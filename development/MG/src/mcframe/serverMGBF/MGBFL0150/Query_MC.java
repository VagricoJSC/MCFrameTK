package mcframe.serverMGBF.MGBFL0150;

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
	 * MGBFL0150_MGT_ACC_TOP_S01
	 */
	static MCQueryPlan MGBFL0150_MGT_ACC_TOP_S01() {
		MGT_ACC_TOP_R S0T1 = MGT_ACC_TOP_R.create("T1");
		MGT_ACC_SML_COST_R S0T2 = MGT_ACC_SML_COST_R.create("T2");
		MAVM_RD_WG_R S0WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_EXPNS_R S0EXPNS = MAM_EXPNS_R.create("EXPNS");
		MCTempView T = createTempView("T");
		MGT_ARG_R ARG = MGT_ARG_R.create("ARG");
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
		MAM_AC_RSN_R AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_SITE_R SITE = MAM_SITE_R.create("SITE");
		MAM_LOC_R LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R OPER = MAM_OPER_R.create("OPER");
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
		MAM_CUR_R TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_UNIT_R UNIT = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R DIM_UNIT = MAM_UNIT_R.create("DIM_UNIT");
		MAM_UNIT_R WT_UNIT = MAM_UNIT_R.create("WT_UNIT");
		MAM_UNIT_R CONTS_UNIT = MAM_UNIT_R.create("CONTS_UNIT");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0150_MGT_ACC_TOP_Query_S01")
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
							cases()
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_STK.value())))
									.then(value(MGC_IO_REC_TYP.ST_STK.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_WIP.value())))
									.then(value(MGC_IO_REC_TYP.ST_WIP.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.PURC.value())))
									.then(value(MGC_IO_REC_TYP.PURC.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
									.then(value(MGC_IO_REC_TYP.COMP.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value())))
									.then(
										cases()
											.when(S0T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.STK_IN.value())))
												.then(value(MGC_IO_REC_TYP.STK_IN.value()))
											.when(S0T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.STK_OUT.value())))
												.then(value(MGC_IO_REC_TYP.STK_OUT.value()))
											.when(S0T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.FFR_PROV.value())))
												.then(value(MGC_IO_REC_TYP.FFR.value()))
											.when(S0T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.ONR_PROV.value())))
												.then(value(MGC_IO_REC_TYP.ONR.value()))
											.otherwise(nullValue())
								)
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.GP_ALC.value())))
									.then(value(MGC_IO_REC_TYP.GP_ALC.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INPT.value())))
									.then(value(MGC_IO_REC_TYP.INPT.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.SLS.value())))
									.then(value(MGC_IO_REC_TYP.SLS.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_STK.value())))
									.then(value(MGC_IO_REC_TYP.END_STK.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_WIP.value())))
									.then(value(MGC_IO_REC_TYP.END_WIP.value()))
								.when(S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ADJ.value())))
									.then(value(MGC_IO_REC_TYP.ADJ.value()))
								.otherwise(nullValue()).as("io_rec_typ"),
							nvl(
								S0T1.std_upri,
								value(0)
							).as("std_upri"),
							S0T2.std_cost,
							S0T2.act_cost,
							S0T2.expns_cd,
							S0EXPNS.var_typ,
							S0EXPNS.expns_grp_cd,
							addDynamicSelect(core)
						)
						.from(
							S0T1
							.leftOuterJoin(S0T2).on(
								S0T1.calc_no.eq(S0T2.calc_no)
								.and(S0T1.calc_grp_cd.eq(S0T2.calc_grp_cd))
								.and(S0T1.top_rec_no.eq(S0T2.top_rec_no))
								.and(S0T2.expns_typ.neq(value(MAC_EXPNS_TYP.SGA.value())))
								.and(
									nvl(
										S0T2.expns_typ,
										value(MAC_EXPNS_TYP.PROD.value())
									).in(
										value(MAC_EXPNS_TYP.PROD.value()),
										value(MAC_EXPNS_TYP.SPPL.value())
									)
								)
							)
							.innerJoin(S0WG).on(S0T1.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T1.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T1.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0ITM.itm_sub3))
							)
							.leftOuterJoin(S0SUNDRY_ITM).on(
								S0T1.itm_cd.eq(S0SUNDRY_ITM.itm_cd)
								.and(S0T1.itm_sub1.eq(S0SUNDRY_ITM.itm_sub1))
								.and(S0T1.itm_sub2.eq(S0SUNDRY_ITM.itm_sub2))
								.and(S0T1.itm_sub3.eq(S0SUNDRY_ITM.itm_sub3))
								.and(S0T1.sno1.eq(S0SUNDRY_ITM.sno1))
								.and(S0T1.sno2.eq(S0SUNDRY_ITM.sno2))
								.and(S0T1.sno3.eq(S0SUNDRY_ITM.sno3))
								.and(S0T1.sno4.eq(S0SUNDRY_ITM.sno4))
							)
							.leftOuterJoin(S0EXPNS).on(S0T2.expns_cd.eq(S0EXPNS.expns_cd))
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S0T1.calc_no.like(bind("calc_no")))
							.and(S0T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(
								value(0).eq(value(1))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("st_stk_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("st_wip_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("purc_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("comp_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("gp_alc_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("inpt_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("sls_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("end_stk_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("end_wip_str")))
								.cutoff$or(S0T1.calc_rec_typ.eq(bind("adj_str")))
								.cutoff$or(
									S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S0T1.cost_io_typ.eq(bind("stk_in_str")))
								)
								.cutoff$or(
									S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S0T1.cost_io_typ.eq(bind("stk_out_str")))
								)
								.cutoff$or(
									S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S0T1.cost_io_typ.eq(bind("ffr_prov_str")))
								)
								.cutoff$or(
									S0T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S0T1.cost_io_typ.eq(bind("onr_prov_str")))
								)
							)
							.cutoff$and(S0T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S0ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S0ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S0ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S0T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S0T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S0T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S0T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S0SUNDRY_ITM.itm_nm,
									S0ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S0T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S0T1.ym.eq(bind("ym")))
							.cutoff$and(S0T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S0T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S0T1.sno1.like(bind("sno1")))
							.cutoff$and(S0T1.sno2.like(bind("sno2")))
							.cutoff$and(S0T1.sno3.like(bind("sno3")))
							.cutoff$and(S0T1.sno4.like(bind("sno4")))
							.cutoff$and(S0T1.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S0T1.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S0T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(
								S0T1.asst_typ.in(
									bind("co_sls_str"),
									value(MAC_ASST_TYP.CO_PROD.value())
								)
							)
							.cutoff$and(S0T1.repurc_obli_flg.eq(bind("repurc_obli_flg")))
							.cutoff$and(S0T1.repurc_obli_flg.eq(bind("repurc_obli_oth_flg"))
									.or(S0T1.asst_typ.eq(value(MAC_ASST_TYP.OTH.value()))))
							.cutoff$and(S0T1.cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S0T1.po_no.like(bind("po_no")))
							.cutoff$and(S0T1.slo_no.like(bind("slo_no")))
							.cutoff$and(S0T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S0T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S0T1.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S0T1.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S0T1.bp_cd.like(bind("bp_cd")))
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
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S0T1.ac_rsn_cd.isNull())
							)
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S0T1.bp_cd.isNull())
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
					when(null)
						.select(core,S0T1.ym.as("ym"))
						.select(aggr,T.pr("ym"))
						.groupBy(core,S0T1.ym)
						.groupBy(aggr,T.pr("ym"))
						.orderBy(T.pr("ym").asc()),
					when(boundOr("wg_flg"))
						.select(core,S0T1.wg_cd.as("wg_cd"))
						.select(aggr,T.pr("wg_cd"))
						.groupBy(core,S0T1.wg_cd)
						.groupBy(aggr,T.pr("wg_cd"))
						.orderBy(T.pr("wg_cd").asc()),
					when(boundOr("mng_dpt_flg"))
						.select(core,S0T1.mng_dpt_cd.as("mng_dpt_cd"))
						.select(aggr,T.pr("mng_dpt_cd"))
						.groupBy(core,S0T1.mng_dpt_cd)
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
						.select(core,S0T1.itm_cd.as("itm_cd"))
						.select(aggr,T.pr("itm_cd"))
						.groupBy(core,S0T1.itm_cd)
						.groupBy(aggr,T.pr("itm_cd"))
						.orderBy(T.pr("itm_cd").asc()),
					when(boundOr("itm_flg"))
						.select(core,S0T1.itm_sub1.as("itm_sub1"))
						.select(aggr,T.pr("itm_sub1"))
						.groupBy(core,S0T1.itm_sub1)
						.groupBy(aggr,T.pr("itm_sub1"))
						.orderBy(T.pr("itm_sub1").asc()),
					when(boundOr("itm_flg"))
						.select(core,S0T1.itm_sub2.as("itm_sub2"))
						.select(aggr,T.pr("itm_sub2"))
						.groupBy(core,S0T1.itm_sub2)
						.groupBy(aggr,T.pr("itm_sub2"))
						.orderBy(T.pr("itm_sub2").asc()),
					when(boundOr("itm_flg"))
						.select(core,S0T1.itm_sub3.as("itm_sub3"))
						.select(aggr,T.pr("itm_sub3"))
						.groupBy(core,S0T1.itm_sub3)
						.groupBy(aggr,T.pr("itm_sub3"))
						.orderBy(T.pr("itm_sub3").asc()),
					when(boundOr("asst_typ_flg"))
						.select(core,S0T1.asst_typ.as("asst_typ"))
						.select(aggr,T.pr("asst_typ"))
						.groupBy(core,S0T1.asst_typ)
						.groupBy(aggr,T.pr("asst_typ"))
						.orderBy(T.pr("asst_typ").asc()),
					when(boundOr("asst_typ_flg"))
						.select(core,S0T1.repurc_obli_flg.as("repurc_obli_flg"))
						.select(aggr,T.pr("repurc_obli_flg"))
						.groupBy(core,S0T1.repurc_obli_flg)
						.groupBy(aggr,T.pr("repurc_obli_flg")),
					when(null)
						.select(aggr,T.pr("io_rec_typ"))
						.groupBy(aggr,T.pr("io_rec_typ"))
						.orderBy(T.pr("io_rec_typ").asc()),
					when(boundOr("lot_flg"))
						.select(core,S0T1.lot_no.as("lot_no"))
						.select(aggr,T.pr("lot_no"))
						.groupBy(core,S0T1.lot_no)
						.groupBy(aggr,T.pr("lot_no"))
						.orderBy(T.pr("lot_no").asc()),
					when(boundOr("sublot_flg"))
						.select(core,S0T1.sublot_no.as("sublot_no"))
						.select(aggr,T.pr("sublot_no"))
						.groupBy(core,S0T1.sublot_no)
						.groupBy(aggr,T.pr("sublot_no"))
						.orderBy(T.pr("sublot_no").asc()),
					when(boundOr("sno1_flg"))
						.select(core,S0T1.sno1.as("sno1"))
						.select(aggr,T.pr("sno1"))
						.groupBy(core,S0T1.sno1)
						.groupBy(aggr,T.pr("sno1"))
						.orderBy(T.pr("sno1").asc()),
					when(boundOr("sno2_flg"))
						.select(core,S0T1.sno2.as("sno2"))
						.select(aggr,T.pr("sno2"))
						.groupBy(core,S0T1.sno2)
						.groupBy(aggr,T.pr("sno2"))
						.orderBy(T.pr("sno2").asc()),
					when(boundOr("sno3_flg"))
						.select(core,S0T1.sno3.as("sno3"))
						.select(aggr,T.pr("sno3"))
						.groupBy(core,S0T1.sno3)
						.groupBy(aggr,T.pr("sno3"))
						.orderBy(T.pr("sno3").asc()),
					when(boundOr("sno4_flg"))
						.select(core,S0T1.sno4.as("sno4"))
						.select(aggr,T.pr("sno4"))
						.groupBy(core,S0T1.sno4)
						.groupBy(aggr,T.pr("sno4"))
						.orderBy(T.pr("sno4").asc()),
					when(boundOr("ac_slip_typ_flg"))
						.select(core,S0T1.ac_slip_typ.as("ac_slip_typ"))
						.select(aggr,T.pr("ac_slip_typ"))
						.groupBy(core,S0T1.ac_slip_typ)
						.groupBy(aggr,T.pr("ac_slip_typ"))
						.orderBy(T.pr("ac_slip_typ").asc()),
					when(boundOr("ac_rsn_flg"))
						.select(core,S0T1.ac_rsn_cd.as("ac_rsn_cd"))
						.select(aggr,T.pr("ac_rsn_cd"))
						.groupBy(core,S0T1.ac_rsn_cd)
						.groupBy(aggr,T.pr("ac_rsn_cd"))
						.orderBy(T.pr("ac_rsn_cd").asc()),
					when(boundOr("trd_cur_flg"))
						.select(core,S0T1.cur_cd.as("trd_cur_cd"))
						.select(aggr,T.pr("trd_cur_cd"))
						.groupBy(core,S0T1.cur_cd)
						.groupBy(aggr,T.pr("trd_cur_cd"))
						.orderBy(T.pr("trd_cur_cd").asc()),
					when(boundOr("mng_dpt_flg","mng_dpt_nm"))
						.view(core, v -> v.innerJoin(ARG).on(S0T1.calc_no.eq(ARG.calc_no).and(S0T1.calc_grp_cd.eq(ARG.calc_grp_cd)))),
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
					when(boundOr("itm_flg"))
						.select(core,nvl(S0SUNDRY_ITM.itm_nm,S0ITM.itm_nm).as("itm_nm"))
						.select(aggr,T.pr("itm_nm"))
						.groupBy(core,nvl(S0SUNDRY_ITM.itm_nm,S0ITM.itm_nm))
						.groupBy(aggr,T.pr("itm_nm")),
					when(boundOr("itm_typ_d_flg"))
						.select(core,ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
						.select(aggr,T.pr("itm_typ_d_nm"))
						.groupBy(core,ITM_TYP_D.itm_typ_d_nm)
						.groupBy(aggr,T.pr("itm_typ_d_nm")),
					when(boundOr("itm_typ_d_flg","itm_typ_d_nm"))
						.view(core, v -> v.leftOuterJoin(ITM_TYP_D).on(S0ITM.itm_typ.eq(ITM_TYP_D.itm_typ).and(S0ITM.itm_typ_d_cd.eq(ITM_TYP_D.itm_typ_d_cd))))
						.predicate(core, p -> p.cutoff$and(ITM_TYP_D.itm_typ_d_nm.like(bind("ITM_TYP_D_NM")))),
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
					when(boundOr("ac_rsn_flg"))
						.select(core,AC_RSN.ac_rsn_nm.as("ac_rsn_nm"))
						.select(aggr,T.pr("ac_rsn_nm"))
						.groupBy(core,AC_RSN.ac_rsn_nm)
						.groupBy(aggr,T.pr("ac_rsn_nm")),
					when(boundOr("ac_rsn_flg","ac_rsn_nm"))
						.view(core, v -> v.leftOuterJoin(AC_RSN).on(S0T1.ac_rsn_cd.eq(AC_RSN.ac_rsn_cd)))
						.predicate(core, p -> p.cutoff$and(AC_RSN.ac_rsn_nm.like(bind("AC_RSN_NM")))),
					when(boundOr("site_flg"))
						.select(core,LOC.site_cd.as("site_cd"))
						.select(aggr,T.pr("site_cd"))
						.groupBy(core,LOC.site_cd)
						.groupBy(aggr,T.pr("site_cd")),
					when(boundOr("site_flg"))
						.select(core,SITE.site_nm.as("site_nm"))
						.select(aggr,T.pr("site_nm"))
						.groupBy(core,SITE.site_nm)
						.groupBy(aggr,T.pr("site_nm")),
					when(boundOr("loc_flg","loc_nm","site_cd","site_nm","site_flg"))
						.view(core, v -> v.leftOuterJoin(LOC).on(S0T1.loc_cd.eq(LOC.loc_cd)))
						.predicate(core, p -> p.cutoff$and(LOC.loc_nm.like(bind("LOC_NM"))).cutoff$and(LOC.site_cd.like(bind("SITE_CD")))),
					when(boundOr("site_flg","site_nm"))
						.view(core, v -> v.leftOuterJoin(SITE).on(LOC.site_cd.eq(SITE.site_cd)))
						.predicate(core, p -> p.cutoff$and(SITE.site_nm.like(bind("SITE_NM")))),
					when(boundOr("loc_flg"))
						.select(core,S0T1.loc_cd.as("loc_cd"))
						.select(aggr,T.pr("loc_cd"))
						.groupBy(core,S0T1.loc_cd)
						.groupBy(aggr,T.pr("loc_cd")),
					when(boundOr("loc_flg"))
						.select(core,LOC.loc_nm.as("loc_nm"))
						.select(aggr,T.pr("loc_nm"))
						.groupBy(core,LOC.loc_nm)
						.groupBy(aggr,T.pr("loc_nm")),
					when(boundOr("str_ln_flg"))
						.select(core,S0T1.str_ln_cd.as("str_ln_cd"))
						.select(aggr,T.pr("str_ln_cd"))
						.groupBy(core,S0T1.str_ln_cd)
						.groupBy(aggr,T.pr("str_ln_cd")),
					when(boundOr("str_ln_flg"))
						.select(core,STR_LN.str_ln_nm.as("str_ln_nm"))
						.select(aggr,T.pr("str_ln_nm"))
						.groupBy(core,STR_LN.str_ln_nm)
						.groupBy(aggr,T.pr("str_ln_nm")),
					when(boundOr("str_ln_flg","str_ln_nm"))
						.view(core, v -> v.leftOuterJoin(STR_LN).on(S0T1.str_ln_cd.eq(STR_LN.str_ln_cd).and(S0T1.loc_cd.eq(STR_LN.loc_cd))))
						.predicate(core, p -> p.cutoff$and(STR_LN.str_ln_nm.like(bind("STR_LN_NM")))),
					when(boundOr("oper_flg"))
						.select(core,S0T1.oper_cd.as("oper_cd"))
						.select(aggr,T.pr("oper_cd"))
						.groupBy(core,S0T1.oper_cd)
						.groupBy(aggr,T.pr("oper_cd")),
					when(boundOr("oper_flg"))
						.select(core,OPER.oper_nm.as("oper_nm"))
						.select(aggr,T.pr("oper_nm"))
						.groupBy(core,OPER.oper_nm)
						.groupBy(aggr,T.pr("oper_nm")),
					when(boundOr("oper_flg","oper_nm"))
						.view(core, v -> v.leftOuterJoin(OPER).on(S0T1.oper_cd.eq(OPER.oper_cd)))
						.predicate(core, p -> p.cutoff$and(OPER.oper_nm.like(bind("OPER_NM")))),
					when(boundOr("bp_flg"))
						.select(core,S0T1.bp_cd.as("bp_cd"))
						.select(aggr,T.pr("bp_cd"))
						.groupBy(core,S0T1.bp_cd)
						.groupBy(aggr,T.pr("bp_cd")),
					when(boundOr("bp_flg","bp_nm","bp_grp_cd1","bp_grp_nm1","bp_grp_cd2","bp_grp_nm2","bp_grp_cd3","bp_grp_nm3","bp_grp_cd4","bp_grp_nm4","bp_grp_cd5","bp_grp_nm5","bp_grp_cd6","bp_grp_nm6","bp_grp_cd7","bp_grp_nm7","bp_grp_cd8","bp_grp_nm8","bp_grp_cd9","bp_grp_nm9","bp_grp_cd10","bp_grp_nm10","cntry_cd","cntry_nm","area_cd","area_nm","bp_grp_flg1","bp_grp_flg2","bp_grp_flg3","bp_grp_flg4","bp_grp_flg5","bp_grp_flg6","bp_grp_flg7","bp_grp_flg8","bp_grp_flg9","bp_grp_flg10","cntry_flg","area_flg"))
						.view(core, v -> v.leftOuterJoin(BP).on(S0T1.bp_cd.eq(BP.bp_cd)))
						.predicate(core, p -> p.cutoff$and(BP.bp_nm.like(bind("BP_NM"))).cutoff$and(BP.cntry_cd.like(bind("CNTRY_CD"))).cutoff$and(BP.area_cd.like(bind("AREA_CD"))).cutoff$and(BP.bp_grp_cd1.like(bind("BP_GRP_CD1"))).cutoff$and(BP.bp_grp_cd2.like(bind("BP_GRP_CD2"))).cutoff$and(BP.bp_grp_cd3.like(bind("BP_GRP_CD3"))).cutoff$and(BP.bp_grp_cd4.like(bind("BP_GRP_CD4"))).cutoff$and(BP.bp_grp_cd5.like(bind("BP_GRP_CD5"))).cutoff$and(BP.bp_grp_cd6.like(bind("BP_GRP_CD6"))).cutoff$and(BP.bp_grp_cd7.like(bind("BP_GRP_CD7"))).cutoff$and(BP.bp_grp_cd8.like(bind("BP_GRP_CD8"))).cutoff$and(BP.bp_grp_cd9.like(bind("BP_GRP_CD9"))).cutoff$and(BP.bp_grp_cd10.like(bind("BP_GRP_CD10")))),
					when(boundOr("bp_flg"))
						.select(core,BP.bp_nm.as("bp_nm"))
						.select(aggr,T.pr("bp_nm"))
						.groupBy(core,BP.bp_nm)
						.groupBy(aggr,T.pr("bp_nm")),
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
					when(boundOr("po_no_flg"))
						.select(core,S0T1.po_no.as("po_no"))
						.select(aggr,T.pr("po_no"))
						.groupBy(core,S0T1.po_no)
						.groupBy(aggr,T.pr("po_no")),
					when(boundOr("slo_no_flg"))
						.select(core,S0T1.slo_no.as("slo_no"))
						.select(aggr,T.pr("slo_no"))
						.groupBy(core,S0T1.slo_no)
						.groupBy(aggr,T.pr("slo_no")),
					when(boundOr("iv_no_flg"))
						.select(core,S0T1.iv_no.as("iv_no"))
						.select(aggr,T.pr("iv_no"))
						.groupBy(core,S0T1.iv_no)
						.groupBy(aggr,T.pr("iv_no")),
					when(boundOr("trd_cur_flg"))
						.select(core,TRD_CUR.cur_nm.as("trd_cur_nm"))
						.select(aggr,T.pr("trd_cur_nm"))
						.groupBy(core,TRD_CUR.cur_nm)
						.groupBy(aggr,T.pr("trd_cur_nm")),
					when(boundOr("trd_cur_flg","trd_cur_nm"))
						.view(core, v -> v.leftOuterJoin(TRD_CUR).on(S0T1.cur_cd.eq(TRD_CUR.cur_cd)))
						.predicate(core, p -> p.cutoff$and(TRD_CUR.cur_nm.like(bind("TRD_CUR_NM")))),
					when(boundOr("trd_cur_flg"))
						.select(core,TRD_CUR.amt_dec_place.as("trd_cur_amt_dec_place"))
						.select(aggr,T.pr("trd_cur_amt_dec_place"))
						.groupBy(core,TRD_CUR.amt_dec_place)
						.groupBy(aggr,T.pr("trd_cur_amt_dec_place")),
					when(boundOr("trd_cur_flg"))
						.select(core,TRD_CUR.upri_dec_place.as("trd_cur_upri_dec_place"))
						.select(aggr,T.pr("trd_cur_upri_dec_place"))
						.groupBy(core,TRD_CUR.upri_dec_place)
						.groupBy(aggr,T.pr("trd_cur_upri_dec_place")),
					when(boundOr("xrate_flg"))
						.select(core,S0T1.xrate.as("xrate"))
						.select(aggr,T.pr("xrate"))
						.groupBy(core,S0T1.xrate)
						.groupBy(aggr,T.pr("xrate")),
					when(boundOr("qty_flg"))
						.select(core,S0ITM.unit_cd.as("unit_cd"))
						.select(aggr,T.pr("unit_cd"))
						.groupBy(core,S0ITM.unit_cd)
						.groupBy(aggr,T.pr("unit_cd")),
					when(boundOr("qty_flg"))
						.select(core,UNIT.unit_nm.as("unit_nm"))
						.select(aggr,T.pr("unit_nm"))
						.groupBy(core,UNIT.unit_nm)
						.groupBy(aggr,T.pr("unit_nm")),
					when(null)
						.view(core, v -> v.leftOuterJoin(UNIT).on(S0ITM.unit_cd.eq(UNIT.unit_cd))),
					when(boundOr("qty_flg"))
						.select(core,S0ITM.dec_place.as("dec_place"))
						.select(aggr,T.pr("dec_place"))
						.groupBy(core,S0ITM.dec_place)
						.groupBy(aggr,T.pr("dec_place")),
					when(boundOr("dim_flg"))
						.select(core,S0ITM.dim_unit_cd.as("dim_unit_cd"))
						.select(aggr,T.pr("dim_unit_cd"))
						.groupBy(core,S0ITM.dim_unit_cd)
						.groupBy(aggr,T.pr("dim_unit_cd")),
					when(boundOr("dim_flg"))
						.select(core,DIM_UNIT.unit_nm.as("dim_unit_nm"))
						.select(aggr,T.pr("dim_unit_nm"))
						.groupBy(core,DIM_UNIT.unit_nm)
						.groupBy(aggr,T.pr("dim_unit_nm")),
					when(null)
						.view(core, v -> v.leftOuterJoin(DIM_UNIT).on(S0ITM.dim_unit_cd.eq(DIM_UNIT.unit_cd))),
					when(boundOr("dim_flg"))
						.select(core,nvl(DIM_UNIT.dec_place,value(2)).as("dim_dec_place"))
						.select(aggr,T.pr("dim_dec_place"))
						.groupBy(core,nvl(DIM_UNIT.dec_place,value(2)))
						.groupBy(aggr,T.pr("dim_dec_place")),
					when(boundOr("wt_flg"))
						.select(core,S0ITM.wt_unit_cd.as("wt_unit_cd"))
						.select(aggr,T.pr("wt_unit_cd"))
						.groupBy(core,S0ITM.wt_unit_cd)
						.groupBy(aggr,T.pr("wt_unit_cd")),
					when(boundOr("wt_flg"))
						.select(core,WT_UNIT.unit_nm.as("wt_unit_nm"))
						.select(aggr,T.pr("wt_unit_nm"))
						.groupBy(core,WT_UNIT.unit_nm)
						.groupBy(aggr,T.pr("wt_unit_nm")),
					when(null)
						.view(core, v -> v.leftOuterJoin(WT_UNIT).on(S0ITM.wt_unit_cd.eq(WT_UNIT.unit_cd))),
					when(boundOr("wt_flg"))
						.select(core,nvl(WT_UNIT.dec_place,value(2)).as("wt_dec_place"))
						.select(aggr,T.pr("wt_dec_place"))
						.groupBy(core,nvl(WT_UNIT.dec_place,value(2)))
						.groupBy(aggr,T.pr("wt_dec_place")),
					when(boundOr("conts_flg"))
						.select(core,S0ITM.conts_unit_cd.as("conts_unit_cd"))
						.select(aggr,T.pr("conts_unit_cd"))
						.groupBy(core,S0ITM.conts_unit_cd)
						.groupBy(aggr,T.pr("conts_unit_cd")),
					when(boundOr("conts_flg"))
						.select(core,CONTS_UNIT.unit_nm.as("conts_unit_nm"))
						.select(aggr,T.pr("conts_unit_nm"))
						.groupBy(core,CONTS_UNIT.unit_nm)
						.groupBy(aggr,T.pr("conts_unit_nm")),
					when(null)
						.view(core, v -> v.leftOuterJoin(CONTS_UNIT).on(S0ITM.conts_unit_cd.eq(CONTS_UNIT.unit_cd))),
					when(boundOr("conts_flg"))
						.select(core,nvl(CONTS_UNIT.dec_place,value(2)).as("conts_dec_place"))
						.select(aggr,T.pr("conts_dec_place"))
						.groupBy(core,nvl(CONTS_UNIT.dec_place,value(2)))
						.groupBy(aggr,T.pr("conts_dec_place")),
					when(null)
						.select(aggr,avg(T.pr("std_upri")).as("std_upri")),
					when(null)
						.select(aggr,nvl(sum(T.pr("std_cost")),value(0)).as("std_cost")),
					when(null)
						.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl")),
					when(null)
						.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var")),
					when(null)
						.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd")),
					when(boundOr("GRP_FLG_000"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000")),
					when(boundOr("EXP_FLG_000"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000")),
					when(boundOr("GRP_FLG_001"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_001"),T.pr("act_cost"),value(0))),value(0)).as("col_001")),
					when(boundOr("EXP_FLG_001"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_001"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_001")),
					when(boundOr("GRP_FLG_002"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002")),
					when(boundOr("EXP_FLG_002"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002")),
					when(boundOr("GRP_FLG_003"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_003"),T.pr("act_cost"),value(0))),value(0)).as("col_003")),
					when(boundOr("EXP_FLG_003"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_003"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_003")),
					when(boundOr("GRP_FLG_004"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004")),
					when(boundOr("EXP_FLG_004"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004")),
					when(boundOr("GRP_FLG_005"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_005"),T.pr("act_cost"),value(0))),value(0)).as("col_005")),
					when(boundOr("EXP_FLG_005"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_005"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_005")),
					when(boundOr("GRP_FLG_006"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006")),
					when(boundOr("EXP_FLG_006"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006")),
					when(boundOr("GRP_FLG_007"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_007"),T.pr("act_cost"),value(0))),value(0)).as("col_007")),
					when(boundOr("EXP_FLG_007"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_007"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_007")),
					when(boundOr("GRP_FLG_008"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008")),
					when(boundOr("EXP_FLG_008"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008")),
					when(boundOr("GRP_FLG_009"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_009"),T.pr("act_cost"),value(0))),value(0)).as("col_009")),
					when(boundOr("EXP_FLG_009"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_009"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_009")),
					when(boundOr("GRP_FLG_010"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010")),
					when(boundOr("EXP_FLG_010"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010")),
					when(boundOr("GRP_FLG_011"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_011"),T.pr("act_cost"),value(0))),value(0)).as("col_011")),
					when(boundOr("EXP_FLG_011"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_011"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_011")),
					when(boundOr("GRP_FLG_012"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012")),
					when(boundOr("EXP_FLG_012"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012")),
					when(boundOr("GRP_FLG_013"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_013"),T.pr("act_cost"),value(0))),value(0)).as("col_013")),
					when(boundOr("EXP_FLG_013"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_013"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_013")),
					when(boundOr("GRP_FLG_014"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014")),
					when(boundOr("EXP_FLG_014"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014")),
					when(boundOr("GRP_FLG_015"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_015"),T.pr("act_cost"),value(0))),value(0)).as("col_015")),
					when(boundOr("EXP_FLG_015"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_015"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_015")),
					when(boundOr("GRP_FLG_016"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016")),
					when(boundOr("EXP_FLG_016"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016")),
					when(boundOr("GRP_FLG_017"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_017"),T.pr("act_cost"),value(0))),value(0)).as("col_017")),
					when(boundOr("EXP_FLG_017"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_017"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_017")),
					when(boundOr("GRP_FLG_018"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018")),
					when(boundOr("EXP_FLG_018"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018")),
					when(boundOr("GRP_FLG_019"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_019"),T.pr("act_cost"),value(0))),value(0)).as("col_019")),
					when(boundOr("EXP_FLG_019"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_019"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_019")),
					when(boundOr("GRP_FLG_020"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020")),
					when(boundOr("EXP_FLG_020"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020")),
					when(boundOr("GRP_FLG_021"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_021"),T.pr("act_cost"),value(0))),value(0)).as("col_021")),
					when(boundOr("EXP_FLG_021"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_021"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_021")),
					when(boundOr("GRP_FLG_022"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022")),
					when(boundOr("EXP_FLG_022"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022")),
					when(boundOr("GRP_FLG_023"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_023"),T.pr("act_cost"),value(0))),value(0)).as("col_023")),
					when(boundOr("EXP_FLG_023"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_023"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_023")),
					when(boundOr("GRP_FLG_024"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024")),
					when(boundOr("EXP_FLG_024"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024")),
					when(boundOr("GRP_FLG_025"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_025"),T.pr("act_cost"),value(0))),value(0)).as("col_025")),
					when(boundOr("EXP_FLG_025"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_025"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_025")),
					when(boundOr("GRP_FLG_026"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026")),
					when(boundOr("EXP_FLG_026"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026")),
					when(boundOr("GRP_FLG_027"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_027"),T.pr("act_cost"),value(0))),value(0)).as("col_027")),
					when(boundOr("EXP_FLG_027"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_027"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_027")),
					when(boundOr("GRP_FLG_028"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028")),
					when(boundOr("EXP_FLG_028"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028")),
					when(boundOr("GRP_FLG_029"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_029"),T.pr("act_cost"),value(0))),value(0)).as("col_029")),
					when(boundOr("EXP_FLG_029"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_029"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_029")),
					when(boundOr("GRP_FLG_030"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030")),
					when(boundOr("EXP_FLG_030"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030")),
					when(boundOr("GRP_FLG_031"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_031"),T.pr("act_cost"),value(0))),value(0)).as("col_031")),
					when(boundOr("EXP_FLG_031"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_031"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_031")),
					when(boundOr("GRP_FLG_032"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032")),
					when(boundOr("EXP_FLG_032"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032")),
					when(boundOr("GRP_FLG_033"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_033"),T.pr("act_cost"),value(0))),value(0)).as("col_033")),
					when(boundOr("EXP_FLG_033"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_033"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_033")),
					when(boundOr("GRP_FLG_034"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034")),
					when(boundOr("EXP_FLG_034"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034")),
					when(boundOr("GRP_FLG_035"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_035"),T.pr("act_cost"),value(0))),value(0)).as("col_035")),
					when(boundOr("EXP_FLG_035"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_035"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_035")),
					when(boundOr("GRP_FLG_036"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036")),
					when(boundOr("EXP_FLG_036"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036")),
					when(boundOr("GRP_FLG_037"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_037"),T.pr("act_cost"),value(0))),value(0)).as("col_037")),
					when(boundOr("EXP_FLG_037"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_037"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_037")),
					when(boundOr("GRP_FLG_038"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038")),
					when(boundOr("EXP_FLG_038"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038")),
					when(boundOr("GRP_FLG_039"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_039"),T.pr("act_cost"),value(0))),value(0)).as("col_039")),
					when(boundOr("EXP_FLG_039"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_039"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_039")),
					when(boundOr("GRP_FLG_040"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040")),
					when(boundOr("EXP_FLG_040"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040")),
					when(boundOr("GRP_FLG_041"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_041"),T.pr("act_cost"),value(0))),value(0)).as("col_041")),
					when(boundOr("EXP_FLG_041"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_041"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_041")),
					when(boundOr("GRP_FLG_042"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042")),
					when(boundOr("EXP_FLG_042"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042")),
					when(boundOr("GRP_FLG_043"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_043"),T.pr("act_cost"),value(0))),value(0)).as("col_043")),
					when(boundOr("EXP_FLG_043"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_043"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_043")),
					when(boundOr("GRP_FLG_044"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044")),
					when(boundOr("EXP_FLG_044"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044")),
					when(boundOr("GRP_FLG_045"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_045"),T.pr("act_cost"),value(0))),value(0)).as("col_045")),
					when(boundOr("EXP_FLG_045"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_045"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_045")),
					when(boundOr("GRP_FLG_046"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046")),
					when(boundOr("EXP_FLG_046"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046")),
					when(boundOr("GRP_FLG_047"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_047"),T.pr("act_cost"),value(0))),value(0)).as("col_047")),
					when(boundOr("EXP_FLG_047"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_047"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_047")),
					when(boundOr("GRP_FLG_048"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048")),
					when(boundOr("EXP_FLG_048"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048")),
					when(boundOr("GRP_FLG_049"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_049"),T.pr("act_cost"),value(0))),value(0)).as("col_049")),
					when(boundOr("EXP_FLG_049"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_049"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_049")),
					when(boundOr("GRP_FLG_050"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050")),
					when(boundOr("EXP_FLG_050"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050")),
					when(boundOr("GRP_FLG_051"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_051"),T.pr("act_cost"),value(0))),value(0)).as("col_051")),
					when(boundOr("EXP_FLG_051"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_051"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_051")),
					when(boundOr("GRP_FLG_052"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052")),
					when(boundOr("EXP_FLG_052"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052")),
					when(boundOr("GRP_FLG_053"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_053"),T.pr("act_cost"),value(0))),value(0)).as("col_053")),
					when(boundOr("EXP_FLG_053"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_053"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_053")),
					when(boundOr("GRP_FLG_054"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054")),
					when(boundOr("EXP_FLG_054"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054")),
					when(boundOr("GRP_FLG_055"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_055"),T.pr("act_cost"),value(0))),value(0)).as("col_055")),
					when(boundOr("EXP_FLG_055"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_055"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_055")),
					when(boundOr("GRP_FLG_056"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056")),
					when(boundOr("EXP_FLG_056"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056")),
					when(boundOr("GRP_FLG_057"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_057"),T.pr("act_cost"),value(0))),value(0)).as("col_057")),
					when(boundOr("EXP_FLG_057"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_057"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_057")),
					when(boundOr("GRP_FLG_058"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058")),
					when(boundOr("EXP_FLG_058"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058")),
					when(boundOr("GRP_FLG_059"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_059"),T.pr("act_cost"),value(0))),value(0)).as("col_059")),
					when(boundOr("EXP_FLG_059"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_059"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_059")),
					when(boundOr("GRP_FLG_060"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060")),
					when(boundOr("EXP_FLG_060"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060")),
					when(boundOr("GRP_FLG_061"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_061"),T.pr("act_cost"),value(0))),value(0)).as("col_061")),
					when(boundOr("EXP_FLG_061"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_061"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_061")),
					when(boundOr("GRP_FLG_062"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062")),
					when(boundOr("EXP_FLG_062"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062")),
					when(boundOr("GRP_FLG_063"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_063"),T.pr("act_cost"),value(0))),value(0)).as("col_063")),
					when(boundOr("EXP_FLG_063"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_063"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_063")),
					when(boundOr("GRP_FLG_064"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064")),
					when(boundOr("EXP_FLG_064"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064")),
					when(boundOr("GRP_FLG_065"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_065"),T.pr("act_cost"),value(0))),value(0)).as("col_065")),
					when(boundOr("EXP_FLG_065"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_065"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_065")),
					when(boundOr("GRP_FLG_066"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066")),
					when(boundOr("EXP_FLG_066"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066")),
					when(boundOr("GRP_FLG_067"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_067"),T.pr("act_cost"),value(0))),value(0)).as("col_067")),
					when(boundOr("EXP_FLG_067"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_067"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_067")),
					when(boundOr("GRP_FLG_068"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068")),
					when(boundOr("EXP_FLG_068"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068")),
					when(boundOr("GRP_FLG_069"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_069"),T.pr("act_cost"),value(0))),value(0)).as("col_069")),
					when(boundOr("EXP_FLG_069"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_069"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_069")),
					when(boundOr("GRP_FLG_070"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070")),
					when(boundOr("EXP_FLG_070"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070")),
					when(boundOr("GRP_FLG_071"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_071"),T.pr("act_cost"),value(0))),value(0)).as("col_071")),
					when(boundOr("EXP_FLG_071"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_071"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_071")),
					when(boundOr("GRP_FLG_072"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072")),
					when(boundOr("EXP_FLG_072"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072")),
					when(boundOr("GRP_FLG_073"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_073"),T.pr("act_cost"),value(0))),value(0)).as("col_073")),
					when(boundOr("EXP_FLG_073"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_073"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_073")),
					when(boundOr("GRP_FLG_074"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074")),
					when(boundOr("EXP_FLG_074"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074")),
					when(boundOr("GRP_FLG_075"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_075"),T.pr("act_cost"),value(0))),value(0)).as("col_075")),
					when(boundOr("EXP_FLG_075"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_075"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_075")),
					when(boundOr("GRP_FLG_076"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076")),
					when(boundOr("EXP_FLG_076"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076")),
					when(boundOr("GRP_FLG_077"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_077"),T.pr("act_cost"),value(0))),value(0)).as("col_077")),
					when(boundOr("EXP_FLG_077"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_077"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_077")),
					when(boundOr("GRP_FLG_078"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078")),
					when(boundOr("EXP_FLG_078"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078")),
					when(boundOr("GRP_FLG_079"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_079"),T.pr("act_cost"),value(0))),value(0)).as("col_079")),
					when(boundOr("EXP_FLG_079"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_079"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_079")),
					when(boundOr("GRP_FLG_080"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080")),
					when(boundOr("EXP_FLG_080"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080")),
					when(boundOr("GRP_FLG_081"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_081"),T.pr("act_cost"),value(0))),value(0)).as("col_081")),
					when(boundOr("EXP_FLG_081"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_081"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_081")),
					when(boundOr("GRP_FLG_082"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082")),
					when(boundOr("EXP_FLG_082"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082")),
					when(boundOr("GRP_FLG_083"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_083"),T.pr("act_cost"),value(0))),value(0)).as("col_083")),
					when(boundOr("EXP_FLG_083"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_083"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_083")),
					when(boundOr("GRP_FLG_084"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084")),
					when(boundOr("EXP_FLG_084"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084")),
					when(boundOr("GRP_FLG_085"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_085"),T.pr("act_cost"),value(0))),value(0)).as("col_085")),
					when(boundOr("EXP_FLG_085"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_085"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_085")),
					when(boundOr("GRP_FLG_086"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086")),
					when(boundOr("EXP_FLG_086"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086")),
					when(boundOr("GRP_FLG_087"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_087"),T.pr("act_cost"),value(0))),value(0)).as("col_087")),
					when(boundOr("EXP_FLG_087"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_087"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_087")),
					when(boundOr("GRP_FLG_088"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088")),
					when(boundOr("EXP_FLG_088"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088")),
					when(boundOr("GRP_FLG_089"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_089"),T.pr("act_cost"),value(0))),value(0)).as("col_089")),
					when(boundOr("EXP_FLG_089"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_089"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_089")),
					when(boundOr("GRP_FLG_090"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090")),
					when(boundOr("EXP_FLG_090"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090")),
					when(boundOr("GRP_FLG_091"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_091"),T.pr("act_cost"),value(0))),value(0)).as("col_091")),
					when(boundOr("EXP_FLG_091"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_091"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_091")),
					when(boundOr("GRP_FLG_092"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092")),
					when(boundOr("EXP_FLG_092"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092")),
					when(boundOr("GRP_FLG_093"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_093"),T.pr("act_cost"),value(0))),value(0)).as("col_093")),
					when(boundOr("EXP_FLG_093"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_093"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_093")),
					when(boundOr("GRP_FLG_094"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094")),
					when(boundOr("EXP_FLG_094"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094")),
					when(boundOr("GRP_FLG_095"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_095"),T.pr("act_cost"),value(0))),value(0)).as("col_095")),
					when(boundOr("EXP_FLG_095"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_095"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_095")),
					when(boundOr("GRP_FLG_096"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096")),
					when(boundOr("EXP_FLG_096"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096")),
					when(boundOr("GRP_FLG_097"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_097"),T.pr("act_cost"),value(0))),value(0)).as("col_097")),
					when(boundOr("EXP_FLG_097"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_097"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_097")),
					when(boundOr("GRP_FLG_098"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098")),
					when(boundOr("EXP_FLG_098"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098")),
					when(boundOr("GRP_FLG_099"))
						.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("BIND_GRP_099"),T.pr("act_cost"),value(0))),value(0)).as("col_099")),
					when(boundOr("EXP_FLG_099"))
						.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("BIND_EXP_099"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_099"))
				);
	}
	
	/**
	 * -- MGBFL0150_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0150_MGT_ACC_TOP_S02() {
		MCTempView S0_T = createTempView("T");
		MGT_ACC_TOP_R S1_T1 = MGT_ACC_TOP_R.create("T1");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
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
		MAM_AC_RSN_R S1_AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
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
		MAM_CUR_R S1_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_UNIT_R S1_DIM_UNIT = MAM_UNIT_R.create("DIM_UNIT");
		MAM_UNIT_R S1_WT_UNIT = MAM_UNIT_R.create("WT_UNIT");
		MAM_UNIT_R S1_CONTS_UNIT = MAM_UNIT_R.create("CONTS_UNIT");
		MGT_ARG_R S1_ARG = MGT_ARG_R.create("ARG");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0150_MGT_ACC_TOP_Query_S02")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T1.calc_no,
							S1_T1.calc_grp_cd,
							S1_T1.top_rec_no,
							cases()
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_STK.value())))
									.then(value(MGC_IO_REC_TYP.ST_STK.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ST_WIP.value())))
									.then(value(MGC_IO_REC_TYP.ST_WIP.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.PURC.value())))
									.then(value(MGC_IO_REC_TYP.PURC.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.COMP.value())))
									.then(value(MGC_IO_REC_TYP.COMP.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value())))
									.then(
										cases()
											.when(S1_T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.STK_IN.value())))
												.then(value(MGC_IO_REC_TYP.STK_IN.value()))
											.when(S1_T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.STK_OUT.value())))
												.then(value(MGC_IO_REC_TYP.STK_OUT.value()))
											.when(S1_T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.FFR_PROV.value())))
												.then(value(MGC_IO_REC_TYP.FFR.value()))
											.when(S1_T1.cost_io_typ.eq(value(MAC_COST_IO_TYP.ONR_PROV.value())))
												.then(value(MGC_IO_REC_TYP.ONR.value()))
											.otherwise(nullValue())
								)
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.GP_ALC.value())))
									.then(value(MGC_IO_REC_TYP.GP_ALC.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.INPT.value())))
									.then(value(MGC_IO_REC_TYP.INPT.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.SLS.value())))
									.then(value(MGC_IO_REC_TYP.SLS.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_STK.value())))
									.then(value(MGC_IO_REC_TYP.END_STK.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_WIP.value())))
									.then(value(MGC_IO_REC_TYP.END_WIP.value()))
								.when(S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.ADJ.value())))
									.then(value(MGC_IO_REC_TYP.ADJ.value()))
								.otherwise(nullValue()).as("io_rec_typ"),
							S1_T1.cur_amt.as("trd_cur_amt"),
							decode(
								S1_T1.calc_rec_typ,
								value(MGC_CALC_REC_TYP.INPT.value()),
								decode(
									S1_T1.cur_amt,
									nullValue(),
									S1_T1.so_act_amt,
									S1_T1.amt
								),
								S1_T1.amt
							).as("amt"),
							S1_T1.qty,
							decode(
								S1_ITM.dim_unit_cd,
								nullValue(),
								nullValue(),
								MAPA_CALC$F_RND(
									S1_T1.qty.multiply(S1_ITM.dim),
									nvl(
										S1_DIM_UNIT.dec_place,
										value(2)
									),
									value(MAC_RND_TYP.RNDOFF.value())
								)
							).as("dim"),
							decode(
								S1_ITM.wt_unit_cd,
								nullValue(),
								nullValue(),
								MAPA_CALC$F_RND(
									S1_T1.qty.multiply(S1_ITM.wt),
									nvl(
										S1_WT_UNIT.dec_place,
										value(2)
									),
									value(MAC_RND_TYP.RNDOFF.value())
								)
							).as("wt"),
							decode(
								S1_ITM.conts_unit_cd,
								nullValue(),
								nullValue(),
								MAPA_CALC$F_RND(
									S1_T1.qty.multiply(S1_ITM.conts_qty),
									nvl(
										S1_CONTS_UNIT.dec_place,
										value(2)
									),
									value(MAC_RND_TYP.RNDOFF.value())
								)
							).as("conts"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T1
							.innerJoin(S1_WG).on(S1_T1.wg_cd.eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_ITM).on(
								S1_T1.itm_cd.eq(S1_ITM.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_ITM.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_ITM.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_SUNDRY_ITM).on(
								S1_T1.itm_cd.eq(S1_SUNDRY_ITM.itm_cd)
								.and(S1_T1.itm_sub1.eq(S1_SUNDRY_ITM.itm_sub1))
								.and(S1_T1.itm_sub2.eq(S1_SUNDRY_ITM.itm_sub2))
								.and(S1_T1.itm_sub3.eq(S1_SUNDRY_ITM.itm_sub3))
								.and(S1_T1.sno1.eq(S1_SUNDRY_ITM.sno1))
								.and(S1_T1.sno2.eq(S1_SUNDRY_ITM.sno2))
								.and(S1_T1.sno3.eq(S1_SUNDRY_ITM.sno3))
								.and(S1_T1.sno4.eq(S1_SUNDRY_ITM.sno4))
							)
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T1.calc_no.like(bind("calc_no")))
							.and(S1_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(
								value(0).eq(value(1))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("st_stk_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("st_wip_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("purc_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("comp_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("gp_alc_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("inpt_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("sls_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("end_stk_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("end_wip_str")))
								.cutoff$or(S1_T1.calc_rec_typ.eq(bind("adj_str")))
								.cutoff$or(
									S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S1_T1.cost_io_typ.eq(bind("stk_in_str")))
								)
								.cutoff$or(
									S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S1_T1.cost_io_typ.eq(bind("stk_out_str")))
								)
								.cutoff$or(
									S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S1_T1.cost_io_typ.eq(bind("ffr_prov_str")))
								)
								.cutoff$or(
									S1_T1.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.IO.value()))
									.and(S1_T1.cost_io_typ.eq(bind("onr_prov_str")))
								)
							)
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_SUNDRY_ITM.itm_nm,
									S1_ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T1.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T1.ym.eq(bind("ym")))
							.cutoff$and(S1_T1.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T1.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T1.sno1.like(bind("sno1")))
							.cutoff$and(S1_T1.sno2.like(bind("sno2")))
							.cutoff$and(S1_T1.sno3.like(bind("sno3")))
							.cutoff$and(S1_T1.sno4.like(bind("sno4")))
							.cutoff$and(S1_T1.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S1_T1.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S1_T1.asst_typ.like(bind("asst_typ")))
							.cutoff$and(
								S1_T1.asst_typ.in(
									bind("co_sls_str"),
									value(MAC_ASST_TYP.CO_PROD.value())
								)
							)
							.cutoff$and(S1_T1.repurc_obli_flg.eq(bind("repurc_obli_flg")))
							.cutoff$and(S1_T1.repurc_obli_flg.eq(bind("repurc_obli_oth_flg"))
									.or(S1_T1.asst_typ.eq(value(MAC_ASST_TYP.OTH.value()))))
							.cutoff$and(S1_T1.cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_T1.po_no.like(bind("po_no")))
							.cutoff$and(S1_T1.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T1.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T1.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T1.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T1.bp_cd.like(bind("bp_cd")))
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
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S1_T1.ac_rsn_cd.isNull())
							)
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T1.bp_cd.isNull())
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
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_cd"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_cd")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_cd"))
					.groupBy(DS0D, S0_T.pr("itm_cd")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_sub1"))
					.groupBy(DS0D, S0_T.pr("itm_sub1")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_sub2"))
					.groupBy(DS0D, S0_T.pr("itm_sub2")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_sub3"))
					.groupBy(DS0D, S0_T.pr("itm_sub3")),
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
					.select(DS0D, S0_T.pr("lot_no"))
					.groupBy(DS0D, S0_T.pr("lot_no")),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr("sublot_no"))
					.groupBy(DS0D, S0_T.pr("sublot_no")),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr("sno1"))
					.groupBy(DS0D, S0_T.pr("sno1")),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr("sno2"))
					.groupBy(DS0D, S0_T.pr("sno2")),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr("sno3"))
					.groupBy(DS0D, S0_T.pr("sno3")),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr("sno4"))
					.groupBy(DS0D, S0_T.pr("sno4")),
				when(boundOr("ac_slip_typ_flg"))
					.select(DS0D, S0_T.pr("ac_slip_typ"))
					.groupBy(DS0D, S0_T.pr("ac_slip_typ")),
				when(boundOr("ac_rsn_flg"))
					.select(DS0D, S0_T.pr("ac_rsn_cd"))
					.groupBy(DS0D, S0_T.pr("ac_rsn_cd")),
				when(boundOr("ac_rsn_flg"))
					.select(DS0D, S0_T.pr("ac_rsn_nm"))
					.groupBy(DS0D, S0_T.pr("ac_rsn_nm")),
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
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_cd"))
					.groupBy(DS0D, S0_T.pr("oper_cd")),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
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
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr("asst_typ"))
					.groupBy(DS0D, S0_T.pr("asst_typ")),
				when(boundOr("asst_typ_flg"))
					.select(DS0D,S0_T.pr("repurc_obli_flg"))
					.groupBy(DS0D,S0_T.pr("repurc_obli_flg")),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, S0_T.pr("trd_cur_cd"))
					.groupBy(DS0D, S0_T.pr("trd_cur_cd")),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, S0_T.pr("trd_cur_nm"))
					.groupBy(DS0D, S0_T.pr("trd_cur_nm")),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, S0_T.pr("trd_cur_amt_dec_place"))
					.groupBy(DS0D, S0_T.pr("trd_cur_amt_dec_place")),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, S0_T.pr("trd_cur_upri_dec_place"))
					.groupBy(DS0D, S0_T.pr("trd_cur_upri_dec_place")),
				when(boundOr("xrate_flg"))
					.select(DS0D, S0_T.pr("xrate"))
					.groupBy(DS0D, S0_T.pr("xrate")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(boundOr("qty_flg"))
					.select(DS0D, max(S0_T.pr("dec_place")).as("dec_place")),
				when(boundOr("dim_flg"))
					.select(DS0D, S0_T.pr("dim_unit_cd"))
					.groupBy(DS0D, S0_T.pr("dim_unit_cd")),
				when(boundOr("dim_flg"))
					.select(DS0D, S0_T.pr("dim_unit_nm"))
					.groupBy(DS0D, S0_T.pr("dim_unit_nm")),
				when(boundOr("dim_flg"))
					.select(DS0D, S0_T.pr("dim_dec_place"))
					.groupBy(DS0D, S0_T.pr("dim_dec_place")),
				when(boundOr("wt_flg"))
					.select(DS0D, S0_T.pr("wt_unit_cd"))
					.groupBy(DS0D, S0_T.pr("wt_unit_cd")),
				when(boundOr("wt_flg"))
					.select(DS0D, S0_T.pr("wt_unit_nm"))
					.groupBy(DS0D, S0_T.pr("wt_unit_nm")),
				when(boundOr("wt_flg"))
					.select(DS0D, S0_T.pr("wt_dec_place"))
					.groupBy(DS0D, S0_T.pr("wt_dec_place")),
				when(boundOr("conts_flg"))
					.select(DS0D, S0_T.pr("conts_unit_cd"))
					.groupBy(DS0D, S0_T.pr("conts_unit_cd")),
				when(boundOr("conts_flg"))
					.select(DS0D, S0_T.pr("conts_unit_nm"))
					.groupBy(DS0D, S0_T.pr("conts_unit_nm")),
				when(boundOr("conts_flg"))
					.select(DS0D, S0_T.pr("conts_dec_place"))
					.groupBy(DS0D, S0_T.pr("conts_dec_place")),
				when(null)
					.select(DS0D, S0_T.pr("ym"))
					.groupBy(DS0D, S0_T.pr("ym")),
				when(null)
					.select(DS0D, S0_T.pr("io_rec_typ"))
					.groupBy(DS0D, S0_T.pr("io_rec_typ")),
				when(null)
					.select(DS0D, sum(S0_T.pr("trd_cur_amt")).as("trd_cur_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt")).as("amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T1.qty)).as("qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("dim")).as("dim")),
				when(null)
					.select(DS0D, sum(S0_T.pr("wt")).as("wt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("conts")).as("conts")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_T1.wg_cd.as("wg_cd"))
					.groupBy(DS1D, S1_T1.wg_cd),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_WG.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_WG.wg_nm),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_T1.mng_dpt_cd.as("mng_dpt_cd"))
					.groupBy(DS1D, S1_T1.mng_dpt_cd),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_ARG).on(S1_T1.calc_no.eq(S1_ARG.calc_no).and(S1_T1.calc_grp_cd.eq(S1_ARG.calc_grp_cd)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T1.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd).and(S1_ARG.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_T1.itm_cd.as("itm_cd"))
					.groupBy(DS1D, S1_T1.itm_cd),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_T1.itm_sub1.as("itm_sub1"))
					.groupBy(DS1D, S1_T1.itm_sub1),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_T1.itm_sub2.as("itm_sub2"))
					.groupBy(DS1D, S1_T1.itm_sub2),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_T1.itm_sub3.as("itm_sub3"))
					.groupBy(DS1D, S1_T1.itm_sub3),
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
				when(boundOr("lot_flg"))
					.select(DS1D, S1_T1.lot_no.as("lot_no"))
					.groupBy(DS1D, S1_T1.lot_no),
				when(boundOr("sublot_flg"))
					.select(DS1D, S1_T1.sublot_no.as("sublot_no"))
					.groupBy(DS1D, S1_T1.sublot_no),
				when(boundOr("sno1_flg"))
					.select(DS1D, S1_T1.sno1.as("sno1"))
					.groupBy(DS1D, S1_T1.sno1),
				when(boundOr("sno2_flg"))
					.select(DS1D, S1_T1.sno2.as("sno2"))
					.groupBy(DS1D, S1_T1.sno2),
				when(boundOr("sno3_flg"))
					.select(DS1D, S1_T1.sno3.as("sno3"))
					.groupBy(DS1D, S1_T1.sno3),
				when(boundOr("sno4_flg"))
					.select(DS1D, S1_T1.sno4.as("sno4"))
					.groupBy(DS1D, S1_T1.sno4),
				when(boundOr("ac_slip_typ_flg"))
					.select(DS1D, S1_T1.ac_slip_typ.as("ac_slip_typ"))
					.groupBy(DS1D, S1_T1.ac_slip_typ),
				when(boundOr("ac_rsn_flg"))
					.select(DS1D, S1_T1.ac_rsn_cd.as("ac_rsn_cd"))
					.groupBy(DS1D, S1_T1.ac_rsn_cd),
				when(boundOr("ac_rsn_flg"))
					.select(DS1D, S1_AC_RSN.ac_rsn_nm.as("ac_rsn_nm"))
					.groupBy(DS1D, S1_AC_RSN.ac_rsn_nm),
				when(boundOr("ac_rsn_flg", "ac_rsn_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AC_RSN).on(S1_T1.ac_rsn_cd.eq(S1_AC_RSN.ac_rsn_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AC_RSN.ac_rsn_nm.like(bind("ac_rsn_nm")))),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T1.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S1_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_LOC.site_cd.eq(S1_SITE.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_T1.loc_cd.as("loc_cd"))
					.groupBy(DS1D, S1_T1.loc_cd),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_T1.str_ln_cd.as("str_ln_cd"))
					.groupBy(DS1D, S1_T1.str_ln_cd),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS1D, S1_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_T1.str_ln_cd.eq(S1_STR_LN.str_ln_cd).and(S1_T1.loc_cd.eq(S1_STR_LN.loc_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_T1.oper_cd.as("oper_cd"))
					.groupBy(DS1D, S1_T1.oper_cd),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T1.oper_cd.eq(S1_OPER.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_T1.bp_cd.as("bp_cd"))
					.groupBy(DS1D, S1_T1.bp_cd),
				when(boundOr("bp_flg", "bp_nm", "bp_grp_cd1", "bp_grp_nm1", "bp_grp_cd2", "bp_grp_nm2", "bp_grp_cd3", "bp_grp_nm3", "bp_grp_cd4", "bp_grp_nm4", "bp_grp_cd5", "bp_grp_nm5", "bp_grp_cd6", "bp_grp_nm6", "bp_grp_cd7", "bp_grp_nm7", "bp_grp_cd8", "bp_grp_nm8", "bp_grp_cd9", "bp_grp_nm9", "bp_grp_cd10", "bp_grp_nm10", "cntry_cd", "cntry_nm", "area_cd", "area_nm", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "cntry_flg", "area_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_BP.bp_cd.eq(S1_T1.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S1_BP.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S1_BP.area_cd.like(bind("area_cd"))).cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
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
				when(boundOr("asst_typ_flg"))
					.select(DS1D, S1_T1.asst_typ.as("asst_typ"))
					.groupBy(DS1D, S1_T1.asst_typ),
				when(boundOr("asst_typ_flg"))
					.select(DS1D, S1_T1.repurc_obli_flg.as("repurc_obli_flg"))
					.groupBy(DS1D, S1_T1.repurc_obli_flg),
				when(boundOr("trd_cur_flg"))
					.select(DS1D, S1_T1.cur_cd.as("trd_cur_cd"))
					.groupBy(DS1D, S1_T1.cur_cd),
				when(boundOr("trd_cur_flg"))
					.select(DS1D, S1_TRD_CUR.cur_nm.as("trd_cur_nm"))
					.groupBy(DS1D, S1_TRD_CUR.cur_nm),
				when(boundOr("trd_cur_flg", "trd_cur_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_TRD_CUR).on(S1_T1.cur_cd.eq(S1_TRD_CUR.cur_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("trd_cur_flg"))
					.select(DS1D, S1_TRD_CUR.amt_dec_place.as("trd_cur_amt_dec_place"))
					.groupBy(DS1D, S1_TRD_CUR.amt_dec_place),
				when(boundOr("trd_cur_flg"))
					.select(DS1D, S1_TRD_CUR.upri_dec_place.as("trd_cur_upri_dec_place"))
					.groupBy(DS1D, S1_TRD_CUR.upri_dec_place),
				when(boundOr("xrate_flg"))
					.select(DS1D, S1_T1.xrate.as("xrate"))
					.groupBy(DS1D, S1_T1.xrate),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm),
				when(null)
					.view(DS1D, v -> v.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("dim_flg"))
					.select(DS1D, S1_ITM.dim_unit_cd.as("dim_unit_cd"))
					.groupBy(DS1D, S1_ITM.dim_unit_cd),
				when(boundOr("dim_flg"))
					.select(DS1D, S1_DIM_UNIT.unit_nm.as("dim_unit_nm"))
					.groupBy(DS1D, S1_DIM_UNIT.unit_nm),
				when(null)
					.view(DS1D, v -> v.leftOuterJoin(S1_DIM_UNIT).on(S1_ITM.dim_unit_cd.eq(S1_DIM_UNIT.unit_cd))),
				when(boundOr("dim_flg"))
					.select(DS1D, nvl(S1_DIM_UNIT.dec_place,value(2)).as("dim_dec_place"))
					.groupBy(DS1D, nvl(S1_DIM_UNIT.dec_place,value(2))),
				when(boundOr("wt_flg"))
					.select(DS1D, S1_ITM.wt_unit_cd.as("wt_unit_cd"))
					.groupBy(DS1D, S1_ITM.wt_unit_cd),
				when(boundOr("wt_flg"))
					.select(DS1D, S1_WT_UNIT.unit_nm.as("wt_unit_nm"))
					.groupBy(DS1D, S1_WT_UNIT.unit_nm),
				when(null)
					.view(DS1D, v -> v.leftOuterJoin(S1_WT_UNIT).on(S1_ITM.wt_unit_cd.eq(S1_WT_UNIT.unit_cd))),
				when(boundOr("wt_flg"))
					.select(DS1D, nvl(S1_WT_UNIT.dec_place,value(2)).as("wt_dec_place"))
					.groupBy(DS1D, nvl(S1_WT_UNIT.dec_place,value(2))),
				when(boundOr("conts_flg"))
					.select(DS1D, S1_ITM.conts_unit_cd.as("conts_unit_cd"))
					.groupBy(DS1D, S1_ITM.conts_unit_cd),
				when(boundOr("conts_flg"))
					.select(DS1D, S1_CONTS_UNIT.unit_nm.as("conts_unit_nm"))
					.groupBy(DS1D, S1_CONTS_UNIT.unit_nm),
				when(null)
					.view(DS1D, v -> v.leftOuterJoin(S1_CONTS_UNIT).on(S1_ITM.conts_unit_cd.eq(S1_CONTS_UNIT.unit_cd))),
				when(boundOr("conts_flg"))
					.select(DS1D, nvl(S1_CONTS_UNIT.dec_place,value(2)).as("conts_dec_place"))
					.groupBy(DS1D, nvl(S1_CONTS_UNIT.dec_place,value(2))),
				when(null)
					.select(DS1D, S1_T1.ym.as("ym"))
					.groupBy(DS1D, S1_T1.ym)
			);
	}
}