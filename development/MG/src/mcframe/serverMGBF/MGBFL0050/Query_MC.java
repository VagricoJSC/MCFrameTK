package mcframe.serverMGBF.MGBFL0050;

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
	 * MGBFL0050_MGT_ACC_SML_COST_S01
	 */
	static MCQueryPlan MGBFL0050_MGT_ACC_SML_COST_S01() {
		MGT_CALC_SLS_R S0T = MGT_CALC_SLS_R.create("T");
		MGT_ACC_TOP_R S0T2 = MGT_ACC_TOP_R.create("T2");
		MGT_ACC_SML_COST_R S0T3 = MGT_ACC_SML_COST_R.create("T3");
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
		MAM_BP_R CST = MAM_BP_R.create("CST");
		MAM_BP_GRP_R CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MAM_CNTRY_R CST_CNTRY = MAM_CNTRY_R.create("CST_CNTRY");
		MAM_AREA_R CST_AREA = MAM_AREA_R.create("CST_AREA");
		MAM_BP_R DLV = MAM_BP_R.create("DLV");
		MAM_BP_GRP_R DLV_GRP1 = MAM_BP_GRP_R.create("DLV_GRP1");
		MAM_BP_GRP_R DLV_GRP2 = MAM_BP_GRP_R.create("DLV_GRP2");
		MAM_BP_GRP_R DLV_GRP3 = MAM_BP_GRP_R.create("DLV_GRP3");
		MAM_BP_GRP_R DLV_GRP4 = MAM_BP_GRP_R.create("DLV_GRP4");
		MAM_BP_GRP_R DLV_GRP5 = MAM_BP_GRP_R.create("DLV_GRP5");
		MAM_BP_GRP_R DLV_GRP6 = MAM_BP_GRP_R.create("DLV_GRP6");
		MAM_BP_GRP_R DLV_GRP7 = MAM_BP_GRP_R.create("DLV_GRP7");
		MAM_BP_GRP_R DLV_GRP8 = MAM_BP_GRP_R.create("DLV_GRP8");
		MAM_BP_GRP_R DLV_GRP9 = MAM_BP_GRP_R.create("DLV_GRP9");
		MAM_BP_GRP_R DLV_GRP10 = MAM_BP_GRP_R.create("DLV_GRP10");
		MAM_CNTRY_R DLV_CNTRY = MAM_CNTRY_R.create("DLV_CNTRY");
		MAM_AREA_R DLV_AREA = MAM_AREA_R.create("DLV_AREA");
		MAM_COST_DPT_R SLS_DPT = MAM_COST_DPT_R.create("SLS_DPT");
		MAM_USR_R SLS_USR = MAM_USR_R.create("SLS_USR");
		MAM_BP_R STK_BP = MAM_BP_R.create("STK_BP");
		MAM_COST_DPT_R ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_BP_R DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R DEST3 = MAM_BP_R.create("DEST3");
		MAM_COST_SLS_R COST_SLS1 = MAM_COST_SLS_R.create("COST_SLS1");
		MAM_COST_SLS_R COST_SLS2 = MAM_COST_SLS_R.create("COST_SLS2");
		MAM_COST_SLS_R COST_SLS3 = MAM_COST_SLS_R.create("COST_SLS3");
		MAM_COST_SLS_R COST_SLS4 = MAM_COST_SLS_R.create("COST_SLS4");
		MAM_COST_SLS_R COST_SLS5 = MAM_COST_SLS_R.create("COST_SLS5");
		MAM_UNIT_R UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CUR_R TRD_CUR = MAM_CUR_R.create("TRD_CUR");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBFL0050_MGT_ACC_SML_COST_Query_S01")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T.calc_grp_cd,
							S0T.calc_no,
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
							S0T.ac_slip_typ,
							S0T.ac_rsn_cd,
							S0T.asst_typ,
							S0T.cst_cd,
							S0T.dlv_cd,
							S0T.slo_no,
							S0T.iv_no,
							S0T.sls_dpt_cd,
							S0T.sls_usr_cd,
							S0T.stk_bp_cd,
							S0T.alc_dpt_cd,
							S0T.dest_cd1,
							S0T.dest_cd2,
							S0T.dest_cd3,
							S0T.cost_sls_cd1,
							S0T.cost_sls_cd2,
							S0T.cost_sls_cd3,
							S0T.cost_sls_cd4,
							S0T.cost_sls_cd5,
							S0T.rec_eval_typ,
							S0T2.top_rec_no,
							S0T2.cur_cd.as("trd_cur_cd"),
							nvl(
								S0T2.xrate,
								value(0)
							).as("xrate"),
							nvl(
								S0T2.std_xrate,
								value(0)
							).as("std_xrate"),
							nvl(
								S0T2.std_upri,
								value(0)
							).as("std_upri"),
							nvl(
								S0T3.std_cost,
								value(0)
							).as("std_cost"),
							nvl(
								S0T3.act_cost,
								value(0)
							).as("act_cost"),
							decode(
								S0EXPNS.expns_typ,
								value(MAC_EXPNS_TYP.PROD.value()),
								S0T3.std_cost,
								value(0)
							).as("std_sls_cost"),
							decode(
								S0EXPNS.expns_typ,
								value(MAC_EXPNS_TYP.SGA.value()),
								S0T3.std_cost,
								value(0)
							).as("std_sls_mng_cost"),
							S0T3.expns_typ,
							S0ITM.dec_place,
							S0EXPNS.var_typ,
							S0EXPNS.expns_cd,
							S0EXPNS.expns_grp_cd,
							addDynamicSelect(core)
						)
						.from(
							S0T
							.leftOuterJoin(S0T2).on(
								S0T.act_sls_id.eq(S0T2.act_id)
								.and(S0T.act_sls_id_sub.eq(S0T2.act_id_sub))
								.and(S0T.calc_grp_cd.eq(S0T2.calc_grp_cd))
								.and(S0T.calc_no.eq(S0T2.calc_no))
								.and(
									nvl(
										S0T2.calc_rec_typ,
										value(MGC_CALC_REC_TYP.SLS.value())
									).eq(value(MGC_CALC_REC_TYP.SLS.value()))
								)
							)
							.leftOuterJoin(S0T3).on(
								S0T2.calc_no.eq(S0T3.calc_no)
								.and(S0T2.calc_grp_cd.eq(S0T3.calc_grp_cd))
								.and(S0T2.top_rec_no.eq(S0T3.top_rec_no))
								.and(
									nvl(
										S0T3.expns_typ,
										value(MAC_EXPNS_TYP.PROD.value())
									).in(
										value(MAC_EXPNS_TYP.PROD.value()),
										value(MAC_EXPNS_TYP.SGA.value())
									)
								)
							)
							.innerJoin(S0WG).on(S0T.wg_cd.eq(S0WG.wg_cd))
							.leftOuterJoin(S0ITM).on(
								S0T.itm_cd.eq(S0ITM.itm_cd)
								.and(S0T.itm_sub1.eq(S0ITM.itm_sub1))
								.and(S0T.itm_sub2.eq(S0ITM.itm_sub2))
								.and(S0T.itm_sub3.eq(S0ITM.itm_sub3))
							)
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
							.leftOuterJoin(S0EXPNS).on(S0T3.expns_cd.eq(S0EXPNS.expns_cd))
							.addDynamicView(core)
						)
						.where(
							value(0).eq(value(0))
							.and(S0T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S0T.calc_no.like(bind("calc_no")))
							.cutoff$and(S0T.calc_grp_cd.like(bind("calc_grp_cd")))
							.cutoff$and(S0T.calc_no.like(bind("calc_no")))
							.cutoff$and(S0T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S0WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S0T.ym.eq(bind("ym")))
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
							.cutoff$and(S0T.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S0T.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S0T2.cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S0T.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S0T.dlv_cd.like(bind("dlv_cd")))
							.cutoff$and(S0T.slo_no.like(bind("slo_no")))
							.cutoff$and(S0T.iv_no.like(bind("iv_no")))
							.cutoff$and(S0T.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S0T.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S0T.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S0T.alc_dpt_cd.like(bind("alc_dpt_cd")))
							.cutoff$and(S0T.dest_cd1.like(bind("dest_cd1")))
							.cutoff$and(S0T.dest_cd2.like(bind("dest_cd2")))
							.cutoff$and(S0T.dest_cd3.like(bind("dest_cd3")))
							.cutoff$and(S0T.cost_sls_cd1.like(bind("cost_sls_cd1")))
							.cutoff$and(S0T.cost_sls_cd2.like(bind("cost_sls_cd2")))
							.cutoff$and(S0T.cost_sls_cd3.like(bind("cost_sls_cd3")))
							.cutoff$and(S0T.cost_sls_cd4.like(bind("cost_sls_cd4")))
							.cutoff$and(S0T.cost_sls_cd5.like(bind("cost_sls_cd5")))
							.cutoff$and(S0T.rec_eval_typ.like(bind("rec_eval_typ")))
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
								bind("no_stk_bp_flg_str").eq(value(true))
								.and(S0T2.stk_bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S0T2.ac_rsn_cd.isNull())
							)
							.cutoff$and(
								bind("no_slo_no_flg_str").eq(value(true))
								.and(S0T2.slo_no.isNull())
							)
							.cutoff$and(
								bind("no_iv_no_flg_str").eq(value(true))
								.and(S0T2.iv_no.isNull())
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
					.select(aggr,T.pr("wg_cd"))
					.groupBy(aggr,T.pr("wg_cd"))
					.orderBy(T.pr("wg_cd").asc()),
				when(boundOr("ym_flg"))
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
				when(boundOr("ac_slip_typ_flg"))
					.select(aggr,T.pr("ac_slip_typ"))
					.groupBy(aggr,T.pr("ac_slip_typ"))
					.orderBy(T.pr("ac_slip_typ").asc()),
				when(boundOr("ac_rsn_flg"))
					.select(aggr,T.pr("ac_rsn_cd"))
					.groupBy(aggr,T.pr("ac_rsn_cd"))
					.orderBy(T.pr("ac_rsn_cd").asc()),
				when(boundOr("asst_typ_flg"))
					.select(aggr,T.pr("asst_typ"))
					.groupBy(aggr,T.pr("asst_typ"))
					.orderBy(T.pr("asst_typ").asc()),
				when(boundOr("cst_flg"))
					.select(aggr,T.pr("cst_cd"))
					.groupBy(aggr,T.pr("cst_cd"))
					.orderBy(T.pr("cst_cd").asc()),
				when(boundOr("cst_flg","cst_nm","cst_grp_cd1","cst_grp_nm1","cst_grp_cd2","cst_grp_nm2","cst_grp_cd3","cst_grp_nm3","cst_grp_cd4","cst_grp_nm4","cst_grp_cd5","cst_grp_nm5","cst_grp_cd6","cst_grp_nm6","cst_grp_cd7","cst_grp_nm7","cst_grp_cd8","cst_grp_nm8","cst_grp_cd9","cst_grp_nm9","cst_grp_cd10","cst_grp_nm10","cst_cntry_cd","cst_cntry_nm","cst_area_cd","cst_area_nm","cst_grp_flg1","cst_grp_flg2","cst_grp_flg3","cst_grp_flg4","cst_grp_flg5","cst_grp_flg6","cst_grp_flg7","cst_grp_flg8","cst_grp_flg9","cst_grp_flg10","cst_cntry_flg","cst_area_flg"))
					.view(core, v -> v.leftOuterJoin(CST).on(S0T.cst_cd.eq(CST.bp_cd)))
					.predicate(core, p -> p.cutoff$and(CST.bp_nm.like(bind("CST_NM"))).cutoff$and(CST.cntry_cd.like(bind("CST_CNTRY_CD"))).cutoff$and(CST.area_cd.like(bind("CST_AREA_CD"))).cutoff$and(CST.bp_grp_cd1.like(bind("CST_GRP_CD1"))).cutoff$and(CST.bp_grp_cd2.like(bind("CST_GRP_CD2"))).cutoff$and(CST.bp_grp_cd3.like(bind("CST_GRP_CD3"))).cutoff$and(CST.bp_grp_cd4.like(bind("CST_GRP_CD4"))).cutoff$and(CST.bp_grp_cd5.like(bind("CST_GRP_CD5"))).cutoff$and(CST.bp_grp_cd6.like(bind("CST_GRP_CD6"))).cutoff$and(CST.bp_grp_cd7.like(bind("CST_GRP_CD7"))).cutoff$and(CST.bp_grp_cd8.like(bind("CST_GRP_CD8"))).cutoff$and(CST.bp_grp_cd9.like(bind("CST_GRP_CD9"))).cutoff$and(CST.bp_grp_cd10.like(bind("CST_GRP_CD10")))),
				when(boundOr("dlv_flg"))
					.select(aggr,T.pr("dlv_cd"))
					.groupBy(aggr,T.pr("dlv_cd"))
					.orderBy(T.pr("dlv_cd").asc()),
				when(boundOr("dlv_flg","dlv_nm","dlv_grp_cd1","dlv_grp_nm1","dlv_grp_cd2","dlv_grp_nm2","dlv_grp_cd3","dlv_grp_nm3","dlv_grp_cd4","dlv_grp_nm4","dlv_grp_cd5","dlv_grp_nm5","dlv_grp_cd6","dlv_grp_nm6","dlv_grp_cd7","dlv_grp_nm7","dlv_grp_cd8","dlv_grp_nm8","dlv_grp_cd9","dlv_grp_nm9","dlv_grp_cd10","dlv_grp_nm10","dlv_cntry_cd","dlv_cntry_nm","dlv_area_cd","dlv_area_nm","dlv_grp_flg1","dlv_grp_flg2","dlv_grp_flg3","dlv_grp_flg4","dlv_grp_flg5","dlv_grp_flg6","dlv_grp_flg7","dlv_grp_flg8","dlv_grp_flg9","dlv_grp_flg10","dlv_cntry_flg","dlv_area_flg"))
					.view(core, v -> v.leftOuterJoin(DLV).on(S0T.dlv_cd.eq(DLV.bp_cd)))
					.predicate(core, p -> p.cutoff$and(DLV.bp_nm.like(bind("DLV_NM"))).cutoff$and(DLV.cntry_cd.like(bind("DLV_CNTRY_CD"))).cutoff$and(DLV.area_cd.like(bind("DLV_AREA_CD"))).cutoff$and(DLV.bp_grp_cd1.like(bind("DLV_GRP_CD1"))).cutoff$and(DLV.bp_grp_cd2.like(bind("DLV_GRP_CD2"))).cutoff$and(DLV.bp_grp_cd3.like(bind("DLV_GRP_CD3"))).cutoff$and(DLV.bp_grp_cd4.like(bind("DLV_GRP_CD4"))).cutoff$and(DLV.bp_grp_cd5.like(bind("DLV_GRP_CD5"))).cutoff$and(DLV.bp_grp_cd6.like(bind("DLV_GRP_CD6"))).cutoff$and(DLV.bp_grp_cd7.like(bind("DLV_GRP_CD7"))).cutoff$and(DLV.bp_grp_cd8.like(bind("DLV_GRP_CD8"))).cutoff$and(DLV.bp_grp_cd9.like(bind("DLV_GRP_CD9"))).cutoff$and(DLV.bp_grp_cd10.like(bind("DLV_GRP_CD10")))),
				when(boundOr("slo_no_flg"))
					.select(aggr,T.pr("slo_no"))
					.groupBy(aggr,T.pr("slo_no"))
					.orderBy(T.pr("slo_no").asc()),
				when(boundOr("iv_no_flg"))
					.select(aggr,T.pr("iv_no"))
					.groupBy(aggr,T.pr("iv_no"))
					.orderBy(T.pr("iv_no").asc()),
				when(boundOr("sls_dpt_flg"))
					.select(aggr,T.pr("sls_dpt_cd"))
					.groupBy(aggr,T.pr("sls_dpt_cd"))
					.orderBy(T.pr("sls_dpt_cd").asc()),
				when(boundOr("sls_usr_flg"))
					.select(aggr,T.pr("sls_usr_cd"))
					.groupBy(aggr,T.pr("sls_usr_cd"))
					.orderBy(T.pr("sls_usr_cd").asc()),
				when(boundOr("stk_bp_flg"))
					.select(aggr,T.pr("stk_bp_cd"))
					.groupBy(aggr,T.pr("stk_bp_cd"))
					.orderBy(T.pr("stk_bp_cd").asc()),
				when(boundOr("alc_dpt_flg"))
					.select(aggr,T.pr("alc_dpt_cd"))
					.groupBy(aggr,T.pr("alc_dpt_cd"))
					.orderBy(T.pr("alc_dpt_cd").asc()),
				when(boundOr("dest1_flg"))
					.select(aggr,T.pr("dest_cd1"))
					.groupBy(aggr,T.pr("dest_cd1"))
					.orderBy(T.pr("dest_cd1").asc()),
				when(boundOr("dest2_flg"))
					.select(aggr,T.pr("dest_cd2"))
					.groupBy(aggr,T.pr("dest_cd2"))
					.orderBy(T.pr("dest_cd2").asc()),
				when(boundOr("dest3_flg"))
					.select(aggr,T.pr("dest_cd3"))
					.groupBy(aggr,T.pr("dest_cd3"))
					.orderBy(T.pr("dest_cd3").asc()),
				when(boundOr("cost_sls1_flg"))
					.select(aggr,T.pr("cost_sls_cd1"))
					.groupBy(aggr,T.pr("cost_sls_cd1"))
					.orderBy(T.pr("cost_sls_cd1").asc()),
				when(boundOr("cost_sls2_flg"))
					.select(aggr,T.pr("cost_sls_cd2"))
					.groupBy(aggr,T.pr("cost_sls_cd2"))
					.orderBy(T.pr("cost_sls_cd2").asc()),
				when(boundOr("cost_sls3_flg"))
					.select(aggr,T.pr("cost_sls_cd3"))
					.groupBy(aggr,T.pr("cost_sls_cd3"))
					.orderBy(T.pr("cost_sls_cd3").asc()),
				when(boundOr("cost_sls4_flg"))
					.select(aggr,T.pr("cost_sls_cd4"))
					.groupBy(aggr,T.pr("cost_sls_cd4"))
					.orderBy(T.pr("cost_sls_cd4").asc()),
				when(boundOr("cost_sls5_flg"))
					.select(aggr,T.pr("cost_sls_cd5"))
					.groupBy(aggr,T.pr("cost_sls_cd5"))
					.orderBy(T.pr("cost_sls_cd5").asc()),
				when(boundOr("rec_eval_typ_flg"))
					.select(aggr,T.pr("rec_eval_typ"))
					.groupBy(aggr,T.pr("rec_eval_typ"))
					.orderBy(T.pr("rec_eval_typ").asc()),
				when(boundOr("mng_dpt_flg","mng_dpt_nm","sls_dpt_flg","sls_dpt_nm","alc_dpt_flg","alc_dpt_nm"))
					.view(core, v -> v.innerJoin(ARG).on(S0T.calc_no.eq(ARG.calc_no).and(S0T.calc_grp_cd.eq(ARG.calc_grp_cd)))),
				when(null)
					.select(aggr,T.pr("calc_grp_cd"))
					.groupBy(aggr,T.pr("calc_grp_cd")),
				when(boundOr("wg_flg"))
					.select(aggr,T.pr("wg_nm"))
					.groupBy(aggr,T.pr("wg_nm")),
				when(boundOr("mng_dpt_flg"))
					.select(core,MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.select(aggr,T.pr("mng_dpt_nm"))
					.groupBy(core,MNG_DPT.dpt_nm)
					.groupBy(aggr,T.pr("mng_dpt_nm")),
				when(boundOr("mng_dpt_flg","mng_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(MNG_DPT).on(S0T.mng_dpt_cd.eq(MNG_DPT.dpt_cd).and(ARG.term.eq(MNG_DPT.term))))
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
					.view(core, v -> v.leftOuterJoin(AC_RSN).on(S0T.ac_rsn_cd.eq(AC_RSN.ac_rsn_cd)))
					.predicate(core, p -> p.cutoff$and(AC_RSN.ac_rsn_nm.like(bind("AC_RSN_NM")))),
				when(boundOr("cst_flg"))
					.select(core,CST.bp_nm.as("cst_nm"))
					.select(aggr,T.pr("cst_nm"))
					.groupBy(core,CST.bp_nm)
					.groupBy(aggr,T.pr("cst_nm")),
				when(boundOr("cst_grp_flg1"))
					.select(core,CST.bp_grp_cd1.as("cst_grp_cd1"))
					.select(aggr,T.pr("cst_grp_cd1"))
					.groupBy(core,CST.bp_grp_cd1)
					.groupBy(aggr,T.pr("cst_grp_cd1")),
				when(boundOr("cst_grp_flg1"))
					.select(core,CST_GRP1.bp_grp_nm.as("cst_grp_nm1"))
					.select(aggr,T.pr("cst_grp_nm1"))
					.groupBy(core,CST_GRP1.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm1")),
				when(boundOr("cst_grp_flg1","cst_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(CST_GRP1).on(CST.bp_grp_cd1.eq(CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(CST_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP1.bp_grp_nm.like(bind("CST_GRP_NM1")))),
				when(boundOr("cst_grp_flg2"))
					.select(core,CST.bp_grp_cd2.as("cst_grp_cd2"))
					.select(aggr,T.pr("cst_grp_cd2"))
					.groupBy(core,CST.bp_grp_cd2)
					.groupBy(aggr,T.pr("cst_grp_cd2")),
				when(boundOr("cst_grp_flg2"))
					.select(core,CST_GRP2.bp_grp_nm.as("cst_grp_nm2"))
					.select(aggr,T.pr("cst_grp_nm2"))
					.groupBy(core,CST_GRP2.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm2")),
				when(boundOr("cst_grp_flg2","cst_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(CST_GRP2).on(CST.bp_grp_cd2.eq(CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(CST_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP2.bp_grp_nm.like(bind("CST_GRP_NM2")))),
				when(boundOr("cst_grp_flg3"))
					.select(core,CST.bp_grp_cd3.as("cst_grp_cd3"))
					.select(aggr,T.pr("cst_grp_cd3"))
					.groupBy(core,CST.bp_grp_cd3)
					.groupBy(aggr,T.pr("cst_grp_cd3")),
				when(boundOr("cst_grp_flg3"))
					.select(core,CST_GRP3.bp_grp_nm.as("cst_grp_nm3"))
					.select(aggr,T.pr("cst_grp_nm3"))
					.groupBy(core,CST_GRP3.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm3")),
				when(boundOr("cst_grp_flg3","cst_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(CST_GRP3).on(CST.bp_grp_cd3.eq(CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(CST_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP3.bp_grp_nm.like(bind("CST_GRP_NM3")))),
				when(boundOr("cst_grp_flg4"))
					.select(core,CST.bp_grp_cd4.as("cst_grp_cd4"))
					.select(aggr,T.pr("cst_grp_cd4"))
					.groupBy(core,CST.bp_grp_cd4)
					.groupBy(aggr,T.pr("cst_grp_cd4")),
				when(boundOr("cst_grp_flg4"))
					.select(core,CST_GRP4.bp_grp_nm.as("cst_grp_nm4"))
					.select(aggr,T.pr("cst_grp_nm4"))
					.groupBy(core,CST_GRP4.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm4")),
				when(boundOr("cst_grp_flg4","cst_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(CST_GRP4).on(CST.bp_grp_cd4.eq(CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(CST_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP4.bp_grp_nm.like(bind("CST_GRP_NM4")))),
				when(boundOr("cst_grp_flg5"))
					.select(core,CST.bp_grp_cd5.as("cst_grp_cd5"))
					.select(aggr,T.pr("cst_grp_cd5"))
					.groupBy(core,CST.bp_grp_cd5)
					.groupBy(aggr,T.pr("cst_grp_cd5")),
				when(boundOr("cst_grp_flg5"))
					.select(core,CST_GRP5.bp_grp_nm.as("cst_grp_nm5"))
					.select(aggr,T.pr("cst_grp_nm5"))
					.groupBy(core,CST_GRP5.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm5")),
				when(boundOr("cst_grp_flg5","cst_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(CST_GRP5).on(CST.bp_grp_cd5.eq(CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(CST_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP5.bp_grp_nm.like(bind("CST_GRP_NM5")))),
				when(boundOr("cst_grp_flg6"))
					.select(core,CST.bp_grp_cd6.as("cst_grp_cd6"))
					.select(aggr,T.pr("cst_grp_cd6"))
					.groupBy(core,CST.bp_grp_cd6)
					.groupBy(aggr,T.pr("cst_grp_cd6")),
				when(boundOr("cst_grp_flg6"))
					.select(core,CST_GRP6.bp_grp_nm.as("cst_grp_nm6"))
					.select(aggr,T.pr("cst_grp_nm6"))
					.groupBy(core,CST_GRP6.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm6")),
				when(boundOr("cst_grp_flg6","cst_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(CST_GRP6).on(CST.bp_grp_cd6.eq(CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(CST_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP6.bp_grp_nm.like(bind("CST_GRP_NM6")))),
				when(boundOr("cst_grp_flg7"))
					.select(core,CST.bp_grp_cd7.as("cst_grp_cd7"))
					.select(aggr,T.pr("cst_grp_cd7"))
					.groupBy(core,CST.bp_grp_cd7)
					.groupBy(aggr,T.pr("cst_grp_cd7")),
				when(boundOr("cst_grp_flg7"))
					.select(core,CST_GRP7.bp_grp_nm.as("cst_grp_nm7"))
					.select(aggr,T.pr("cst_grp_nm7"))
					.groupBy(core,CST_GRP7.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm7")),
				when(boundOr("cst_grp_flg7","cst_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(CST_GRP7).on(CST.bp_grp_cd7.eq(CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(CST_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP7.bp_grp_nm.like(bind("CST_GRP_NM7")))),
				when(boundOr("cst_grp_flg8"))
					.select(core,CST.bp_grp_cd8.as("cst_grp_cd8"))
					.select(aggr,T.pr("cst_grp_cd8"))
					.groupBy(core,CST.bp_grp_cd8)
					.groupBy(aggr,T.pr("cst_grp_cd8")),
				when(boundOr("cst_grp_flg8"))
					.select(core,CST_GRP8.bp_grp_nm.as("cst_grp_nm8"))
					.select(aggr,T.pr("cst_grp_nm8"))
					.groupBy(core,CST_GRP8.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm8")),
				when(boundOr("cst_grp_flg8","cst_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(CST_GRP8).on(CST.bp_grp_cd8.eq(CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(CST_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP8.bp_grp_nm.like(bind("CST_GRP_NM8")))),
				when(boundOr("cst_grp_flg9"))
					.select(core,CST.bp_grp_cd9.as("cst_grp_cd9"))
					.select(aggr,T.pr("cst_grp_cd9"))
					.groupBy(core,CST.bp_grp_cd9)
					.groupBy(aggr,T.pr("cst_grp_cd9")),
				when(boundOr("cst_grp_flg9"))
					.select(core,CST_GRP9.bp_grp_nm.as("cst_grp_nm9"))
					.select(aggr,T.pr("cst_grp_nm9"))
					.groupBy(core,CST_GRP9.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm9")),
				when(boundOr("cst_grp_flg9","cst_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(CST_GRP9).on(CST.bp_grp_cd9.eq(CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(CST_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP9.bp_grp_nm.like(bind("CST_GRP_NM9")))),
				when(boundOr("cst_grp_flg10"))
					.select(core,CST.bp_grp_cd10.as("cst_grp_cd10"))
					.select(aggr,T.pr("cst_grp_cd10"))
					.groupBy(core,CST.bp_grp_cd10)
					.groupBy(aggr,T.pr("cst_grp_cd10")),
				when(boundOr("cst_grp_flg10"))
					.select(core,CST_GRP10.bp_grp_nm.as("cst_grp_nm10"))
					.select(aggr,T.pr("cst_grp_nm10"))
					.groupBy(core,CST_GRP10.bp_grp_nm)
					.groupBy(aggr,T.pr("cst_grp_nm10")),
				when(boundOr("cst_grp_flg10","cst_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(CST_GRP10).on(CST.bp_grp_cd10.eq(CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(CST_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP10.bp_grp_nm.like(bind("CST_GRP_NM10")))),
				when(boundOr("cst_cntry_flg"))
					.select(core,CST.cntry_cd.as("cst_cntry_cd"))
					.select(aggr,T.pr("cst_cntry_cd"))
					.groupBy(core,CST.cntry_cd)
					.groupBy(aggr,T.pr("cst_cntry_cd")),
				when(boundOr("cst_cntry_flg"))
					.select(core,CST_CNTRY.cntry_nm.as("cst_cntry_nm"))
					.select(aggr,T.pr("cst_cntry_nm"))
					.groupBy(core,CST_CNTRY.cntry_nm)
					.groupBy(aggr,T.pr("cst_cntry_nm")),
				when(boundOr("cst_cntry_flg","cst_cntry_nm"))
					.view(core, v -> v.leftOuterJoin(CST_CNTRY).on(CST.cntry_cd.eq(CST_CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(CST_CNTRY.cntry_nm.like(bind("CST_CNTRY_NM")))),
				when(boundOr("cst_area_flg"))
					.select(core,CST.area_cd.as("cst_area_cd"))
					.select(aggr,T.pr("cst_area_cd"))
					.groupBy(core,CST.area_cd)
					.groupBy(aggr,T.pr("cst_area_cd")),
				when(boundOr("cst_area_flg"))
					.select(core,CST_AREA.area_nm.as("cst_area_nm"))
					.select(aggr,T.pr("cst_area_nm"))
					.groupBy(core,CST_AREA.area_nm)
					.groupBy(aggr,T.pr("cst_area_nm")),
				when(boundOr("cst_area_flg","cst_area_nm"))
					.view(core, v -> v.leftOuterJoin(CST_AREA).on(CST.area_cd.eq(CST_AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(CST_AREA.area_nm.like(bind("CST_AREA_NM")))),
				when(boundOr("dlv_flg"))
					.select(core,DLV.bp_nm.as("dlv_nm"))
					.select(aggr,T.pr("dlv_nm"))
					.groupBy(core,DLV.bp_nm)
					.groupBy(aggr,T.pr("dlv_nm")),
				when(boundOr("dlv_grp_flg1"))
					.select(core,DLV.bp_grp_cd1.as("dlv_grp_cd1"))
					.select(aggr,T.pr("dlv_grp_cd1"))
					.groupBy(core,DLV.bp_grp_cd1)
					.groupBy(aggr,T.pr("dlv_grp_cd1")),
				when(boundOr("dlv_grp_flg1"))
					.select(core,DLV_GRP1.bp_grp_nm.as("dlv_grp_nm1"))
					.select(aggr,T.pr("dlv_grp_nm1"))
					.groupBy(core,DLV_GRP1.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm1")),
				when(boundOr("dlv_grp_flg1","dlv_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP1).on(DLV.bp_grp_cd1.eq(DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(DLV_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP1.bp_grp_nm.like(bind("DLV_GRP_NM1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(core,DLV.bp_grp_cd2.as("dlv_grp_cd2"))
					.select(aggr,T.pr("dlv_grp_cd2"))
					.groupBy(core,DLV.bp_grp_cd2)
					.groupBy(aggr,T.pr("dlv_grp_cd2")),
				when(boundOr("dlv_grp_flg2"))
					.select(core,DLV_GRP2.bp_grp_nm.as("dlv_grp_nm2"))
					.select(aggr,T.pr("dlv_grp_nm2"))
					.groupBy(core,DLV_GRP2.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm2")),
				when(boundOr("dlv_grp_flg2","dlv_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP2).on(DLV.bp_grp_cd2.eq(DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(DLV_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP2.bp_grp_nm.like(bind("DLV_GRP_NM2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(core,DLV.bp_grp_cd3.as("dlv_grp_cd3"))
					.select(aggr,T.pr("dlv_grp_cd3"))
					.groupBy(core,DLV.bp_grp_cd3)
					.groupBy(aggr,T.pr("dlv_grp_cd3")),
				when(boundOr("dlv_grp_flg3"))
					.select(core,DLV_GRP3.bp_grp_nm.as("dlv_grp_nm3"))
					.select(aggr,T.pr("dlv_grp_nm3"))
					.groupBy(core,DLV_GRP3.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm3")),
				when(boundOr("dlv_grp_flg3","dlv_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP3).on(DLV.bp_grp_cd3.eq(DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(DLV_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP3.bp_grp_nm.like(bind("DLV_GRP_NM3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(core,DLV.bp_grp_cd4.as("dlv_grp_cd4"))
					.select(aggr,T.pr("dlv_grp_cd4"))
					.groupBy(core,DLV.bp_grp_cd4)
					.groupBy(aggr,T.pr("dlv_grp_cd4")),
				when(boundOr("dlv_grp_flg4"))
					.select(core,DLV_GRP4.bp_grp_nm.as("dlv_grp_nm4"))
					.select(aggr,T.pr("dlv_grp_nm4"))
					.groupBy(core,DLV_GRP4.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm4")),
				when(boundOr("dlv_grp_flg4","dlv_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP4).on(DLV.bp_grp_cd4.eq(DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(DLV_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP4.bp_grp_nm.like(bind("DLV_GRP_NM4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(core,DLV.bp_grp_cd5.as("dlv_grp_cd5"))
					.select(aggr,T.pr("dlv_grp_cd5"))
					.groupBy(core,DLV.bp_grp_cd5)
					.groupBy(aggr,T.pr("dlv_grp_cd5")),
				when(boundOr("dlv_grp_flg5"))
					.select(core,DLV_GRP5.bp_grp_nm.as("dlv_grp_nm5"))
					.select(aggr,T.pr("dlv_grp_nm5"))
					.groupBy(core,DLV_GRP5.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm5")),
				when(boundOr("dlv_grp_flg5","dlv_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP5).on(DLV.bp_grp_cd5.eq(DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(DLV_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP5.bp_grp_nm.like(bind("DLV_GRP_NM5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(core,DLV.bp_grp_cd6.as("dlv_grp_cd6"))
					.select(aggr,T.pr("dlv_grp_cd6"))
					.groupBy(core,DLV.bp_grp_cd6)
					.groupBy(aggr,T.pr("dlv_grp_cd6")),
				when(boundOr("dlv_grp_flg6"))
					.select(core,DLV_GRP6.bp_grp_nm.as("dlv_grp_nm6"))
					.select(aggr,T.pr("dlv_grp_nm6"))
					.groupBy(core,DLV_GRP6.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm6")),
				when(boundOr("dlv_grp_flg6","dlv_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP6).on(DLV.bp_grp_cd6.eq(DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(DLV_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP6.bp_grp_nm.like(bind("DLV_GRP_NM6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(core,DLV.bp_grp_cd7.as("dlv_grp_cd7"))
					.select(aggr,T.pr("dlv_grp_cd7"))
					.groupBy(core,DLV.bp_grp_cd7)
					.groupBy(aggr,T.pr("dlv_grp_cd7")),
				when(boundOr("dlv_grp_flg7"))
					.select(core,DLV_GRP7.bp_grp_nm.as("dlv_grp_nm7"))
					.select(aggr,T.pr("dlv_grp_nm7"))
					.groupBy(core,DLV_GRP7.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm7")),
				when(boundOr("dlv_grp_flg7","dlv_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP7).on(DLV.bp_grp_cd7.eq(DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(DLV_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP7.bp_grp_nm.like(bind("DLV_GRP_NM7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(core,DLV.bp_grp_cd8.as("dlv_grp_cd8"))
					.select(aggr,T.pr("dlv_grp_cd8"))
					.groupBy(core,DLV.bp_grp_cd8)
					.groupBy(aggr,T.pr("dlv_grp_cd8")),
				when(boundOr("dlv_grp_flg8"))
					.select(core,DLV_GRP8.bp_grp_nm.as("dlv_grp_nm8"))
					.select(aggr,T.pr("dlv_grp_nm8"))
					.groupBy(core,DLV_GRP8.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm8")),
				when(boundOr("dlv_grp_flg8","dlv_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP8).on(DLV.bp_grp_cd8.eq(DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(DLV_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP8.bp_grp_nm.like(bind("DLV_GRP_NM8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(core,DLV.bp_grp_cd9.as("dlv_grp_cd9"))
					.select(aggr,T.pr("dlv_grp_cd9"))
					.groupBy(core,DLV.bp_grp_cd9)
					.groupBy(aggr,T.pr("dlv_grp_cd9")),
				when(boundOr("dlv_grp_flg9"))
					.select(core,DLV_GRP9.bp_grp_nm.as("dlv_grp_nm9"))
					.select(aggr,T.pr("dlv_grp_nm9"))
					.groupBy(core,DLV_GRP9.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm9")),
				when(boundOr("dlv_grp_flg9","dlv_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP9).on(DLV.bp_grp_cd9.eq(DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(DLV_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP9.bp_grp_nm.like(bind("DLV_GRP_NM9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(core,DLV.bp_grp_cd10.as("dlv_grp_cd10"))
					.select(aggr,T.pr("dlv_grp_cd10"))
					.groupBy(core,DLV.bp_grp_cd10)
					.groupBy(aggr,T.pr("dlv_grp_cd10")),
				when(boundOr("dlv_grp_flg10"))
					.select(core,DLV_GRP10.bp_grp_nm.as("dlv_grp_nm10"))
					.select(aggr,T.pr("dlv_grp_nm10"))
					.groupBy(core,DLV_GRP10.bp_grp_nm)
					.groupBy(aggr,T.pr("dlv_grp_nm10")),
				when(boundOr("dlv_grp_flg10","dlv_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP10).on(DLV.bp_grp_cd10.eq(DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(DLV_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP10.bp_grp_nm.like(bind("DLV_GRP_NM10")))),
				when(boundOr("dlv_cntry_flg"))
					.select(core,DLV.cntry_cd.as("dlv_cntry_cd"))
					.select(aggr,T.pr("dlv_cntry_cd"))
					.groupBy(core,DLV.cntry_cd)
					.groupBy(aggr,T.pr("dlv_cntry_cd")),
				when(boundOr("dlv_cntry_flg"))
					.select(core,DLV_CNTRY.cntry_nm.as("dlv_cntry_nm"))
					.select(aggr,T.pr("dlv_cntry_nm"))
					.groupBy(core,DLV_CNTRY.cntry_nm)
					.groupBy(aggr,T.pr("dlv_cntry_nm")),
				when(boundOr("dlv_cntry_flg","dlv_cntry_nm"))
					.view(core, v -> v.leftOuterJoin(DLV_CNTRY).on(DLV.cntry_cd.eq(DLV_CNTRY.cntry_cd)))
					.predicate(core, p -> p.cutoff$and(DLV_CNTRY.cntry_nm.like(bind("DLV_CNTRY_NM")))),
				when(boundOr("dlv_area_flg"))
					.select(core,DLV.area_cd.as("dlv_area_cd"))
					.select(aggr,T.pr("dlv_area_cd"))
					.groupBy(core,DLV.area_cd)
					.groupBy(aggr,T.pr("dlv_area_cd")),
				when(boundOr("dlv_area_flg"))
					.select(core,DLV_AREA.area_nm.as("dlv_area_nm"))
					.select(aggr,T.pr("dlv_area_nm"))
					.groupBy(core,DLV_AREA.area_nm)
					.groupBy(aggr,T.pr("dlv_area_nm")),
				when(boundOr("dlv_area_flg","dlv_area_nm"))
					.view(core, v -> v.leftOuterJoin(DLV_AREA).on(DLV.area_cd.eq(DLV_AREA.area_cd)))
					.predicate(core, p -> p.cutoff$and(DLV_AREA.area_nm.like(bind("DLV_AREA_NM")))),
				when(boundOr("sls_dpt_flg"))
					.select(core,SLS_DPT.dpt_nm.as("sls_dpt_nm"))
					.select(aggr,T.pr("sls_dpt_nm"))
					.groupBy(core,SLS_DPT.dpt_nm)
					.groupBy(aggr,T.pr("sls_dpt_nm")),
				when(boundOr("sls_dpt_flg","sls_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(SLS_DPT).on(S0T.sls_dpt_cd.eq(SLS_DPT.dpt_cd).and(ARG.term.eq(SLS_DPT.term))))
					.predicate(core, p -> p.cutoff$and(SLS_DPT.dpt_nm.like(bind("SLS_DPT_NM")))),
				when(boundOr("sls_usr_flg"))
					.select(core,SLS_USR.usr_nm.as("sls_usr_nm"))
					.select(aggr,T.pr("sls_usr_nm"))
					.groupBy(core,SLS_USR.usr_nm)
					.groupBy(aggr,T.pr("sls_usr_nm")),
				when(boundOr("sls_usr_flg","sls_usr_nm"))
					.view(core, v -> v.leftOuterJoin(SLS_USR).on(S0T.sls_usr_cd.eq(SLS_USR.usr_cd)))
					.predicate(core, p -> p.cutoff$and(SLS_USR.usr_nm.like(bind("SLS_USR_NM")))),
				when(boundOr("stk_bp_flg"))
					.select(core,STK_BP.bp_nm.as("stk_bp_nm"))
					.select(aggr,T.pr("stk_bp_nm"))
					.groupBy(core,STK_BP.bp_nm)
					.groupBy(aggr,T.pr("stk_bp_nm")),
				when(boundOr("stk_bp_flg","stk_bp_nm"))
					.view(core, v -> v.leftOuterJoin(STK_BP).on(S0T.stk_bp_cd.eq(STK_BP.bp_cd)))
					.predicate(core, p -> p.cutoff$and(STK_BP.bp_nm.like(bind("STK_BP_NM")))),
				when(boundOr("alc_dpt_flg"))
					.select(core,ALC_DPT.dpt_nm.as("alc_dpt_nm"))
					.select(aggr,T.pr("alc_dpt_nm"))
					.groupBy(core,ALC_DPT.dpt_nm)
					.groupBy(aggr,T.pr("alc_dpt_nm")),
				when(boundOr("alc_dpt_flg","alc_dpt_nm"))
					.view(core, v -> v.leftOuterJoin(ALC_DPT).on(S0T.alc_dpt_cd.eq(ALC_DPT.dpt_cd).and(ARG.term.eq(ALC_DPT.term))))
					.predicate(core, p -> p.cutoff$and(ALC_DPT.dpt_nm.like(bind("ALC_DPT_NM")))),
				when(boundOr("dest1_flg"))
					.select(core,DEST1.bp_nm.as("dest_nm1"))
					.select(aggr,T.pr("dest_nm1"))
					.groupBy(core,DEST1.bp_nm)
					.groupBy(aggr,T.pr("dest_nm1")),
				when(boundOr("dest1_flg","dest_nm1"))
					.view(core, v -> v.leftOuterJoin(DEST1).on(S0T.dest_cd1.eq(DEST1.bp_cd)))
					.predicate(core, p -> p.cutoff$and(DEST1.bp_nm.like(bind("DEST_NM1")))),
				when(boundOr("dest2_flg"))
					.select(core,DEST2.bp_nm.as("dest_nm2"))
					.select(aggr,T.pr("dest_nm2"))
					.groupBy(core,DEST2.bp_nm)
					.groupBy(aggr,T.pr("dest_nm2")),
				when(boundOr("dest2_flg","dest_nm2"))
					.view(core, v -> v.leftOuterJoin(DEST2).on(S0T.dest_cd2.eq(DEST2.bp_cd)))
					.predicate(core, p -> p.cutoff$and(DEST2.bp_nm.like(bind("DEST_NM2")))),
				when(boundOr("dest3_flg"))
					.select(core,DEST3.bp_nm.as("dest_nm3"))
					.select(aggr,T.pr("dest_nm3"))
					.groupBy(core,DEST3.bp_nm)
					.groupBy(aggr,T.pr("dest_nm3")),
				when(boundOr("dest3_flg","dest_nm3"))
					.view(core, v -> v.leftOuterJoin(DEST3).on(S0T.dest_cd3.eq(DEST3.bp_cd)))
					.predicate(core, p -> p.cutoff$and(DEST3.bp_nm.like(bind("DEST_NM3")))),
				when(boundOr("cost_sls1_flg"))
					.select(core,COST_SLS1.cost_sls_nm.as("cost_sls_nm1"))
					.select(aggr,T.pr("cost_sls_nm1"))
					.groupBy(core,COST_SLS1.cost_sls_nm)
					.groupBy(aggr,T.pr("cost_sls_nm1")),
				when(boundOr("cost_sls1_flg","cost_sls_nm1"))
					.view(core, v -> v.leftOuterJoin(COST_SLS1).on(S0T.cost_sls_cd1.eq(COST_SLS1.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S1.value()).eq(COST_SLS1.cost_sls_typ))))
					.predicate(core, p -> p.cutoff$and(COST_SLS1.cost_sls_nm.like(bind("COST_SLS_NM1")))),
				when(boundOr("cost_sls2_flg"))
					.select(core,COST_SLS2.cost_sls_nm.as("cost_sls_nm2"))
					.select(aggr,T.pr("cost_sls_nm2"))
					.groupBy(core,COST_SLS2.cost_sls_nm)
					.groupBy(aggr,T.pr("cost_sls_nm2")),
				when(boundOr("cost_sls2_flg","cost_sls_nm2"))
					.view(core, v -> v.leftOuterJoin(COST_SLS2).on(S0T.cost_sls_cd2.eq(COST_SLS2.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S2.value()).eq(COST_SLS2.cost_sls_typ))))
					.predicate(core, p -> p.cutoff$and(COST_SLS2.cost_sls_nm.like(bind("COST_SLS_NM2")))),
				when(boundOr("cost_sls3_flg"))
					.select(core,COST_SLS3.cost_sls_nm.as("cost_sls_nm3"))
					.select(aggr,T.pr("cost_sls_nm3"))
					.groupBy(core,COST_SLS3.cost_sls_nm)
					.groupBy(aggr,T.pr("cost_sls_nm3")),
				when(boundOr("cost_sls3_flg","cost_sls_nm3"))
					.view(core, v -> v.leftOuterJoin(COST_SLS3).on(S0T.cost_sls_cd3.eq(COST_SLS3.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S3.value()).eq(COST_SLS3.cost_sls_typ))))
					.predicate(core, p -> p.cutoff$and(COST_SLS3.cost_sls_nm.like(bind("COST_SLS_NM3")))),
				when(boundOr("cost_sls4_flg"))
					.select(core,COST_SLS4.cost_sls_nm.as("cost_sls_nm4"))
					.select(aggr,T.pr("cost_sls_nm4"))
					.groupBy(core,COST_SLS4.cost_sls_nm)
					.groupBy(aggr,T.pr("cost_sls_nm4")),
				when(boundOr("cost_sls4_flg","cost_sls_nm4"))
					.view(core, v -> v.leftOuterJoin(COST_SLS4).on(S0T.cost_sls_cd4.eq(COST_SLS4.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S4.value()).eq(COST_SLS4.cost_sls_typ))))
					.predicate(core, p -> p.cutoff$and(COST_SLS4.cost_sls_nm.like(bind("COST_SLS_NM4")))),
				when(boundOr("cost_sls5_flg"))
					.select(core,COST_SLS5.cost_sls_nm.as("cost_sls_nm5"))
					.select(aggr,T.pr("cost_sls_nm5"))
					.groupBy(core,COST_SLS5.cost_sls_nm)
					.groupBy(aggr,T.pr("cost_sls_nm5")),
				when(boundOr("cost_sls5_flg","cost_sls_nm5"))
					.view(core, v -> v.leftOuterJoin(COST_SLS5).on(S0T.cost_sls_cd5.eq(COST_SLS5.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S5.value()).eq(COST_SLS5.cost_sls_typ))))
					.predicate(core, p -> p.cutoff$and(COST_SLS5.cost_sls_nm.like(bind("COST_SLS_NM5")))),
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
				when(boundOr("qty_flg"))
					.view(core, v -> v.leftOuterJoin(UNIT).on(S0ITM.unit_cd.eq(UNIT.unit_cd))),
				when(boundOr("qty_flg"))
					.select(aggr,max(T.pr("dec_place")).as("dec_place")),
				when(boundOr("trd_cur_flg"))
					.select(aggr,T.pr("trd_cur_cd"))
					.groupBy(aggr,T.pr("trd_cur_cd")),
				when(boundOr("trd_cur_flg"))
					.select(core,TRD_CUR.cur_nm.as("trd_cur_nm"))
					.select(aggr,T.pr("trd_cur_nm"))
					.groupBy(core,TRD_CUR.cur_nm)
					.groupBy(aggr,T.pr("trd_cur_nm")),
				when(boundOr("trd_cur_flg","trd_cur_nm"))
					.view(core, v -> v.leftOuterJoin(TRD_CUR).on(S0T2.cur_cd.eq(TRD_CUR.cur_cd)))
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
					.select(aggr,T.pr("xrate"))
					.groupBy(aggr,T.pr("xrate")),
				when(boundOr("xrate_flg"))
					.select(aggr,T.pr("std_xrate"))
					.groupBy(aggr,T.pr("std_xrate")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("var")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("fxd")),
				when(null)
					.select(aggr,nvl(sum(T.pr("std_cost")),value(0)).as("std_cost")),
				when(null)
					.select(aggr,nvl(sum(T.pr("std_sls_cost")),value(0)).as("std_sls_cost")),
				when(null)
					.select(aggr,nvl(sum(T.pr("std_sls_mng_cost")),value(0)).as("std_sls_mng_cost")),
				when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("expns_typ"),value(MAC_EXPNS_TYP.PROD.value()),T.pr("act_cost"),value(0))),value(0)).as("sls_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("expns_typ"),value(MAC_EXPNS_TYP.SGA.value()),T.pr("act_cost"),value(0))),value(0)).as("sls_mng_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("act_cost"),value(0))),value(0)).as("unit_var")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("act_cost"),value(0))),value(0)).as("unit_fxd")),
				when(null)
					.select(aggr,avg(T.pr("std_upri")).as("unit_std_cost")),
				when(null)
					.select(aggr,nvl(sum(T.pr("act_cost")),value(0)).as("unit_ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("expns_typ"),value(MAC_EXPNS_TYP.PROD.value()),T.pr("act_cost"),value(0))),value(0)).as("unit_sls_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("expns_typ"),value(MAC_EXPNS_TYP.SGA.value()),T.pr("act_cost"),value(0))),value(0)).as("unit_sls_mng_cost")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("act_cost"),value(0))),value(0)).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_000")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("act_cost"),value(0))),value(0)).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_002")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("act_cost"),value(0))),value(0)).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_004")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("act_cost"),value(0))),value(0)).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_006")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("act_cost"),value(0))),value(0)).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_008")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("act_cost"),value(0))),value(0)).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_010")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("act_cost"),value(0))),value(0)).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_012")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("act_cost"),value(0))),value(0)).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_014")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("act_cost"),value(0))),value(0)).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_016")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("act_cost"),value(0))),value(0)).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_018")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("act_cost"),value(0))),value(0)).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_020")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("act_cost"),value(0))),value(0)).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_022")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("act_cost"),value(0))),value(0)).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_024")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("act_cost"),value(0))),value(0)).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_026")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("act_cost"),value(0))),value(0)).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_028")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("act_cost"),value(0))),value(0)).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_030")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("act_cost"),value(0))),value(0)).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_032")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("act_cost"),value(0))),value(0)).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_034")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("act_cost"),value(0))),value(0)).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_036")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("act_cost"),value(0))),value(0)).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_038")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("act_cost"),value(0))),value(0)).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_040")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("act_cost"),value(0))),value(0)).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_042")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("act_cost"),value(0))),value(0)).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_044")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("act_cost"),value(0))),value(0)).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_046")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("act_cost"),value(0))),value(0)).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_048")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("act_cost"),value(0))),value(0)).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_050")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("act_cost"),value(0))),value(0)).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_052")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("act_cost"),value(0))),value(0)).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_054")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("act_cost"),value(0))),value(0)).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_056")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("act_cost"),value(0))),value(0)).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_058")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("act_cost"),value(0))),value(0)).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_060")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("act_cost"),value(0))),value(0)).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_062")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("act_cost"),value(0))),value(0)).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_064")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("act_cost"),value(0))),value(0)).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_066")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("act_cost"),value(0))),value(0)).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_068")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("act_cost"),value(0))),value(0)).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_070")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("act_cost"),value(0))),value(0)).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_072")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("act_cost"),value(0))),value(0)).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_074")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("act_cost"),value(0))),value(0)).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_076")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("act_cost"),value(0))),value(0)).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_078")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("act_cost"),value(0))),value(0)).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_080")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("act_cost"),value(0))),value(0)).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_082")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("act_cost"),value(0))),value(0)).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_084")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("act_cost"),value(0))),value(0)).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_086")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("act_cost"),value(0))),value(0)).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_088")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("act_cost"),value(0))),value(0)).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_090")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("act_cost"),value(0))),value(0)).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_092")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("act_cost"),value(0))),value(0)).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_094")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("act_cost"),value(0))),value(0)).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_096")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("act_cost"),value(0))),value(0)).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_098")),
				when(boundOr("grp_flg_100"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_100"),T.pr("act_cost"),value(0))),value(0)).as("col_100")),
				when(boundOr("exp_flg_100"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_100"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_100")),
				when(boundOr("grp_flg_102"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_102"),T.pr("act_cost"),value(0))),value(0)).as("col_102")),
				when(boundOr("exp_flg_102"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_102"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_102")),
				when(boundOr("grp_flg_104"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_104"),T.pr("act_cost"),value(0))),value(0)).as("col_104")),
				when(boundOr("exp_flg_104"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_104"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_104")),
				when(boundOr("grp_flg_106"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_106"),T.pr("act_cost"),value(0))),value(0)).as("col_106")),
				when(boundOr("exp_flg_106"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_106"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_106")),
				when(boundOr("grp_flg_108"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_108"),T.pr("act_cost"),value(0))),value(0)).as("col_108")),
				when(boundOr("exp_flg_108"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_108"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_108")),
				when(boundOr("grp_flg_110"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_110"),T.pr("act_cost"),value(0))),value(0)).as("col_110")),
				when(boundOr("exp_flg_110"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_110"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_110")),
				when(boundOr("grp_flg_112"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_112"),T.pr("act_cost"),value(0))),value(0)).as("col_112")),
				when(boundOr("exp_flg_112"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_112"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_112")),
				when(boundOr("grp_flg_114"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_114"),T.pr("act_cost"),value(0))),value(0)).as("col_114")),
				when(boundOr("exp_flg_114"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_114"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_114")),
				when(boundOr("grp_flg_116"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_116"),T.pr("act_cost"),value(0))),value(0)).as("col_116")),
				when(boundOr("exp_flg_116"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_116"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_116")),
				when(boundOr("grp_flg_118"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_118"),T.pr("act_cost"),value(0))),value(0)).as("col_118")),
				when(boundOr("exp_flg_118"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_118"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_118")),
				when(boundOr("grp_flg_120"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_120"),T.pr("act_cost"),value(0))),value(0)).as("col_120")),
				when(boundOr("exp_flg_120"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_120"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_120")),
				when(boundOr("grp_flg_122"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_122"),T.pr("act_cost"),value(0))),value(0)).as("col_122")),
				when(boundOr("exp_flg_122"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_122"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_122")),
				when(boundOr("grp_flg_124"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_124"),T.pr("act_cost"),value(0))),value(0)).as("col_124")),
				when(boundOr("exp_flg_124"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_124"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_124")),
				when(boundOr("grp_flg_126"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_126"),T.pr("act_cost"),value(0))),value(0)).as("col_126")),
				when(boundOr("exp_flg_126"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_126"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_126")),
				when(boundOr("grp_flg_128"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_128"),T.pr("act_cost"),value(0))),value(0)).as("col_128")),
				when(boundOr("exp_flg_128"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_128"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_128")),
				when(boundOr("grp_flg_130"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_130"),T.pr("act_cost"),value(0))),value(0)).as("col_130")),
				when(boundOr("exp_flg_130"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_130"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_130")),
				when(boundOr("grp_flg_132"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_132"),T.pr("act_cost"),value(0))),value(0)).as("col_132")),
				when(boundOr("exp_flg_132"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_132"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_132")),
				when(boundOr("grp_flg_134"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_134"),T.pr("act_cost"),value(0))),value(0)).as("col_134")),
				when(boundOr("exp_flg_134"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_134"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_134")),
				when(boundOr("grp_flg_136"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_136"),T.pr("act_cost"),value(0))),value(0)).as("col_136")),
				when(boundOr("exp_flg_136"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_136"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_136")),
				when(boundOr("grp_flg_138"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_138"),T.pr("act_cost"),value(0))),value(0)).as("col_138")),
				when(boundOr("exp_flg_138"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_138"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_138")),
				when(boundOr("grp_flg_140"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_140"),T.pr("act_cost"),value(0))),value(0)).as("col_140")),
				when(boundOr("exp_flg_140"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_140"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_140")),
				when(boundOr("grp_flg_142"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_142"),T.pr("act_cost"),value(0))),value(0)).as("col_142")),
				when(boundOr("exp_flg_142"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_142"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_142")),
				when(boundOr("grp_flg_144"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_144"),T.pr("act_cost"),value(0))),value(0)).as("col_144")),
				when(boundOr("exp_flg_144"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_144"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_144")),
				when(boundOr("grp_flg_146"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_146"),T.pr("act_cost"),value(0))),value(0)).as("col_146")),
				when(boundOr("exp_flg_146"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_146"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_146")),
				when(boundOr("grp_flg_148"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_148"),T.pr("act_cost"),value(0))),value(0)).as("col_148")),
				when(boundOr("exp_flg_148"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_148"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_148")),
				when(boundOr("grp_flg_150"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_150"),T.pr("act_cost"),value(0))),value(0)).as("col_150")),
				when(boundOr("exp_flg_150"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_150"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_150")),
				when(boundOr("grp_flg_152"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_152"),T.pr("act_cost"),value(0))),value(0)).as("col_152")),
				when(boundOr("exp_flg_152"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_152"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_152")),
				when(boundOr("grp_flg_154"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_154"),T.pr("act_cost"),value(0))),value(0)).as("col_154")),
				when(boundOr("exp_flg_154"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_154"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_154")),
				when(boundOr("grp_flg_156"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_156"),T.pr("act_cost"),value(0))),value(0)).as("col_156")),
				when(boundOr("exp_flg_156"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_156"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_156")),
				when(boundOr("grp_flg_158"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_158"),T.pr("act_cost"),value(0))),value(0)).as("col_158")),
				when(boundOr("exp_flg_158"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_158"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_158")),
				when(boundOr("grp_flg_160"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_160"),T.pr("act_cost"),value(0))),value(0)).as("col_160")),
				when(boundOr("exp_flg_160"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_160"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_160")),
				when(boundOr("grp_flg_162"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_162"),T.pr("act_cost"),value(0))),value(0)).as("col_162")),
				when(boundOr("exp_flg_162"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_162"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_162")),
				when(boundOr("grp_flg_164"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_164"),T.pr("act_cost"),value(0))),value(0)).as("col_164")),
				when(boundOr("exp_flg_164"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_164"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_164")),
				when(boundOr("grp_flg_166"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_166"),T.pr("act_cost"),value(0))),value(0)).as("col_166")),
				when(boundOr("exp_flg_166"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_166"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_166")),
				when(boundOr("grp_flg_168"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_168"),T.pr("act_cost"),value(0))),value(0)).as("col_168")),
				when(boundOr("exp_flg_168"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_168"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_168")),
				when(boundOr("grp_flg_170"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_170"),T.pr("act_cost"),value(0))),value(0)).as("col_170")),
				when(boundOr("exp_flg_170"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_170"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_170")),
				when(boundOr("grp_flg_172"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_172"),T.pr("act_cost"),value(0))),value(0)).as("col_172")),
				when(boundOr("exp_flg_172"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_172"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_172")),
				when(boundOr("grp_flg_174"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_174"),T.pr("act_cost"),value(0))),value(0)).as("col_174")),
				when(boundOr("exp_flg_174"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_174"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_174")),
				when(boundOr("grp_flg_176"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_176"),T.pr("act_cost"),value(0))),value(0)).as("col_176")),
				when(boundOr("exp_flg_176"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_176"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_176")),
				when(boundOr("grp_flg_178"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_178"),T.pr("act_cost"),value(0))),value(0)).as("col_178")),
				when(boundOr("exp_flg_178"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_178"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_178")),
				when(boundOr("grp_flg_180"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_180"),T.pr("act_cost"),value(0))),value(0)).as("col_180")),
				when(boundOr("exp_flg_180"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_180"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_180")),
				when(boundOr("grp_flg_182"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_182"),T.pr("act_cost"),value(0))),value(0)).as("col_182")),
				when(boundOr("exp_flg_182"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_182"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_182")),
				when(boundOr("grp_flg_184"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_184"),T.pr("act_cost"),value(0))),value(0)).as("col_184")),
				when(boundOr("exp_flg_184"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_184"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_184")),
				when(boundOr("grp_flg_186"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_186"),T.pr("act_cost"),value(0))),value(0)).as("col_186")),
				when(boundOr("exp_flg_186"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_186"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_186")),
				when(boundOr("grp_flg_188"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_188"),T.pr("act_cost"),value(0))),value(0)).as("col_188")),
				when(boundOr("exp_flg_188"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_188"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_188")),
				when(boundOr("grp_flg_190"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_190"),T.pr("act_cost"),value(0))),value(0)).as("col_190")),
				when(boundOr("exp_flg_190"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_190"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_190")),
				when(boundOr("grp_flg_192"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_192"),T.pr("act_cost"),value(0))),value(0)).as("col_192")),
				when(boundOr("exp_flg_192"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_192"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_192")),
				when(boundOr("grp_flg_194"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_194"),T.pr("act_cost"),value(0))),value(0)).as("col_194")),
				when(boundOr("exp_flg_194"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_194"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_194")),
				when(boundOr("grp_flg_196"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_196"),T.pr("act_cost"),value(0))),value(0)).as("col_196")),
				when(boundOr("exp_flg_196"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_196"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_196")),
				when(boundOr("grp_flg_198"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_198"),T.pr("act_cost"),value(0))),value(0)).as("col_198")),
				when(boundOr("exp_flg_198"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_198"),T.pr("act_cost"),value(0))),value(0)),value(0)).as("col_198"))
			);
	}
	
	/**
	 * -- MGBFL0050_MGT_CALC_SLS_Query_S01
	 */
	static MCQueryPlan MGBFL0050_MGT_CALC_SLS_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_CALC_SLS_R S1_T = MGT_CALC_SLS_R.create("T");
		MGT_ACC_TOP_R S1_T2 = MGT_ACC_TOP_R.create("T2");
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
		MAM_BP_R S1_CST = MAM_BP_R.create("CST");
		MAM_BP_GRP_R S1_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S1_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S1_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S1_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S1_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S1_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S1_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S1_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S1_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S1_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MAM_CNTRY_R S1_CST_CNTRY = MAM_CNTRY_R.create("CST_CNTRY");
		MAM_AREA_R S1_CST_AREA = MAM_AREA_R.create("CST_AREA");
		MAM_BP_R S1_DLV = MAM_BP_R.create("DLV");
		MAM_BP_GRP_R S1_DLV_GRP1 = MAM_BP_GRP_R.create("DLV_GRP1");
		MAM_BP_GRP_R S1_DLV_GRP2 = MAM_BP_GRP_R.create("DLV_GRP2");
		MAM_BP_GRP_R S1_DLV_GRP3 = MAM_BP_GRP_R.create("DLV_GRP3");
		MAM_BP_GRP_R S1_DLV_GRP4 = MAM_BP_GRP_R.create("DLV_GRP4");
		MAM_BP_GRP_R S1_DLV_GRP5 = MAM_BP_GRP_R.create("DLV_GRP5");
		MAM_BP_GRP_R S1_DLV_GRP6 = MAM_BP_GRP_R.create("DLV_GRP6");
		MAM_BP_GRP_R S1_DLV_GRP7 = MAM_BP_GRP_R.create("DLV_GRP7");
		MAM_BP_GRP_R S1_DLV_GRP8 = MAM_BP_GRP_R.create("DLV_GRP8");
		MAM_BP_GRP_R S1_DLV_GRP9 = MAM_BP_GRP_R.create("DLV_GRP9");
		MAM_BP_GRP_R S1_DLV_GRP10 = MAM_BP_GRP_R.create("DLV_GRP10");
		MAM_CNTRY_R S1_DLV_CNTRY = MAM_CNTRY_R.create("DLV_CNTRY");
		MAM_AREA_R S1_DLV_AREA = MAM_AREA_R.create("DLV_AREA");
		MAM_COST_DPT_R S1_SLS_DPT = MAM_COST_DPT_R.create("SLS_DPT");
		MAM_USR_R S1_SLS_USR = MAM_USR_R.create("SLS_USR");
		MAM_BP_R S1_STK_BP = MAM_BP_R.create("STK_BP");
		MAM_COST_DPT_R S1_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_BP_R S1_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S1_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S1_DEST3 = MAM_BP_R.create("DEST3");
		MAM_COST_SLS_R S1_COST_SLS1 = MAM_COST_SLS_R.create("COST_SLS1");
		MAM_COST_SLS_R S1_COST_SLS2 = MAM_COST_SLS_R.create("COST_SLS2");
		MAM_COST_SLS_R S1_COST_SLS3 = MAM_COST_SLS_R.create("COST_SLS3");
		MAM_COST_SLS_R S1_COST_SLS4 = MAM_COST_SLS_R.create("COST_SLS4");
		MAM_COST_SLS_R S1_COST_SLS5 = MAM_COST_SLS_R.create("COST_SLS5");
		MGT_ARG_R S1_ARG = MGT_ARG_R.create("ARG");
		MAM_CUR_R S1_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0050_MGT_CALC_SLS_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.calc_no,
							S1_T.calc_grp_cd,
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.mng_dpt_cd,
							S1_ITM.itm_typ,
							S1_ITM.itm_typ_d_cd,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_ITM.itm_jnl_cd,
							S1_ITM.itm_grp_cd1,
							S1_ITM.itm_grp_cd2,
							S1_ITM.itm_grp_cd3,
							S1_ITM.itm_grp_cd4,
							S1_ITM.itm_grp_cd5,
							S1_ITM.itm_grp_cd6,
							S1_ITM.itm_grp_cd7,
							S1_ITM.itm_grp_cd8,
							S1_ITM.itm_grp_cd9,
							S1_ITM.itm_grp_cd10,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.ac_slip_typ,
							S1_T.ac_rsn_cd,
							S1_T.asst_typ,
							S1_T.cst_cd,
							S1_T.dlv_cd,
							S1_T.slo_no,
							S1_T.iv_no,
							S1_T.sls_dpt_cd,
							S1_T.sls_usr_cd,
							S1_T.stk_bp_cd,
							S1_T.alc_dpt_cd,
							S1_T.dest_cd1,
							S1_T.dest_cd2,
							S1_T.dest_cd3,
							S1_T.cost_sls_cd1,
							S1_T.cost_sls_cd2,
							S1_T.cost_sls_cd3,
							S1_T.cost_sls_cd4,
							S1_T.cost_sls_cd5,
							S1_T.rec_eval_typ,
							S1_T.qty,
							S1_ITM.unit_cd,
							S1_T2.cur_cd.as("trd_cur_cd"),
							nvl(
								S1_T2.xrate,
								value(0)
							).as("xrate"),
							nvl(
								S1_T2.std_xrate,
								value(0)
							).as("std_xrate"),
							nvl(
								S1_T2.amt,
								value(0)
							).as("amt"),
							nvl(
								S1_T2.std_amt,
								value(0)
							).as("std_amt"),
							nvl(
								S1_T2.cur_amt,
								value(0)
							).as("trd_cur_amt"),
							nvl(
								S1_T2.cur_std_amt,
								value(0)
							).as("cur_std_amt"),
							nvl(
								S1_T2.upri_diff,
								value(0)
							).as("amt_unit_diff"),
							nvl(
								S1_T2.rate_diff,
								value(0)
							).as("amt_rate_diff"),
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.leftOuterJoin(S1_T2).on(
								S1_T.act_sls_id.eq(S1_T2.act_id)
								.and(S1_T.act_sls_id_sub.eq(S1_T2.act_id_sub))
								.and(S1_T.calc_grp_cd.eq(S1_T2.calc_grp_cd))
								.and(S1_T.calc_no.eq(S1_T2.calc_no))
								.and(
									nvl(
										S1_T2.calc_rec_typ,
										value(MGC_CALC_REC_TYP.SLS.value())
									).eq(value(MGC_CALC_REC_TYP.SLS.value()))
								)
							)
							.innerJoin(S1_WG).on(S1_T.wg_cd.eq(S1_WG.wg_cd))
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
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.eq(bind("ym")))
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
							.cutoff$and(S1_T.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S1_T.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S1_T2.cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_T.cst_cd.like(bind("cst_cd")))
							.cutoff$and(S1_T.dlv_cd.like(bind("dlv_cd")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.sls_dpt_cd.like(bind("sls_dpt_cd")))
							.cutoff$and(S1_T.sls_usr_cd.like(bind("sls_usr_cd")))
							.cutoff$and(S1_T.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_T.alc_dpt_cd.like(bind("alc_dpt_cd")))
							.cutoff$and(S1_T.dest_cd1.like(bind("dest_cd1")))
							.cutoff$and(S1_T.dest_cd2.like(bind("dest_cd2")))
							.cutoff$and(S1_T.dest_cd3.like(bind("dest_cd3")))
							.cutoff$and(S1_T.cost_sls_cd1.like(bind("cost_sls_cd1")))
							.cutoff$and(S1_T.cost_sls_cd2.like(bind("cost_sls_cd2")))
							.cutoff$and(S1_T.cost_sls_cd3.like(bind("cost_sls_cd3")))
							.cutoff$and(S1_T.cost_sls_cd4.like(bind("cost_sls_cd4")))
							.cutoff$and(S1_T.cost_sls_cd5.like(bind("cost_sls_cd5")))
							.cutoff$and(S1_T.rec_eval_typ.like(bind("rec_eval_typ")))
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
								bind("no_stk_bp_flg_str").eq(value(true))
								.and(S1_T.stk_bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S1_T.ac_rsn_cd.isNull())
							)
							.cutoff$and(
								bind("no_slo_no_flg_str").eq(value(true))
								.and(S1_T.slo_no.isNull())
							)
							.cutoff$and(
								bind("no_iv_no_flg_str").eq(value(true))
								.and(S1_T.iv_no.isNull())
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
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.mng_dpt_cd)),
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_typ))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_typ)),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd)),
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
					.select(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd)),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd1))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd1)),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd2))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd2)),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd3))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd3)),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd4))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd4)),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd5))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd5)),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd6))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd6)),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd7))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd7)),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd8))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd8)),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd9))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd9)),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr(S1_ITM.itm_grp_cd10))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_grp_cd10)),
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
				when(boundOr("ac_slip_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.ac_slip_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.ac_slip_typ)),
				when(boundOr("ac_rsn_flg"))
					.select(DS0D, S0_T.pr(S1_T.ac_rsn_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ac_rsn_cd)),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
				when(boundOr("cst_flg"))
					.select(DS0D, S0_T.pr(S1_T.cst_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.cst_cd)),
				when(boundOr("cst_grp_flg1"))
					.select(DS0D, S0_T.pr("cst_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd1")),
				when(boundOr("cst_grp_flg2"))
					.select(DS0D, S0_T.pr("cst_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd2")),
				when(boundOr("cst_grp_flg3"))
					.select(DS0D, S0_T.pr("cst_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd3")),
				when(boundOr("cst_grp_flg4"))
					.select(DS0D, S0_T.pr("cst_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd4")),
				when(boundOr("cst_grp_flg5"))
					.select(DS0D, S0_T.pr("cst_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd5")),
				when(boundOr("cst_grp_flg6"))
					.select(DS0D, S0_T.pr("cst_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd6")),
				when(boundOr("cst_grp_flg7"))
					.select(DS0D, S0_T.pr("cst_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd7")),
				when(boundOr("cst_grp_flg8"))
					.select(DS0D, S0_T.pr("cst_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd8")),
				when(boundOr("cst_grp_flg9"))
					.select(DS0D, S0_T.pr("cst_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd9")),
				when(boundOr("cst_grp_flg10"))
					.select(DS0D, S0_T.pr("cst_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("cst_grp_cd10")),
				when(boundOr("cst_cntry_flg"))
					.select(DS0D, S0_T.pr("cst_cntry_cd"))
					.groupBy(DS0D, S0_T.pr("cst_cntry_cd")),
				when(boundOr("cst_area_flg"))
					.select(DS0D, S0_T.pr("cst_area_cd"))
					.groupBy(DS0D, S0_T.pr("cst_area_cd")),
				when(boundOr("dlv_flg"))
					.select(DS0D, S0_T.pr(S1_T.dlv_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.dlv_cd)),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0D, S0_T.pr("dlv_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd1")),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0D, S0_T.pr("dlv_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd2")),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0D, S0_T.pr("dlv_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd3")),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0D, S0_T.pr("dlv_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd4")),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0D, S0_T.pr("dlv_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd5")),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0D, S0_T.pr("dlv_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd6")),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0D, S0_T.pr("dlv_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd7")),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0D, S0_T.pr("dlv_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd8")),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0D, S0_T.pr("dlv_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd9")),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0D, S0_T.pr("dlv_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("dlv_grp_cd10")),
				when(boundOr("dlv_cntry_flg"))
					.select(DS0D, S0_T.pr("dlv_cntry_cd"))
					.groupBy(DS0D, S0_T.pr("dlv_cntry_cd")),
				when(boundOr("dlv_area_flg"))
					.select(DS0D, S0_T.pr("dlv_area_cd"))
					.groupBy(DS0D, S0_T.pr("dlv_area_cd")),
				when(boundOr("slo_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(boundOr("iv_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(boundOr("sls_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.sls_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.sls_dpt_cd)),
				when(boundOr("sls_usr_flg"))
					.select(DS0D, S0_T.pr(S1_T.sls_usr_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.sls_usr_cd)),
				when(boundOr("stk_bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.stk_bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.stk_bp_cd)),
				when(boundOr("alc_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.alc_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_dpt_cd)),
				when(boundOr("dest1_flg"))
					.select(DS0D, S0_T.pr(S1_T.dest_cd1))
					.groupBy(DS0D, S0_T.pr(S1_T.dest_cd1)),
				when(boundOr("dest2_flg"))
					.select(DS0D, S0_T.pr(S1_T.dest_cd2))
					.groupBy(DS0D, S0_T.pr(S1_T.dest_cd2)),
				when(boundOr("dest3_flg"))
					.select(DS0D, S0_T.pr(S1_T.dest_cd3))
					.groupBy(DS0D, S0_T.pr(S1_T.dest_cd3)),
				when(boundOr("cost_sls1_flg"))
					.select(DS0D, S0_T.pr(S1_T.cost_sls_cd1))
					.groupBy(DS0D, S0_T.pr(S1_T.cost_sls_cd1)),
				when(boundOr("cost_sls2_flg"))
					.select(DS0D, S0_T.pr(S1_T.cost_sls_cd2))
					.groupBy(DS0D, S0_T.pr(S1_T.cost_sls_cd2)),
				when(boundOr("cost_sls3_flg"))
					.select(DS0D, S0_T.pr(S1_T.cost_sls_cd3))
					.groupBy(DS0D, S0_T.pr(S1_T.cost_sls_cd3)),
				when(boundOr("cost_sls4_flg"))
					.select(DS0D, S0_T.pr(S1_T.cost_sls_cd4))
					.groupBy(DS0D, S0_T.pr(S1_T.cost_sls_cd4)),
				when(boundOr("cost_sls5_flg"))
					.select(DS0D, S0_T.pr(S1_T.cost_sls_cd5))
					.groupBy(DS0D, S0_T.pr(S1_T.cost_sls_cd5)),
				when(boundOr("rec_eval_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.rec_eval_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.rec_eval_typ)),
				when(boundOr("xrate_flg"))
					.select(DS0D, S0_T.pr("xrate"))
					.groupBy(DS0D, S0_T.pr("xrate")),
				when(boundOr("xrate_flg"))
					.select(DS0D, S0_T.pr("std_xrate"))
					.groupBy(DS0D, S0_T.pr("std_xrate")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr(S1_ITM.unit_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.unit_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_T.calc_grp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.calc_grp_cd)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.qty)).as("qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt")).as("amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std_amt")).as("std_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("trd_cur_amt")).as("trd_cur_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("cur_std_amt")).as("cur_std_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt_unit_diff")).as("amt_upri_diff")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt_rate_diff")).as("amt_rate_diff")),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm", "sls_dpt_flg", "sls_dpt_nm", "alc_dpt_flg", "alc_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_ARG).on(S1_T.calc_no.eq(S1_ARG.calc_no).and(S1_T.calc_grp_cd.eq(S1_ARG.calc_grp_cd)))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd).and(S1_ARG.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM.itm_jnl_cd.eq(S1_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("ac_rsn_flg", "ac_rsn_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AC_RSN).on(S1_T.ac_rsn_cd.eq(S1_AC_RSN.ac_rsn_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AC_RSN.ac_rsn_nm.like(bind("ac_rsn_nm")))),
				when(boundOr("cst_flg", "cst_nm", "cst_grp_cd1", "cst_grp_nm1", "cst_grp_cd2", "cst_grp_nm2", "cst_grp_cd3", "cst_grp_nm3", "cst_grp_cd4", "cst_grp_nm4", "cst_grp_cd5", "cst_grp_nm5", "cst_grp_cd6", "cst_grp_nm6", "cst_grp_cd7", "cst_grp_nm7", "cst_grp_cd8", "cst_grp_nm8", "cst_grp_cd9", "cst_grp_nm9", "cst_grp_cd10", "cst_grp_nm10", "cst_cntry_cd", "cst_cntry_nm", "cst_area_cd", "cst_area_nm", "cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_cntry_flg", "cst_area_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST).on(S1_CST.bp_cd.eq(S1_T.cst_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST.bp_nm.like(bind("cst_nm"))).cutoff$and(S1_CST.cntry_cd.like(bind("cst_cntry_cd"))).cutoff$and(S1_CST.area_cd.like(bind("cst_area_cd"))).cutoff$and(S1_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S1_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S1_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S1_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S1_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S1_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S1_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S1_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S1_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S1_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS1D, S1_CST.bp_grp_cd1.as("cst_grp_cd1"))
					.groupBy(DS1D, S1_CST.bp_grp_cd1),
				when(boundOr("cst_grp_flg1", "cst_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP1).on(S1_CST.bp_grp_cd1.eq(S1_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_CST_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS1D, S1_CST.bp_grp_cd2.as("cst_grp_cd2"))
					.groupBy(DS1D, S1_CST.bp_grp_cd2),
				when(boundOr("cst_grp_flg2", "cst_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP2).on(S1_CST.bp_grp_cd2.eq(S1_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_CST_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS1D, S1_CST.bp_grp_cd3.as("cst_grp_cd3"))
					.groupBy(DS1D, S1_CST.bp_grp_cd3),
				when(boundOr("cst_grp_flg3", "cst_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP3).on(S1_CST.bp_grp_cd3.eq(S1_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_CST_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS1D, S1_CST.bp_grp_cd4.as("cst_grp_cd4"))
					.groupBy(DS1D, S1_CST.bp_grp_cd4),
				when(boundOr("cst_grp_flg4", "cst_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP4).on(S1_CST.bp_grp_cd4.eq(S1_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_CST_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS1D, S1_CST.bp_grp_cd5.as("cst_grp_cd5"))
					.groupBy(DS1D, S1_CST.bp_grp_cd5),
				when(boundOr("cst_grp_flg5", "cst_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP5).on(S1_CST.bp_grp_cd5.eq(S1_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_CST_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS1D, S1_CST.bp_grp_cd6.as("cst_grp_cd6"))
					.groupBy(DS1D, S1_CST.bp_grp_cd6),
				when(boundOr("cst_grp_flg6", "cst_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP6).on(S1_CST.bp_grp_cd6.eq(S1_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_CST_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS1D, S1_CST.bp_grp_cd7.as("cst_grp_cd7"))
					.groupBy(DS1D, S1_CST.bp_grp_cd7),
				when(boundOr("cst_grp_flg7", "cst_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP7).on(S1_CST.bp_grp_cd7.eq(S1_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_CST_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS1D, S1_CST.bp_grp_cd8.as("cst_grp_cd8"))
					.groupBy(DS1D, S1_CST.bp_grp_cd8),
				when(boundOr("cst_grp_flg8", "cst_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP8).on(S1_CST.bp_grp_cd8.eq(S1_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_CST_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS1D, S1_CST.bp_grp_cd9.as("cst_grp_cd9"))
					.groupBy(DS1D, S1_CST.bp_grp_cd9),
				when(boundOr("cst_grp_flg9", "cst_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP9).on(S1_CST.bp_grp_cd9.eq(S1_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_CST_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS1D, S1_CST.bp_grp_cd10.as("cst_grp_cd10"))
					.groupBy(DS1D, S1_CST.bp_grp_cd10),
				when(boundOr("cst_grp_flg10", "cst_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_GRP10).on(S1_CST.bp_grp_cd10.eq(S1_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_CST_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("cst_cntry_flg"))
					.select(DS1D, S1_CST.cntry_cd.as("cst_cntry_cd"))
					.groupBy(DS1D, S1_CST.cntry_cd),
				when(boundOr("cst_cntry_flg", "cst_cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_CNTRY).on(S1_CST.cntry_cd.eq(S1_CST_CNTRY.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_CNTRY.cntry_nm.like(bind("cst_cntry_nm")))),
				when(boundOr("cst_area_flg"))
					.select(DS1D, S1_CST.area_cd.as("cst_area_cd"))
					.groupBy(DS1D, S1_CST.area_cd),
				when(boundOr("cst_area_flg", "cst_area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CST_AREA).on(S1_CST.area_cd.eq(S1_CST_AREA.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CST_AREA.area_nm.like(bind("cst_area_nm")))),
				when(boundOr("dlv_flg", "dlv_nm", "dlv_grp_cd1", "dlv_grp_nm1", "dlv_grp_cd2", "dlv_grp_nm2", "dlv_grp_cd3", "dlv_grp_nm3", "dlv_grp_cd4", "dlv_grp_nm4", "dlv_grp_cd5", "dlv_grp_nm5", "dlv_grp_cd6", "dlv_grp_nm6", "dlv_grp_cd7", "dlv_grp_nm7", "dlv_grp_cd8", "dlv_grp_nm8", "dlv_grp_cd9", "dlv_grp_nm9", "dlv_grp_cd10", "dlv_grp_nm10", "dlv_cntry_cd", "dlv_cntry_nm", "dlv_area_cd", "dlv_area_nm", "dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10", "dlv_cntry_flg", "dlv_area_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV).on(S1_DLV.bp_cd.eq(S1_T.dlv_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV.bp_nm.like(bind("dlv_nm"))).cutoff$and(S1_DLV.cntry_cd.like(bind("dlv_cntry_cd"))).cutoff$and(S1_DLV.area_cd.like(bind("dlv_area_cd"))).cutoff$and(S1_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S1_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S1_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S1_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S1_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S1_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S1_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S1_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S1_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S1_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS1D, S1_DLV.bp_grp_cd1.as("dlv_grp_cd1"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd1),
				when(boundOr("dlv_grp_flg1", "dlv_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP1).on(S1_DLV.bp_grp_cd1.eq(S1_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_DLV_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS1D, S1_DLV.bp_grp_cd2.as("dlv_grp_cd2"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd2),
				when(boundOr("dlv_grp_flg2", "dlv_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP2).on(S1_DLV.bp_grp_cd2.eq(S1_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_DLV_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS1D, S1_DLV.bp_grp_cd3.as("dlv_grp_cd3"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd3),
				when(boundOr("dlv_grp_flg3", "dlv_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP3).on(S1_DLV.bp_grp_cd3.eq(S1_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_DLV_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS1D, S1_DLV.bp_grp_cd4.as("dlv_grp_cd4"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd4),
				when(boundOr("dlv_grp_flg4", "dlv_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP4).on(S1_DLV.bp_grp_cd4.eq(S1_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_DLV_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS1D, S1_DLV.bp_grp_cd5.as("dlv_grp_cd5"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd5),
				when(boundOr("dlv_grp_flg5", "dlv_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP5).on(S1_DLV.bp_grp_cd5.eq(S1_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_DLV_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS1D, S1_DLV.bp_grp_cd6.as("dlv_grp_cd6"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd6),
				when(boundOr("dlv_grp_flg6", "dlv_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP6).on(S1_DLV.bp_grp_cd6.eq(S1_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_DLV_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS1D, S1_DLV.bp_grp_cd7.as("dlv_grp_cd7"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd7),
				when(boundOr("dlv_grp_flg7", "dlv_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP7).on(S1_DLV.bp_grp_cd7.eq(S1_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_DLV_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS1D, S1_DLV.bp_grp_cd8.as("dlv_grp_cd8"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd8),
				when(boundOr("dlv_grp_flg8", "dlv_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP8).on(S1_DLV.bp_grp_cd8.eq(S1_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_DLV_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS1D, S1_DLV.bp_grp_cd9.as("dlv_grp_cd9"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd9),
				when(boundOr("dlv_grp_flg9", "dlv_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP9).on(S1_DLV.bp_grp_cd9.eq(S1_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_DLV_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS1D, S1_DLV.bp_grp_cd10.as("dlv_grp_cd10"))
					.groupBy(DS1D, S1_DLV.bp_grp_cd10),
				when(boundOr("dlv_grp_flg10", "dlv_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_GRP10).on(S1_DLV.bp_grp_cd10.eq(S1_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_DLV_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("dlv_cntry_flg"))
					.select(DS1D, S1_DLV.cntry_cd.as("dlv_cntry_cd"))
					.groupBy(DS1D, S1_DLV.cntry_cd),
				when(boundOr("dlv_cntry_flg", "dlv_cntry_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_CNTRY).on(S1_DLV.cntry_cd.eq(S1_DLV_CNTRY.cntry_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_CNTRY.cntry_nm.like(bind("dlv_cntry_nm")))),
				when(boundOr("dlv_area_flg"))
					.select(DS1D, S1_DLV.area_cd.as("dlv_area_cd"))
					.groupBy(DS1D, S1_DLV.area_cd),
				when(boundOr("dlv_area_flg", "dlv_area_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DLV_AREA).on(S1_DLV.area_cd.eq(S1_DLV_AREA.area_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_DLV_AREA.area_nm.like(bind("dlv_area_nm")))),
				when(boundOr("sls_dpt_flg", "sls_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SLS_DPT).on(S1_T.sls_dpt_cd.eq(S1_SLS_DPT.dpt_cd).and(S1_ARG.term.eq(S1_SLS_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_SLS_DPT.dpt_nm.like(bind("sls_dpt_nm")))),
				when(boundOr("sls_usr_flg", "sls_usr_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SLS_USR).on(S1_T.sls_usr_cd.eq(S1_SLS_USR.usr_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SLS_USR.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("stk_bp_flg", "stk_bp_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STK_BP).on(S1_T.stk_bp_cd.eq(S1_STK_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_STK_BP.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("alc_dpt_flg", "alc_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ALC_DPT).on(S1_T.alc_dpt_cd.eq(S1_ALC_DPT.dpt_cd).and(S1_ARG.term.eq(S1_ALC_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ALC_DPT.dpt_nm.like(bind("alc_dpt_nm")))),
				when(boundOr("dest1_flg", "dest_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DEST1).on(S1_T.dest_cd1.eq(S1_DEST1.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest2_flg", "dest_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DEST2).on(S1_T.dest_cd2.eq(S1_DEST2.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest3_flg", "dest_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DEST3).on(S1_T.dest_cd3.eq(S1_DEST3.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("cost_sls1_flg", "cost_sls_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_COST_SLS1).on(S1_T.cost_sls_cd1.eq(S1_COST_SLS1.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S1.value()).eq(S1_COST_SLS1.cost_sls_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_COST_SLS1.cost_sls_nm.like(bind("cost_sls_nm1")))),
				when(boundOr("cost_sls2_flg", "cost_sls_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_COST_SLS2).on(S1_T.cost_sls_cd2.eq(S1_COST_SLS2.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S2.value()).eq(S1_COST_SLS2.cost_sls_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_COST_SLS2.cost_sls_nm.like(bind("cost_sls_nm2")))),
				when(boundOr("cost_sls3_flg", "cost_sls_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_COST_SLS3).on(S1_T.cost_sls_cd3.eq(S1_COST_SLS3.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S3.value()).eq(S1_COST_SLS3.cost_sls_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_COST_SLS3.cost_sls_nm.like(bind("cost_sls_nm3")))),
				when(boundOr("cost_sls4_flg", "cost_sls_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_COST_SLS4).on(S1_T.cost_sls_cd4.eq(S1_COST_SLS4.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S4.value()).eq(S1_COST_SLS4.cost_sls_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_COST_SLS4.cost_sls_nm.like(bind("cost_sls_nm4")))),
				when(boundOr("cost_sls5_flg", "cost_sls_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_COST_SLS5).on(S1_T.cost_sls_cd5.eq(S1_COST_SLS5.cost_sls_cd).and(value(MAC_COST_SLS_TYP.S5.value()).eq(S1_COST_SLS5.cost_sls_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_COST_SLS5.cost_sls_nm.like(bind("cost_sls_nm5")))),
				when(boundOr("trd_cur_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_TRD_CUR).on(S1_T2.cur_cd.eq(S1_TRD_CUR.cur_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_TRD_CUR.cur_nm.like(bind("trd_cur_nm"))))
			);
	}
}