package mcframe.serverMGBD.MGBDL0500;

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
	 * -- MGBDL0500_MAM_BOM_Query_S01
	 */
	static MCQueryPlan MGBDL0500_MAM_BOM_S01() {
		MCTempView S0_V2 = createTempView("V2");
		MCTempView S1_V1 = createTempView("V1");
		MAM_BOM_R S2_M1 = MAM_BOM_R.create("M1");
		MAM_ITM_SRCH_R S2_ITM = MAM_ITM_SRCH_R.create("ITM");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MGT_ITM_R S3_X = MGT_ITM_R.create("X");
		MAM_ITM_DTL__R S4_X = MAM_ITM_DTL__R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0500_MAM_BOM_Query_S01")
					.mainQuery()
					.select(S0_V2.prAll())
					.from(
						subQuery()
						.select(
							S1_V1.prAll(),
							rowNumber()
								.over()
								.orderBy(nullValue().asc()).as("row_num")
						)
						.from(
							subQuery()
							.selectDistinct(
								S2_M1.chd_itm_cd.as("itm_cd"),
								S2_M1.chd_itm_sub1.as("itm_sub1"),
								S2_M1.chd_itm_sub2.as("itm_sub2"),
								S2_M1.chd_itm_sub3.as("itm_sub3"),
								S2_ITM.calc_ptn_cd
							)
							.from(
								S2_M1
								.innerJoin(S2_ITM).on(
									S2_M1.chd_itm_cd.eq(S2_ITM.itm_cd)
									.and(S2_M1.chd_itm_sub1.eq(S2_ITM.itm_sub1))
									.and(S2_M1.chd_itm_sub2.eq(S2_ITM.itm_sub2))
									.and(S2_M1.chd_itm_sub3.eq(S2_ITM.itm_sub3))
								)
								.innerJoin(S2_TERM).on(
									S2_M1.st_dt.lt(S2_TERM.term_end_ym)
									.and(S2_M1.end_dt.gte(S2_TERM.term))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_ITM.calc_ptn_cd.isNull())
								.and(S2_ITM.stk_mng_typ.neq(value(MAC_STK_MNG_TYP.PHANTOM.value())))
								.and(
									S2_ITM.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.MNG.value()))
									.or(S2_M1.byprod_flg.eq(value(false)))
									.and(S2_ITM.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.NOT_MNG.value())))
								)
								.and(S2_M1.chd_itm_cd.isNotNull())
								.and(S2_M1.ph_flg.eq(value(false)))
								.and(S2_M1.not_cost_flg.eq(value(false)))
								.and(
									S2_M1.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
									.cutoff$or(bind("all_wg_flg").eq(value(true)))
									.cutoff$or(S2_M1.wg_cd.like(bind("wg_cd")))
								)
								.and(S2_TERM.term.eq(bind("term")))
								.and(S2_TERM.del_flg.eq(value(false)))
								.cutoff$and(S2_M1.del_flg.eq(bind("with_del_flg_str")))
								.cutoff$and(S2_ITM.del_flg.eq(bind("with_del_flg_str")))
								.cutoff$and(S2_ITM.release_flg.eq(bind("release_flg_str")))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S3_X)
										.where(
											S3_X.itm_cd.eq(S2_M1.chd_itm_cd)
											.and(S3_X.itm_sub1.eq(S2_M1.chd_itm_sub1))
											.and(S3_X.itm_sub2.eq(S2_M1.chd_itm_sub2))
											.and(S3_X.itm_sub3.eq(S2_M1.chd_itm_sub3))
											.and(S3_X.term.eq(bind("term")))
											.and(S3_X.calc_ctg_cd.eq(bind("calc_ctg_cd")))
											.and(S3_X.wg_cd.eq(bind("runtime_wg_cd")))
											.cutoff$and(S3_X.fix_flg.eq(bind("fix_flg_str")))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S4_X)
										.where(
											S4_X.itm_cd.eq(S2_M1.chd_itm_cd)
											.and(S4_X.itm_sub1.eq(S2_M1.chd_itm_sub1))
											.and(S4_X.itm_sub2.eq(S2_M1.chd_itm_sub2))
											.and(S4_X.itm_sub3.eq(S2_M1.chd_itm_sub3))
											.and(
												S4_X.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
												.cutoff$or(bind("all_wg_flg").eq(value(true)))
												.cutoff$or(S4_X.wg_cd.like(bind("wg_cd")))
											)
										)
									)
								)
								.cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M1.chd_itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_M1.chd_itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_M1.chd_itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_M1.chd_itm_sub3.like(bind("itm_sub3")))
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
							).view(S1_V1)
						).view(S0_V2)
					)
					.where(
						S0_V2.pr("row_num").lte(value(100))
					)
			);
	}
	
	
	/**
	 * -- MGBDL0500_MAM_ITM_DTL_Query_S01
	 */
	static MCQueryPlan MGBDL0500_MAM_ITM_DTL_S01() {
		MCTempView S0_V2 = createTempView("V2");
		MCTempView S1_V1 = createTempView("V1");
		MAM_ITM_DTL__R S2_M1 = MAM_ITM_DTL__R.create("M1");
		MAM_ITM_SRCH_R S2_ITM = MAM_ITM_SRCH_R.create("ITM");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MGT_ITM_R S3_X = MGT_ITM_R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0500_MAM_ITM_DTL_Query_S01")
					.mainQuery()
					.select(S0_V2.prAll())
					.from(
						subQuery()
						.select(
							S1_V1.prAll(),
							rowNumber()
								.over()
								.orderBy(nullValue().asc()).as("row_num")
						)
						.from(
							subQuery()
							.selectDistinct(
								S2_M1.itm_cd,
								S2_M1.itm_sub1,
								S2_M1.itm_sub2,
								S2_M1.itm_sub3,
								S2_ITM.calc_ptn_cd
							)
							.from(
								S2_M1
								.innerJoin(S2_ITM).on(
									S2_M1.itm_cd.eq(S2_ITM.itm_cd)
									.and(S2_M1.itm_sub1.eq(S2_ITM.itm_sub1))
									.and(S2_M1.itm_sub2.eq(S2_ITM.itm_sub2))
									.and(S2_M1.itm_sub3.eq(S2_ITM.itm_sub3))
								)
								.innerJoin(S2_TERM).on(
									S2_M1.st_dt.lt(S2_TERM.term_end_ym)
									.and(S2_M1.end_dt.gte(S2_TERM.term))
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_ITM.calc_ptn_cd.isNull())
								.and(S2_ITM.stk_mng_typ.neq(value(MAC_STK_MNG_TYP.PHANTOM.value())))
								.and(
									S2_M1.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
									.cutoff$or(bind("all_wg_flg").eq(value(true)))
									.cutoff$or(S2_M1.wg_cd.like(bind("wg_cd")))
								)
								.and(S2_TERM.term.eq(bind("term")))
								.and(
									nvl(
										S2_M1.cost_ratio,
										S2_M1.order_ratio
									).gt(value(0))
								)
								.and(S2_TERM.del_flg.eq(value(false)))
								.cutoff$and(S2_M1.del_flg.eq(bind("with_del_flg_str")))
								.cutoff$and(S2_ITM.del_flg.eq(bind("with_del_flg_str")))
								.cutoff$and(S2_ITM.release_flg.eq(bind("release_flg_str")))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S3_X)
										.where(
											S3_X.itm_cd.eq(S2_M1.itm_cd)
											.and(S3_X.itm_sub1.eq(S2_M1.itm_sub1))
											.and(S3_X.itm_sub2.eq(S2_M1.itm_sub2))
											.and(S3_X.itm_sub3.eq(S2_M1.itm_sub3))
											.and(S3_X.term.eq(bind("term")))
											.and(S3_X.calc_ctg_cd.eq(bind("calc_ctg_cd")))
											.and(S3_X.wg_cd.eq(bind("runtime_wg_cd")))
											.cutoff$and(S3_X.fix_flg.eq(bind("fix_flg_str")))
										)
									)
								)
								.cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_M1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_M1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_M1.itm_sub3.like(bind("itm_sub3")))
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
							).view(S1_V1)
						).view(S0_V2)
					)
					.where(
						S0_V2.pr("row_num").lte(value(100))
					)
			);
	}
	
	/**
	 * -- MGBDL0500_MAM_ITM_SRCH_Query_S01
	 */
	static MCQueryPlan MGBDL0500_MAM_ITM_SRCH_S01() {
		MCTempView S0_V2 = createTempView("V2");
		MCTempView S1_V1 = createTempView("V1");
		MAM_ITM_SRCH_R S2_M1 = MAM_ITM_SRCH_R.create("M1");
		MGT_ITM_R S3_X = MGT_ITM_R.create("X");
		MAM_ITM_DTL__R S4_X = MAM_ITM_DTL__R.create("X");
		MAM_BOM_R S5_X = MAM_BOM_R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0500_MAM_ITM_SRCH_Query_S01")
					.mainQuery()
					.select(S0_V2.prAll())
					.from(
						subQuery()
						.select(
							S1_V1.prAll(),
							rowNumber()
								.over()
								.orderBy(nullValue().asc()).as("row_num")
						)
						.from(
							subQuery()
							.selectDistinct(
								S2_M1.itm_cd,
								S2_M1.itm_sub1,
								S2_M1.itm_sub2,
								S2_M1.itm_sub3,
								S2_M1.calc_ptn_cd
							)
							.from(S2_M1)
							.where(
								value(0).eq(value(0))
								.and(bind("only_itm_flg").eq(value(true)))
								.and(S2_M1.calc_ptn_cd.isNull())
								.and(S2_M1.stk_mng_typ.neq(value(MAC_STK_MNG_TYP.PHANTOM.value())))
								.cutoff$and(S2_M1.del_flg.eq(bind("with_del_flg_str")))
								.cutoff$and(S2_M1.release_flg.eq(bind("release_flg_str")))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S3_X)
										.where(
											S3_X.itm_cd.eq(S2_M1.itm_cd)
											.and(S3_X.itm_sub1.eq(S2_M1.itm_sub1))
											.and(S3_X.itm_sub2.eq(S2_M1.itm_sub2))
											.and(S3_X.itm_sub3.eq(S2_M1.itm_sub3))
											.and(S3_X.term.eq(bind("term")))
											.and(S3_X.calc_ctg_cd.eq(bind("calc_ctg_cd")))
											.and(S3_X.wg_cd.eq(bind("runtime_wg_cd")))
											.cutoff$and(S3_X.fix_flg.eq(bind("fix_flg_str")))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S4_X)
										.where(
											S4_X.itm_cd.eq(S2_M1.itm_cd)
											.and(S4_X.itm_sub1.eq(S2_M1.itm_sub1))
											.and(S4_X.itm_sub2.eq(S2_M1.itm_sub2))
											.and(S4_X.itm_sub3.eq(S2_M1.itm_sub3))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S5_X)
										.where(
											S5_X.chd_itm_cd.eq(S2_M1.itm_cd)
											.and(S5_X.chd_itm_sub1.eq(S2_M1.itm_sub1))
											.and(S5_X.chd_itm_sub2.eq(S2_M1.itm_sub2))
											.and(S5_X.chd_itm_sub3.eq(S2_M1.itm_sub3))
										)
									)
								)
								.cutoff$and(S2_M1.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S2_M1.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_M1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_M1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_M1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2_M1.itm_grp_cd1.like(bind("itm_grp_cd1")))
								.cutoff$and(S2_M1.itm_grp_cd2.like(bind("itm_grp_cd2")))
								.cutoff$and(S2_M1.itm_grp_cd3.like(bind("itm_grp_cd3")))
								.cutoff$and(S2_M1.itm_grp_cd4.like(bind("itm_grp_cd4")))
								.cutoff$and(S2_M1.itm_grp_cd5.like(bind("itm_grp_cd5")))
								.cutoff$and(S2_M1.itm_grp_cd6.like(bind("itm_grp_cd6")))
								.cutoff$and(S2_M1.itm_grp_cd7.like(bind("itm_grp_cd7")))
								.cutoff$and(S2_M1.itm_grp_cd8.like(bind("itm_grp_cd8")))
								.cutoff$and(S2_M1.itm_grp_cd9.like(bind("itm_grp_cd9")))
								.cutoff$and(S2_M1.itm_grp_cd10.like(bind("itm_grp_cd10")))
							).view(S1_V1)
						).view(S0_V2)
					)
					.where(
						S0_V2.pr("row_num").lte(value(100))
					)
			);
	}
	
	/**
	 * -- MGBDL0500_MAM_ITM_SRCH_Query_S02
	 */
	static MCQueryPlan MGBDL0500_MAM_ITM_SRCH_S02() {
		MAM_ITM_DTL__R S0_M1 = MAM_ITM_DTL__R.create("M1");
		MAM_ITM_SRCH_R S0_ITM = MAM_ITM_SRCH_R.create("ITM");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MGT_ITM_R S1_X = MGT_ITM_R.create("X");
		MAM_BOM_R S2_M1 = MAM_BOM_R.create("M1");
		MAM_ITM_SRCH_R S2_ITM = MAM_ITM_SRCH_R.create("ITM");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MGT_ITM_R S3_X = MGT_ITM_R.create("X");
		MAM_ITM_DTL__R S4_X = MAM_ITM_DTL__R.create("X");
		MAM_ITM_SRCH_R S5_M1 = MAM_ITM_SRCH_R.create("M1");
		MGT_ITM_R S6_X = MGT_ITM_R.create("X");
		MAM_ITM_DTL__R S7_X = MAM_ITM_DTL__R.create("X");
		MAM_BOM_R S8_X = MAM_BOM_R.create("X");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0500_MAM_ITM_SRCH_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						bind("term").as("term"),
						bind("calc_ctg_cd").as("calc_ctg_cd"),
						bind("runtime_wg_cd").as("wg_cd"),
						S0_ITM.calc_ptn_cd,
						nvl(
							S0_ITM.cost_std_qty,
							value(1)
						).as("std_qty")
					)
					.from(
						S0_M1
						.innerJoin(S0_ITM).on(
							S0_M1.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_M1.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_M1.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_M1.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.innerJoin(S0_TERM).on(
							S0_M1.st_dt.lt(S0_TERM.term_end_ym)
							.and(S0_M1.end_dt.gte(S0_TERM.term))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_M1.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
							.cutoff$or(bind("all_wg_flg").eq(value(true)))
							.cutoff$or(S0_M1.wg_cd.like(bind("wg_cd")))
						)
						.and(S0_TERM.term.eq(bind("term")))
						.and(
							nvl(
								S0_M1.cost_ratio,
								S0_M1.order_ratio
							).gt(value(0))
						)
						.and(S0_TERM.del_flg.eq(value(false)))
						.cutoff$and(S0_M1.del_flg.eq(bind("with_del_flg_str")))
						.cutoff$and(S0_ITM.del_flg.eq(bind("with_del_flg_str")))
						.cutoff$and(S0_ITM.release_flg.eq(bind("release_flg_str")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_X)
								.where(
									S1_X.itm_cd.eq(S0_M1.itm_cd)
									.and(S1_X.itm_sub1.eq(S0_M1.itm_sub1))
									.and(S1_X.itm_sub2.eq(S0_M1.itm_sub2))
									.and(S1_X.itm_sub3.eq(S0_M1.itm_sub3))
									.and(S1_X.term.eq(bind("term")))
									.and(S1_X.calc_ctg_cd.eq(bind("calc_ctg_cd")))
									.and(S1_X.wg_cd.eq(bind("runtime_wg_cd")))
									.cutoff$and(S1_X.fix_flg.eq(bind("fix_flg_str")))
								)
							)
						)
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_M1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_M1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_M1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
						.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
						.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
						.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
						.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
						.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
						.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
						.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
						.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
						.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
						.and(S0_ITM.stk_mng_typ.neq(value(MAC_STK_MNG_TYP.PHANTOM.value())))
					)
					.unionAll(
						subQuery()
						.selectDistinct(
							S2_M1.chd_itm_cd,
							S2_M1.chd_itm_sub1,
							S2_M1.chd_itm_sub2,
							S2_M1.chd_itm_sub3,
							bind("term").as("term"),
							bind("calc_ctg_cd").as("calc_ctg_cd"),
							bind("runtime_wg_cd").as("wg_cd"),
							S2_ITM.calc_ptn_cd,
							nvl(
								S2_ITM.cost_std_qty,
								value(1)
							).as("std_qty")
						)
						.from(
							S2_M1
							.innerJoin(S2_ITM).on(
								S2_M1.chd_itm_cd.eq(S2_ITM.itm_cd)
								.and(S2_M1.chd_itm_sub1.eq(S2_ITM.itm_sub1))
								.and(S2_M1.chd_itm_sub2.eq(S2_ITM.itm_sub2))
								.and(S2_M1.chd_itm_sub3.eq(S2_ITM.itm_sub3))
							)
							.innerJoin(S2_TERM).on(
								S2_M1.st_dt.lt(S2_TERM.term_end_ym)
								.and(S2_M1.end_dt.gte(S2_TERM.term))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S2_M1.ph_flg.eq(value(false)))
							.and(S2_M1.not_cost_flg.eq(value(false)))
							.and(
								S2_M1.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
								.cutoff$or(bind("all_wg_flg").eq(value(true)))
								.cutoff$or(S2_M1.wg_cd.like(bind("wg_cd")))
							)
							.and(S2_TERM.term.eq(bind("term")))
							.and(S2_TERM.del_flg.eq(value(false)))
							.cutoff$and(S2_M1.del_flg.eq(bind("with_del_flg_str")))
							.cutoff$and(S2_ITM.del_flg.eq(bind("with_del_flg_str")))
							.cutoff$and(S2_ITM.release_flg.eq(bind("release_flg_str")))
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S3_X)
									.where(
										S3_X.itm_cd.eq(S2_M1.chd_itm_cd)
										.and(S3_X.itm_sub1.eq(S2_M1.chd_itm_sub1))
										.and(S3_X.itm_sub2.eq(S2_M1.chd_itm_sub2))
										.and(S3_X.itm_sub3.eq(S2_M1.chd_itm_sub3))
										.and(S3_X.term.eq(bind("term")))
										.and(S3_X.calc_ctg_cd.eq(bind("calc_ctg_cd")))
										.and(S3_X.wg_cd.eq(bind("runtime_wg_cd")))
										.cutoff$and(S3_X.fix_flg.eq(bind("fix_flg_str")))
									)
								)
							)
							.and(
								notExists(
									subQuery()
									.select(value("X"))
									.from(S4_X)
									.where(
										S4_X.itm_cd.eq(S2_M1.chd_itm_cd)
										.and(S4_X.itm_sub1.eq(S2_M1.chd_itm_sub1))
										.and(S4_X.itm_sub2.eq(S2_M1.chd_itm_sub2))
										.and(S4_X.itm_sub3.eq(S2_M1.chd_itm_sub3))
										.and(
											S4_X.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
											.cutoff$or(bind("all_wg_flg").eq(value(true)))
											.cutoff$or(S4_X.wg_cd.like(bind("wg_cd")))
										)
									)
								)
							)
							.cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S2_M1.chd_itm_cd.like(bind("itm_cd")))
							.cutoff$and(S2_M1.chd_itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S2_M1.chd_itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S2_M1.chd_itm_sub3.like(bind("itm_sub3")))
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
							.and(S2_ITM.stk_mng_typ.neq(value(MAC_STK_MNG_TYP.PHANTOM.value())))
							.and(
								S2_ITM.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.MNG.value()))
								.or(S2_M1.byprod_flg.eq(value(false)))
								.and(S2_ITM.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.NOT_MNG.value())))
							)
						)
						.unionAll(
							subQuery()
							.selectDistinct(
								S5_M1.itm_cd,
								S5_M1.itm_sub1,
								S5_M1.itm_sub2,
								S5_M1.itm_sub3,
								bind("term").as("term"),
								bind("calc_ctg_cd").as("calc_ctg_cd"),
								bind("runtime_wg_cd").as("wg_cd"),
								S5_M1.calc_ptn_cd,
								nvl(
									S5_M1.cost_std_qty,
									value(1)
								).as("std_qty")
							)
							.from(S5_M1)
							.where(
								value(0).eq(value(0))
								.and(bind("only_itm_flg").eq(value(true)))
								.cutoff$and(S5_M1.del_flg.eq(bind("with_del_flg_str")))
								.cutoff$and(S5_M1.release_flg.eq(bind("release_flg_str")))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S6_X)
										.where(
											S6_X.itm_cd.eq(S5_M1.itm_cd)
											.and(S6_X.itm_sub1.eq(S5_M1.itm_sub1))
											.and(S6_X.itm_sub2.eq(S5_M1.itm_sub2))
											.and(S6_X.itm_sub3.eq(S5_M1.itm_sub3))
											.and(S6_X.term.eq(bind("term")))
											.and(S6_X.calc_ctg_cd.eq(bind("calc_ctg_cd")))
											.and(S6_X.wg_cd.eq(bind("runtime_wg_cd")))
											.cutoff$and(S6_X.fix_flg.eq(bind("fix_flg_str")))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S7_X)
										.where(
											S7_X.itm_cd.eq(S5_M1.itm_cd)
											.and(S7_X.itm_sub1.eq(S5_M1.itm_sub1))
											.and(S7_X.itm_sub2.eq(S5_M1.itm_sub2))
											.and(S7_X.itm_sub3.eq(S5_M1.itm_sub3))
										)
									)
								)
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S8_X)
										.where(
											S8_X.chd_itm_cd.eq(S5_M1.itm_cd)
											.and(S8_X.chd_itm_sub1.eq(S5_M1.itm_sub1))
											.and(S8_X.chd_itm_sub2.eq(S5_M1.itm_sub2))
											.and(S8_X.chd_itm_sub3.eq(S5_M1.itm_sub3))
										)
									)
								)
								.cutoff$and(S5_M1.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S5_M1.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S5_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S5_M1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S5_M1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S5_M1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S5_M1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S5_M1.itm_grp_cd1.like(bind("itm_grp_cd1")))
								.cutoff$and(S5_M1.itm_grp_cd2.like(bind("itm_grp_cd2")))
								.cutoff$and(S5_M1.itm_grp_cd3.like(bind("itm_grp_cd3")))
								.cutoff$and(S5_M1.itm_grp_cd4.like(bind("itm_grp_cd4")))
								.cutoff$and(S5_M1.itm_grp_cd5.like(bind("itm_grp_cd5")))
								.cutoff$and(S5_M1.itm_grp_cd6.like(bind("itm_grp_cd6")))
								.cutoff$and(S5_M1.itm_grp_cd7.like(bind("itm_grp_cd7")))
								.cutoff$and(S5_M1.itm_grp_cd8.like(bind("itm_grp_cd8")))
								.cutoff$and(S5_M1.itm_grp_cd9.like(bind("itm_grp_cd9")))
								.cutoff$and(S5_M1.itm_grp_cd10.like(bind("itm_grp_cd10")))
								.and(S5_M1.stk_mng_typ.neq(value(MAC_STK_MNG_TYP.PHANTOM.value())))
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0500_MGT_ITM_Query_S01
	 */
	static MCQueryPlan MGBDL0500_MGT_ITM_S01() {
		MGT_ITM_R S0_T = MGT_ITM_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_CALC_PTN_R S0_CALC_PTN = MAM_CALC_PTN_R.create("CALC_PTN");
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
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0500_MGT_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.term,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.calc_ptn_cd,
						S0_T.std_qty,
						S0_T.cmn_upri_flg,
						S0_T.fix_flg,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						S0_ITM.asset_mng_typ,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM.itm_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						S0_WG.wg_nm,
						S0_ITM.del_flg,
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.addDynamicView()
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.term.gte(bind("term_fr")))
						.cutoff$and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T.calc_ptn_cd.like(bind("calc_ptn_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
						.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
						.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
						.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
						.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
						.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
						.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
						.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
						.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
						.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
						.cutoff$and(S0_T.non_calc_flg.eq(bind("non_calc_flg_str")))
						.cutoff$and(S0_T.fix_flg.eq(bind("fix_flg_str")))
						.cutoff$and(S0_ITM.del_flg.eq(bind("del_flg_str")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.term.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_ITM.itm_jnl_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("calc_ptn_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_PTN).on(S0_T.calc_ptn_cd.eq(S0_CALC_PTN.calc_ptn_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_PTN.calc_ptn_nm.like(bind("calc_ptn_nm")))),
				when(boundOr("itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_TERM_R.class, r -> toCondition(
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("term_nm", m.term_nm());
					}),
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
						.add(MAM_CALC_PTN_R.class, r -> toCondition(
							r.getStringNE("calc_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ptn_nm", m.calc_ptn_nm());
					})
				)
			);
	}
	
	/**
	 * -- MGBDL0500_MGT_ITM_Query_S02
	 */
	static MCQueryPlan MGBDL0500_MGT_ITM_S02() {
		MGW_ITM_KEY_R S0_W1 = MGW_ITM_KEY_R.create("W1");
		MGT_ITM_R S0_T1 = MGT_ITM_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0500_MGT_ITM_Query_S02")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.term,
						S0_T1.calc_ctg_cd,
						S0_T1.wg_cd
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_W1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_W1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_W1.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_W1.term.eq(S0_T1.term))
								.and(S0_W1.calc_ctg_cd.eq(S0_T1.calc_ctg_cd))
								.and(S0_W1.wg_cd.eq(S0_T1.wg_cd))
							)
						)
					)
					.forUpdate(S0_T1.itm_cd)
			);
	}
}