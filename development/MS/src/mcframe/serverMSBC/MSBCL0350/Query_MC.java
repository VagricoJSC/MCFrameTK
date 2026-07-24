package mcframe.serverMSBC.MSBCL0350;

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
	 * -- MSBCL0350_MAM_MPS_ITM_Query_S01
	 */
	static MCQueryPlan MSBCL0350_MAM_MPS_ITM_S01() {
		MAM_MPS_ITM_R S0_T1 = MAM_MPS_ITM_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_MPS_GRP_R S0_T2 = MAM_MPS_GRP_R.create("T2");
		MAM_ITM_R S0_T3 = MAM_ITM_R.create("T3");
		MAM_LOC_R S0_T4 = MAM_LOC_R.create("T4");
		MAM_WG_R S0_T5 = MAM_WG_R.create("T5");
		MAM_SITE_R S0_T6 = MAM_SITE_R.create("T6");
		MAM_LOC_GRP_R S0_T7 = MAM_LOC_GRP_R.create("T7");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MAM_MPS_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.mps_grp_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T3.itm_nm,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T3.unit_cd,
						S0_T3.dec_place,
						bind("ym").as("ym"),
						S0_T1.del_flg.as("mst_del_flg")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_T3.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.mps_grp_cd.like(bind("mps_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
					)
					.orderBy(
						S0_T1.mps_grp_cd.asc(),
						S0_T1.strg_loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.mps_grp_cd.eq(S0_T2.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("site_nm", "strg_loc_grp_nm", "strg_loc_nm", "site_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.strg_loc_cd.eq(S0_T4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_T4.site_cd.like(bind("site_cd"))).cutoff$and(S0_T4.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("wg_cm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T1.wg_cd.eq(S0_T5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.wg_nm.like(bind("wg_cm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(bracket(S0_T4.site_cd.eq(S0_T6.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T6.site_nm.like(bind("site_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T4.loc_grp_cd.eq(S0_T7.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T7.loc_grp_nm.like(bind("strg_loc_grp_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_MPS_GRP_R.class, r -> toCondition(
							r.getStringNE("mps_grp_cd")
						))
						.addSelect(m -> toArray(
							m.mps_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mps_grp_nm", m.mps_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0350_MST_MLY_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL0350_MST_MLY_RQMT_S01() {
		MST_MLY_RQMT_R S0_T1 = MST_MLY_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_MPS_GRP_R S0_T2 = MAM_MPS_GRP_R.create("T2");
		MAM_LOC_R S0_T3 = MAM_LOC_R.create("T3");
		MAM_LOC_GRP_R S0_T4 = MAM_LOC_GRP_R.create("T4");
		MAM_WG_R S0_T5 = MAM_WG_R.create("T5");
		MAM_SITE_R S0_T6 = MAM_SITE_R.create("T6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MST_MLY_RQMT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.mps_grp_cd,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.prod_ym,
						S0_T1.qty,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.upd_cntr
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.ym.eq(bind("ym")))
						.cutoff$and(S0_T1.prod_ym.gte(bind("prod_ym_fr")))
						.cutoff$and(S0_T1.prod_ym.lte(bind("prod_ym_to")))
						.cutoff$and(S0_T1.mps_grp_cd.like(bind("mps_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
					)
					.orderBy(
						S0_T1.mps_grp_cd.asc(),
						S0_T1.strg_loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T1.mps_grp_cd.eq(S0_T2.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("loc_grp_nm", "site_nm", "site_cd", "loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.strg_loc_cd.eq(S0_T3.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T3.site_cd.like(bind("site_cd"))).cutoff$and(S0_T3.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_T3.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T3.loc_grp_cd.eq(S0_T4.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T1.wg_cd.eq(S0_T5.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(bracket(S0_T3.site_cd.eq(S0_T6.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T6.site_nm.like(bind("site_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
							r.setStringNE("join_site_cd_", m.site_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0350_MST_MLY_RQMT_Query_S02
	 */
	static MCQueryPlan MSBCL0350_MST_MLY_RQMT_S02() {
		MST_MLY_RQMT_R S0_T1 = MST_MLY_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MCTempView S0_T2 = createTempView("T2");
		MST_MLY_RQMT_R S1_T = MST_MLY_RQMT_R.create("T");
		MAM_MPS_GRP_R S1_M1 = MAM_MPS_GRP_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_LOC_GRP_R S1_M3 = MAM_LOC_GRP_R.create("M3");
		MAM_WG_R S1_M4 = MAM_WG_R.create("M4");
		MAM_SITE_R S1_M5 = MAM_SITE_R.create("M5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MST_MLY_RQMT_Query_S02")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.mps_grp_cd,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.prod_ym,
						S0_T1.qty.as("pre_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								max(S1_T.ym).as("ym"),
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								S1_T.mps_grp_cd,
								S1_T.strg_loc_cd,
								S1_T.prod_ym
							)
							.from(
								S1_T
								.addDynamicView()
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T.ym.lt(bind("ym")))
								.and(S1_T.prod_ym.gte(bind("prod_ym_fr")))
								.and(S1_T.prod_ym.lte(bind("prod_ym_to")))
								.cutoff$and(S1_T.mps_grp_cd.like(bind("mps_grp_cd")))
								.addDynamicPredicate()
								.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_T.strg_loc_cd.like(bind("strg_loc_cd")))
							)
							.groupBy(
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								S1_T.mps_grp_cd,
								S1_T.strg_loc_cd,
								S1_T.prod_ym
							).view(S0_T2)
						).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.ym.eq(S0_T2.pr("ym")))
								.and(S0_T1.prod_ym.eq(S0_T2.pr(S1_T.prod_ym)))
								.and(S0_T1.itm_cd.eq(S0_T2.pr(S1_T.itm_cd)))
								.and(S0_T1.itm_sub1.eq(S0_T2.pr(S1_T.itm_sub1)))
								.and(S0_T1.itm_sub2.eq(S0_T2.pr(S1_T.itm_sub2)))
								.and(S0_T1.itm_sub3.eq(S0_T2.pr(S1_T.itm_sub3)))
								.and(S0_T1.mps_grp_cd.eq(S0_T2.pr(S1_T.mps_grp_cd)))
								.and(S0_T1.strg_loc_cd.eq(S0_T2.pr(S1_T.strg_loc_cd)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T1.mps_grp_cd.asc(),
						S0_T1.strg_loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S1_M1).on(bracket(S1_T.mps_grp_cd.eq(S1_M1.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S1_M1.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("loc_grp_nm", "site_nm", "site_cd", "loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S1_M2).on(bracket(S1_T.strg_loc_cd.eq(S1_M2.loc_cd))))
					.predicate(p -> p.cutoff$and(S1_M2.site_cd.like(bind("site_cd"))).cutoff$and(S1_M2.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S1_M2.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S1_M3).on(bracket(S1_M2.loc_grp_cd.eq(S1_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S1_M3.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S1_M4).on(bracket(S1_T.wg_cd.eq(S1_M4.wg_cd))))
					.predicate(p -> p.cutoff$and(S1_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S1_M5).on(bracket(S1_M2.site_cd.eq(S1_M5.site_cd))))
					.predicate(p -> p.cutoff$and(S1_M5.site_nm.like(bind("site_nm"))))
			);
	}
	
	/**
	 * -- MSBCL0350_MST_MLY_RQMT_Query_S03
	 */
	static MCQueryPlan MSBCL0350_MST_MLY_RQMT_S03() {
		MST_MLY_RQMT_R S0_T1 = MST_MLY_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MCTempView S0_T2 = createTempView("T2");
		MAM_MPS_GRP_R S0_T3 = MAM_MPS_GRP_R.create("T3");
		MAM_LOC_R S0_T4 = MAM_LOC_R.create("T4");
		MAM_LOC_GRP_R S0_T5 = MAM_LOC_GRP_R.create("T5");
		MAM_WG_R S0_T6 = MAM_WG_R.create("T6");
		MAM_SITE_R S0_T7 = MAM_SITE_R.create("T7");
		MST_MLY_RQMT_R S1_T = MST_MLY_RQMT_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MST_MLY_RQMT_Query_S03")
					.mainQuery()
					.select(
						bind("prod_ym_fr").as("ym"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.mps_grp_cd,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.prod_ym,
						S0_T1.qty,
						S0_T1.upd_cntr
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								max(S1_T.ym).as("ym"),
								S1_T.prod_ym,
								S1_T.mps_grp_cd,
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3
							)
							.from(S1_T)
							.where(
								value(0).eq(value(0))
								.and(S1_T.prod_ym.gte(bind("prod_ym_fr")))
								.and(S1_T.prod_ym.lte(bind("prod_ym_to")))
								.cutoff$and(S1_T.mps_grp_cd.like(bind("mps_grp_cd")))
								.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_T.strg_loc_cd.like(bind("strg_loc_cd")))
							)
							.groupBy(
								S1_T.prod_ym,
								S1_T.mps_grp_cd,
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3
							).view(S0_T2)
						).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.ym.eq(S0_T2.pr("ym")))
								.and(S0_T1.prod_ym.eq(S0_T2.pr(S1_T.prod_ym)))
								.and(S0_T1.mps_grp_cd.eq(S0_T2.pr(S1_T.mps_grp_cd)))
								.and(S0_T1.itm_cd.eq(S0_T2.pr(S1_T.itm_cd)))
								.and(S0_T1.itm_sub1.eq(S0_T2.pr(S1_T.itm_sub1)))
								.and(S0_T1.itm_sub2.eq(S0_T2.pr(S1_T.itm_sub2)))
								.and(S0_T1.itm_sub3.eq(S0_T2.pr(S1_T.itm_sub3)))
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.prod_ym.gte(bind("prod_ym_fr")))
						.and(S0_T1.prod_ym.lte(bind("prod_ym_to")))
						.cutoff$and(S0_T1.mps_grp_cd.like(bind("mps_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
					)
					.orderBy(
						S0_T1.mps_grp_cd.asc(),
						S0_T1.strg_loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.mps_grp_cd.eq(S0_T3.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T3.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("loc_grp_nm", "site_nm", "site_cd", "loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.strg_loc_cd.eq(S0_T4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.site_cd.like(bind("site_cd"))).cutoff$and(S0_T4.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_T4.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T4.loc_grp_cd.eq(S0_T5.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_T6).on(bracket(S0_T1.wg_cd.eq(S0_T6.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T6.wg_nm.like(bind("wg_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T7).on(bracket(S0_T4.site_cd.eq(S0_T7.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T7.site_nm.like(bind("site_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
							r.setStringNE("join_site_cd_", m.site_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0350_MST_MLY_RQMT_Query_S04
	 */
	static MCQueryPlan MSBCL0350_MST_MLY_RQMT_S04() {
		MST_MLY_RQMT_R S0_T1 = MST_MLY_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MCTempView S0_T2 = createTempView("T2");
		MST_MLY_RQMT_R S1_T = MST_MLY_RQMT_R.create("T");
		MCTempView S1_T1 = createTempView("T1");
		MAM_MPS_GRP_R S1_M1 = MAM_MPS_GRP_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_LOC_GRP_R S1_M3 = MAM_LOC_GRP_R.create("M3");
		MAM_WG_R S1_M4 = MAM_WG_R.create("M4");
		MAM_SITE_R S1_M5 = MAM_SITE_R.create("M5");
		MST_MLY_RQMT_R S2_T = MST_MLY_RQMT_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MST_MLY_RQMT_Query_S04")
					.mainQuery()
					.select(
						S0_T1.ym,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.mps_grp_cd,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.prod_ym,
						S0_T1.qty.as("pre_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								max(S1_T.ym).as("ym"),
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								S1_T.mps_grp_cd,
								S1_T.strg_loc_cd,
								S1_T.prod_ym
							)
							.from(
								S1_T
								.innerJoin(
									subQuery()
									.select(
										max(S2_T.ym).as("ym"),
										S2_T.prod_ym,
										S2_T.mps_grp_cd,
										S2_T.itm_cd,
										S2_T.itm_sub1,
										S2_T.itm_sub2,
										S2_T.itm_sub3
									)
									.from(S2_T)
									.where(
										value(0).eq(value(0))
									)
									.groupBy(
										S2_T.prod_ym,
										S2_T.mps_grp_cd,
										S2_T.itm_cd,
										S2_T.itm_sub1,
										S2_T.itm_sub2,
										S2_T.itm_sub3
									).view(S1_T1)
								).on(
									bracket(
										value(0).eq(value(0))
										.and(S1_T.ym.lt(S1_T1.pr("ym")))
										.and(S1_T.prod_ym.eq(S1_T1.pr(S2_T.prod_ym)))
										.and(S1_T.mps_grp_cd.eq(S1_T1.pr(S2_T.mps_grp_cd)))
										.and(S1_T.itm_cd.eq(S1_T1.pr(S2_T.itm_cd)))
										.and(S1_T.itm_sub1.eq(S1_T1.pr(S2_T.itm_sub1)))
										.and(S1_T.itm_sub2.eq(S1_T1.pr(S2_T.itm_sub2)))
										.and(S1_T.itm_sub3.eq(S1_T1.pr(S2_T.itm_sub3)))
									)
								)
								.addDynamicView()
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S1_T.prod_ym.gte(bind("prod_ym_fr")))
								.cutoff$and(S1_T.prod_ym.lte(bind("prod_ym_to")))
								.cutoff$and(S1_T.mps_grp_cd.like(bind("mps_grp_cd")))
								.addDynamicPredicate()
								.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_T.strg_loc_cd.like(bind("strg_loc_cd")))
							)
							.groupBy(
								S1_T.itm_cd,
								S1_T.itm_sub1,
								S1_T.itm_sub2,
								S1_T.itm_sub3,
								S1_T.mps_grp_cd,
								S1_T.strg_loc_cd,
								S1_T.prod_ym
							).view(S0_T2)
						).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.ym.eq(S0_T2.pr("ym")))
								.and(S0_T1.prod_ym.eq(S0_T2.pr(S1_T.prod_ym)))
								.and(S0_T1.itm_cd.eq(S0_T2.pr(S1_T.itm_cd)))
								.and(S0_T1.itm_sub1.eq(S0_T2.pr(S1_T.itm_sub1)))
								.and(S0_T1.itm_sub2.eq(S0_T2.pr(S1_T.itm_sub2)))
								.and(S0_T1.itm_sub3.eq(S0_T2.pr(S1_T.itm_sub3)))
								.and(S0_T1.mps_grp_cd.eq(S0_T2.pr(S1_T.mps_grp_cd)))
								.and(S0_T1.strg_loc_cd.eq(S0_T2.pr(S1_T.strg_loc_cd)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T1.mps_grp_cd.asc(),
						S0_T1.strg_loc_cd.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("mps_grp_nm"))
					.view(v -> v.leftOuterJoin(S1_M1).on(bracket(S1_T.mps_grp_cd.eq(S1_M1.mps_grp_cd))))
					.predicate(p -> p.cutoff$and(S1_M1.mps_grp_nm.like(bind("mps_grp_nm")))),
				when(boundOr("loc_grp_nm", "site_nm", "site_cd", "loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S1_M2).on(bracket(S1_T.strg_loc_cd.eq(S1_M2.loc_cd))))
					.predicate(p -> p.cutoff$and(S1_M2.site_cd.like(bind("site_cd"))).cutoff$and(S1_M2.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S1_M2.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S1_M3).on(bracket(S1_M2.loc_grp_cd.eq(S1_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S1_M3.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S1_M4).on(bracket(S1_T.wg_cd.eq(S1_M4.wg_cd))))
					.predicate(p -> p.cutoff$and(S1_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S1_M5).on(bracket(S1_M2.site_cd.eq(S1_M5.site_cd))))
					.predicate(p -> p.cutoff$and(S1_M5.site_nm.like(bind("site_nm"))))
			);
	}
	
	/**
	 * -- MSBCL0350_MST_RQMT_Query_S01
	 */
	static MCQueryPlan MSBCL0350_MST_RQMT_S01() {
		MST_RQMT_R S0_T1 = MST_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_LOC_R S0_T2 = MAM_LOC_R.create("T2");
		MAM_LOC_GRP_R S0_T3 = MAM_LOC_GRP_R.create("T3");
		MAM_WG_R S0_T4 = MAM_WG_R.create("T4");
		MAM_SITE_R S0_T5 = MAM_SITE_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MST_RQMT_Query_S01")
					.mainQuery()
					.select(
						MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt).as("prod_ym"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						sum(S0_T1.rqmt_qty).as("fix_rqmt_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt).gte(bind("prod_ym_fr")))
						.and(MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt).lte(bind("prod_ym_to")))
						.and(S0_T1.fix_flg.eq(value(true)))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
					)
					.groupBy(
						MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt),
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("strg_loc_grp_nm", "site_nm", "site_cd", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T2.loc_cd.eq(S0_T1.strg_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.site_cd.like(bind("site_cd"))).cutoff$and(S0_T2.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_T2.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T3.loc_grp_cd.eq(S0_T2.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T3.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("wg_cm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T4.wg_cd.eq(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.wg_nm.like(bind("wg_cm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.site_cd.eq(S0_T2.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.site_nm.like(bind("site_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
							r.setStringNE("join_site_cd_", m.site_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0350_MST_RQMT_Query_S02
	 */
	static MCQueryPlan MSBCL0350_MST_RQMT_S02() {
		MST_RQMT_R S0_T1 = MST_RQMT_R.create("T1");
		MAVM_RD_LOC_R S0_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_LOC_R S0_T2 = MAM_LOC_R.create("T2");
		MAM_LOC_GRP_R S0_T3 = MAM_LOC_GRP_R.create("T3");
		MAM_WG_R S0_T4 = MAM_WG_R.create("T4");
		MAM_SITE_R S0_T5 = MAM_SITE_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MST_RQMT_Query_S02")
					.mainQuery()
					.select(
						MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt).as("prod_ym"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						sum(S0_T1.rqmt_qty).as("no_fix_rqmt_qty")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_DAC.loc_cd)
							)
						)
						.addDynamicView()
					)
					.where(
						value(0).eq(value(0))
						.and(MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt).gte(bind("prod_ym_fr")))
						.and(MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt).lte(bind("prod_ym_to")))
						.and(S0_T1.fix_flg.eq(value(false)))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
					)
					.groupBy(
						MAPA_DT$F_GET_AC_YM1(S0_T1.due_dt),
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("strg_loc_grp_nm", "site_nm", "site_cd", "strg_loc_grp_cd", "strg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T2.loc_cd.eq(S0_T1.strg_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_T2.site_cd.like(bind("site_cd"))).cutoff$and(S0_T2.loc_grp_cd.like(bind("strg_loc_grp_cd"))).cutoff$and(S0_T2.loc_nm.like(bind("strg_loc_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T3.loc_grp_cd.eq(S0_T2.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_T3.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("wg_cm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T4.wg_cd.eq(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_T4.wg_nm.like(bind("wg_cm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T5.site_cd.eq(S0_T2.site_cd))))
					.predicate(p -> p.cutoff$and(S0_T5.site_nm.like(bind("site_nm"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
							r.setStringNE("join_site_cd_", m.site_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0350_MST_YIELD_ACT_Query_S01
	 */
	static MCQueryPlan MSBCL0350_MST_YIELD_ACT_S01() {
		MCTempView S0_T = createTempView("T");
		MST_YIELD_ACT_R S1_T1 = MST_YIELD_ACT_R.create("T1");
		MAVM_RD_LOC_R S1_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_LOC_R S1_T2 = MAM_LOC_R.create("T2");
		MAM_LOC_GRP_R S1_T3 = MAM_LOC_GRP_R.create("T3");
		MAM_WG_R S1_T4 = MAM_WG_R.create("T4");
		MAM_SITE_R S1_T5 = MAM_SITE_R.create("T5");
		MST_ARR_ACT_R S2_T1 = MST_ARR_ACT_R.create("T1");
		MAVM_RD_LOC_R S2_DAC = MAVM_RD_LOC_R.create("DAC");
		MAM_LOC_R S2_T2 = MAM_LOC_R.create("T2");
		MAM_LOC_GRP_R S2_T3 = MAM_LOC_GRP_R.create("T3");
		MAM_WG_R S2_T4 = MAM_WG_R.create("T4");
		MAM_SITE_R S2_T5 = MAM_SITE_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0350_MST_YIELD_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T.pr("prod_ym"),
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3),
						S0_T.pr(S1_T1.strg_loc_cd),
						S0_T.pr(S1_T2.wg_cd),
						sum(S0_T.pr("act_qty")).as("act_qty")
					)
					.from(
						subQuery()
						.select(
							MAPA_DT$F_GET_AC_YM1(S1_T1.act_tm).as("prod_ym"),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.strg_loc_cd,
							S1_T2.wg_cd,
							sum(S1_T1.base_unit_qty).as("act_qty")
						)
						.from(
							S1_T1
							.innerJoin(S1_DAC).on(
								bracket(
									S1_T1.strg_loc_cd.eq(S1_DAC.loc_cd)
								)
							)
							.leftOuterJoin(S1_T2).on(
								bracket(
									S1_T2.loc_cd.eq(S1_T1.strg_loc_cd)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.loc_grp_cd.eq(S1_T2.loc_grp_cd)
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T4.wg_cd.eq(S1_T2.wg_cd)
								)
							)
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T5.site_cd.eq(S1_T2.site_cd)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(MAPA_DT$F_GET_AC_YM1(S1_T1.act_tm).gte(bind("prod_ym_fr")))
							.and(MAPA_DT$F_GET_AC_YM1(S1_T1.act_tm).lte(bind("prod_ym_to")))
							.and(S1_T1.mfg_mtd_typ.eq(value(MSC_MFG_MTD_TYP.INTNL.value())))
							.cutoff$and(S1_T2.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_T5.site_nm.like(bind("site_nm")))
							.cutoff$and(S1_T2.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_T4.wg_nm.like(bind("wg_cm")))
							.cutoff$and(S1_T2.loc_grp_cd.like(bind("strg_loc_grp_cd")))
							.cutoff$and(S1_T3.loc_grp_nm.like(bind("strg_loc_grp_nm")))
							.cutoff$and(S1_T1.strg_loc_cd.like(bind("strg_loc_cd")))
							.cutoff$and(S1_T2.loc_nm.like(bind("strg_loc_nm")))
						)
						.groupBy(
							MAPA_DT$F_GET_AC_YM1(S1_T1.act_tm),
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_T1.strg_loc_cd,
							S1_T2.wg_cd
						)
						.unionAll(
							subQuery()
							.select(
								MAPA_DT$F_GET_AC_YM1(S2_T1.arr_tm).as("prod_ym"),
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.arr_loc_cd.as("strg_loc_cd"),
								S2_T2.wg_cd,
								sum(S2_T1.base_unit_qty).as("act_qty")
							)
							.from(
								S2_T1
								.innerJoin(S2_DAC).on(
									bracket(
										S2_T1.arr_loc_cd.eq(S2_DAC.loc_cd)
									)
								)
								.leftOuterJoin(S2_T2).on(
									bracket(
										S2_T2.loc_cd.eq(S2_T1.arr_loc_cd)
									)
								)
								.leftOuterJoin(S2_T3).on(
									bracket(
										S2_T3.loc_grp_cd.eq(S2_T2.loc_grp_cd)
									)
								)
								.leftOuterJoin(S2_T4).on(
									bracket(
										S2_T4.wg_cd.eq(S2_T2.wg_cd)
									)
								)
								.leftOuterJoin(S2_T5).on(
									bracket(
										S2_T5.site_cd.eq(S2_T2.site_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(MAPA_DT$F_GET_AC_YM1(S2_T1.arr_tm).gte(bind("prod_ym_fr")))
								.and(MAPA_DT$F_GET_AC_YM1(S2_T1.arr_tm).lte(bind("prod_ym_to")))
								.and(S2_T1.can_flg.eq(value(false)))
								.cutoff$and(S2_T2.site_cd.like(bind("site_cd")))
								.cutoff$and(S2_T5.site_nm.like(bind("site_nm")))
								.cutoff$and(S2_T2.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_T4.wg_nm.like(bind("wg_cm")))
								.cutoff$and(S2_T2.loc_grp_cd.like(bind("strg_loc_grp_cd")))
								.cutoff$and(S2_T3.loc_grp_nm.like(bind("strg_loc_grp_nm")))
								.cutoff$and(S2_T1.arr_loc_cd.like(bind("strg_loc_cd")))
								.cutoff$and(S2_T2.loc_nm.like(bind("strg_loc_nm")))
							)
							.groupBy(
								MAPA_DT$F_GET_AC_YM1(S2_T1.arr_tm),
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.arr_loc_cd,
								S2_T2.wg_cd
							)
						).view(S0_T)
					)
					.where(
						value(0).eq(value(0))
					)
					.groupBy(
						S0_T.pr("prod_ym"),
						S0_T.pr(S1_T1.strg_loc_cd),
						S0_T.pr(S1_T2.wg_cd),
						S0_T.pr(S1_T1.itm_cd),
						S0_T.pr(S1_T1.itm_sub1),
						S0_T.pr(S1_T1.itm_sub2),
						S0_T.pr(S1_T1.itm_sub3)
					)
			);
	}
}