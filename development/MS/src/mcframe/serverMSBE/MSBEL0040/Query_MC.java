package mcframe.serverMSBE.MSBEL0040;

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
	 * -- MSBEL0040_MSW_ALLOC_ITM_Query_I01
	 */
	static MCQueryPlan MSBEL0040_MSW_ALLOC_ITM_I01() {
		MSW_ALLOC_ITM_R S0 = MSW_ALLOC_ITM_R.create();
		MSVT_AVL_STK_R S1_T = MSVT_AVL_STK_R.create("T");
		MAVM_RD_LOC_R S1_M = MAVM_RD_LOC_R.create("M");
		MAM_ALLOC_GRP_R S1_M2 = MAM_ALLOC_GRP_R.create("M2");
		MAM_LOC_GRP_R S1_M3 = MAM_LOC_GRP_R.create("M3");
		MAM_STK_GD_R S1_M4 = MAM_STK_GD_R.create("M4");
		MAM_LG_GRP_R S1_M5 = MAM_LG_GRP_R.create("M5");
		MSVT_WRK_SNO_R S1_T3 = MSVT_WRK_SNO_R.create("T3");
		MSVT_AVL_IO_SCHD_R S2_T = MSVT_AVL_IO_SCHD_R.create("T");
		MAVM_RD_LOC_R S2_M = MAVM_RD_LOC_R.create("M");
		MAM_ALLOC_GRP_R S2_M2 = MAM_ALLOC_GRP_R.create("M2");
		MAM_LOC_GRP_R S2_M3 = MAM_LOC_GRP_R.create("M3");
		MAM_STK_GD_R S2_M4 = MAM_STK_GD_R.create("M4");
		MAM_LG_GRP_R S2_M5 = MAM_LG_GRP_R.create("M5");
		MSVT_WRK_SNO_R S2_T3 = MSVT_WRK_SNO_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0040_MSW_ALLOC_ITM_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.gd_cd,
						S0.in_xfr_typ,
						S0.quality_typ,
						S0.stk_insp_typ,
						S0.stk_id_typ,
						S0.stk_bp_cd
					)
					.query(
						subQuery()
						.select(
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.gd_cd,
							S1_T.in_xfr_typ,
							S1_T.quality_typ,
							S1_T.stk_insp_typ,
							S1_T.stk_id_typ,
							S1_T.stk_bp_cd
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								bracket(
									S1_M.loc_cd.eq(S1_T.loc_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M2.alloc_grp_cd.eq(S1_M.alloc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_M3.loc_grp_cd.eq(S1_M.loc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.gd_cd.eq(S1_T.gd_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.lg_grp_cd.eq(S1_M.lg_grp_cd)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.sno1.eq(S1_T.sno1)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_M.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M5.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1_M.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M2.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1_M.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1_M3.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_M.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_T.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_T.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M4.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T.stk_id_typ.like(bind("stk_id_typ")))
							.and(S1_T.itm_cd.eq(bind("itm_cd")))
							.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
							.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
							.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T3.wrk_nm.like(bind("wrk_nm")))
						)
						.union(
							subQuery()
							.select(
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
								S2_T.gd_cd,
								S2_T.in_xfr_typ,
								S2_T.quality_typ,
								S2_T.stk_insp_typ,
								S2_T.stk_id_typ,
								S2_T.stk_bp_cd
							)
							.from(
								S2_T
								.innerJoin(S2_M).on(
									bracket(
										S2_M.loc_cd.eq(S2_T.loc_cd)
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_M2.alloc_grp_cd.eq(S2_M.alloc_grp_cd)
									)
								)
								.leftOuterJoin(S2_M3).on(
									bracket(
										S2_M3.loc_grp_cd.eq(S2_M.loc_grp_cd)
									)
								)
								.leftOuterJoin(S2_M4).on(
									bracket(
										S2_M4.gd_cd.eq(S2_T.gd_cd)
									)
								)
								.leftOuterJoin(S2_M5).on(
									bracket(
										S2_M5.lg_grp_cd.eq(S2_M.lg_grp_cd)
									)
								)
								.leftOuterJoin(S2_T3).on(
									bracket(
										S2_T3.sno1.eq(S2_T.sno1)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_M.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2_M5.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2_M.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2_M2.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2_M.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2_M3.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_M.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2_T.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S2_T.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2_M4.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2_T.stk_id_typ.like(bind("stk_id_typ")))
								.and(S2_T.itm_cd.eq(bind("itm_cd")))
								.and(S2_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S2_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S2_T.itm_sub3.eq(bind("itm_sub3")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T3.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_T3.wrk_nm.like(bind("wrk_nm")))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL0040_MSW_ALLOC_LOCK_KEY_Query_I01
	 */
	static MCQueryPlan MSBEL0040_MSW_ALLOC_LOCK_KEY_I01() {
		MSW_ALLOC_LOCK_KEY_R S0 = MSW_ALLOC_LOCK_KEY_R.create();
		MSVT_AVL_STK_R S1_T = MSVT_AVL_STK_R.create("T");
		MAVM_RD_LOC_R S1_M = MAVM_RD_LOC_R.create("M");
		MAM_ALLOC_GRP_R S1_M2 = MAM_ALLOC_GRP_R.create("M2");
		MAM_LOC_GRP_R S1_M3 = MAM_LOC_GRP_R.create("M3");
		MAM_STK_GD_R S1_M4 = MAM_STK_GD_R.create("M4");
		MAM_LG_GRP_R S1_M5 = MAM_LG_GRP_R.create("M5");
		MSVT_WRK_SNO_R S1_T3 = MSVT_WRK_SNO_R.create("T3");
		MSVT_AVL_IO_SCHD_R S2_T = MSVT_AVL_IO_SCHD_R.create("T");
		MAVM_RD_LOC_R S2_M = MAVM_RD_LOC_R.create("M");
		MAM_ALLOC_GRP_R S2_M2 = MAM_ALLOC_GRP_R.create("M2");
		MAM_LOC_GRP_R S2_M3 = MAM_LOC_GRP_R.create("M3");
		MAM_STK_GD_R S2_M4 = MAM_STK_GD_R.create("M4");
		MAM_LG_GRP_R S2_M5 = MAM_LG_GRP_R.create("M5");
		MSVT_WRK_SNO_R S2_T3 = MSVT_WRK_SNO_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0040_MSW_ALLOC_LOCK_KEY_Query_I01")
					.insert(S0)
					.columns(
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.loc_cd
					)
					.query(
						subQuery()
						.select(
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.loc_cd
						)
						.from(
							S1_T
							.innerJoin(S1_M).on(
								bracket(
									S1_M.loc_cd.eq(S1_T.loc_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M2.alloc_grp_cd.eq(S1_M.alloc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_M3.loc_grp_cd.eq(S1_M.loc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.gd_cd.eq(S1_T.gd_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.lg_grp_cd.eq(S1_M.lg_grp_cd)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									S1_T3.sno1.eq(S1_T.sno1)
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_M.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M5.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1_M.alloc_grp_cd.like(bind("alloc_grp_cd")))
							.cutoff$and(S1_M2.alloc_grp_nm.like(bind("alloc_grp_nm")))
							.cutoff$and(S1_M.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1_M3.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_M.loc_nm.like(bind("loc_nm")))
							.cutoff$and(S1_T.quality_typ.like(bind("quality_typ")))
							.cutoff$and(S1_T.gd_cd.like(bind("gd_cd")))
							.cutoff$and(S1_M4.gd_nm.like(bind("gd_nm")))
							.cutoff$and(S1_T.stk_id_typ.like(bind("stk_id_typ")))
							.and(S1_T.itm_cd.eq(bind("itm_cd")))
							.and(S1_T.itm_sub1.eq(bind("itm_sub1")))
							.and(S1_T.itm_sub2.eq(bind("itm_sub2")))
							.and(S1_T.itm_sub3.eq(bind("itm_sub3")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T3.wrk_no.like(bind("wrk_no")))
							.cutoff$and(S1_T3.wrk_nm.like(bind("wrk_nm")))
						)
						.union(
							subQuery()
							.select(
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.loc_cd
							)
							.from(
								S2_T
								.innerJoin(S2_M).on(
									bracket(
										S2_M.loc_cd.eq(S2_T.loc_cd)
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_M2.alloc_grp_cd.eq(S2_M.alloc_grp_cd)
									)
								)
								.leftOuterJoin(S2_M3).on(
									bracket(
										S2_M3.loc_grp_cd.eq(S2_M.loc_grp_cd)
									)
								)
								.leftOuterJoin(S2_M4).on(
									bracket(
										S2_M4.gd_cd.eq(S2_T.gd_cd)
									)
								)
								.leftOuterJoin(S2_M5).on(
									bracket(
										S2_M5.lg_grp_cd.eq(S2_M.lg_grp_cd)
									)
								)
								.leftOuterJoin(S2_T3).on(
									bracket(
										S2_T3.sno1.eq(S2_T.sno1)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_M.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2_M5.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2_M.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2_M2.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2_M.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2_M3.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_M.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2_T.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S2_T.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2_M4.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2_T.stk_id_typ.like(bind("stk_id_typ")))
								.and(S2_T.itm_cd.eq(bind("itm_cd")))
								.and(S2_T.itm_sub1.eq(bind("itm_sub1")))
								.and(S2_T.itm_sub2.eq(bind("itm_sub2")))
								.and(S2_T.itm_sub3.eq(bind("itm_sub3")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T3.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2_T3.wrk_nm.like(bind("wrk_nm")))
							)
						)
					)
			);
	}
}