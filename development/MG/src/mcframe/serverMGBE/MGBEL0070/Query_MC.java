package mcframe.serverMGBE.MGBEL0070;

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
	 * MGBEL0070_MGT_STD_TOP_S01
	 */
	static MCQueryPlan MGBEL0070_MGT_STD_TOP_S01() {
		MCTempView S0T1 = createTempView("T1");
		MCTempView S0T2 = createTempView("T2");
		MGT_STD_SML_COST_R S0T3 = MGT_STD_SML_COST_R.create("T3");
		MAM_EXPNS_R S0M2 = MAM_EXPNS_R.create("M2");
		MGT_STD_TOP_R S1T = MGT_STD_TOP_R.create("T");
		MAVM_RD_WG_R S1WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S1ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S1ITM_UNIT = MAM_UNIT_R.create("ITM_UNIT");
		MAM_COST_DPT_R S1DPT = MAM_COST_DPT_R.create("DPT");
		MAM_BP_R S1CST = MAM_BP_R.create("CST");
		MAM_BP_R S1DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S1DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S1DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S1DEST3 = MAM_BP_R.create("DEST3");
		MGT_STD_TOP_R S2TOP1 = MGT_STD_TOP_R.create("TOP1");
		MAM_COST_DPT_R S2M1 = MAM_COST_DPT_R.create("M1");
		MCTempView S3T1 = createTempView("T1");
		MCTempView S3T2 = createTempView("T2");
		MGT_STD_SML_COST_R S3T3 = MGT_STD_SML_COST_R.create("T3");
		MAM_EXPNS_R S3M2 = MAM_EXPNS_R.create("M2");
		MGT_STD_TOP_R S4T = MGT_STD_TOP_R.create("T");
		MAVM_RD_WG_R S4WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S4ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S4ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S4ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S4ITM_UNIT = MAM_UNIT_R.create("ITM_UNIT");
		MAM_COST_DPT_R S4DPT = MAM_COST_DPT_R.create("DPT");
		MAM_BP_R S4CST = MAM_BP_R.create("CST");
		MAM_BP_R S4DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S4DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S4DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S4DEST3 = MAM_BP_R.create("DEST3");
		MGT_STD_TOP_R S5TOP1 = MGT_STD_TOP_R.create("TOP1");
		MAM_COST_DPT_R S5M1 = MAM_COST_DPT_R.create("M1");
		MCTempView T = createTempView("T");
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
		MGT_STD_TOP_R S1W1 = MGT_STD_TOP_R.create("W1");
		MGT_STD_INPT_R S1W2 = MGT_STD_INPT_R.create("W2");
		MAM_ITM_R S1W3 = MAM_ITM_R.create("W3");
		MGT_STD_INPT_R S2W1 = MGT_STD_INPT_R.create("W1");
		MAM_ITM_R S2W2 = MAM_ITM_R.create("W2");

		MCDynamicSQLID core = createDynamicSQLID("core");
		MCDynamicSQLID aggr = createDynamicSQLID("aggr");

		return createQueryPlan()
			.setQuery(
				sql("MGBEL0070_MGT_STD_TOP_Query_S01")
				.mainQuery()
				.select(
					addDynamicSelect(aggr)
				)
				.from(
					subQuery()
					.select(
							S0T1.pr("tgt_no"),
							S0T1.pr(S1T.wg_cd),
							S0T1.pr(S1WG.wg_nm),
							S0T1.pr(S1T.itm_cd),
							S0T1.pr(S1T.itm_sub1),
							S0T1.pr(S1T.itm_sub2),
							S0T1.pr(S1T.itm_sub3),
							S0T1.pr(S1ITM.itm_nm),
							S0T1.pr(S1ITM.itm_typ),
							S0T1.pr(S1ITM.itm_typ_d_cd),
							S0T1.pr(S1ITM_TYP_D.itm_typ_d_nm),
							S0T1.pr(S1ITM.itm_jnl_cd),
							S0T1.pr(S1ITM_JNL.itm_jnl_nm),
							S0T1.pr(S1ITM.unit_cd),
							S0T1.pr(S1ITM_UNIT.unit_nm),
							S0T1.pr(S1ITM.dec_place),
							S0T1.pr(S1T.dpt_cd),
							S0T1.pr(S1DPT.dpt_nm),
							S0T1.pr(S1T.cst_cd),
							S0T1.pr("cst_nm"),
							S0T1.pr(S1T.dlv_cd),
							S0T1.pr("dlv_nm"),
							S0T1.pr(S1T.dest_cd1),
							S0T1.pr("dest_nm1"),
							S0T1.pr(S1T.dest_cd2),
							S0T1.pr("dest_nm2"),
							S0T1.pr(S1T.dest_cd3),
							S0T1.pr("dest_nm3"),
							S0T3.expns_cd,
							S0M2.expns_grp_cd,
							S0M2.var_typ,
							sum(S0T3.std_cost).as("std_cost")
						)
						.from(
							subQuery()
							.selectDistinct(
								value(1).as("tgt_no"),
								S1T.wg_cd,
								S1WG.wg_nm,
								S1T.itm_cd,
								S1T.itm_sub1,
								S1T.itm_sub2,
								S1T.itm_sub3,
								S1ITM.itm_nm,
								S1ITM.itm_typ,
								S1ITM.itm_typ_d_cd,
								S1ITM_TYP_D.itm_typ_d_nm,
								S1ITM.itm_jnl_cd,
								S1ITM_JNL.itm_jnl_nm,
								S1ITM.unit_cd,
								S1ITM.dec_place,
								S1ITM_UNIT.unit_nm,
								S1T.dpt_cd,
								S1DPT.dpt_nm,
								S1T.cst_cd,
								S1CST.bp_nm.as("cst_nm"),
								S1T.dlv_cd,
								S1DLV.bp_nm.as("dlv_nm"),
								S1T.dest_cd1,
								S1DEST1.bp_nm.as("dest_nm1"),
								S1T.dest_cd2,
								S1DEST2.bp_nm.as("dest_nm2"),
								S1T.dest_cd3,
								S1DEST3.bp_nm.as("dest_nm3"),
								addDynamicSelect(core)
							)
							.from(
								S1T
								.innerJoin(S1WG).on(S1T.wg_cd.eq(S1WG.wg_cd))
								.leftOuterJoin(S1ITM).on(
									S1T.itm_cd.eq(S1ITM.itm_cd)
									.and(S1T.itm_sub1.eq(S1ITM.itm_sub1))
									.and(S1T.itm_sub2.eq(S1ITM.itm_sub2))
									.and(S1T.itm_sub3.eq(S1ITM.itm_sub3))
								)
								.leftOuterJoin(S1ITM_TYP_D).on(
									S1ITM.itm_typ.eq(S1ITM_TYP_D.itm_typ)
									.and(S1ITM.itm_typ_d_cd.eq(S1ITM_TYP_D.itm_typ_d_cd))
								)
								.leftOuterJoin(S1ITM_JNL).on(S1ITM.itm_jnl_cd.eq(S1ITM_JNL.itm_jnl_cd))
								.leftOuterJoin(S1ITM_UNIT).on(S1ITM.unit_cd.eq(S1ITM_UNIT.unit_cd))
								.leftOuterJoin(S1DPT).on(S1T.dpt_cd.eq(S1DPT.dpt_cd))
								.leftOuterJoin(S1CST).on(S1T.cst_cd.eq(S1CST.bp_cd))
								.leftOuterJoin(S1DLV).on(S1T.dlv_cd.eq(S1DLV.bp_cd))
								.leftOuterJoin(S1DEST1).on(S1T.dest_cd1.eq(S1DEST1.bp_cd))
								.leftOuterJoin(S1DEST2).on(S1T.dest_cd2.eq(S1DEST2.bp_cd))
								.leftOuterJoin(S1DEST3).on(S1T.dest_cd3.eq(S1DEST3.bp_cd))
								.addDynamicView(core)
							)
							.where(
								value(0).eq(value(0))
								.and(
									bracket(
										S1T.calc_no.eq(bind("calc_no"))
										.and(S1T.calc_grp_cd.eq(bind("calc_grp_cd")))
										.and(
											nvl(
												S1T.dpt_cd,
												value(MAC_STR.NULL_VAL.value())
											).eq(value(MAC_STR.NULL_VAL.value()))
											.or(S1DPT.term.eq(bind("term")))
										)
									)
									.or(
										S1T.calc_no.eq(bind("calc_no2"))
										.and(S1T.calc_grp_cd.eq(bind("calc_grp_cd2")))
										.and(
											nvl(
												S1T.dpt_cd,
												value(MAC_STR.NULL_VAL.value())
											).eq(value(MAC_STR.NULL_VAL.value()))
											.or(S1DPT.term.eq(bind("term2")))
										)
									)
								)
								.and(S1T.sls_flg.eq(bind("sls_flg_str")))
								.cutoff$and(S1T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S1ITM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S1ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S1ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S1ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S1ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
								.cutoff$and(S1T.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S1T.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S1T.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S1T.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S1ITM.itm_nm.like(bind("itm_nm")))
								.cutoff$and(S1T.dpt_cd.like(bind("dpt_cd")))
								.cutoff$and(S1T.cst_cd.like(bind("cst_cd")))
								.cutoff$and(S1T.dlv_cd.like(bind("dlv_cd")))
								.cutoff$and(S1DPT.dpt_nm.like(bind("dpt_nm")))
								.cutoff$and(S1CST.bp_nm.like(bind("cst_nm")))
								.cutoff$and(S1DLV.bp_nm.like(bind("dlv_nm")))
								.cutoff$and(S1T.dest_cd1.like(bind("dest_cd1")))
								.cutoff$and(S1DEST1.bp_nm.like(bind("dest_nm1")))
								.cutoff$and(S1T.dest_cd2.like(bind("dest_cd2")))
								.cutoff$and(S1DEST2.bp_nm.like(bind("dest_nm2")))
								.cutoff$and(S1T.dest_cd3.like(bind("dest_cd3")))
								.cutoff$and(S1DEST3.bp_nm.like(bind("dest_nm3")))
								.cutoff$and(S1ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
								.cutoff$and(S1ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
								.cutoff$and(S1ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
								.cutoff$and(S1ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
								.cutoff$and(S1ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
								.cutoff$and(S1ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
								.cutoff$and(S1ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
								.cutoff$and(S1ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
								.cutoff$and(S1ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
								.cutoff$and(S1ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
								.cutoff$and(S1CST.bp_grp_cd1.like(bind("cst_grp_cd1")))
								.cutoff$and(S1CST.bp_grp_cd2.like(bind("cst_grp_cd2")))
								.cutoff$and(S1CST.bp_grp_cd3.like(bind("cst_grp_cd3")))
								.cutoff$and(S1CST.bp_grp_cd4.like(bind("cst_grp_cd4")))
								.cutoff$and(S1CST.bp_grp_cd5.like(bind("cst_grp_cd5")))
								.cutoff$and(S1CST.bp_grp_cd6.like(bind("cst_grp_cd6")))
								.cutoff$and(S1CST.bp_grp_cd7.like(bind("cst_grp_cd7")))
								.cutoff$and(S1CST.bp_grp_cd8.like(bind("cst_grp_cd8")))
								.cutoff$and(S1CST.bp_grp_cd9.like(bind("cst_grp_cd9")))
								.cutoff$and(S1CST.bp_grp_cd10.like(bind("cst_grp_cd10")))
								.cutoff$and(S1DLV.bp_grp_cd1.like(bind("dlv_grp_cd1")))
								.cutoff$and(S1DLV.bp_grp_cd2.like(bind("dlv_grp_cd2")))
								.cutoff$and(S1DLV.bp_grp_cd3.like(bind("dlv_grp_cd3")))
								.cutoff$and(S1DLV.bp_grp_cd4.like(bind("dlv_grp_cd4")))
								.cutoff$and(S1DLV.bp_grp_cd5.like(bind("dlv_grp_cd5")))
								.cutoff$and(S1DLV.bp_grp_cd6.like(bind("dlv_grp_cd6")))
								.cutoff$and(S1DLV.bp_grp_cd7.like(bind("dlv_grp_cd7")))
								.cutoff$and(S1DLV.bp_grp_cd8.like(bind("dlv_grp_cd8")))
								.cutoff$and(S1DLV.bp_grp_cd9.like(bind("dlv_grp_cd9")))
								.cutoff$and(S1DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))
								.cutoff$and(
									bind("no_dpt_flg_str").eq(value(true))
									.and(S1T.dpt_cd.isNull())
								)
								.cutoff$and(
									bind("no_cst_flg_str").eq(value(true))
									.and(S1T.cst_cd.isNull())
								)
								.cutoff$and(
									bind("no_dlv_flg_str").eq(value(true))
									.and(S1T.dlv_cd.isNull())
								)
								.cutoff$and(
									bind("no_dest1_flg_str").eq(value(true))
									.and(S1T.dest_cd1.isNull())
								)
								.cutoff$and(
									bind("no_dest2_flg_str").eq(value(true))
									.and(S1T.dest_cd2.isNull())
								)
								.cutoff$and(
									bind("no_dest3_flg_str").eq(value(true))
									.and(S1T.dest_cd3.isNull())
								)
								.addDynamicPredicate(core)
							).view(S0T1)
							.leftOuterJoin(
								subQuery()
								.select(
									S2TOP1.wg_cd,
									S2TOP1.itm_cd,
									S2TOP1.itm_sub1,
									S2TOP1.itm_sub2,
									S2TOP1.itm_sub3,
									S2TOP1.dpt_cd,
									S2M1.dpt_nm,
									S2TOP1.cst_cd,
									S2TOP1.dlv_cd,
									S2TOP1.dest_cd1,
									S2TOP1.dest_cd2,
									S2TOP1.dest_cd3,
									S2TOP1.calc_no,
									S2TOP1.calc_grp_cd,
									S2TOP1.top_rec_no
								)
								.from(
									S2TOP1
									.leftOuterJoin(S2M1).on(
										S2TOP1.dpt_cd.eq(S2M1.dpt_cd)
										.and(S2M1.term.eq(bind("term")))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S2TOP1.calc_no.eq(bind("calc_no")))
									.and(S2TOP1.calc_grp_cd.eq(bind("calc_grp_cd")))
									.and(S2TOP1.sls_flg.eq(bind("sls_flg_str")))
								).view(S0T2)
							).on(
								S0T1.pr(S1T.wg_cd).eq(S0T2.pr(S2TOP1.wg_cd))
								.and(S0T1.pr(S1T.itm_cd).eq(S0T2.pr(S2TOP1.itm_cd)))
								.and(S0T1.pr(S1T.itm_sub1).eq(S0T2.pr(S2TOP1.itm_sub1)))
								.and(S0T1.pr(S1T.itm_sub2).eq(S0T2.pr(S2TOP1.itm_sub2)))
								.and(S0T1.pr(S1T.itm_sub3).eq(S0T2.pr(S2TOP1.itm_sub3)))
								.and(
									nvl(
										S0T1.pr(S1T.dpt_cd),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0T2.pr(S2TOP1.dpt_cd),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0T1.pr(S1DPT.dpt_nm),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0T2.pr(S2M1.dpt_nm),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0T1.pr(S1T.cst_cd),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0T2.pr(S2TOP1.cst_cd),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0T1.pr(S1T.dlv_cd),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0T2.pr(S2TOP1.dlv_cd),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0T1.pr(S1T.dest_cd1),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0T2.pr(S2TOP1.dest_cd1),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0T1.pr(S1T.dest_cd2),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0T2.pr(S2TOP1.dest_cd2),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S0T1.pr(S1T.dest_cd3),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S0T2.pr(S2TOP1.dest_cd3),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
							)
							.leftOuterJoin(S0T3).on(
								S0T2.pr(S2TOP1.calc_no).eq(S0T3.calc_no)
								.and(S0T2.pr(S2TOP1.calc_grp_cd).eq(S0T3.calc_grp_cd))
								.and(S0T2.pr(S2TOP1.top_rec_no).eq(S0T3.top_rec_no))
							)
							.leftOuterJoin(S0M2).on(S0T3.expns_cd.eq(S0M2.expns_cd))
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(
								bind("mfg_flg_str").eq(value(true))
								.and(
									nvl(
										S0T3.expns_typ,
										value(MAC_EXPNS_TYP.PROD.value())
									).eq(value(MAC_EXPNS_TYP.PROD.value())))
							)
							.cutoff$and(
								bind("all_flg_str").eq(value(true))
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
						)
						.groupBy(
							S0T1.pr("tgt_no"),
							S0T1.pr(S1T.wg_cd),
							S0T1.pr(S1WG.wg_nm),
							S0T1.pr(S1T.itm_cd),
							S0T1.pr(S1T.itm_sub1),
							S0T1.pr(S1T.itm_sub2),
							S0T1.pr(S1T.itm_sub3),
							S0T1.pr(S1ITM.itm_nm),
							S0T1.pr(S1ITM.itm_typ),
							S0T1.pr(S1ITM.itm_typ_d_cd),
							S0T1.pr(S1ITM_TYP_D.itm_typ_d_nm),
							S0T1.pr(S1ITM.itm_jnl_cd),
							S0T1.pr(S1ITM_JNL.itm_jnl_nm),
							S0T1.pr(S1ITM.unit_cd),
							S0T1.pr(S1ITM_UNIT.unit_nm),
							S0T1.pr(S1ITM.dec_place),
							S0T1.pr(S1T.dpt_cd),
							S0T1.pr(S1DPT.dpt_nm),
							S0T1.pr(S1T.cst_cd),
							S0T1.pr("cst_nm"),
							S0T1.pr(S1T.dlv_cd),
							S0T1.pr("dlv_nm"),
							S0T1.pr(S1T.dest_cd1),
							S0T1.pr("dest_nm1"),
							S0T1.pr(S1T.dest_cd2),
							S0T1.pr("dest_nm2"),
							S0T1.pr(S1T.dest_cd3),
							S0T1.pr("dest_nm3"),
							S0M2.expns_grp_cd,
							S0M2.var_typ,
							S0T3.expns_cd
						)
						.unionAll(
							subQuery()
							.select(
								S3T1.pr("tgt_no"),
								S3T1.pr(S4T.wg_cd),
								S3T1.pr(S4WG.wg_nm),
								S3T1.pr(S4T.itm_cd),
								S3T1.pr(S4T.itm_sub1),
								S3T1.pr(S4T.itm_sub2),
								S3T1.pr(S4T.itm_sub3),
								S3T1.pr(S4ITM.itm_nm),
								S3T1.pr(S4ITM.itm_typ),
								S3T1.pr(S4ITM.itm_typ_d_cd),
								S3T1.pr(S4ITM_TYP_D.itm_typ_d_nm),
								S3T1.pr(S4ITM.itm_jnl_cd),
								S3T1.pr(S4ITM_JNL.itm_jnl_nm),
								S3T1.pr(S4ITM.unit_cd),
								S3T1.pr(S4ITM_UNIT.unit_nm),
								S3T1.pr(S4ITM.dec_place),
								S3T1.pr(S4T.dpt_cd),
								S3T1.pr(S4DPT.dpt_nm),
								S3T1.pr(S4T.cst_cd),
								S3T1.pr("cst_nm"),
								S3T1.pr(S4T.dlv_cd),
								S3T1.pr("dlv_nm"),
								S3T1.pr(S4T.dest_cd1),
								S3T1.pr("dest_nm1"),
								S3T1.pr(S4T.dest_cd2),
								S3T1.pr("dest_nm2"),
								S3T1.pr(S4T.dest_cd3),
								S3T1.pr("dest_nm3"),
								S3T3.expns_cd,
								S3M2.expns_grp_cd,
								S3M2.var_typ,
								sum(S3T3.std_cost).as("std_cost")
							)
							.from(
								subQuery()
								.selectDistinct(
									value(2).as("tgt_no"),
									S4T.wg_cd,
									S4WG.wg_nm,
									S4T.itm_cd,
									S4T.itm_sub1,
									S4T.itm_sub2,
									S4T.itm_sub3,
									S4ITM.itm_nm,
									S4ITM.itm_typ,
									S4ITM.itm_typ_d_cd,
									S4ITM_TYP_D.itm_typ_d_nm,
									S4ITM.itm_jnl_cd,
									S4ITM_JNL.itm_jnl_nm,
									S4ITM.unit_cd,
									S4ITM.dec_place,
									S4ITM_UNIT.unit_nm,
									S4T.dpt_cd,
									S4DPT.dpt_nm,
									S4T.cst_cd,
									S4CST.bp_nm.as("cst_nm"),
									S4T.dlv_cd,
									S4DLV.bp_nm.as("dlv_nm"),
									S4T.dest_cd1,
									S4DEST1.bp_nm.as("dest_nm1"),
									S4T.dest_cd2,
									S4DEST2.bp_nm.as("dest_nm2"),
									S4T.dest_cd3,
									S4DEST3.bp_nm.as("dest_nm3"),
									addDynamicSelect(core)
								)
								.from(
									S4T
									.innerJoin(S4WG).on(S4T.wg_cd.eq(S4WG.wg_cd))
									.leftOuterJoin(S4ITM).on(
										S4T.itm_cd.eq(S4ITM.itm_cd)
										.and(S4T.itm_sub1.eq(S4ITM.itm_sub1))
										.and(S4T.itm_sub2.eq(S4ITM.itm_sub2))
										.and(S4T.itm_sub3.eq(S4ITM.itm_sub3))
									)
									.leftOuterJoin(S4ITM_TYP_D).on(
										S4ITM.itm_typ.eq(S4ITM_TYP_D.itm_typ)
										.and(S4ITM.itm_typ_d_cd.eq(S4ITM_TYP_D.itm_typ_d_cd))
									)
									.leftOuterJoin(S4ITM_JNL).on(S4ITM.itm_jnl_cd.eq(S4ITM_JNL.itm_jnl_cd))
									.leftOuterJoin(S4ITM_UNIT).on(S4ITM.unit_cd.eq(S4ITM_UNIT.unit_cd))
									.leftOuterJoin(S4DPT).on(S4T.dpt_cd.eq(S4DPT.dpt_cd))
									.leftOuterJoin(S4CST).on(S4T.cst_cd.eq(S4CST.bp_cd))
									.leftOuterJoin(S4DLV).on(S4T.dlv_cd.eq(S4DLV.bp_cd))
									.leftOuterJoin(S4DEST1).on(S4T.dest_cd1.eq(S4DEST1.bp_cd))
									.leftOuterJoin(S4DEST2).on(S4T.dest_cd2.eq(S4DEST2.bp_cd))
									.leftOuterJoin(S4DEST3).on(S4T.dest_cd3.eq(S4DEST3.bp_cd))
									.addDynamicView(core)
								)
								.where(
									value(0).eq(value(0))
									.and(
										bracket(
											S4T.calc_no.eq(bind("calc_no"))
											.and(S4T.calc_grp_cd.eq(bind("calc_grp_cd")))
											.and(
												nvl(
													S4T.dpt_cd,
													value(MAC_STR.NULL_VAL.value())
												).eq(value(MAC_STR.NULL_VAL.value()))
												.or(S4DPT.term.eq(bind("term")))
											)
										)
										.or(
											S4T.calc_no.eq(bind("calc_no2"))
											.and(S4T.calc_grp_cd.eq(bind("calc_grp_cd2")))
											.and(
												nvl(
													S4T.dpt_cd,
													value(MAC_STR.NULL_VAL.value())
												).eq(value(MAC_STR.NULL_VAL.value()))
												.or(S4DPT.term.eq(bind("term2")))
											)
										)
									)
									.and(S4T.sls_flg.eq(bind("sls_flg_str")))
									.cutoff$and(S4T.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S4WG.wg_nm.like(bind("wg_nm")))
									.cutoff$and(S4ITM.itm_typ.like(bind("itm_typ")))
									.cutoff$and(S4ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
									.cutoff$and(S4ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
									.cutoff$and(S4ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
									.cutoff$and(S4ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
									.cutoff$and(S4T.itm_cd.like(bind("itm_cd")))
									.cutoff$and(S4T.itm_sub1.like(bind("itm_sub1")))
									.cutoff$and(S4T.itm_sub2.like(bind("itm_sub2")))
									.cutoff$and(S4T.itm_sub3.like(bind("itm_sub3")))
									.cutoff$and(S4ITM.itm_nm.like(bind("itm_nm")))
									.cutoff$and(S4T.dpt_cd.like(bind("dpt_cd")))
									.cutoff$and(S4T.cst_cd.like(bind("cst_cd")))
									.cutoff$and(S4T.dlv_cd.like(bind("dlv_cd")))
									.cutoff$and(S4DPT.dpt_nm.like(bind("dpt_nm")))
									.cutoff$and(S4CST.bp_nm.like(bind("cst_nm")))
									.cutoff$and(S4DLV.bp_nm.like(bind("dlv_nm")))
									.cutoff$and(S4T.dest_cd1.like(bind("dest_cd1")))
									.cutoff$and(S4DEST1.bp_nm.like(bind("dest_nm1")))
									.cutoff$and(S4T.dest_cd2.like(bind("dest_cd2")))
									.cutoff$and(S4DEST2.bp_nm.like(bind("dest_nm2")))
									.cutoff$and(S4T.dest_cd3.like(bind("dest_cd3")))
									.cutoff$and(S4DEST3.bp_nm.like(bind("dest_nm3")))
									.cutoff$and(S4ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
									.cutoff$and(S4ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
									.cutoff$and(S4ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
									.cutoff$and(S4ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
									.cutoff$and(S4ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
									.cutoff$and(S4ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
									.cutoff$and(S4ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
									.cutoff$and(S4ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
									.cutoff$and(S4ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
									.cutoff$and(S4ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
									.cutoff$and(S4CST.bp_grp_cd1.like(bind("cst_grp_cd1")))
									.cutoff$and(S4CST.bp_grp_cd2.like(bind("cst_grp_cd2")))
									.cutoff$and(S4CST.bp_grp_cd3.like(bind("cst_grp_cd3")))
									.cutoff$and(S4CST.bp_grp_cd4.like(bind("cst_grp_cd4")))
									.cutoff$and(S4CST.bp_grp_cd5.like(bind("cst_grp_cd5")))
									.cutoff$and(S4CST.bp_grp_cd6.like(bind("cst_grp_cd6")))
									.cutoff$and(S4CST.bp_grp_cd7.like(bind("cst_grp_cd7")))
									.cutoff$and(S4CST.bp_grp_cd8.like(bind("cst_grp_cd8")))
									.cutoff$and(S4CST.bp_grp_cd9.like(bind("cst_grp_cd9")))
									.cutoff$and(S4CST.bp_grp_cd10.like(bind("cst_grp_cd10")))
									.cutoff$and(S4DLV.bp_grp_cd1.like(bind("dlv_grp_cd1")))
									.cutoff$and(S4DLV.bp_grp_cd2.like(bind("dlv_grp_cd2")))
									.cutoff$and(S4DLV.bp_grp_cd3.like(bind("dlv_grp_cd3")))
									.cutoff$and(S4DLV.bp_grp_cd4.like(bind("dlv_grp_cd4")))
									.cutoff$and(S4DLV.bp_grp_cd5.like(bind("dlv_grp_cd5")))
									.cutoff$and(S4DLV.bp_grp_cd6.like(bind("dlv_grp_cd6")))
									.cutoff$and(S4DLV.bp_grp_cd7.like(bind("dlv_grp_cd7")))
									.cutoff$and(S4DLV.bp_grp_cd8.like(bind("dlv_grp_cd8")))
									.cutoff$and(S4DLV.bp_grp_cd9.like(bind("dlv_grp_cd9")))
									.cutoff$and(S4DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))
									.cutoff$and(
										bind("no_dpt_flg_str").eq(value(true))
										.and(S4T.dpt_cd.isNull())
									)
									.cutoff$and(
										bind("no_cst_flg_str").eq(value(true))
										.and(S4T.cst_cd.isNull())
									)
									.cutoff$and(
										bind("no_dlv_flg_str").eq(value(true))
										.and(S4T.dlv_cd.isNull())
									)
									.cutoff$and(
										bind("no_dest1_flg_str").eq(value(true))
										.and(S4T.dest_cd1.isNull())
									)
									.cutoff$and(
										bind("no_dest2_flg_str").eq(value(true))
										.and(S4T.dest_cd2.isNull())
									)
									.cutoff$and(
										bind("no_dest3_flg_str").eq(value(true))
										.and(S4T.dest_cd3.isNull())
									)
									.addDynamicPredicate(core)
								).view(S3T1)
								.leftOuterJoin(
									subQuery()
									.select(
										S5TOP1.wg_cd,
										S5TOP1.itm_cd,
										S5TOP1.itm_sub1,
										S5TOP1.itm_sub2,
										S5TOP1.itm_sub3,
										S5TOP1.dpt_cd,
										S5M1.dpt_nm,
										S5TOP1.cst_cd,
										S5TOP1.dlv_cd,
										S5TOP1.dest_cd1,
										S5TOP1.dest_cd2,
										S5TOP1.dest_cd3,
										S5TOP1.calc_no,
										S5TOP1.calc_grp_cd,
										S5TOP1.top_rec_no
									)
									.from(
										S5TOP1
										.leftOuterJoin(S5M1).on(
											S5TOP1.dpt_cd.eq(S5M1.dpt_cd)
											.and(S5M1.term.eq(bind("term2")))
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S5TOP1.calc_no.eq(bind("calc_no2")))
										.and(S5TOP1.calc_grp_cd.eq(bind("calc_grp_cd2")))
										.and(S5TOP1.sls_flg.eq(bind("sls_flg_str")))
									).view(S3T2)
								).on(
									S3T1.pr(S4T.wg_cd).eq(S3T2.pr(S5TOP1.wg_cd))
									.and(S3T1.pr(S4T.itm_cd).eq(S3T2.pr(S5TOP1.itm_cd)))
									.and(S3T1.pr(S4T.itm_sub1).eq(S3T2.pr(S5TOP1.itm_sub1)))
									.and(S3T1.pr(S4T.itm_sub2).eq(S3T2.pr(S5TOP1.itm_sub2)))
									.and(S3T1.pr(S4T.itm_sub3).eq(S3T2.pr(S5TOP1.itm_sub3)))
									.and(
										nvl(
											S3T1.pr(S4T.dpt_cd),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S3T2.pr(S5TOP1.dpt_cd),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S3T1.pr(S4DPT.dpt_nm),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S3T2.pr(S5M1.dpt_nm),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S3T1.pr(S4T.cst_cd),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S3T2.pr(S5TOP1.cst_cd),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S3T1.pr(S4T.dlv_cd),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S3T2.pr(S5TOP1.dlv_cd),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S3T1.pr(S4T.dest_cd1),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S3T2.pr(S5TOP1.dest_cd1),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S3T1.pr(S4T.dest_cd2),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S3T2.pr(S5TOP1.dest_cd2),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S3T1.pr(S4T.dest_cd3),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S3T2.pr(S5TOP1.dest_cd3),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
								)
								.leftOuterJoin(S3T3).on(
									S3T2.pr(S5TOP1.calc_no).eq(S3T3.calc_no)
									.and(S3T2.pr(S5TOP1.calc_grp_cd).eq(S3T3.calc_grp_cd))
									.and(S3T2.pr(S5TOP1.top_rec_no).eq(S3T3.top_rec_no))
								)
								.leftOuterJoin(S3M2).on(S3T3.expns_cd.eq(S3M2.expns_cd))
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(
									bind("mfg_flg_str").eq(value(true))
									.and(
										nvl(
											S3T3.expns_typ,
											value(MAC_EXPNS_TYP.PROD.value())
										).eq(value(MAC_EXPNS_TYP.PROD.value())))
								)
								.cutoff$and(
									bind("all_flg_str").eq(value(true))
									.and(
										nvl(
											S3T3.expns_typ,
											value(MAC_EXPNS_TYP.PROD.value())
										).in(
											value(MAC_EXPNS_TYP.PROD.value()),
											value(MAC_EXPNS_TYP.SGA.value())
										)
									)
								)
							)
							.groupBy(
								S3T1.pr("tgt_no"),
								S3T1.pr(S4T.wg_cd),
								S3T1.pr(S4WG.wg_nm),
								S3T1.pr(S4T.itm_cd),
								S3T1.pr(S4T.itm_sub1),
								S3T1.pr(S4T.itm_sub2),
								S3T1.pr(S4T.itm_sub3),
								S3T1.pr(S4ITM.itm_nm),
								S3T1.pr(S4ITM.itm_typ),
								S3T1.pr(S4ITM.itm_typ_d_cd),
								S3T1.pr(S4ITM_TYP_D.itm_typ_d_nm),
								S3T1.pr(S4ITM.itm_jnl_cd),
								S3T1.pr(S4ITM_JNL.itm_jnl_nm),
								S3T1.pr(S4ITM.unit_cd),
								S3T1.pr(S4ITM_UNIT.unit_nm),
								S3T1.pr(S4ITM.dec_place),
								S3T1.pr(S4T.dpt_cd),
								S3T1.pr(S4DPT.dpt_nm),
								S3T1.pr(S4T.cst_cd),
								S3T1.pr("cst_nm"),
								S3T1.pr(S4T.dlv_cd),
								S3T1.pr("dlv_nm"),
								S3T1.pr(S4T.dest_cd1),
								S3T1.pr("dest_nm1"),
								S3T1.pr(S4T.dest_cd2),
								S3T1.pr("dest_nm2"),
								S3T1.pr(S4T.dest_cd3),
								S3T1.pr("dest_nm3"),
								S3M2.expns_grp_cd,
								S3M2.var_typ,
								S3T3.expns_cd
							)
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
					.select(aggr,T.pr("wg_cd"))
					.groupBy(aggr,T.pr("wg_cd"))
					.orderBy(T.pr("wg_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_typ"))
					.groupBy(aggr,T.pr("itm_typ"))
					.orderBy(T.pr("itm_typ").asc()),
				when(null)
					.select(aggr,T.pr("itm_typ_d_cd"))
					.groupBy(aggr,T.pr("itm_typ_d_cd"))
					.orderBy(T.pr("itm_typ_d_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_jnl_cd"))
					.groupBy(aggr,T.pr("itm_jnl_cd"))
					.orderBy(T.pr("itm_jnl_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_cd"))
					.groupBy(aggr,T.pr("itm_cd"))
					.orderBy(T.pr("itm_cd").asc()),
				when(null)
					.select(aggr,T.pr("itm_sub1"))
					.groupBy(aggr,T.pr("itm_sub1"))
					.orderBy(T.pr("itm_sub1").asc()),
				when(null)
					.select(aggr,T.pr("itm_sub2"))
					.groupBy(aggr,T.pr("itm_sub2"))
					.orderBy(T.pr("itm_sub2").asc()),
				when(null)
					.select(aggr,T.pr("itm_sub3"))
					.groupBy(aggr,T.pr("itm_sub3"))
					.orderBy(T.pr("itm_sub3").asc()),
				when(boundOr("dpt_flg"))
					.select(aggr,T.pr("dpt_cd"))
					.groupBy(aggr,T.pr("dpt_cd"))
					.orderBy(T.pr("dpt_cd").asc()),
				when(boundOr("dpt_flg"))
					.select(aggr,T.pr("dpt_nm"))
					.groupBy(aggr,T.pr("dpt_nm"))
					.orderBy(T.pr("dpt_nm").asc()),
				when(boundOr("cst_flg"))
					.select(aggr,T.pr("cst_cd"))
					.groupBy(aggr,T.pr("cst_cd"))
					.orderBy(T.pr("cst_cd").asc()),
				when(boundOr("dlv_flg"))
					.select(aggr,T.pr("dlv_cd"))
					.groupBy(aggr,T.pr("dlv_cd"))
					.orderBy(T.pr("dlv_cd").asc()),
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
				when(null)
					.select(aggr,T.pr("tgt_no"))
					.groupBy(aggr,T.pr("tgt_no"))
					.orderBy(T.pr("tgt_no").asc()),
				when(boundOr("itm_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP1).on(S1ITM.itm_grp_cd1.eq(ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(ITM_GRP1.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP1.itm_grp_nm.like(bind("ITM_GRP_NM1")))),
				when(boundOr("itm_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP2).on(S1ITM.itm_grp_cd2.eq(ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(ITM_GRP2.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP2.itm_grp_nm.like(bind("ITM_GRP_NM2")))),
				when(boundOr("itm_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP3).on(S1ITM.itm_grp_cd3.eq(ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(ITM_GRP3.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP3.itm_grp_nm.like(bind("ITM_GRP_NM3")))),
				when(boundOr("itm_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP4).on(S1ITM.itm_grp_cd4.eq(ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(ITM_GRP4.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP4.itm_grp_nm.like(bind("ITM_GRP_NM4")))),
				when(boundOr("itm_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP5).on(S1ITM.itm_grp_cd5.eq(ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(ITM_GRP5.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP5.itm_grp_nm.like(bind("ITM_GRP_NM5")))),
				when(boundOr("itm_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP6).on(S1ITM.itm_grp_cd6.eq(ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(ITM_GRP6.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP6.itm_grp_nm.like(bind("ITM_GRP_NM6")))),
				when(boundOr("itm_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP7).on(S1ITM.itm_grp_cd7.eq(ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(ITM_GRP7.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP7.itm_grp_nm.like(bind("ITM_GRP_NM7")))),
				when(boundOr("itm_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP8).on(S1ITM.itm_grp_cd8.eq(ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(ITM_GRP8.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP8.itm_grp_nm.like(bind("ITM_GRP_NM8")))),
				when(boundOr("itm_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP9).on(S1ITM.itm_grp_cd9.eq(ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(ITM_GRP9.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP9.itm_grp_nm.like(bind("ITM_GRP_NM9")))),
				when(boundOr("itm_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(ITM_GRP10).on(S1ITM.itm_grp_cd10.eq(ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(ITM_GRP10.itm_grp_typ))))
					.predicate(core, p -> p.cutoff$and(ITM_GRP10.itm_grp_nm.like(bind("ITM_GRP_NM10")))),
				when(boundOr("cst_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(CST_GRP1).on(S1CST.bp_grp_cd1.eq(CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(CST_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP1.bp_grp_nm.like(bind("CST_GRP_NM1")))),
				when(boundOr("cst_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(CST_GRP2).on(S1CST.bp_grp_cd2.eq(CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(CST_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP2.bp_grp_nm.like(bind("CST_GRP_NM2")))),
				when(boundOr("cst_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(CST_GRP3).on(S1CST.bp_grp_cd3.eq(CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(CST_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP3.bp_grp_nm.like(bind("CST_GRP_NM3")))),
				when(boundOr("cst_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(CST_GRP4).on(S1CST.bp_grp_cd4.eq(CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(CST_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP4.bp_grp_nm.like(bind("CST_GRP_NM4")))),
				when(boundOr("cst_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(CST_GRP5).on(S1CST.bp_grp_cd5.eq(CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(CST_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP5.bp_grp_nm.like(bind("CST_GRP_NM5")))),
				when(boundOr("cst_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(CST_GRP6).on(S1CST.bp_grp_cd6.eq(CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(CST_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP6.bp_grp_nm.like(bind("CST_GRP_NM6")))),
				when(boundOr("cst_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(CST_GRP7).on(S1CST.bp_grp_cd7.eq(CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(CST_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP7.bp_grp_nm.like(bind("CST_GRP_NM7")))),
				when(boundOr("cst_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(CST_GRP8).on(S1CST.bp_grp_cd8.eq(CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(CST_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP8.bp_grp_nm.like(bind("CST_GRP_NM8")))),
				when(boundOr("cst_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(CST_GRP9).on(S1CST.bp_grp_cd9.eq(CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(CST_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP9.bp_grp_nm.like(bind("CST_GRP_NM9")))),
				when(boundOr("cst_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(CST_GRP10).on(S1CST.bp_grp_cd10.eq(CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(CST_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(CST_GRP10.bp_grp_nm.like(bind("CST_GRP_NM10")))),
				when(boundOr("dlv_grp_nm1"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP1).on(S1DLV.bp_grp_cd1.eq(DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(DLV_GRP1.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP1.bp_grp_nm.like(bind("DLV_GRP_NM1")))),
				when(boundOr("dlv_grp_nm2"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP2).on(S1DLV.bp_grp_cd2.eq(DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(DLV_GRP2.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP2.bp_grp_nm.like(bind("DLV_GRP_NM2")))),
				when(boundOr("dlv_grp_nm3"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP3).on(S1DLV.bp_grp_cd3.eq(DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(DLV_GRP3.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP3.bp_grp_nm.like(bind("DLV_GRP_NM3")))),
				when(boundOr("dlv_grp_nm4"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP4).on(S1DLV.bp_grp_cd4.eq(DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(DLV_GRP4.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP4.bp_grp_nm.like(bind("DLV_GRP_NM4")))),
				when(boundOr("dlv_grp_nm5"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP5).on(S1DLV.bp_grp_cd5.eq(DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(DLV_GRP5.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP5.bp_grp_nm.like(bind("DLV_GRP_NM5")))),
				when(boundOr("dlv_grp_nm6"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP6).on(S1DLV.bp_grp_cd6.eq(DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(DLV_GRP6.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP6.bp_grp_nm.like(bind("DLV_GRP_NM6")))),
				when(boundOr("dlv_grp_nm7"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP7).on(S1DLV.bp_grp_cd7.eq(DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(DLV_GRP7.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP7.bp_grp_nm.like(bind("DLV_GRP_NM7")))),
				when(boundOr("dlv_grp_nm8"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP8).on(S1DLV.bp_grp_cd8.eq(DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(DLV_GRP8.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP8.bp_grp_nm.like(bind("DLV_GRP_NM8")))),
				when(boundOr("dlv_grp_nm9"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP9).on(S1DLV.bp_grp_cd9.eq(DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(DLV_GRP9.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP9.bp_grp_nm.like(bind("DLV_GRP_NM9")))),
				when(boundOr("dlv_grp_nm10"))
					.view(core, v -> v.leftOuterJoin(DLV_GRP10).on(S1DLV.bp_grp_cd10.eq(DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(DLV_GRP10.bp_grp_typ))))
					.predicate(core, p -> p.cutoff$and(DLV_GRP10.bp_grp_nm.like(bind("DLV_GRP_NM10")))),
				when(boundOr("par_itm_cd","par_itm_sub1","par_itm_sub2","par_itm_sub3","par_itm_nm"))
					.predicate(core, p -> p.and(value(0).eq(value(0))
							.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S1W1
											.innerJoin(S1W2).on(
												S1W2.calc_no.eq(S1W1.calc_no)
												.and(S1W2.calc_grp_cd.eq(S1W1.calc_grp_cd))
												.and(S1W2.top_rec_no.eq(S1W1.top_rec_no))
												.and(S1W2.itm_cd.eq(S1T.itm_cd))
												.and(S1W2.itm_sub1.eq(S1T.itm_sub1))
												.and(S1W2.itm_sub2.eq(S1T.itm_sub2))
												.and(S1W2.itm_sub3.eq(S1T.itm_sub3))
											)
											.leftOuterJoin(S1W3).on(
												S1W3.itm_cd.eq(S1W1.itm_cd)
												.and(S1W3.itm_sub1.eq(S1W1.itm_sub1))
												.and(S1W3.itm_sub2.eq(S1W1.itm_sub2))
												.and(S1W3.itm_sub3.eq(S1W1.itm_sub3))
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S1W1.calc_no.eq(S1T.calc_no))
											.and(S1W1.calc_grp_cd.eq(S1T.calc_grp_cd))
											.cutoff$and(S1W1.itm_cd.like(bind("par_itm_cd")))
											.cutoff$and(S1W1.itm_sub1.like(bind("par_itm_sub1")))
											.cutoff$and(S1W1.itm_sub2.like(bind("par_itm_sub2")))
											.cutoff$and(S1W1.itm_sub3.like(bind("par_itm_sub3")))
											.and(S1W1.wg_cd.eq(S1T.wg_cd))
											.and(S1W1.sls_flg.eq(value(false)))
											.cutoff$and(S1W3.itm_nm.like(bind("par_itm_nm")))
										)
									)
								))),
				when(boundOr("chd_itm_cd","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3","chd_itm_nm"))
					.predicate(core, p -> p.and(value(0).eq(value(0))
							.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S2W1
											.leftOuterJoin(S2W2).on(
												S2W2.itm_cd.eq(S2W1.itm_cd)
												.and(S2W2.itm_sub1.eq(S2W1.itm_sub1))
												.and(S2W2.itm_sub2.eq(S2W1.itm_sub2))
												.and(S2W2.itm_sub3.eq(S2W1.itm_sub3))
											)
										)
										.where(
											value(0).eq(value(0))
											.and(S2W1.calc_no.eq(S1T.calc_no))
											.and(S2W1.calc_grp_cd.eq(S1T.calc_grp_cd))
											.and(S2W1.top_rec_no.eq(S1T.top_rec_no))
											.cutoff$and(S2W1.itm_cd.like(bind("chd_itm_cd")))
											.cutoff$and(S2W1.itm_sub1.like(bind("chd_itm_sub1")))
											.cutoff$and(S2W1.itm_sub2.like(bind("chd_itm_sub2")))
											.cutoff$and(S2W1.itm_sub3.like(bind("chd_itm_sub3")))
											.cutoff$and(S2W2.itm_nm.like(bind("chd_itm_nm")))
										)
									)
								))),
				when(null)
					.select(aggr,T.pr("wg_nm"))
					.groupBy(aggr,T.pr("wg_nm")),
				when(null)
					.select(aggr,T.pr("itm_nm"))
					.groupBy(aggr,T.pr("itm_nm")),
				when(null)
					.select(aggr,T.pr("itm_typ_d_nm"))
					.groupBy(aggr,T.pr("itm_typ_d_nm")),
				when(null)
					.select(aggr,T.pr("itm_jnl_nm"))
					.groupBy(aggr,T.pr("itm_jnl_nm")),
				when(boundOr("cst_flg"))
					.select(aggr,T.pr("cst_nm"))
					.groupBy(aggr,T.pr("cst_nm")),
				when(boundOr("dlv_flg"))
					.select(aggr,T.pr("dlv_nm"))
					.groupBy(aggr,T.pr("dlv_nm")),
				when(boundOr("dest1_flg"))
					.select(aggr,T.pr("dest_nm1"))
					.groupBy(aggr,T.pr("dest_nm1")),
				when(boundOr("dest2_flg"))
					.select(aggr,T.pr("dest_nm2"))
					.groupBy(aggr,T.pr("dest_nm2")),
				when(boundOr("dest3_flg"))
					.select(aggr,T.pr("dest_nm3"))
					.groupBy(aggr,T.pr("dest_nm3")),
				when(null)
					.select(aggr,T.pr("unit_cd"))
					.groupBy(aggr,T.pr("unit_cd")),
				when(null)
					.select(aggr,T.pr("unit_nm"))
					.groupBy(aggr,T.pr("unit_nm")),
				when(null)
					.select(aggr,T.pr("dec_place"))
					.groupBy(aggr,T.pr("dec_place")),
				when(null)
					.select(aggr,nvl(sum(T.pr("std_cost")),value(0)).as("ttl")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.VAR.value()),T.pr("std_cost"),value(0))),value(0)).as("var_cost")),
				when(null)
					.select(aggr,nvl(sum(decode(T.pr("var_typ"),value(MAC_VAR_TYP.FXD.value()),T.pr("std_cost"),value(0))),value(0)).as("fxd_cost")),
				when(boundOr("grp_flg_000"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_000"),T.pr("std_cost"),value(0))),value(0)).as("col_000")),
				when(boundOr("exp_flg_000"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_000"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_000")),
				when(boundOr("grp_flg_001"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_001"),T.pr("std_cost"),value(0))),value(0)).as("col_001")),
				when(boundOr("exp_flg_001"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_001"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_001")),
				when(boundOr("grp_flg_002"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_002"),T.pr("std_cost"),value(0))),value(0)).as("col_002")),
				when(boundOr("exp_flg_002"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_002"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_002")),
				when(boundOr("grp_flg_003"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_003"),T.pr("std_cost"),value(0))),value(0)).as("col_003")),
				when(boundOr("exp_flg_003"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_003"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_003")),
				when(boundOr("grp_flg_004"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_004"),T.pr("std_cost"),value(0))),value(0)).as("col_004")),
				when(boundOr("exp_flg_004"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_004"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_004")),
				when(boundOr("grp_flg_005"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_005"),T.pr("std_cost"),value(0))),value(0)).as("col_005")),
				when(boundOr("exp_flg_005"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_005"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_005")),
				when(boundOr("grp_flg_006"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_006"),T.pr("std_cost"),value(0))),value(0)).as("col_006")),
				when(boundOr("exp_flg_006"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_006"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_006")),
				when(boundOr("grp_flg_007"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_007"),T.pr("std_cost"),value(0))),value(0)).as("col_007")),
				when(boundOr("exp_flg_007"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_007"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_007")),
				when(boundOr("grp_flg_008"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_008"),T.pr("std_cost"),value(0))),value(0)).as("col_008")),
				when(boundOr("exp_flg_008"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_008"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_008")),
				when(boundOr("grp_flg_009"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_009"),T.pr("std_cost"),value(0))),value(0)).as("col_009")),
				when(boundOr("exp_flg_009"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_009"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_009")),
				when(boundOr("grp_flg_010"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_010"),T.pr("std_cost"),value(0))),value(0)).as("col_010")),
				when(boundOr("exp_flg_010"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_010"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_010")),
				when(boundOr("grp_flg_011"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_011"),T.pr("std_cost"),value(0))),value(0)).as("col_011")),
				when(boundOr("exp_flg_011"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_011"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_011")),
				when(boundOr("grp_flg_012"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_012"),T.pr("std_cost"),value(0))),value(0)).as("col_012")),
				when(boundOr("exp_flg_012"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_012"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_012")),
				when(boundOr("grp_flg_013"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_013"),T.pr("std_cost"),value(0))),value(0)).as("col_013")),
				when(boundOr("exp_flg_013"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_013"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_013")),
				when(boundOr("grp_flg_014"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_014"),T.pr("std_cost"),value(0))),value(0)).as("col_014")),
				when(boundOr("exp_flg_014"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_014"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_014")),
				when(boundOr("grp_flg_015"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_015"),T.pr("std_cost"),value(0))),value(0)).as("col_015")),
				when(boundOr("exp_flg_015"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_015"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_015")),
				when(boundOr("grp_flg_016"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_016"),T.pr("std_cost"),value(0))),value(0)).as("col_016")),
				when(boundOr("exp_flg_016"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_016"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_016")),
				when(boundOr("grp_flg_017"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_017"),T.pr("std_cost"),value(0))),value(0)).as("col_017")),
				when(boundOr("exp_flg_017"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_017"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_017")),
				when(boundOr("grp_flg_018"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_018"),T.pr("std_cost"),value(0))),value(0)).as("col_018")),
				when(boundOr("exp_flg_018"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_018"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_018")),
				when(boundOr("grp_flg_019"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_019"),T.pr("std_cost"),value(0))),value(0)).as("col_019")),
				when(boundOr("exp_flg_019"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_019"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_019")),
				when(boundOr("grp_flg_020"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_020"),T.pr("std_cost"),value(0))),value(0)).as("col_020")),
				when(boundOr("exp_flg_020"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_020"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_020")),
				when(boundOr("grp_flg_021"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_021"),T.pr("std_cost"),value(0))),value(0)).as("col_021")),
				when(boundOr("exp_flg_021"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_021"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_021")),
				when(boundOr("grp_flg_022"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_022"),T.pr("std_cost"),value(0))),value(0)).as("col_022")),
				when(boundOr("exp_flg_022"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_022"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_022")),
				when(boundOr("grp_flg_023"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_023"),T.pr("std_cost"),value(0))),value(0)).as("col_023")),
				when(boundOr("exp_flg_023"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_023"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_023")),
				when(boundOr("grp_flg_024"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_024"),T.pr("std_cost"),value(0))),value(0)).as("col_024")),
				when(boundOr("exp_flg_024"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_024"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_024")),
				when(boundOr("grp_flg_025"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_025"),T.pr("std_cost"),value(0))),value(0)).as("col_025")),
				when(boundOr("exp_flg_025"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_025"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_025")),
				when(boundOr("grp_flg_026"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_026"),T.pr("std_cost"),value(0))),value(0)).as("col_026")),
				when(boundOr("exp_flg_026"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_026"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_026")),
				when(boundOr("grp_flg_027"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_027"),T.pr("std_cost"),value(0))),value(0)).as("col_027")),
				when(boundOr("exp_flg_027"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_027"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_027")),
				when(boundOr("grp_flg_028"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_028"),T.pr("std_cost"),value(0))),value(0)).as("col_028")),
				when(boundOr("exp_flg_028"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_028"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_028")),
				when(boundOr("grp_flg_029"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_029"),T.pr("std_cost"),value(0))),value(0)).as("col_029")),
				when(boundOr("exp_flg_029"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_029"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_029")),
				when(boundOr("grp_flg_030"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_030"),T.pr("std_cost"),value(0))),value(0)).as("col_030")),
				when(boundOr("exp_flg_030"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_030"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_030")),
				when(boundOr("grp_flg_031"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_031"),T.pr("std_cost"),value(0))),value(0)).as("col_031")),
				when(boundOr("exp_flg_031"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_031"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_031")),
				when(boundOr("grp_flg_032"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_032"),T.pr("std_cost"),value(0))),value(0)).as("col_032")),
				when(boundOr("exp_flg_032"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_032"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_032")),
				when(boundOr("grp_flg_033"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_033"),T.pr("std_cost"),value(0))),value(0)).as("col_033")),
				when(boundOr("exp_flg_033"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_033"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_033")),
				when(boundOr("grp_flg_034"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_034"),T.pr("std_cost"),value(0))),value(0)).as("col_034")),
				when(boundOr("exp_flg_034"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_034"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_034")),
				when(boundOr("grp_flg_035"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_035"),T.pr("std_cost"),value(0))),value(0)).as("col_035")),
				when(boundOr("exp_flg_035"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_035"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_035")),
				when(boundOr("grp_flg_036"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_036"),T.pr("std_cost"),value(0))),value(0)).as("col_036")),
				when(boundOr("exp_flg_036"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_036"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_036")),
				when(boundOr("grp_flg_037"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_037"),T.pr("std_cost"),value(0))),value(0)).as("col_037")),
				when(boundOr("exp_flg_037"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_037"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_037")),
				when(boundOr("grp_flg_038"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_038"),T.pr("std_cost"),value(0))),value(0)).as("col_038")),
				when(boundOr("exp_flg_038"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_038"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_038")),
				when(boundOr("grp_flg_039"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_039"),T.pr("std_cost"),value(0))),value(0)).as("col_039")),
				when(boundOr("exp_flg_039"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_039"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_039")),
				when(boundOr("grp_flg_040"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_040"),T.pr("std_cost"),value(0))),value(0)).as("col_040")),
				when(boundOr("exp_flg_040"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_040"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_040")),
				when(boundOr("grp_flg_041"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_041"),T.pr("std_cost"),value(0))),value(0)).as("col_041")),
				when(boundOr("exp_flg_041"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_041"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_041")),
				when(boundOr("grp_flg_042"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_042"),T.pr("std_cost"),value(0))),value(0)).as("col_042")),
				when(boundOr("exp_flg_042"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_042"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_042")),
				when(boundOr("grp_flg_043"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_043"),T.pr("std_cost"),value(0))),value(0)).as("col_043")),
				when(boundOr("exp_flg_043"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_043"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_043")),
				when(boundOr("grp_flg_044"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_044"),T.pr("std_cost"),value(0))),value(0)).as("col_044")),
				when(boundOr("exp_flg_044"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_044"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_044")),
				when(boundOr("grp_flg_045"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_045"),T.pr("std_cost"),value(0))),value(0)).as("col_045")),
				when(boundOr("exp_flg_045"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_045"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_045")),
				when(boundOr("grp_flg_046"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_046"),T.pr("std_cost"),value(0))),value(0)).as("col_046")),
				when(boundOr("exp_flg_046"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_046"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_046")),
				when(boundOr("grp_flg_047"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_047"),T.pr("std_cost"),value(0))),value(0)).as("col_047")),
				when(boundOr("exp_flg_047"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_047"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_047")),
				when(boundOr("grp_flg_048"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_048"),T.pr("std_cost"),value(0))),value(0)).as("col_048")),
				when(boundOr("exp_flg_048"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_048"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_048")),
				when(boundOr("grp_flg_049"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_049"),T.pr("std_cost"),value(0))),value(0)).as("col_049")),
				when(boundOr("exp_flg_049"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_049"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_049")),
				when(boundOr("grp_flg_050"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_050"),T.pr("std_cost"),value(0))),value(0)).as("col_050")),
				when(boundOr("exp_flg_050"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_050"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_050")),
				when(boundOr("grp_flg_051"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_051"),T.pr("std_cost"),value(0))),value(0)).as("col_051")),
				when(boundOr("exp_flg_051"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_051"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_051")),
				when(boundOr("grp_flg_052"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_052"),T.pr("std_cost"),value(0))),value(0)).as("col_052")),
				when(boundOr("exp_flg_052"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_052"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_052")),
				when(boundOr("grp_flg_053"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_053"),T.pr("std_cost"),value(0))),value(0)).as("col_053")),
				when(boundOr("exp_flg_053"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_053"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_053")),
				when(boundOr("grp_flg_054"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_054"),T.pr("std_cost"),value(0))),value(0)).as("col_054")),
				when(boundOr("exp_flg_054"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_054"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_054")),
				when(boundOr("grp_flg_055"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_055"),T.pr("std_cost"),value(0))),value(0)).as("col_055")),
				when(boundOr("exp_flg_055"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_055"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_055")),
				when(boundOr("grp_flg_056"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_056"),T.pr("std_cost"),value(0))),value(0)).as("col_056")),
				when(boundOr("exp_flg_056"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_056"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_056")),
				when(boundOr("grp_flg_057"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_057"),T.pr("std_cost"),value(0))),value(0)).as("col_057")),
				when(boundOr("exp_flg_057"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_057"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_057")),
				when(boundOr("grp_flg_058"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_058"),T.pr("std_cost"),value(0))),value(0)).as("col_058")),
				when(boundOr("exp_flg_058"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_058"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_058")),
				when(boundOr("grp_flg_059"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_059"),T.pr("std_cost"),value(0))),value(0)).as("col_059")),
				when(boundOr("exp_flg_059"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_059"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_059")),
				when(boundOr("grp_flg_060"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_060"),T.pr("std_cost"),value(0))),value(0)).as("col_060")),
				when(boundOr("exp_flg_060"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_060"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_060")),
				when(boundOr("grp_flg_061"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_061"),T.pr("std_cost"),value(0))),value(0)).as("col_061")),
				when(boundOr("exp_flg_061"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_061"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_061")),
				when(boundOr("grp_flg_062"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_062"),T.pr("std_cost"),value(0))),value(0)).as("col_062")),
				when(boundOr("exp_flg_062"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_062"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_062")),
				when(boundOr("grp_flg_063"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_063"),T.pr("std_cost"),value(0))),value(0)).as("col_063")),
				when(boundOr("exp_flg_063"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_063"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_063")),
				when(boundOr("grp_flg_064"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_064"),T.pr("std_cost"),value(0))),value(0)).as("col_064")),
				when(boundOr("exp_flg_064"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_064"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_064")),
				when(boundOr("grp_flg_065"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_065"),T.pr("std_cost"),value(0))),value(0)).as("col_065")),
				when(boundOr("exp_flg_065"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_065"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_065")),
				when(boundOr("grp_flg_066"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_066"),T.pr("std_cost"),value(0))),value(0)).as("col_066")),
				when(boundOr("exp_flg_066"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_066"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_066")),
				when(boundOr("grp_flg_067"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_067"),T.pr("std_cost"),value(0))),value(0)).as("col_067")),
				when(boundOr("exp_flg_067"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_067"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_067")),
				when(boundOr("grp_flg_068"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_068"),T.pr("std_cost"),value(0))),value(0)).as("col_068")),
				when(boundOr("exp_flg_068"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_068"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_068")),
				when(boundOr("grp_flg_069"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_069"),T.pr("std_cost"),value(0))),value(0)).as("col_069")),
				when(boundOr("exp_flg_069"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_069"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_069")),
				when(boundOr("grp_flg_070"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_070"),T.pr("std_cost"),value(0))),value(0)).as("col_070")),
				when(boundOr("exp_flg_070"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_070"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_070")),
				when(boundOr("grp_flg_071"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_071"),T.pr("std_cost"),value(0))),value(0)).as("col_071")),
				when(boundOr("exp_flg_071"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_071"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_071")),
				when(boundOr("grp_flg_072"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_072"),T.pr("std_cost"),value(0))),value(0)).as("col_072")),
				when(boundOr("exp_flg_072"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_072"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_072")),
				when(boundOr("grp_flg_073"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_073"),T.pr("std_cost"),value(0))),value(0)).as("col_073")),
				when(boundOr("exp_flg_073"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_073"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_073")),
				when(boundOr("grp_flg_074"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_074"),T.pr("std_cost"),value(0))),value(0)).as("col_074")),
				when(boundOr("exp_flg_074"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_074"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_074")),
				when(boundOr("grp_flg_075"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_075"),T.pr("std_cost"),value(0))),value(0)).as("col_075")),
				when(boundOr("exp_flg_075"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_075"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_075")),
				when(boundOr("grp_flg_076"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_076"),T.pr("std_cost"),value(0))),value(0)).as("col_076")),
				when(boundOr("exp_flg_076"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_076"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_076")),
				when(boundOr("grp_flg_077"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_077"),T.pr("std_cost"),value(0))),value(0)).as("col_077")),
				when(boundOr("exp_flg_077"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_077"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_077")),
				when(boundOr("grp_flg_078"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_078"),T.pr("std_cost"),value(0))),value(0)).as("col_078")),
				when(boundOr("exp_flg_078"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_078"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_078")),
				when(boundOr("grp_flg_079"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_079"),T.pr("std_cost"),value(0))),value(0)).as("col_079")),
				when(boundOr("exp_flg_079"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_079"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_079")),
				when(boundOr("grp_flg_080"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_080"),T.pr("std_cost"),value(0))),value(0)).as("col_080")),
				when(boundOr("exp_flg_080"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_080"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_080")),
				when(boundOr("grp_flg_081"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_081"),T.pr("std_cost"),value(0))),value(0)).as("col_081")),
				when(boundOr("exp_flg_081"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_081"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_081")),
				when(boundOr("grp_flg_082"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_082"),T.pr("std_cost"),value(0))),value(0)).as("col_082")),
				when(boundOr("exp_flg_082"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_082"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_082")),
				when(boundOr("grp_flg_083"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_083"),T.pr("std_cost"),value(0))),value(0)).as("col_083")),
				when(boundOr("exp_flg_083"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_083"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_083")),
				when(boundOr("grp_flg_084"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_084"),T.pr("std_cost"),value(0))),value(0)).as("col_084")),
				when(boundOr("exp_flg_084"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_084"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_084")),
				when(boundOr("grp_flg_085"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_085"),T.pr("std_cost"),value(0))),value(0)).as("col_085")),
				when(boundOr("exp_flg_085"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_085"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_085")),
				when(boundOr("grp_flg_086"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_086"),T.pr("std_cost"),value(0))),value(0)).as("col_086")),
				when(boundOr("exp_flg_086"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_086"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_086")),
				when(boundOr("grp_flg_087"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_087"),T.pr("std_cost"),value(0))),value(0)).as("col_087")),
				when(boundOr("exp_flg_087"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_087"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_087")),
				when(boundOr("grp_flg_088"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_088"),T.pr("std_cost"),value(0))),value(0)).as("col_088")),
				when(boundOr("exp_flg_088"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_088"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_088")),
				when(boundOr("grp_flg_089"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_089"),T.pr("std_cost"),value(0))),value(0)).as("col_089")),
				when(boundOr("exp_flg_089"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_089"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_089")),
				when(boundOr("grp_flg_090"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_090"),T.pr("std_cost"),value(0))),value(0)).as("col_090")),
				when(boundOr("exp_flg_090"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_090"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_090")),
				when(boundOr("grp_flg_091"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_091"),T.pr("std_cost"),value(0))),value(0)).as("col_091")),
				when(boundOr("exp_flg_091"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_091"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_091")),
				when(boundOr("grp_flg_092"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_092"),T.pr("std_cost"),value(0))),value(0)).as("col_092")),
				when(boundOr("exp_flg_092"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_092"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_092")),
				when(boundOr("grp_flg_093"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_093"),T.pr("std_cost"),value(0))),value(0)).as("col_093")),
				when(boundOr("exp_flg_093"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_093"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_093")),
				when(boundOr("grp_flg_094"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_094"),T.pr("std_cost"),value(0))),value(0)).as("col_094")),
				when(boundOr("exp_flg_094"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_094"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_094")),
				when(boundOr("grp_flg_095"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_095"),T.pr("std_cost"),value(0))),value(0)).as("col_095")),
				when(boundOr("exp_flg_095"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_095"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_095")),
				when(boundOr("grp_flg_096"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_096"),T.pr("std_cost"),value(0))),value(0)).as("col_096")),
				when(boundOr("exp_flg_096"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_096"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_096")),
				when(boundOr("grp_flg_097"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_097"),T.pr("std_cost"),value(0))),value(0)).as("col_097")),
				when(boundOr("exp_flg_097"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_097"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_097")),
				when(boundOr("grp_flg_098"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_098"),T.pr("std_cost"),value(0))),value(0)).as("col_098")),
				when(boundOr("exp_flg_098"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_098"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_098")),
				when(boundOr("grp_flg_099"))
					.select(aggr,nvl(sum(decode(T.pr("expns_grp_cd"),bind("bind_grp_099"),T.pr("std_cost"),value(0))),value(0)).as("col_099")),
				when(boundOr("exp_flg_099"))
					.select(aggr,nullIf(nvl(sum(decode(T.pr("expns_cd"),bind("bind_exp_099"),T.pr("std_cost"),value(0))),value(0)),value(0)).as("col_099"))
			);
	}
	
	/**
	 * -- MGBEL0070_MGT_STD_TOP_Query_S02
	 */
	static MCQueryPlan MGBEL0070_MGT_STD_TOP_S02() {
		MCTempView S0_T = createTempView("T");
		MCTempView S1_T1 = createTempView("T1");
		MCTempView S1_T2 = createTempView("T2");
		MGT_STD_TOP_R S2_T = MGT_STD_TOP_R.create("T");
		MAVM_RD_WG_R S2_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S2_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S2_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S2_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_COST_DPT_R S2_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_BP_R S2_CST = MAM_BP_R.create("CST");
		MAM_BP_R S2_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S2_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S2_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S2_DEST3 = MAM_BP_R.create("DEST3");
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
		MAM_BP_GRP_R S2_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S2_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S2_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S2_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S2_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S2_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S2_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S2_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S2_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S2_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MAM_BP_GRP_R S2_DLV_GRP1 = MAM_BP_GRP_R.create("DLV_GRP1");
		MAM_BP_GRP_R S2_DLV_GRP2 = MAM_BP_GRP_R.create("DLV_GRP2");
		MAM_BP_GRP_R S2_DLV_GRP3 = MAM_BP_GRP_R.create("DLV_GRP3");
		MAM_BP_GRP_R S2_DLV_GRP4 = MAM_BP_GRP_R.create("DLV_GRP4");
		MAM_BP_GRP_R S2_DLV_GRP5 = MAM_BP_GRP_R.create("DLV_GRP5");
		MAM_BP_GRP_R S2_DLV_GRP6 = MAM_BP_GRP_R.create("DLV_GRP6");
		MAM_BP_GRP_R S2_DLV_GRP7 = MAM_BP_GRP_R.create("DLV_GRP7");
		MAM_BP_GRP_R S2_DLV_GRP8 = MAM_BP_GRP_R.create("DLV_GRP8");
		MAM_BP_GRP_R S2_DLV_GRP9 = MAM_BP_GRP_R.create("DLV_GRP9");
		MAM_BP_GRP_R S2_DLV_GRP10 = MAM_BP_GRP_R.create("DLV_GRP10");
		MGT_STD_TOP_R S3_W1 = MGT_STD_TOP_R.create("W1");
		MGT_STD_INPT_R S3_W2 = MGT_STD_INPT_R.create("W2");
		MAM_ITM_R S3_W3 = MAM_ITM_R.create("W3");
		MGT_STD_INPT_R S4_W1 = MGT_STD_INPT_R.create("W1");
		MAM_ITM_R S4_W2 = MAM_ITM_R.create("W2");
		MGT_STD_TOP_R S5_TOP1 = MGT_STD_TOP_R.create("TOP1");
		MAM_COST_DPT_R S5_M1 = MAM_COST_DPT_R.create("M1");
		MCTempView S6_T1 = createTempView("T1");
		MCTempView S6_T2 = createTempView("T2");
		MGT_STD_TOP_R S7_T = MGT_STD_TOP_R.create("T");
		MAVM_RD_WG_R S7_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S7_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S7_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S7_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_COST_DPT_R S7_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_BP_R S7_CST = MAM_BP_R.create("CST");
		MAM_BP_R S7_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S7_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S7_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S7_DEST3 = MAM_BP_R.create("DEST3");
		MAM_ITM_GRP_R S7_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S7_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S7_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S7_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S7_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S7_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S7_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S7_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S7_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S7_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_GRP_R S7_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S7_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S7_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S7_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S7_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S7_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S7_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S7_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S7_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S7_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MAM_BP_GRP_R S7_DLV_GRP1 = MAM_BP_GRP_R.create("DLV_GRP1");
		MAM_BP_GRP_R S7_DLV_GRP2 = MAM_BP_GRP_R.create("DLV_GRP2");
		MAM_BP_GRP_R S7_DLV_GRP3 = MAM_BP_GRP_R.create("DLV_GRP3");
		MAM_BP_GRP_R S7_DLV_GRP4 = MAM_BP_GRP_R.create("DLV_GRP4");
		MAM_BP_GRP_R S7_DLV_GRP5 = MAM_BP_GRP_R.create("DLV_GRP5");
		MAM_BP_GRP_R S7_DLV_GRP6 = MAM_BP_GRP_R.create("DLV_GRP6");
		MAM_BP_GRP_R S7_DLV_GRP7 = MAM_BP_GRP_R.create("DLV_GRP7");
		MAM_BP_GRP_R S7_DLV_GRP8 = MAM_BP_GRP_R.create("DLV_GRP8");
		MAM_BP_GRP_R S7_DLV_GRP9 = MAM_BP_GRP_R.create("DLV_GRP9");
		MAM_BP_GRP_R S7_DLV_GRP10 = MAM_BP_GRP_R.create("DLV_GRP10");
		MGT_STD_TOP_R S8_W1 = MGT_STD_TOP_R.create("W1");
		MGT_STD_INPT_R S8_W2 = MGT_STD_INPT_R.create("W2");
		MAM_ITM_R S8_W3 = MAM_ITM_R.create("W3");
		MGT_STD_INPT_R S9_W1 = MGT_STD_INPT_R.create("W1");
		MAM_ITM_R S9_W2 = MAM_ITM_R.create("W2");
		MGT_STD_TOP_R S10_TOP1 = MGT_STD_TOP_R.create("TOP1");
		MAM_COST_DPT_R S10_M1 = MAM_COST_DPT_R.create("M1");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		MCDynamicSQLID DS7D = createDynamicSQLID("DS7D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBEL0070_MGT_STD_TOP_Query_S02")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T1.pr(S2_T.wg_cd),
							S1_T1.pr(S2_T.itm_cd),
							S1_T1.pr(S2_T.itm_sub1),
							S1_T1.pr(S2_T.itm_sub2),
							S1_T1.pr(S2_T.itm_sub3),
							S1_T1.pr(S2_T.dpt_cd),
							S1_T1.pr(S2_DPT.dpt_nm),
							S1_T1.pr(S2_T.cst_cd),
							S1_T1.pr(S2_T.dlv_cd),
							S1_T1.pr(S2_T.dest_cd1),
							S1_T1.pr(S2_T.dest_cd2),
							S1_T1.pr(S2_T.dest_cd3),
							S1_T1.pr("tgt_no"),
							sum(S1_T2.pr(S5_TOP1.qty)).as("qty")
						)
						.from(
							subQuery()
							.selectDistinct(
								value(1).as("tgt_no"),
								S2_T.wg_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.dpt_cd,
								S2_DPT.dpt_nm,
								S2_T.cst_cd,
								S2_T.dlv_cd,
								S2_T.dest_cd1,
								S2_T.dest_cd2,
								S2_T.dest_cd3,
								addDynamicSelect(DS2D)
							)
							.from(
								S2_T
								.innerJoin(S2_WG).on(S2_T.wg_cd.eq(S2_WG.wg_cd))
								.leftOuterJoin(S2_ITM).on(
									S2_T.itm_cd.eq(S2_ITM.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_ITM.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_ITM.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_ITM.itm_sub3))
								)
								.leftOuterJoin(S2_ITM_TYP_D).on(
									S2_ITM.itm_typ.eq(S2_ITM_TYP_D.itm_typ)
									.and(S2_ITM.itm_typ_d_cd.eq(S2_ITM_TYP_D.itm_typ_d_cd))
								)
								.leftOuterJoin(S2_ITM_JNL).on(S2_ITM.itm_jnl_cd.eq(S2_ITM_JNL.itm_jnl_cd))
								.leftOuterJoin(S2_DPT).on(S2_T.dpt_cd.eq(S2_DPT.dpt_cd))
								.addDynamicView(DS2D)
							)
							.where(
								value(0).eq(value(0))
								.and(
									bracket(
										S2_T.calc_no.eq(bind("calc_no"))
										.and(S2_T.calc_grp_cd.eq(bind("calc_grp_cd")))
										.and(
											nvl(
												S2_T.dpt_cd,
												value(MAC_STR.NULL_VAL.value())
											).eq(value(MAC_STR.NULL_VAL.value()))
											.or(S2_DPT.term.eq(bind("term")))
										)
									)
									.or(
										S2_T.calc_no.eq(bind("calc_no2"))
										.and(S2_T.calc_grp_cd.eq(bind("calc_grp_cd2")))
										.and(
											nvl(
												S2_T.dpt_cd,
												value(MAC_STR.NULL_VAL.value())
											).eq(value(MAC_STR.NULL_VAL.value()))
											.or(S2_DPT.term.eq(bind("term2")))
										)
									)
								)
								.and(S2_T.sls_flg.eq(bind("sls_flg_str")))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S2_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
								.cutoff$and(S2_T.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2_ITM.itm_nm.like(bind("itm_nm")))
								.cutoff$and(S2_T.dpt_cd.like(bind("dpt_cd")))
								.cutoff$and(S2_DPT.dpt_nm.like(bind("dpt_nm")))
								.cutoff$and(S2_T.cst_cd.like(bind("cst_cd")))
								.cutoff$and(S2_T.dlv_cd.like(bind("dlv_cd")))
								.cutoff$and(S2_T.dest_cd1.like(bind("dest_cd1")))
								.cutoff$and(S2_T.dest_cd2.like(bind("dest_cd2")))
								.cutoff$and(S2_T.dest_cd3.like(bind("dest_cd3")))
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
								.cutoff$and(
									bind("no_dpt_flg_str").eq(value(true))
									.and(S2_T.dpt_cd.isNull())
								)
								.cutoff$and(
									bind("no_cst_flg_str").eq(value(true))
									.and(S2_T.cst_cd.isNull())
								)
								.cutoff$and(
									bind("no_dlv_flg_str").eq(value(true))
									.and(S2_T.dlv_cd.isNull())
								)
								.cutoff$and(
									bind("no_dest1_flg_str").eq(value(true))
									.and(S2_T.dest_cd1.isNull())
								)
								.cutoff$and(
									bind("no_dest2_flg_str").eq(value(true))
									.and(S2_T.dest_cd2.isNull())
								)
								.cutoff$and(
									bind("no_dest3_flg_str").eq(value(true))
									.and(S2_T.dest_cd3.isNull())
								)
								.addDynamicPredicate(DS2D)
							).view(S1_T1)
							.leftOuterJoin(
								subQuery()
								.select(
									S5_TOP1.wg_cd,
									S5_TOP1.itm_cd,
									S5_TOP1.itm_sub1,
									S5_TOP1.itm_sub2,
									S5_TOP1.itm_sub3,
									S5_TOP1.dpt_cd,
									S5_M1.dpt_nm,
									S5_TOP1.cst_cd,
									S5_TOP1.dlv_cd,
									S5_TOP1.dest_cd1,
									S5_TOP1.dest_cd2,
									S5_TOP1.dest_cd3,
									S5_TOP1.qty,
									S5_TOP1.calc_no,
									S5_TOP1.calc_grp_cd,
									S5_TOP1.top_rec_no
								)
								.from(
									S5_TOP1
									.leftOuterJoin(S5_M1).on(
										S5_TOP1.dpt_cd.eq(S5_M1.dpt_cd)
										.and(S5_M1.term.eq(bind("term")))
									)
								)
								.where(
									value(0).eq(value(0))
									.and(S5_TOP1.calc_no.eq(bind("calc_no")))
									.and(S5_TOP1.calc_grp_cd.eq(bind("calc_grp_cd")))
									.and(S5_TOP1.sls_flg.eq(bind("sls_flg_str")))
								).view(S1_T2)
							).on(
								S1_T1.pr(S2_T.wg_cd).eq(S1_T2.pr(S5_TOP1.wg_cd))
								.and(S1_T1.pr(S2_T.itm_cd).eq(S1_T2.pr(S5_TOP1.itm_cd)))
								.and(S1_T1.pr(S2_T.itm_sub1).eq(S1_T2.pr(S5_TOP1.itm_sub1)))
								.and(S1_T1.pr(S2_T.itm_sub2).eq(S1_T2.pr(S5_TOP1.itm_sub2)))
								.and(S1_T1.pr(S2_T.itm_sub3).eq(S1_T2.pr(S5_TOP1.itm_sub3)))
								.and(
									nvl(
										S1_T1.pr(S2_T.dpt_cd),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S1_T2.pr(S5_TOP1.dpt_cd),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S1_T1.pr(S2_DPT.dpt_nm),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S1_T2.pr(S5_M1.dpt_nm),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S1_T1.pr(S2_T.cst_cd),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S1_T2.pr(S5_TOP1.cst_cd),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S1_T1.pr(S2_T.dlv_cd),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S1_T2.pr(S5_TOP1.dlv_cd),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S1_T1.pr(S2_T.dest_cd1),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S1_T2.pr(S5_TOP1.dest_cd1),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S1_T1.pr(S2_T.dest_cd2),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S1_T2.pr(S5_TOP1.dest_cd2),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
								.and(
									nvl(
										S1_T1.pr(S2_T.dest_cd3),
										value(MAC_STR.NULL_VAL.value())
									).eq(nvl(
											S1_T2.pr(S5_TOP1.dest_cd3),
											value(MAC_STR.NULL_VAL.value())
										)
									)
								)
							)
						)
						.where(
							value(0).eq(value(0))
						)
						.groupBy(
							S1_T1.pr(S2_T.wg_cd),
							S1_T1.pr(S2_T.itm_cd),
							S1_T1.pr(S2_T.itm_sub1),
							S1_T1.pr(S2_T.itm_sub2),
							S1_T1.pr(S2_T.itm_sub3),
							S1_T1.pr(S2_T.dpt_cd),
							S1_T1.pr(S2_DPT.dpt_nm),
							S1_T1.pr(S2_T.cst_cd),
							S1_T1.pr(S2_T.dlv_cd),
							S1_T1.pr(S2_T.dest_cd1),
							S1_T1.pr(S2_T.dest_cd2),
							S1_T1.pr(S2_T.dest_cd3),
							S1_T1.pr("tgt_no")
						)
						.unionAll(
							subQuery()
							.select(
								S6_T1.pr(S7_T.wg_cd),
								S6_T1.pr(S7_T.itm_cd),
								S6_T1.pr(S7_T.itm_sub1),
								S6_T1.pr(S7_T.itm_sub2),
								S6_T1.pr(S7_T.itm_sub3),
								S6_T1.pr(S7_T.dpt_cd),
								S6_T1.pr(S7_DPT.dpt_nm),
								S6_T1.pr(S7_T.cst_cd),
								S6_T1.pr(S7_T.dlv_cd),
								S6_T1.pr(S7_T.dest_cd1),
								S6_T1.pr(S7_T.dest_cd2),
								S6_T1.pr(S7_T.dest_cd3),
								S6_T1.pr("tgt_no"),
								sum(S6_T2.pr(S10_TOP1.qty)).as("qty")
							)
							.from(
								subQuery()
								.selectDistinct(
									value(2).as("tgt_no"),
									S7_T.wg_cd,
									S7_T.itm_cd,
									S7_T.itm_sub1,
									S7_T.itm_sub2,
									S7_T.itm_sub3,
									S7_T.dpt_cd,
									S7_DPT.dpt_nm,
									S7_T.cst_cd,
									S7_T.dlv_cd,
									S7_T.dest_cd1,
									S7_T.dest_cd2,
									S7_T.dest_cd3,
									addDynamicSelect(DS7D)
								)
								.from(
									S7_T
									.innerJoin(S7_WG).on(S7_T.wg_cd.eq(S7_WG.wg_cd))
									.leftOuterJoin(S7_DPT).on(S7_T.dpt_cd.eq(S7_DPT.dpt_cd))
									.addDynamicView()
									.addDynamicView(DS7D)
								)
								.where(
									value(0).eq(value(0))
									.and(
										bracket(
											S7_T.calc_no.eq(bind("calc_no"))
											.and(S7_T.calc_grp_cd.eq(bind("calc_grp_cd")))
											.and(
												nvl(
													S7_T.dpt_cd,
													value(MAC_STR.NULL_VAL.value())
												).eq(value(MAC_STR.NULL_VAL.value()))
												.or(S7_DPT.term.eq(bind("term")))
											)
										)
										.or(
											S7_T.calc_no.eq(bind("calc_no2"))
											.and(S7_T.calc_grp_cd.eq(bind("calc_grp_cd2")))
											.and(
												nvl(
													S7_T.dpt_cd,
													value(MAC_STR.NULL_VAL.value())
												).eq(value(MAC_STR.NULL_VAL.value()))
												.or(S7_DPT.term.eq(bind("term2")))
											)
										)
									)
									.and(S7_T.sls_flg.eq(bind("sls_flg_str")))
									.cutoff$and(S7_T.wg_cd.like(bind("wg_cd")))
									.cutoff$and(S7_WG.wg_nm.like(bind("wg_nm")))
									.addDynamicPredicate()
									.cutoff$and(S7_T.itm_cd.like(bind("itm_cd")))
									.cutoff$and(S7_T.itm_sub1.like(bind("itm_sub1")))
									.cutoff$and(S7_T.itm_sub2.like(bind("itm_sub2")))
									.cutoff$and(S7_T.itm_sub3.like(bind("itm_sub3")))
									.cutoff$and(S7_T.dpt_cd.like(bind("dpt_cd")))
									.cutoff$and(S7_T.cst_cd.like(bind("cst_cd")))
									.cutoff$and(S7_T.dlv_cd.like(bind("dlv_cd")))
									.cutoff$and(S7_T.dest_cd1.like(bind("dest_cd1")))
									.cutoff$and(S7_T.dest_cd2.like(bind("dest_cd2")))
									.cutoff$and(S7_T.dest_cd3.like(bind("dest_cd3")))
									.cutoff$and(
										bind("no_dpt_flg_str").eq(value(true))
										.and(S7_T.dpt_cd.isNull())
									)
									.cutoff$and(
										bind("no_cst_flg_str").eq(value(true))
										.and(S7_T.cst_cd.isNull())
									)
									.cutoff$and(
										bind("no_dlv_flg_str").eq(value(true))
										.and(S7_T.dlv_cd.isNull())
									)
									.cutoff$and(
										bind("no_dest1_flg_str").eq(value(true))
										.and(S7_T.dest_cd1.isNull())
									)
									.cutoff$and(
										bind("no_dest2_flg_str").eq(value(true))
										.and(S7_T.dest_cd2.isNull())
									)
									.cutoff$and(
										bind("no_dest3_flg_str").eq(value(true))
										.and(S7_T.dest_cd3.isNull())
									)
									.addDynamicPredicate(DS7D)
								).view(S6_T1)
								.leftOuterJoin(
									subQuery()
									.select(
										S10_TOP1.wg_cd,
										S10_TOP1.itm_cd,
										S10_TOP1.itm_sub1,
										S10_TOP1.itm_sub2,
										S10_TOP1.itm_sub3,
										S10_TOP1.dpt_cd,
										S10_M1.dpt_nm,
										S10_TOP1.cst_cd,
										S10_TOP1.dlv_cd,
										S10_TOP1.dest_cd1,
										S10_TOP1.dest_cd2,
										S10_TOP1.dest_cd3,
										S10_TOP1.qty,
										S10_TOP1.calc_no,
										S10_TOP1.calc_grp_cd,
										S10_TOP1.top_rec_no
									)
									.from(
										S10_TOP1
										.leftOuterJoin(S10_M1).on(
											S10_TOP1.dpt_cd.eq(S10_M1.dpt_cd)
											.and(S10_M1.term.eq(bind("term2")))
										)
									)
									.where(
										value(0).eq(value(0))
										.and(S10_TOP1.calc_no.eq(bind("calc_no2")))
										.and(S10_TOP1.calc_grp_cd.eq(bind("calc_grp_cd2")))
										.and(S10_TOP1.sls_flg.eq(bind("sls_flg_str")))
									).view(S6_T2)
								).on(
									S6_T1.pr(S7_T.wg_cd).eq(S6_T2.pr(S10_TOP1.wg_cd))
									.and(S6_T1.pr(S7_T.itm_cd).eq(S6_T2.pr(S10_TOP1.itm_cd)))
									.and(S6_T1.pr(S7_T.itm_sub1).eq(S6_T2.pr(S10_TOP1.itm_sub1)))
									.and(S6_T1.pr(S7_T.itm_sub2).eq(S6_T2.pr(S10_TOP1.itm_sub2)))
									.and(S6_T1.pr(S7_T.itm_sub3).eq(S6_T2.pr(S10_TOP1.itm_sub3)))
									.and(
										nvl(
											S6_T1.pr(S7_T.dpt_cd),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S6_T2.pr(S10_TOP1.dpt_cd),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S6_T1.pr(S7_DPT.dpt_nm),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S6_T2.pr(S10_M1.dpt_nm),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S6_T1.pr(S7_T.cst_cd),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S6_T2.pr(S10_TOP1.cst_cd),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S6_T1.pr(S7_T.dlv_cd),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S6_T2.pr(S10_TOP1.dlv_cd),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S6_T1.pr(S7_T.dest_cd1),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S6_T2.pr(S10_TOP1.dest_cd1),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S6_T1.pr(S7_T.dest_cd2),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S6_T2.pr(S10_TOP1.dest_cd2),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
									.and(
										nvl(
											S6_T1.pr(S7_T.dest_cd3),
											value(MAC_STR.NULL_VAL.value())
										).eq(nvl(
												S6_T2.pr(S10_TOP1.dest_cd3),
												value(MAC_STR.NULL_VAL.value())
											)
										)
									)
								)
							)
							.where(
								value(0).eq(value(0))
							)
							.groupBy(
								S6_T1.pr(S7_T.wg_cd),
								S6_T1.pr(S7_T.itm_cd),
								S6_T1.pr(S7_T.itm_sub1),
								S6_T1.pr(S7_T.itm_sub2),
								S6_T1.pr(S7_T.itm_sub3),
								S6_T1.pr(S7_T.dpt_cd),
								S6_T1.pr(S7_DPT.dpt_nm),
								S6_T1.pr(S7_T.cst_cd),
								S6_T1.pr(S7_T.dlv_cd),
								S6_T1.pr(S7_T.dest_cd1),
								S6_T1.pr(S7_T.dest_cd2),
								S6_T1.pr(S7_T.dest_cd3),
								S6_T1.pr("tgt_no")
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
				when(boundOr("itm_typ_d_nm", "itm_jnl_nm", "itm_grp_nm1", "itm_grp_nm2", "itm_grp_nm3", "itm_grp_nm4", "itm_grp_nm5", "itm_grp_nm6", "itm_grp_nm7", "itm_grp_nm8", "itm_grp_nm9", "itm_grp_nm10", "itm_grp_nm1", "itm_grp_nm2", "itm_grp_nm3", "itm_grp_nm4", "itm_grp_nm5", "itm_grp_nm6", "itm_grp_nm7", "itm_grp_nm8", "itm_grp_nm9", "itm_grp_nm10", "itm_typ", "itm_typ_d_cd", "itm_jnl_cd", "itm_nm", "itm_grp_cd1", "itm_grp_cd2", "itm_grp_cd3", "itm_grp_cd4", "itm_grp_cd5", "itm_grp_cd6", "itm_grp_cd7", "itm_grp_cd8", "itm_grp_cd9", "itm_grp_cd10"))
					.view(v -> v.leftOuterJoin(S7_ITM).on(S7_T.itm_cd.eq(S7_ITM.itm_cd).and(S7_T.itm_sub1.eq(S7_ITM.itm_sub1)).and(S7_T.itm_sub2.eq(S7_ITM.itm_sub2)).and(S7_T.itm_sub3.eq(S7_ITM.itm_sub3))))
					.predicate(p -> p.cutoff$and(S7_ITM.itm_typ.like(bind("itm_typ"))).cutoff$and(S7_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S7_ITM.itm_jnl_cd.like(bind("itm_jnl_cd"))).cutoff$and(S7_ITM.itm_nm.like(bind("itm_nm"))).cutoff$and(S7_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S7_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S7_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S7_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S7_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S7_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S7_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S7_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S7_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S7_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S7_ITM_TYP_D).on(S7_ITM.itm_typ.eq(S7_ITM_TYP_D.itm_typ).and(S7_ITM.itm_typ_d_cd.eq(S7_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S7_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S7_ITM_JNL).on(S7_ITM.itm_jnl_cd.eq(S7_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S7_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr(S2_T.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S2_T.dpt_cd)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr(S2_DPT.dpt_nm))
					.groupBy(DS0D, S0_T.pr(S2_DPT.dpt_nm)),
				when(boundOr("cst_flg"))
					.select(DS0D, S0_T.pr(S2_T.cst_cd))
					.groupBy(DS0D, S0_T.pr(S2_T.cst_cd)),
				when(boundOr("dlv_flg"))
					.select(DS0D, S0_T.pr(S2_T.dlv_cd))
					.groupBy(DS0D, S0_T.pr(S2_T.dlv_cd)),
				when(boundOr("dest1_flg"))
					.select(DS0D, S0_T.pr(S2_T.dest_cd1))
					.groupBy(DS0D, S0_T.pr(S2_T.dest_cd1)),
				when(boundOr("dest2_flg"))
					.select(DS0D, S0_T.pr(S2_T.dest_cd2))
					.groupBy(DS0D, S0_T.pr(S2_T.dest_cd2)),
				when(boundOr("dest3_flg"))
					.select(DS0D, S0_T.pr(S2_T.dest_cd3))
					.groupBy(DS0D, S0_T.pr(S2_T.dest_cd3)),
				when(null)
					.select(DS0D, S0_T.pr(S2_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S2_T.wg_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S2_T.itm_cd))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S2_T.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_sub1)),
				when(null)
					.select(DS0D, S0_T.pr(S2_T.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_sub2)),
				when(null)
					.select(DS0D, S0_T.pr(S2_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S2_T.itm_sub3)),
				when(null)
					.select(DS0D, S0_T.pr("tgt_no"))
					.groupBy(DS0D, S0_T.pr("tgt_no")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty")).as("qty")),
				when(boundOr("cst_flg", "cst_nm", "cst_grp_cd1", "cst_grp_nm1", "cst_grp_cd2", "cst_grp_nm2", "cst_grp_cd3", "cst_grp_nm3", "cst_grp_cd4", "cst_grp_nm4", "cst_grp_cd5", "cst_grp_nm5", "cst_grp_cd6", "cst_grp_nm6", "cst_grp_cd7", "cst_grp_nm7", "cst_grp_cd8", "cst_grp_nm8", "cst_grp_cd9", "cst_grp_nm9", "cst_grp_cd10", "cst_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST).on(S2_CST.bp_cd.eq(S2_T.cst_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST.bp_nm.like(bind("cst_nm"))).cutoff$and(S2_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S2_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S2_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S2_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S2_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S2_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S2_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S2_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S2_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S2_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("dlv_flg", "dlv_nm", "dlv_grp_cd1", "dlv_grp_nm1", "dlv_grp_cd2", "dlv_grp_nm2", "dlv_grp_cd3", "dlv_grp_nm3", "dlv_grp_cd4", "dlv_grp_nm4", "dlv_grp_cd5", "dlv_grp_nm5", "dlv_grp_cd6", "dlv_grp_nm6", "dlv_grp_cd7", "dlv_grp_nm7", "dlv_grp_cd8", "dlv_grp_nm8", "dlv_grp_cd9", "dlv_grp_nm9", "dlv_grp_cd10", "dlv_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV).on(S2_DLV.bp_cd.eq(S2_T.dlv_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV.bp_nm.like(bind("dlv_nm"))).cutoff$and(S2_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S2_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S2_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S2_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S2_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S2_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S2_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S2_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S2_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S2_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))),
				when(boundOr("dest1_flg", "dest_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DEST1).on(S2_T.dest_cd1.eq(S2_DEST1.bp_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest2_flg", "dest_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DEST2).on(S2_T.dest_cd2.eq(S2_DEST2.bp_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest3_flg", "dest_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DEST3).on(S2_T.dest_cd3.eq(S2_DEST3.bp_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP1).on(S2_ITM.itm_grp_cd1.eq(S2_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2_ITM_GRP1.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP2).on(S2_ITM.itm_grp_cd2.eq(S2_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2_ITM_GRP2.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP3).on(S2_ITM.itm_grp_cd3.eq(S2_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2_ITM_GRP3.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP4).on(S2_ITM.itm_grp_cd4.eq(S2_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2_ITM_GRP4.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP5).on(S2_ITM.itm_grp_cd5.eq(S2_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2_ITM_GRP5.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP6).on(S2_ITM.itm_grp_cd6.eq(S2_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2_ITM_GRP6.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP7).on(S2_ITM.itm_grp_cd7.eq(S2_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2_ITM_GRP7.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP8).on(S2_ITM.itm_grp_cd8.eq(S2_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2_ITM_GRP8.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP9).on(S2_ITM.itm_grp_cd9.eq(S2_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2_ITM_GRP9.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP10).on(S2_ITM.itm_grp_cd10.eq(S2_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2_ITM_GRP10.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cst_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP1).on(S2_CST.bp_grp_cd1.eq(S2_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S2_CST_GRP1.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP2).on(S2_CST.bp_grp_cd2.eq(S2_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S2_CST_GRP2.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP3).on(S2_CST.bp_grp_cd3.eq(S2_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S2_CST_GRP3.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP4).on(S2_CST.bp_grp_cd4.eq(S2_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S2_CST_GRP4.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP5).on(S2_CST.bp_grp_cd5.eq(S2_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S2_CST_GRP5.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP6).on(S2_CST.bp_grp_cd6.eq(S2_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S2_CST_GRP6.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP7).on(S2_CST.bp_grp_cd7.eq(S2_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S2_CST_GRP7.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP8).on(S2_CST.bp_grp_cd8.eq(S2_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S2_CST_GRP8.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP9).on(S2_CST.bp_grp_cd9.eq(S2_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S2_CST_GRP9.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_CST_GRP10).on(S2_CST.bp_grp_cd10.eq(S2_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S2_CST_GRP10.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP1).on(S2_DLV.bp_grp_cd1.eq(S2_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S2_DLV_GRP1.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP2).on(S2_DLV.bp_grp_cd2.eq(S2_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S2_DLV_GRP2.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP3).on(S2_DLV.bp_grp_cd3.eq(S2_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S2_DLV_GRP3.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP4).on(S2_DLV.bp_grp_cd4.eq(S2_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S2_DLV_GRP4.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP5).on(S2_DLV.bp_grp_cd5.eq(S2_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S2_DLV_GRP5.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP6).on(S2_DLV.bp_grp_cd6.eq(S2_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S2_DLV_GRP6.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP7).on(S2_DLV.bp_grp_cd7.eq(S2_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S2_DLV_GRP7.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP8).on(S2_DLV.bp_grp_cd8.eq(S2_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S2_DLV_GRP8.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP9).on(S2_DLV.bp_grp_cd9.eq(S2_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S2_DLV_GRP9.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_DLV_GRP10).on(S2_DLV.bp_grp_cd10.eq(S2_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S2_DLV_GRP10.bp_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("par_itm_cd", "par_itm_sub1", "par_itm_sub2", "par_itm_sub3", "par_itm_nm"))
					.predicate(DS2D, p -> p.and(exists(subQuery().select(value("X")).from(S3_W1.innerJoin(S3_W2).on(S3_W2.calc_no.eq(S3_W1.calc_no).and(S3_W2.calc_grp_cd.eq(S3_W1.calc_grp_cd)).and(S3_W2.top_rec_no.eq(S3_W1.top_rec_no))).leftOuterJoin(S3_W3).on(S3_W3.itm_cd.eq(S3_W1.itm_cd).and(S3_W3.itm_sub1.eq(S3_W1.itm_sub1)).and(S3_W3.itm_sub2.eq(S3_W1.itm_sub2)).and(S3_W3.itm_sub3.eq(S3_W1.itm_sub3)))).where(value(0).eq(value(0)).and(S3_W1.calc_no.eq(S2_T.calc_no)).and(S3_W1.calc_grp_cd.eq(S2_T.calc_grp_cd)).cutoff$and(S3_W1.itm_cd.like(bind("par_itm_cd"))).cutoff$and(S3_W1.itm_sub1.like(bind("par_itm_sub1"))).cutoff$and(S3_W1.itm_sub2.like(bind("par_itm_sub2"))).cutoff$and(S3_W1.itm_sub3.like(bind("par_itm_sub3"))).and(S3_W1.wg_cd.eq(S2_T.wg_cd)).and(S3_W1.sls_flg.eq(value(false))).and(S3_W2.itm_cd.eq(S2_T.itm_cd)).and(S3_W2.itm_sub1.eq(S2_T.itm_sub1)).and(S3_W2.itm_sub2.eq(S2_T.itm_sub2)).and(S3_W2.itm_sub3.eq(S2_T.itm_sub3)).cutoff$and(S3_W3.itm_nm.like(bind("par_itm_nm"))))))),
				when(boundOr("chd_itm_cd", "chd_itm_sub1", "chd_itm_sub2", "chd_itm_sub3", "chd_itm_nm"))
					.predicate(DS2D, p -> p.and(exists(subQuery().select(value("X")).from(S4_W1.leftOuterJoin(S4_W2).on(S4_W2.itm_cd.eq(S4_W1.itm_cd).and(S4_W2.itm_sub1.eq(S4_W1.itm_sub1)).and(S4_W2.itm_sub2.eq(S4_W1.itm_sub2)).and(S4_W2.itm_sub3.eq(S4_W1.itm_sub3)))).where(value(0).eq(value(0)).and(S4_W1.calc_no.eq(S2_T.calc_no)).and(S4_W1.calc_grp_cd.eq(S2_T.calc_grp_cd)).and(S4_W1.top_rec_no.eq(S2_T.top_rec_no)).cutoff$and(S4_W1.itm_cd.like(bind("chd_itm_cd"))).cutoff$and(S4_W1.itm_sub1.like(bind("chd_itm_sub1"))).cutoff$and(S4_W1.itm_sub2.like(bind("chd_itm_sub2"))).cutoff$and(S4_W1.itm_sub3.like(bind("chd_itm_sub3"))).cutoff$and(S4_W2.itm_nm.like(bind("chd_itm_nm"))))))),
				when(boundOr("cst_flg", "cst_nm", "cst_grp_cd1", "cst_grp_nm1", "cst_grp_cd2", "cst_grp_nm2", "cst_grp_cd3", "cst_grp_nm3", "cst_grp_cd4", "cst_grp_nm4", "cst_grp_cd5", "cst_grp_nm5", "cst_grp_cd6", "cst_grp_nm6", "cst_grp_cd7", "cst_grp_nm7", "cst_grp_cd8", "cst_grp_nm8", "cst_grp_cd9", "cst_grp_nm9", "cst_grp_cd10", "cst_grp_nm10"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST).on(S7_CST.bp_cd.eq(S7_T.cst_cd)))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST.bp_nm.like(bind("cst_nm"))).cutoff$and(S7_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S7_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S7_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S7_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S7_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S7_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S7_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S7_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S7_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S7_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("dlv_flg", "dlv_nm", "dlv_grp_cd1", "dlv_grp_nm1", "dlv_grp_cd2", "dlv_grp_nm2", "dlv_grp_cd3", "dlv_grp_nm3", "dlv_grp_cd4", "dlv_grp_nm4", "dlv_grp_cd5", "dlv_grp_nm5", "dlv_grp_cd6", "dlv_grp_nm6", "dlv_grp_cd7", "dlv_grp_nm7", "dlv_grp_cd8", "dlv_grp_nm8", "dlv_grp_cd9", "dlv_grp_nm9", "dlv_grp_cd10", "dlv_grp_nm10"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV).on(S7_DLV.bp_cd.eq(S7_T.dlv_cd)))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV.bp_nm.like(bind("dlv_nm"))).cutoff$and(S7_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S7_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S7_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S7_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S7_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S7_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S7_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S7_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S7_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S7_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))),
				when(boundOr("dest1_flg", "dest_nm1"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DEST1).on(S7_T.dest_cd1.eq(S7_DEST1.bp_cd)))
					.predicate(DS7D, p -> p.cutoff$and(S7_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest2_flg", "dest_nm2"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DEST2).on(S7_T.dest_cd2.eq(S7_DEST2.bp_cd)))
					.predicate(DS7D, p -> p.cutoff$and(S7_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest3_flg", "dest_nm3"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DEST3).on(S7_T.dest_cd3.eq(S7_DEST3.bp_cd)))
					.predicate(DS7D, p -> p.cutoff$and(S7_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_grp_nm1"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP1).on(S7_ITM.itm_grp_cd1.eq(S7_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S7_ITM_GRP1.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP2).on(S7_ITM.itm_grp_cd2.eq(S7_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S7_ITM_GRP2.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP3).on(S7_ITM.itm_grp_cd3.eq(S7_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S7_ITM_GRP3.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP4).on(S7_ITM.itm_grp_cd4.eq(S7_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S7_ITM_GRP4.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP5).on(S7_ITM.itm_grp_cd5.eq(S7_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S7_ITM_GRP5.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP6).on(S7_ITM.itm_grp_cd6.eq(S7_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S7_ITM_GRP6.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP7).on(S7_ITM.itm_grp_cd7.eq(S7_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S7_ITM_GRP7.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP8).on(S7_ITM.itm_grp_cd8.eq(S7_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S7_ITM_GRP8.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP9).on(S7_ITM.itm_grp_cd9.eq(S7_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S7_ITM_GRP9.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS7D, v -> v.leftOuterJoin(S7_ITM_GRP10).on(S7_ITM.itm_grp_cd10.eq(S7_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S7_ITM_GRP10.itm_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cst_grp_nm1"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP1).on(S7_CST.bp_grp_cd1.eq(S7_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S7_CST_GRP1.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_nm2"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP2).on(S7_CST.bp_grp_cd2.eq(S7_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S7_CST_GRP2.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_nm3"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP3).on(S7_CST.bp_grp_cd3.eq(S7_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S7_CST_GRP3.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_nm4"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP4).on(S7_CST.bp_grp_cd4.eq(S7_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S7_CST_GRP4.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_nm5"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP5).on(S7_CST.bp_grp_cd5.eq(S7_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S7_CST_GRP5.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_nm6"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP6).on(S7_CST.bp_grp_cd6.eq(S7_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S7_CST_GRP6.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_nm7"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP7).on(S7_CST.bp_grp_cd7.eq(S7_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S7_CST_GRP7.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_nm8"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP8).on(S7_CST.bp_grp_cd8.eq(S7_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S7_CST_GRP8.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_nm9"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP9).on(S7_CST.bp_grp_cd9.eq(S7_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S7_CST_GRP9.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_nm10"))
					.view(DS7D, v -> v.leftOuterJoin(S7_CST_GRP10).on(S7_CST.bp_grp_cd10.eq(S7_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S7_CST_GRP10.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_nm1"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP1).on(S7_DLV.bp_grp_cd1.eq(S7_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S7_DLV_GRP1.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_nm2"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP2).on(S7_DLV.bp_grp_cd2.eq(S7_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S7_DLV_GRP2.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_nm3"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP3).on(S7_DLV.bp_grp_cd3.eq(S7_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S7_DLV_GRP3.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_nm4"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP4).on(S7_DLV.bp_grp_cd4.eq(S7_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S7_DLV_GRP4.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_nm5"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP5).on(S7_DLV.bp_grp_cd5.eq(S7_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S7_DLV_GRP5.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_nm6"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP6).on(S7_DLV.bp_grp_cd6.eq(S7_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S7_DLV_GRP6.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_nm7"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP7).on(S7_DLV.bp_grp_cd7.eq(S7_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S7_DLV_GRP7.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_nm8"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP8).on(S7_DLV.bp_grp_cd8.eq(S7_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S7_DLV_GRP8.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_nm9"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP9).on(S7_DLV.bp_grp_cd9.eq(S7_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S7_DLV_GRP9.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_nm10"))
					.view(DS7D, v -> v.leftOuterJoin(S7_DLV_GRP10).on(S7_DLV.bp_grp_cd10.eq(S7_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S7_DLV_GRP10.bp_grp_typ))))
					.predicate(DS7D, p -> p.cutoff$and(S7_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("par_itm_cd", "par_itm_sub1", "par_itm_sub2", "par_itm_sub3", "par_itm_nm"))
					.predicate(DS7D, p -> p.and(exists(subQuery().select(value("X")).from(S8_W1.innerJoin(S8_W2).on(S8_W2.calc_no.eq(S8_W1.calc_no).and(S8_W2.calc_grp_cd.eq(S8_W1.calc_grp_cd)).and(S8_W2.top_rec_no.eq(S8_W1.top_rec_no))).leftOuterJoin(S8_W3).on(S8_W3.itm_cd.eq(S8_W1.itm_cd).and(S8_W3.itm_sub1.eq(S8_W1.itm_sub1)).and(S8_W3.itm_sub2.eq(S8_W1.itm_sub2)).and(S8_W3.itm_sub3.eq(S8_W1.itm_sub3)))).where(value(0).eq(value(0)).and(S8_W1.calc_no.eq(S7_T.calc_no)).and(S8_W1.calc_grp_cd.eq(S7_T.calc_grp_cd)).cutoff$and(S8_W1.itm_cd.like(bind("par_itm_cd"))).cutoff$and(S8_W1.itm_sub1.like(bind("par_itm_sub1"))).cutoff$and(S8_W1.itm_sub2.like(bind("par_itm_sub2"))).cutoff$and(S8_W1.itm_sub3.like(bind("par_itm_sub3"))).and(S8_W1.wg_cd.eq(S7_T.wg_cd)).and(S8_W1.sls_flg.eq(value(false))).and(S8_W2.itm_cd.eq(S7_T.itm_cd)).and(S8_W2.itm_sub1.eq(S7_T.itm_sub1)).and(S8_W2.itm_sub2.eq(S7_T.itm_sub2)).and(S8_W2.itm_sub3.eq(S7_T.itm_sub3)).cutoff$and(S8_W3.itm_nm.like(bind("par_itm_nm"))))))),
				when(boundOr("chd_itm_cd", "chd_itm_sub1", "chd_itm_sub2", "chd_itm_sub3", "chd_itm_nm"))
					.predicate(DS7D, p -> p.and(exists(subQuery().select(value("X")).from(S9_W1.leftOuterJoin(S9_W2).on(S9_W2.itm_cd.eq(S9_W1.itm_cd).and(S9_W2.itm_sub1.eq(S9_W1.itm_sub1)).and(S9_W2.itm_sub2.eq(S9_W1.itm_sub2)).and(S9_W2.itm_sub3.eq(S9_W1.itm_sub3)))).where(value(0).eq(value(0)).and(S9_W1.calc_no.eq(S7_T.calc_no)).and(S9_W1.calc_grp_cd.eq(S7_T.calc_grp_cd)).and(S9_W1.top_rec_no.eq(S7_T.top_rec_no)).cutoff$and(S9_W1.itm_cd.like(bind("chd_itm_cd"))).cutoff$and(S9_W1.itm_sub1.like(bind("chd_itm_sub1"))).cutoff$and(S9_W1.itm_sub2.like(bind("chd_itm_sub2"))).cutoff$and(S9_W1.itm_sub3.like(bind("chd_itm_sub3"))).cutoff$and(S9_W2.itm_nm.like(bind("chd_itm_nm")))))))
			);
	}
}