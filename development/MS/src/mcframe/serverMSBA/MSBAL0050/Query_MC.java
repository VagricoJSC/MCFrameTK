package mcframe.serverMSBA.MSBAL0050;

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
	 * -- MABAL0050_TGT_ITM_Query_S01
	 */
	static MCQueryPlan MABAL0050_TGT_ITM_S01() {
		MST_DLY_DMND_R S0_T1 = MST_DLY_DMND_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_UNIT_R S0_M2 = MAM_UNIT_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_ITM_TYP_D_R S0_M5 = MAM_ITM_TYP_D_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S0_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_SITE_R S0_M8 = MAM_SITE_R.create("M8");
		MAVM_ITM_WG_R S0_M9 = MAVM_ITM_WG_R.create("M9");
		MAVM_RD_LOC_R S0_M10 = MAVM_RD_LOC_R.create("M10");
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
		MST_DLY_SD_R S1_T1 = MST_DLY_SD_R.create("T1");
		MAM_ITM_R S1_M1 = MAM_ITM_R.create("M1");
		MAM_UNIT_R S1_M2 = MAM_UNIT_R.create("M2");
		MAM_LOC_R S1_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S1_M4 = MAM_WG_R.create("M4");
		MAM_ITM_TYP_D_R S1_M5 = MAM_ITM_TYP_D_R.create("M5");
		MAM_LG_GRP_R S1_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S1_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_SITE_R S1_M8 = MAM_SITE_R.create("M8");
		MAVM_ITM_WG_R S1_M9 = MAVM_ITM_WG_R.create("M9");
		MAVM_RD_LOC_R S1_M10 = MAVM_RD_LOC_R.create("M10");
		MAM_ITM_GRP_R S1_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S1_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S1_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S1_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S1_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S1_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S1_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S1_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S1_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S1_MM10 = MAM_ITM_GRP_R.create("MM10");
		MST_ITM_ORDER_R S2_T1 = MST_ITM_ORDER_R.create("T1");
		MAM_ITM_R S2_M1 = MAM_ITM_R.create("M1");
		MAM_UNIT_R S2_M2 = MAM_UNIT_R.create("M2");
		MAM_LOC_R S2_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S2_M4 = MAM_WG_R.create("M4");
		MAM_ITM_TYP_D_R S2_M5 = MAM_ITM_TYP_D_R.create("M5");
		MAM_LG_GRP_R S2_M6 = MAM_LG_GRP_R.create("M6");
		MAM_LOC_GRP_R S2_M7 = MAM_LOC_GRP_R.create("M7");
		MAM_SITE_R S2_M8 = MAM_SITE_R.create("M8");
		MAVM_ITM_WG_R S2_M9 = MAVM_ITM_WG_R.create("M9");
		MAVM_RD_LOC_R S2_M10 = MAVM_RD_LOC_R.create("M10");
		MAM_ITM_GRP_R S2_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S2_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S2_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S2_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S2_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S2_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S2_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S2_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S2_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S2_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS1C_ITM_GRP = createDynamicSQLID("DS1C_ITM_GRP");
		MCDynamicSQLID DS2C_ITM_GRP = createDynamicSQLID("DS2C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MABAL0050_TGT_ITM_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M1.itm_nm,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.unit_cd,
						S0_M2.unit_nm,
						S0_M1.dec_place,
						S0_T1.dmnd_loc_cd.as("loc_cd"),
						S0_M3.loc_nm,
						S0_T1.wg_cd,
						S0_M4.wg_nm,
						nvl(
							S0_M9.rqmt_typ,
							value(MAC_RQMT_TYP.NON.value())
						).as("rqmt_typ"),
						nvl(
							S0_M9.prod_pln_typ,
							value(MAC_PROD_PLN_TYP.NOT_USE.value())
						).as("prod_pln_typ"),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.unit_cd.eq(S0_M1.unit_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.loc_cd.eq(S0_T1.dmnd_loc_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.itm_typ.eq(S0_M1.itm_typ)
								.and(S0_M5.itm_typ_d_cd.eq(S0_M1.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.lg_grp_cd.eq(S0_M3.lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.loc_grp_cd.eq(S0_M3.loc_grp_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.site_cd.eq(S0_M3.site_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M9.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M9.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M9.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M9.wg_cd.eq(S0_T1.wg_cd))
							)
						)
						.innerJoin(S0_M10).on(
							bracket(
								S0_M10.loc_cd.eq(S0_T1.dmnd_loc_cd)
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dmnd_dt.gte(FCPA_DATE_UTIL$F_GET_TODAY1()))
						.cutoff$and(
							bracket(
								bind("tmp_adjst_tgt").eq(value(true))
								.and(
									nvl(
										S0_M9.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).eq(value(MAC_RQMT_TYP.NON.value()))
								)
								.and(
									nvl(
										S0_M9.prod_pln_typ,
										value(MAC_PROD_PLN_TYP.NOT_USE.value())
									).eq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("tmp_adjst_not_tgt").eq(value(true))
								.and(
									nvl(
										S0_M9.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).neq(value(MAC_RQMT_TYP.NON.value()))
									.or(
										nvl(
											S0_M9.prod_pln_typ,
											value(MAC_PROD_PLN_TYP.NOT_USE.value())
										).neq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
									)
								)
							)
						)
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.dmnd_dt.gte(bind("srch_dt_fr")))
						.cutoff$and(S0_T1.dmnd_dt.lte(bind("srch_dt_to")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M5.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_T1.dmnd_loc_cd.like(bind("dmnd_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("dmnd_loc_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M6.lg_grp_nm.like(bind("lg_grp_nm")))
						.cutoff$and(S0_M3.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M7.loc_grp_nm.like(bind("loc_grp_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M8.site_nm.like(bind("site_nm")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.union(
						subQuery()
						.select(
							S1_T1.itm_cd,
							S1_T1.itm_sub1,
							S1_T1.itm_sub2,
							S1_T1.itm_sub3,
							S1_M1.itm_nm,
							S1_M1.sno1_mng_typ,
							S1_M1.sno2_mng_typ,
							S1_M1.sno3_mng_typ,
							S1_M1.sno4_mng_typ,
							S1_M1.unit_cd,
							S1_M2.unit_nm,
							S1_M1.dec_place,
							S1_T1.strg_loc_cd.as("loc_cd"),
							S1_M3.loc_nm,
							S1_T1.wg_cd,
							S1_M4.wg_nm,
							nvl(
								S1_M9.rqmt_typ,
								value(MAC_RQMT_TYP.NON.value())
							).as("rqmt_typ"),
							nvl(
								S1_M9.prod_pln_typ,
								value(MAC_PROD_PLN_TYP.NOT_USE.value())
							).as("prod_pln_typ"),
							addDynamicSelect(DS1C_ITM_GRP)
						)
						.from(
							S1_T1
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_M1.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M1.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M1.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M1.itm_sub3.eq(S1_T1.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_M2.unit_cd.eq(S1_M1.unit_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_M3.loc_cd.eq(S1_T1.strg_loc_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_M4.wg_cd.eq(S1_T1.wg_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_M5.itm_typ.eq(S1_M1.itm_typ)
									.and(S1_M5.itm_typ_d_cd.eq(S1_M1.itm_typ_d_cd))
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_M6.lg_grp_cd.eq(S1_M3.lg_grp_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_M7.loc_grp_cd.eq(S1_M3.loc_grp_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_M8.site_cd.eq(S1_M3.site_cd)
								)
							)
							.leftOuterJoin(S1_M9).on(
								bracket(
									S1_M9.itm_cd.eq(S1_T1.itm_cd)
									.and(S1_M9.itm_sub1.eq(S1_T1.itm_sub1))
									.and(S1_M9.itm_sub2.eq(S1_T1.itm_sub2))
									.and(S1_M9.itm_sub3.eq(S1_T1.itm_sub3))
									.and(S1_M9.wg_cd.eq(S1_T1.wg_cd))
								)
							)
							.innerJoin(S1_M10).on(
								bracket(
									S1_M10.loc_cd.eq(S1_T1.strg_loc_cd)
								)
							)
							.addDynamicView(DS1C_ITM_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(
								bracket(
									bind("tmp_adjst_tgt").eq(value(true))
									.and(
										nvl(
											S1_M9.rqmt_typ,
											value(MAC_RQMT_TYP.NON.value())
										).eq(value(MAC_RQMT_TYP.NON.value()))
									)
									.and(
										nvl(
											S1_M9.prod_pln_typ,
											value(MAC_PROD_PLN_TYP.NOT_USE.value())
										).eq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
									)
								)
							)
							.cutoff$and(
								bracket(
									bind("tmp_adjst_not_tgt").eq(value(true))
									.and(
										nvl(
											S1_M9.rqmt_typ,
											value(MAC_RQMT_TYP.NON.value())
										).neq(value(MAC_RQMT_TYP.NON.value()))
										.or(
											nvl(
												S1_M9.prod_pln_typ,
												value(MAC_PROD_PLN_TYP.NOT_USE.value())
											).neq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
										)
									)
								)
							)
							.cutoff$and(S1_T1.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T1.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T1.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T1.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(S1_M1.itm_nm.like(bind("itm_nm")))
							.cutoff$and(S1_T1.due_dt.gte(bind("srch_dt_fr")))
							.cutoff$and(S1_T1.due_dt.lte(bind("srch_dt_to")))
							.cutoff$and(S1_M1.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_M5.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T1.strg_loc_cd.like(bind("dmnd_loc_cd")))
							.cutoff$and(S1_M3.loc_nm.like(bind("dmnd_loc_nm")))
							.cutoff$and(S1_T1.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_M4.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_M3.lg_grp_cd.like(bind("lg_grp_cd")))
							.cutoff$and(S1_M6.lg_grp_nm.like(bind("lg_grp_nm")))
							.cutoff$and(S1_M3.loc_grp_cd.like(bind("loc_grp_cd")))
							.cutoff$and(S1_M7.loc_grp_nm.like(bind("loc_grp_nm")))
							.cutoff$and(S1_M3.site_cd.like(bind("site_cd")))
							.cutoff$and(S1_M8.site_nm.like(bind("site_nm")))
							.addDynamicPredicate(DS1C_ITM_GRP)
						)
					)
					.union(
							subQuery()
							.select(
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_M1.itm_nm,
								S2_M1.sno1_mng_typ,
								S2_M1.sno2_mng_typ,
								S2_M1.sno3_mng_typ,
								S2_M1.sno4_mng_typ,
								S2_M1.unit_cd,
								S2_M2.unit_nm,
								S2_M1.dec_place,
								S2_T1.rqst_loc_cd.as("loc_cd"),
								S2_M3.loc_nm,
								S2_T1.rqst_wg_cd.as("wg_cd"),
								S2_M4.wg_nm,
								nvl(
									S2_M9.rqmt_typ,
									value(MAC_RQMT_TYP.NON.value())
								).as("rqmt_typ"),
								nvl(
									S2_M9.prod_pln_typ,
									value(MAC_PROD_PLN_TYP.NOT_USE.value())
								).as("prod_pln_typ"),
								addDynamicSelect(DS2C_ITM_GRP)
							)
							.from(
								S2_T1
								.leftOuterJoin(S2_M1).on(
									bracket(
										S2_M1.itm_cd.eq(S2_T1.itm_cd)
										.and(S2_M1.itm_sub1.eq(S2_T1.itm_sub1))
										.and(S2_M1.itm_sub2.eq(S2_T1.itm_sub2))
										.and(S2_M1.itm_sub3.eq(S2_T1.itm_sub3))
									)
								)
								.leftOuterJoin(S2_M2).on(
									bracket(
										S2_M2.unit_cd.eq(S2_M1.unit_cd)
									)
								)
								.leftOuterJoin(S2_M3).on(
									bracket(
										S2_M3.loc_cd.eq(S2_T1.rqst_loc_cd)
									)
								)
								.leftOuterJoin(S2_M4).on(
									bracket(
										S2_M4.wg_cd.eq(S2_T1.rqst_wg_cd)
									)
								)
								.leftOuterJoin(S2_M5).on(
									bracket(
										S2_M5.itm_typ.eq(S2_M1.itm_typ)
										.and(S2_M5.itm_typ_d_cd.eq(S2_M1.itm_typ_d_cd))
									)
								)
								.leftOuterJoin(S2_M6).on(
									bracket(
										S2_M6.lg_grp_cd.eq(S2_M3.lg_grp_cd)
									)
								)
								.leftOuterJoin(S1_M7).on(
									bracket(
										S2_M7.loc_grp_cd.eq(S2_M3.loc_grp_cd)
									)
								)
								.leftOuterJoin(S1_M8).on(
									bracket(
										S2_M8.site_cd.eq(S2_M3.site_cd)
									)
								)
								.leftOuterJoin(S2_M9).on(
									bracket(
										S2_M9.itm_cd.eq(S2_T1.itm_cd)
										.and(S2_M9.itm_sub1.eq(S2_T1.itm_sub1))
										.and(S2_M9.itm_sub2.eq(S2_T1.itm_sub2))
										.and(S2_M9.itm_sub3.eq(S2_T1.itm_sub3))
										.and(S2_M9.wg_cd.eq(S2_T1.rqst_wg_cd))
									)
								)
								.innerJoin(S2_M10).on(
									bracket(
										S2_M10.loc_cd.eq(S2_T1.rqst_loc_cd)
									)
								)
								.addDynamicView(DS2C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.itm_ord_typ.eq(value(MSC_ITM_ORD_TYP.WG_XFR.value())))
								.and(S2_T1.gi_schd_dt.gte(FCPA_DATE_UTIL$F_GET_TODAY1()))
								.cutoff$and(
									bracket(
										bind("tmp_adjst_tgt").eq(value(true))
										.and(
											nvl(
												S2_M9.rqmt_typ,
												value(MAC_RQMT_TYP.NON.value())
											).eq(value(MAC_RQMT_TYP.NON.value()))
										)
										.and(
											nvl(
												S2_M9.prod_pln_typ,
												value(MAC_PROD_PLN_TYP.NOT_USE.value())
											).eq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
										)
									)
								)
								.cutoff$and(
									bracket(
										bind("tmp_adjst_not_tgt").eq(value(true))
										.and(
											nvl(
												S2_M9.rqmt_typ,
												value(MAC_RQMT_TYP.NON.value())
											).neq(value(MAC_RQMT_TYP.NON.value()))
											.or(
												nvl(
													S2_M9.prod_pln_typ,
													value(MAC_PROD_PLN_TYP.NOT_USE.value())
												).neq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
											)
										)
									)
								)
								.cutoff$and(S2_T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2_M1.itm_nm.like(bind("itm_nm")))
								.cutoff$and(S2_T1.gi_schd_dt.gte(bind("srch_dt_fr")))
								.cutoff$and(S2_T1.gi_schd_dt.lte(bind("srch_dt_to")))
								.cutoff$and(S2_M1.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M5.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2_T1.rqst_loc_cd.like(bind("dmnd_loc_cd")))
								.cutoff$and(S2_M3.loc_nm.like(bind("dmnd_loc_nm")))
								.cutoff$and(S2_T1.rqst_wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_M4.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_M3.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2_M6.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2_M3.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2_M7.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(S2_M3.site_cd.like(bind("site_cd")))
								.cutoff$and(S2_M8.site_nm.like(bind("site_nm")))
								.addDynamicPredicate(DS2C_ITM_GRP)
							)
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
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd1.as("itm_grp_cd1"), S1_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM1).on(S1_M1.itm_grp_cd1.eq(S1_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_MM1.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S1_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd2.as("itm_grp_cd2"), S1_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM2).on(S1_M1.itm_grp_cd2.eq(S1_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_MM2.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S1_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd3.as("itm_grp_cd3"), S1_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM3).on(S1_M1.itm_grp_cd3.eq(S1_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_MM3.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S1_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd4.as("itm_grp_cd4"), S1_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM4).on(S1_M1.itm_grp_cd4.eq(S1_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_MM4.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S1_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd5.as("itm_grp_cd5"), S1_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM5).on(S1_M1.itm_grp_cd5.eq(S1_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_MM5.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S1_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd6.as("itm_grp_cd6"), S1_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM6).on(S1_M1.itm_grp_cd6.eq(S1_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_MM6.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S1_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd7.as("itm_grp_cd7"), S1_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM7).on(S1_M1.itm_grp_cd7.eq(S1_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_MM7.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S1_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd8.as("itm_grp_cd8"), S1_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM8).on(S1_M1.itm_grp_cd8.eq(S1_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_MM8.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S1_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd9.as("itm_grp_cd9"), S1_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM9).on(S1_M1.itm_grp_cd9.eq(S1_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_MM9.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S1_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1C_ITM_GRP, S1_M1.itm_grp_cd10.as("itm_grp_cd10"), S1_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS1C_ITM_GRP, v -> v.leftOuterJoin(S1_MM10).on(S1_M1.itm_grp_cd10.eq(S1_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_MM10.itm_grp_typ))))
					.predicate(DS1C_ITM_GRP, p -> p.cutoff$and(S1_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S1_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd1.as("itm_grp_cd1"), S2_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM1).on(S2_M1.itm_grp_cd1.eq(S2_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2_MM1.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S2_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd2.as("itm_grp_cd2"), S2_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM2).on(S2_M1.itm_grp_cd2.eq(S2_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2_MM2.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S2_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd3.as("itm_grp_cd3"), S2_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM3).on(S2_M1.itm_grp_cd3.eq(S2_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2_MM3.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S2_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd4.as("itm_grp_cd4"), S2_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM4).on(S2_M1.itm_grp_cd4.eq(S2_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2_MM4.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S2_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd5.as("itm_grp_cd5"), S2_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM5).on(S2_M1.itm_grp_cd5.eq(S2_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2_MM5.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S2_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd6.as("itm_grp_cd6"), S2_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM6).on(S2_M1.itm_grp_cd6.eq(S2_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2_MM6.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S2_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd7.as("itm_grp_cd7"), S2_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM7).on(S2_M1.itm_grp_cd7.eq(S2_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2_MM7.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S2_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd8.as("itm_grp_cd8"), S2_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM8).on(S2_M1.itm_grp_cd8.eq(S2_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2_MM8.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S2_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd9.as("itm_grp_cd9"), S2_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM9).on(S2_M1.itm_grp_cd9.eq(S2_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2_MM9.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S2_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS2C_ITM_GRP, S2_M1.itm_grp_cd10.as("itm_grp_cd10"), S2_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM10).on(S2_M1.itm_grp_cd10.eq(S2_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2_MM10.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S2_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBAL0050_MST_DLY_DMND_Query_S01
	 */
	static MCQueryPlan MSBAL0050_MST_DLY_DMND_S01() {
		MST_DLY_DMND_R S0_T1 = MST_DLY_DMND_R.create("T1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_LOC_R S0_M9 = MAM_LOC_R.create("M9");
		MAM_WG_R S0_M10 = MAM_WG_R.create("M10");
		MAM_ITM_TYP_D_R S0_M11 = MAM_ITM_TYP_D_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_LOC_GRP_R S0_M13 = MAM_LOC_GRP_R.create("M13");
		MAM_SITE_R S0_M14 = MAM_SITE_R.create("M14");
		MAVM_ITM_WG_R S0_M15 = MAVM_ITM_WG_R.create("M15");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_WRK_R S0_T3 = MST_WRK_R.create("T3");
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
				sql("MSBAL0050_MST_DLY_DMND_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dly_dmnd_no,
						S0_T1.dmnd_no,
						S0_T1.dmnd_dt,
						S0_T1.dmnd_st_dt,
						S0_T1.dmnd_end_dt,
						S0_T1.dlv_schd_st_dt,
						S0_T1.dlv_schd_end_dt,
						S0_T1.dmnd_period_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.spln_itm_cd,
						S0_T1.dmnd_typ,
						S0_T1.dmnd_qty.as("base_unit_qty"),
						S0_T1.dmnd_dpt_cd,
						S0_M4.dpt_nm.as("dmnd_dpt_nm"),
						nvl(
							S0_T2.wrk_no,
							S0_T1.wrk_no
						).as("wrk_no"),
						nvl(
							S0_T2.wrk_nm,
							S0_T3.wrk_nm
						).as("wrk_nm"),
						S0_T1.dmnd_usr_cd,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						S0_T1.slo_d_no,
						S0_T1.slo_no,
						S0_T1.cst_frcst_d_no,
						S0_T1.cst_frcst_no,
						S0_T1.ym,
						S0_T1.spln_vers,
						S0_T1.cur_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.dmnd_loc_cd,
						S0_T1.wg_cd.as("dmnd_wg_cd"),
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
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.dpt_cd.eq(S0_T1.dmnd_dpt_cd)
								.and(S0_T1.dmnd_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M15.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M15.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M15.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M15.wg_cd.eq(S0_T1.wg_cd))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M99.loc_cd.eq(S0_T1.dmnd_loc_cd)
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.sno1.eq(S0_T1.sno1)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.wrk_no.eq(S0_T1.wrk_no)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.dmnd_dt.gte(FCPA_DATE_UTIL$F_GET_TODAY1()))
						.cutoff$and(
							bracket(
								bind("tmp_adjst_tgt").eq(value(true))
								.and(
									nvl(
										S0_M15.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).eq(value(MAC_RQMT_TYP.NON.value()))
								)
								.and(
									nvl(
										S0_M15.prod_pln_typ,
										value(MAC_PROD_PLN_TYP.NOT_USE.value())
									).eq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("tmp_adjst_not_tgt").eq(value(true))
								.and(
									nvl(
										S0_M15.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).neq(value(MAC_RQMT_TYP.NON.value()))
									.or(
										nvl(
											S0_M15.prod_pln_typ,
											value(MAC_PROD_PLN_TYP.NOT_USE.value())
										).neq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
									)
								)
							)
						)
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.dmnd_dt.gte(bind("srch_dt_fr")))
						.cutoff$and(S0_T1.dmnd_dt.lte(bind("srch_dt_to")))
						.cutoff$and(S0_T1.dmnd_loc_cd.like(bind("dmnd_loc_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.wg_cd.asc(),
						S0_T1.dmnd_loc_cd.asc(),
						S0_T1.dmnd_dt.asc(),
						S0_T1.dmnd_typ.asc(),
						S0_T1.dmnd_period_typ.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_nm", "itm_typ", "itm_typ_d_cd"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M2.itm_cd.eq(S0_T1.itm_cd).and(S0_M2.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_M2.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_M2.itm_sub3.eq(S0_T1.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M2.itm_nm.like(bind("itm_nm"))).cutoff$and(S0_M2.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M2.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("lg_grp_nm", "loc_grp_nm", "site_nm", "dmnd_loc_nm", "lg_grp_cd", "loc_grp_cd", "site_cd"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.loc_cd.eq(S0_T1.dmnd_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.loc_nm.like(bind("dmnd_loc_nm"))).cutoff$and(S0_M9.lg_grp_cd.like(bind("lg_grp_cd"))).cutoff$and(S0_M9.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M9.site_cd.like(bind("site_cd")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M10.wg_cd.eq(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.wg_nm.like(bind("wg_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M11.itm_typ.eq(S0_M2.itm_typ).and(S0_M11.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M11.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M12.lg_grp_cd.eq(S0_M9.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M13.loc_grp_cd.eq(S0_M9.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M14.site_cd.eq(S0_M9.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.site_nm.like(bind("site_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M2.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M2.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M2.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M2.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M2.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M2.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M2.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M2.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M2.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M2.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M2.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M2.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_SPLN_ITM_R.class, r -> toCondition(
							r.getStringNE("spln_itm_cd")
						))
						.addSelect(m -> toArray(
							m.spln_itm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("spln_itm_nm", m.spln_itm_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("base_unit_cd", m.unit_cd());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("dmnd_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dmnd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_loc_nm", m.loc_nm());
							r.setStringNE("join_lg_grp_cd_", m.lg_grp_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
							r.setStringNE("join_site_cd_", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dmnd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_wg_nm", m.wg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBAL0050_MST_DLY_SD_Query_S01
	 */
	static MCQueryPlan MSBAL0050_MST_DLY_SD_S01() {
		MST_DLY_SD_R S0_T1 = MST_DLY_SD_R.create("T1");
		MCTempView S0_T2 = createTempView("T2");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAM_ITM_TYP_D_R S0_M8 = MAM_ITM_TYP_D_R.create("M8");
		MAM_LG_GRP_R S0_M9 = MAM_LG_GRP_R.create("M9");
		MAM_LOC_GRP_R S0_M10 = MAM_LOC_GRP_R.create("M10");
		MAM_SITE_R S0_M11 = MAM_SITE_R.create("M11");
		MAVM_ITM_WG_R S0_M12 = MAVM_ITM_WG_R.create("M12");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		MST_ITM_ORDER_R S1_T2 = MST_ITM_ORDER_R.create("T2");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0050_MST_DLY_SD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dly_sd_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.strg_loc_cd,
						S0_T1.due_dt,
						S0_T1.rqmt_qty.as("base_unit_qty"),
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.wg_cd.as("strg_wg_cd"),
						S0_T1.due_dt.as("old_due_dt"),
						S0_T1.rqmt_qty.as("old_base_unit_qty"),
						S0_T1.mfg_loc_cd.as("old_mfg_loc_cd"),
						S0_T1.sppl_cd.as("old_sppl_cd"),
						S0_T1.rqst_loc_cd.as("old_rqst_loc_cd"),
						decode(
							S0_T2.pr("itm_ord_sts_typ"),
							value(MSC_ITM_ORD_STS_TYP.FIX.value()),
							value(true),
							value(MSC_ITM_ORD_STS_TYP.PART_INST.value()),
							value(true),
							value(MSC_ITM_ORD_STS_TYP.INST.value()),
							value(true),
							value(MSC_ITM_ORD_STS_TYP.CMPL.value()),
							value(true),
							value(false)
						).as("fix_flg"),
						nvl(
							S0_T2.pr("order_reg_qty"),
							value(0)
						).as("order_reg_qty"),
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("dly_sd_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T2.rqmt_no,
								max(S1_T2.itm_ord_sts_typ).as("itm_ord_sts_typ"),
								sum(S1_T2.yield_schd_qty).as("order_reg_qty")
							)
							.from(S1_T2)
							.groupBy(S1_T2.rqmt_no).view(S0_T2)
						).on(
							bracket(
								S0_T2.pr(S1_T2.rqmt_no).eq(S0_T1.dly_sd_no)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M12.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M12.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M12.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M12.wg_cd.eq(S0_T1.wg_cd))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M99.loc_cd.eq(S0_T1.strg_loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							bracket(
								bind("tmp_adjst_tgt").eq(value(true))
								.and(
									nvl(
										S0_M12.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).eq(value(MAC_RQMT_TYP.NON.value()))
								)
								.and(
									nvl(
										S0_M12.prod_pln_typ,
										value(MAC_PROD_PLN_TYP.NOT_USE.value())
									).eq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("tmp_adjst_not_tgt").eq(value(true))
								.and(
									nvl(
										S0_M12.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).neq(value(MAC_RQMT_TYP.NON.value()))
									.or(
										nvl(
											S0_M12.prod_pln_typ,
											value(MAC_PROD_PLN_TYP.NOT_USE.value())
										).neq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
									)
								)
							)
						)
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.due_dt.gte(bind("srch_dt_fr")))
						.cutoff$and(S0_T1.due_dt.lte(bind("srch_dt_to")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("dmnd_loc_cd")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.wg_cd.asc(),
						S0_T1.strg_loc_cd.asc(),
						S0_T1.due_dt.asc(),
						S0_T1.dly_sd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("lg_grp_nm", "loc_grp_nm", "site_nm", "dmnd_loc_nm", "lg_grp_cd", "loc_grp_cd", "site_cd"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_M1.loc_cd.eq(S0_T1.strg_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.loc_nm.like(bind("dmnd_loc_nm"))).cutoff$and(S0_M1.lg_grp_cd.like(bind("lg_grp_cd"))).cutoff$and(S0_M1.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M1.site_cd.like(bind("site_cd")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M2.wg_cd.eq(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_nm", "itm_typ", "itm_typ_d_cd"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M3.itm_cd.eq(S0_T1.itm_cd).and(S0_M3.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_M3.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_M3.itm_sub3.eq(S0_T1.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M3.itm_nm.like(bind("itm_nm"))).cutoff$and(S0_M3.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M3.itm_typ_d_cd.like(bind("itm_typ_d_cd")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.itm_typ.eq(S0_M3.itm_typ).and(S0_M8.itm_typ_d_cd.eq(S0_M3.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M8.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.lg_grp_cd.eq(S0_M1.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M10.loc_grp_cd.eq(S0_M1.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M11.site_cd.eq(S0_M1.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.site_nm.like(bind("site_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M3.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M3.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M3.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M3.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M3.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M3.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M3.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M3.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M3.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M3.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M3.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M3.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("join_lg_grp_cd_", m.lg_grp_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
							r.setStringNE("join_site_cd_", m.site_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("strg_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("base_unit_cd", m.unit_cd());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
							r.setStringNE("old_mfg_loc_nm", m.loc_nm());
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
							r.setStringNE("old_sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_wg_cd", m.wg_cd());
							r.setStringNE("old_rqst_loc_nm", m.loc_nm());
							r.setStringNE("old_rqst_wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
							r.setStringNE("old_rqst_wg_nm", m.wg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBAL0050_MST_SIM_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBAL0050_MST_SIM_ITM_ORDER_S01() {
		MST_SIM_ITM_ORDER_R S0_T1 = MST_SIM_ITM_ORDER_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S0_M8 = MAM_SITE_R.create("M8");
		MAM_LG_GRP_R S0_M9 = MAM_LG_GRP_R.create("M9");
		MAM_LOC_GRP_R S0_M10 = MAM_LOC_GRP_R.create("M10");
		MAM_ITM_TYP_D_R S0_M11 = MAM_ITM_TYP_D_R.create("M11");
		MAVM_ITM_WG_R S0_M13 = MAVM_ITM_WG_R.create("M13");
		MAM_ITM_DTL_R S0_M14 = MAM_ITM_DTL_R.create("M14");
		MAVM_RD_LOC_R S0_M99 = MAVM_RD_LOC_R.create("M99");
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
		MST_SIM_MRP_R S1_TMP = MST_SIM_MRP_R.create("TMP");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0050_MST_SIM_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_ord_no,
						S0_T1.itm_ord_typ,
						S0_T1.ord_gnrt_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.wg_cd,
						S0_T1.ver_no,
						S0_T1.strg_loc_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.inst_qty,
						S0_T1.yield_schd_qty,
						S0_T1.itm_ord_sts_typ,
						S0_T1.avl_schd_dt,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						MAPA_DT$F_CAL_DATE_LOC(
							S0_T1.avl_schd_dt,
							nvl(
								S0_M14.buf_lt,
								value(MCNumber.ZERO)
							),
							value(true),
							S0_M99.loc_cd,
							value(false)
						).as("due_dt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M13.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M13.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M13.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M13.wg_cd.eq(S0_T1.wg_cd))
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M14.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M14.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M14.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M14.itm_sub3))
								.and(S0_T1.bom_ptn.eq(S0_M14.bom_ptn))
								.and(S0_T1.mfg_loc_cd.eq(S0_M14.mfg_loc_cd))
								.and(S0_T1.sppl_cd.eq(S0_M14.sppl_cd))
								.and(S0_T1.maker_cd.eq(S0_M14.maker_cd))
								.and(S0_T1.rqst_loc_cd.eq(S0_M14.rqst_loc_cd))
								.and(S0_T1.wg_cd.eq(S0_M14.wg_cd))
								.and(S0_T1.master_dt.gte(S0_M14.st_dt))
								.and(S0_T1.master_dt.lte(S0_M14.end_dt))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_M99.loc_cd.eq(S0_T1.strg_loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.sim_mrp_no.eq(bind("sim_mrp_no")))
						.and(
							exists(
								subQuery()
								.select(nullValue())
								.from(S1_TMP)
								.where(
									value(0).eq(value(0))
									.and(S1_TMP.sim_mrp_no.eq(S0_T1.sim_mrp_no))
									.and(S1_TMP.sim_mrp_typ.eq(value(MSC_SIM_MRP_TYP.SD_ADJST.value())))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("tmp_adjst_tgt").eq(value(true))
								.and(
									nvl(
										S0_M13.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).eq(value(MAC_RQMT_TYP.NON.value()))
								)
								.and(
									nvl(
										S0_M13.prod_pln_typ,
										value(MAC_PROD_PLN_TYP.NOT_USE.value())
									).eq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("tmp_adjst_not_tgt").eq(value(true))
								.and(
									nvl(
										S0_M13.rqmt_typ,
										value(MAC_RQMT_TYP.NON.value())
									).neq(value(MAC_RQMT_TYP.NON.value()))
									.or(
										nvl(
											S0_M13.prod_pln_typ,
											value(MAC_PROD_PLN_TYP.NOT_USE.value())
										).neq(value(MAC_PROD_PLN_TYP.DMND_USE.value()))
									)
								)
							)
						)
						.cutoff$and(S0_T1.master_dt.gte(bind("srch_dt_fr")))
						.cutoff$and(S0_T1.master_dt.lte(bind("srch_dt_to")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("dmnd_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(S0_T1.itm_ord_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_M1.itm_cd.eq(S0_T1.itm_cd).and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1)).and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2)).and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_M2.wg_cd.eq(S0_T1.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("site_nm", "lg_grp_nm", "loc_grp_nm", "dmnd_loc_nm", "site_cd", "lg_grp_cd", "loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M3.loc_cd.eq(S0_T1.strg_loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("dmnd_loc_nm"))).cutoff$and(S0_M3.site_cd.like(bind("site_cd"))).cutoff$and(S0_M3.lg_grp_cd.like(bind("lg_grp_cd"))).cutoff$and(S0_M3.loc_grp_cd.like(bind("loc_grp_cd")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.site_cd.eq(S0_M3.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.site_nm.like(bind("site_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.lg_grp_cd.eq(S0_M3.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M10.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M11.itm_typ.eq(S0_M1.itm_typ).and(S0_M11.itm_typ_d_cd.eq(S0_M1.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M11.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setStringNE("base_unit_cd", m.unit_cd());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("join_itm_typ_", m.itm_typ());
							r.setStringNE("join_itm_typ_d_cd_", m.itm_typ_d_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_lg_grp_cd_", m.lg_grp_cd());
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
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					})
				)
			);
	}
}