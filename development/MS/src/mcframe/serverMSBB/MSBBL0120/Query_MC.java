package mcframe.serverMSBB.MSBBL0120;

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
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

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
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSBBL0120_MAM_SPLN_ITM_CONF_Query_S01
	 */
	static MCQueryPlan MSBBL0120_MAM_SPLN_ITM_CONF_S01() {
		MAM_SPLN_ITM_CONF_R S0_M1 = MAM_SPLN_ITM_CONF_R.create("M1");
		MAW_SPLN_ITM_KEY_R S0_WK = MAW_SPLN_ITM_KEY_R.create("WK");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MAM_SPLN_ITM_CONF_Query_S01")
					.mainQuery()
					.select(
						S0_M1.dpt_cd,
						S0_M1.spln_itm_cd,
						S0_M1.itm_cd,
						S0_M1.itm_sub1,
						S0_M1.itm_sub2,
						S0_M1.itm_sub3,
						S0_M2.itm_nm,
						S0_M2.unit_cd,
						S0_M3.unit_nm,
						S0_M1.st_ym,
						S0_M1.end_ym
					)
					.from(
						S0_M1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.spln_itm_cd.eq(S0_M1.spln_itm_cd)
							)
						)
						.innerJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.innerJoin(S0_M3).on(
							bracket(
								S0_M3.unit_cd.eq(S0_M2.unit_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_M1.dpt_cd.eq(bind("dpt_cd"))
							.or(S0_M1.dpt_cd.eq(value(MAC_STR.NULL_VAL.value())))
						)
						.and(S0_M1.end_ym.gte(bind("spln_ym_fr")))
						.and(S0_M1.st_ym.lte(bind("spln_ym_to")))
						.and(S0_M1.del_flg.eq(value(false)))
						.and(S0_M2.del_flg.eq(value(false)))
						.and(S0_M2.release_flg.eq(value(true)))
						.and(S0_M3.del_flg.eq(value(false)))
					)
			);
	}
	
	/**
	 * -- MSBBL0120_MST_SPLN_SUM_DTL_KEY_Query_I01
	 */
	static MCQueryPlan MSBBL0120_MST_SPLN_SUM_DTL_KEY_I01() {
		MSW_SPLN_SUM_DTL_KEY_R S0 = MSW_SPLN_SUM_DTL_KEY_R.create();
		MST_SPLN_SUM_DTL_R S1_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MSW_SPLN_SUM_DTL_KEY_R S2_WK = MSW_SPLN_SUM_DTL_KEY_R.create("WK");
		MSW_SPLN_SUM_DTL_KEY_R S3_WK = MSW_SPLN_SUM_DTL_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MST_SPLN_SUM_DTL_KEY_Query_I01")
					.insert(S0)
					.columns(
						S0.dpt_cd,
						S0.cst_cd,
						S0.wrk_no,
						S0.ym,
						S0.spln_vers,
						S0.spln_itm_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.cur_cd,
						S0.spln_ym
					)
					.query(
						subQuery()
						.select(
							S1_T1.dpt_cd,
							S1_T1.cst_cd,
							S1_T1.wrk_no,
							S1_T1.ym,
							S1_T1.spln_vers,
							S1_T1.spln_itm_cd,
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.cur_cd,
							S1_T1.spln_ym
						)
						.from(S1_T1)
						.where(
							value(0).eq(value(0))
							.and(
								exists(
									subQuery()
									.select(value(1))
									.from(S2_WK)
									.where(
										S2_WK.spln_vers.eq(S1_T1.spln_vers)
										.and(S2_WK.ym.eq(S1_T1.ym))
										.and(S2_WK.dpt_cd.eq(S1_T1.dpt_cd))
										.and(S2_WK.cst_cd.eq(S1_T1.cst_cd))
										.and(S2_WK.wrk_no.eq(S1_T1.wrk_no))
										.and(S2_WK.spln_itm_cd.eq(S1_T1.spln_itm_cd))
										.and(S2_WK.itm_cd.eq(S1_T1.itm_cd))
										.and(S2_WK.itm_sub1.eq(S1_T1.itm_sub1))
										.and(S2_WK.itm_sub2.eq(S1_T1.itm_sub2))
										.and(S2_WK.itm_sub3.eq(S1_T1.itm_sub3))
										.and(S2_WK.cur_cd.eq(S1_T1.cur_cd))
									)
								)
							)
							.and(
								notExists(
									subQuery()
									.select(value(1))
									.from(S3_WK)
									.where(
										S3_WK.spln_vers.eq(S1_T1.spln_vers)
										.and(S3_WK.ym.eq(S1_T1.ym))
										.and(S3_WK.dpt_cd.eq(S1_T1.dpt_cd))
										.and(S3_WK.cst_cd.eq(S1_T1.cst_cd))
										.and(S3_WK.wrk_no.eq(S1_T1.wrk_no))
										.and(S3_WK.spln_itm_cd.eq(S1_T1.spln_itm_cd))
										.and(S3_WK.itm_cd.eq(S1_T1.itm_cd))
										.and(S3_WK.itm_sub1.eq(S1_T1.itm_sub1))
										.and(S3_WK.itm_sub2.eq(S1_T1.itm_sub2))
										.and(S3_WK.itm_sub3.eq(S1_T1.itm_sub3))
										.and(S3_WK.cur_cd.eq(S1_T1.cur_cd))
										.and(S3_WK.spln_ym.eq(S1_T1.spln_ym))
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0120_MST_SPLN_SUM_DTL_Query_S01
	 */
	static MCQueryPlan MSBBL0120_MST_SPLN_SUM_DTL_S01() {
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MST_SPLN_SUM_FIX_R S0_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		MST_SPLN_SUM_ITM_R S0_T3 = MST_SPLN_SUM_ITM_R.create("T3");
		MST_SPLN_FMT_R S0_T4 = MST_SPLN_FMT_R.create("T4");
		MAM_SPLN_ITM_R S0_M1 = MAM_SPLN_ITM_R.create("M1");
		MAM_CUR_R S0_M2 = MAM_CUR_R.create("M2");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAM_UNIT_R S0_M4 = MAM_UNIT_R.create("M4");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MST_SPLN_SUM_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.spln_itm_cd,
						S0_M1.spln_itm_nm,
						S0_M1.spln_set_typ,
						S0_T1.cur_cd,
						S0_M2.cur_nm,
						S0_M2.amt_dec_place,
						S0_T1.spln_ym,
						S0_T1.spln_qty.as("dtl_qty"),
						S0_T1.spln_amt.as("dtl_amt"),
						S0_T2.fix_flg,
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_M3.itm_nm,
						S0_M3.unit_cd,
						S0_M4.unit_nm,
						S0_T3.spln_qty,
						S0_T3.spln_amt,
						min(S0_T4.disp_seq).as("disp_seq")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T3.ym.eq(S0_T1.ym))
								.and(S0_T3.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T3.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T3.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T3.spln_ym.eq(S0_T1.spln_ym))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.dpt_cd.eq(S0_T1.dpt_cd)
								.and(
									cases()
										.when(S0_T4.cst_cd_unit_flg.eq(value(true)))
											.then(S0_T4.cst_cd)
										.otherwise(value(MAC_STR.NULL_VAL.value())).eq(S0_T1.cst_cd)
								)
								.and(
									cases()
										.when(S0_T4.wrk_no_unit_flg.eq(value(true)))
											.then(S0_T4.wrk_no)
										.otherwise(value(MAC_STR.NULL_VAL.value())).eq(S0_T1.wrk_no)
								)
								.and(S0_T4.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T4.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T4.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T4.st_ym.lte(S0_T1.spln_ym))
								.and(S0_T4.end_ym.gte(S0_T1.spln_ym))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.spln_itm_cd.eq(S0_T1.spln_itm_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.cur_cd.eq(S0_T1.cur_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_M3.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_M3.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_M3.itm_sub3.eq(S0_T3.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.unit_cd.eq(S0_M3.unit_cd)
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dpt_cd.eq(bind("dpt_cd")))
						.and(S0_T1.cst_cd.eq(bind("cst_cd")))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
						.and(S0_T1.ym.eq(bind("ym")))
						.and(S0_T1.spln_vers.eq(bind("spln_vers")))
						.and(S0_T1.itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
						.and(S0_T1.spln_ym.gte(bind("spln_ym_fr")))
						.and(S0_T1.spln_ym.lte(bind("spln_ym_to")))
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_M1.spln_itm_nm.like(bind("spln_itm_nm")))
						.cutoff$and(S0_M2.cur_nm.like(bind("cur_nm")))
						.cutoff$and(S0_T2.fix_flg.eq(bind("fix_flg_str")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.groupBy(
						S0_T1.spln_itm_cd,
						S0_M1.spln_itm_nm,
						S0_M1.spln_set_typ,
						S0_T1.cur_cd,
						S0_M2.cur_nm,
						S0_M2.amt_dec_place,
						S0_T1.spln_ym,
						S0_T1.spln_qty,
						S0_T1.spln_amt,
						S0_T2.fix_flg,
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_M3.itm_nm,
						S0_M3.unit_cd,
						S0_M4.unit_nm,
						S0_T3.spln_qty,
						S0_T3.spln_amt
					)
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_grp_flg1"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBBL0120_MST_SPLN_SUM_DTL_Query_S02
	 */
	static MCQueryPlan MSBBL0120_MST_SPLN_SUM_DTL_S02() {
		MCTempView S0_V1 = createTempView("V1");
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MSW_SPLN_SUM_DTL_KEY_R S1_WK = MSW_SPLN_SUM_DTL_KEY_R.create("WK");
		MST_SPLN_SUM_ITM_R S1_T1 = MST_SPLN_SUM_ITM_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MST_SPLN_SUM_DTL_Query_S02")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.ym,
						S0_T1.spln_vers,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.spln_ym,
						S0_V1.pr("spln_qty"),
						S0_V1.pr("spln_amt")
					)
					.from(
						subQuery()
						.select(
							S1_WK.dpt_cd,
							S1_WK.cst_cd,
							S1_WK.wrk_no,
							S1_WK.ym,
							S1_WK.spln_vers,
							S1_WK.spln_itm_cd,
							S1_WK.cur_cd,
							S1_WK.spln_ym,
							sum(S1_T1.spln_qty).as("spln_qty"),
							sum(S1_T1.spln_amt).as("spln_amt")
						)
						.from(
							S1_WK
							.innerJoin(S1_T1).on(
								bracket(
									S1_T1.dpt_cd.eq(S1_WK.dpt_cd)
									.and(S1_T1.cst_cd.eq(S1_WK.cst_cd))
									.and(S1_T1.wrk_no.eq(S1_WK.wrk_no))
									.and(S1_T1.ym.eq(S1_WK.ym))
									.and(S1_T1.spln_vers.eq(S1_WK.spln_vers))
									.and(S1_T1.spln_itm_cd.eq(S1_WK.spln_itm_cd))
									.and(S1_T1.cur_cd.eq(S1_WK.cur_cd))
									.and(S1_T1.spln_ym.eq(S1_WK.spln_ym))
								)
							)
						)
						.groupBy(
							S1_WK.dpt_cd,
							S1_WK.cst_cd,
							S1_WK.wrk_no,
							S1_WK.ym,
							S1_WK.spln_vers,
							S1_WK.spln_itm_cd,
							S1_WK.cur_cd,
							S1_WK.spln_ym
						).view(S0_V1)
						.innerJoin(S0_T1).on(
							bracket(
								S0_V1.pr(S1_WK.dpt_cd).eq(S0_T1.dpt_cd)
								.and(S0_V1.pr(S1_WK.cst_cd).eq(S0_T1.cst_cd))
								.and(S0_V1.pr(S1_WK.wrk_no).eq(S0_T1.wrk_no))
								.and(S0_V1.pr(S1_WK.ym).eq(S0_T1.ym))
								.and(S0_V1.pr(S1_WK.spln_vers).eq(S0_T1.spln_vers))
								.and(S0_V1.pr(S1_WK.spln_itm_cd).eq(S0_T1.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T1.itm_sub1.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T1.itm_sub2.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_T1.itm_sub3.eq(value(MAC_STR.NULL_VAL.value())))
								.and(S0_V1.pr(S1_WK.cur_cd).eq(S0_T1.cur_cd))
								.and(S0_V1.pr(S1_WK.spln_ym).eq(S0_T1.spln_ym))
							)
						)
					)
					.where(
						S0_V1.pr("spln_qty").neq(S0_T1.spln_qty)
						.or(S0_V1.pr("spln_amt").neq(S0_T1.spln_amt))
					)
					.forUpdate(S0_T1.dpt_cd)
			);
	}
	
	/**
	 * -- MSBBL0120_MST_SPLN_SUM_ITM_NEW_Query_D01
	 */
	static MCQueryPlan MSBBL0120_MST_SPLN_SUM_ITM_NEW_D01() {
		MST_SPLN_SUM_ITM_NEW_R S0_T = MST_SPLN_SUM_ITM_NEW_R.create("T");
		MSW_SPLN_SUM_DTL_KEY_R S1_W = MSW_SPLN_SUM_DTL_KEY_R.create("W");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MST_SPLN_SUM_ITM_NEW_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value(1))
								.from(S1_W)
								.where(
									S1_W.dpt_cd.eq(S0_T.dpt_cd)
									.and(S1_W.cst_cd.eq(S0_T.cst_cd))
									.and(S1_W.wrk_no.eq(S0_T.wrk_no))
									.and(S1_W.spln_itm_cd.eq(S0_T.spln_itm_cd))
									.and(S1_W.cur_cd.eq(S0_T.cur_cd))
									.and(S1_W.spln_ym.eq(S0_T.spln_ym))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0120_MST_SPLN_SUM_ITM_Query_S01
	 */
	static MCQueryPlan MSBBL0120_MST_SPLN_SUM_ITM_S01() {
		MST_SPLN_SUM_ITM_R S0_T1 = MST_SPLN_SUM_ITM_R.create("T1");
		MSW_SPLN_SUM_DTL_KEY_R S0_WK = MSW_SPLN_SUM_DTL_KEY_R.create("WK");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MST_SPLN_SUM_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.ym,
						S0_T1.spln_vers,
						S0_T1.spln_itm_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.cur_cd,
						S0_T1.spln_ym,
						S0_T1.spln_qty,
						S0_T1.spln_amt
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_WK.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_WK.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_WK.ym.eq(S0_T1.ym))
								.and(S0_WK.spln_vers.eq(S0_T1.spln_vers))
								.and(S0_WK.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_WK.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_WK.spln_ym.eq(S0_T1.spln_ym))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0120_MST_SPLN_SUM_ITM_Query_S02
	 */
	static MCQueryPlan MSBBL0120_MST_SPLN_SUM_ITM_S02() {
		MSW_SPLN_SUM_DTL_KEY_R S0_W = MSW_SPLN_SUM_DTL_KEY_R.create("W");
		MST_SPLN_SUM_DTL_R S0_T1 = MST_SPLN_SUM_DTL_R.create("T1");
		MST_SPLN_SUM_FIX_R S0_T2 = MST_SPLN_SUM_FIX_R.create("T2");
		MST_SPLN_SUM_ITM_R S0_T3 = MST_SPLN_SUM_ITM_R.create("T3");
		MST_SPLN_SUM_VERS_R S0_T4 = MST_SPLN_SUM_VERS_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MST_SPLN_SUM_ITM_Query_S02")
					.mainQuery()
					.select(
						S0_T1.spln_vers,
						S0_T1.ym,
						S0_T1.dpt_cd,
						S0_T1.cst_cd,
						S0_T1.wrk_no,
						S0_T1.spln_itm_cd,
						nvl(
							S0_T3.itm_cd,
							S0_T1.itm_cd
						).as("itm_cd"),
						nvl(
							S0_T3.itm_sub1,
							S0_T1.itm_sub1
						).as("itm_sub1"),
						nvl(
							S0_T3.itm_sub2,
							S0_T1.itm_sub2
						).as("itm_sub2"),
						nvl(
							S0_T3.itm_sub3,
							S0_T1.itm_sub3
						).as("itm_sub3"),
						S0_T1.cur_cd,
						S0_T1.spln_ym,
						nvl(
							S0_T3.spln_qty,
							S0_T1.spln_qty
						).as("spln_qty"),
						nvl(
							S0_T3.spln_amt,
							S0_T1.spln_amt
						).as("spln_amt")
					)
					.from(
						S0_W
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.spln_vers.eq(S0_W.spln_vers)
								.and(S0_T1.ym.eq(S0_W.ym))
								.and(S0_T1.dpt_cd.eq(S0_W.dpt_cd))
								.and(S0_T1.cst_cd.eq(S0_W.cst_cd))
								.and(S0_T1.wrk_no.eq(S0_W.wrk_no))
								.and(S0_T1.spln_itm_cd.eq(S0_W.spln_itm_cd))
								.and(S0_T1.itm_cd.eq(S0_W.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_W.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_W.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_W.itm_sub3))
								.and(S0_T1.cur_cd.eq(S0_W.cur_cd))
								.and(S0_T1.spln_ym.eq(S0_W.spln_ym))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T2.ym.eq(S0_T1.ym))
								.and(S0_T2.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T2.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T2.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T2.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T2.itm_cd.eq(S0_T1.itm_cd))
								.and(S0_T2.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_T2.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T2.fix_flg.eq(value(true)))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T3.ym.eq(S0_T1.ym))
								.and(S0_T3.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T3.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T3.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T3.spln_itm_cd.eq(S0_T1.spln_itm_cd))
								.and(S0_T3.cur_cd.eq(S0_T1.cur_cd))
								.and(S0_T3.spln_ym.eq(S0_T1.spln_ym))
								.and(S0_T1.spln_itm_cd.neq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.spln_vers.eq(S0_T1.spln_vers)
								.and(S0_T4.ym.eq(S0_T1.ym))
								.and(S0_T4.dpt_cd.eq(S0_T1.dpt_cd))
								.and(S0_T4.cst_cd.eq(S0_T1.cst_cd))
								.and(S0_T4.wrk_no.eq(S0_T1.wrk_no))
								.and(S0_T4.adopted_flg.eq(value(true)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(
							nvl(
								S0_T3.itm_cd,
								S0_T1.itm_cd
							).neq(value(MAC_STR.NULL_VAL.value()))
						)
					)
			);
	}
	
	/**
	 * -- MSBBL0120_MST_SPLN_SUM_VERS_Query_S01
	 */
	static MCQueryPlan MSBBL0120_MST_SPLN_SUM_VERS_S01() {
		MST_SPLN_SUM_VERS_R S0_T1 = MST_SPLN_SUM_VERS_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_DPT_R S0_M1 = MAM_DPT_R.create("M1");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL0120_MST_SPLN_SUM_VERS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_T1.dpt_cd,
						S0_M1.dpt_nm,
						S0_T1.cst_cd,
						S0_M2.bp_nm.as("cst_nm"),
						S0_T1.wrk_no,
						S0_T1.spln_vers,
						S0_T1.edited_flg,
						S0_T1.adopted_flg,
						S0_T1.locked_flg,
						S0_T1.usr_cd,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_M1.sls_dpt_flg.eq(value(true)))
								.and(
									MAPA_DT$F_GET_YM_ST_DT_NE2(
										S0_T1.ym,
										bind("ac_cl_day"),
										bind("ac_cl_mon_base")
									).between(S0_M1.st_dt, S0_M1.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.bp_cd.eq(S0_T1.cst_cd)
								.and(S0_M2.cst_flg.eq(value(true)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dpt_cd.eq(bind("dpt_cd")))
						.and(S0_T1.cst_cd.eq(bind("cst_cd")))
						.and(S0_T1.wrk_no.eq(bind("wrk_no")))
						.and(S0_T1.ym.eq(bind("ym")))
						.and(S0_T1.spln_vers.eq(bind("spln_vers")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("usr_nm", m.usr_nm());
					})
				)
			);
	}
}