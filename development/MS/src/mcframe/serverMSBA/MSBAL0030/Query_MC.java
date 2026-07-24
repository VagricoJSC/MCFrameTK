package mcframe.serverMSBA.MSBAL0030;

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
	 * -- MSBAL0030_MST_DMND_Query_S01
	 */
	static MCQueryPlan MSBAL0030_MST_DMND_S01() {
		MST_DMND_R S0_T1 = MST_DMND_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_SPLN_ITM_R S0_M7 = MAM_SPLN_ITM_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_ITM_TYP_D_R S0_M10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_SITE_R S0_M13 = MAM_SITE_R.create("M13");
		MAM_USR_R S0_M14 = MAM_USR_R.create("M14");
		MAVM_RD_LOC_R S0_M15 = MAVM_RD_LOC_R.create("M15");
		MAM_CO_R S0_M16 = MAM_CO_R.create("M16");
		MAM_LG_CTL_R S0_M17 = MAM_LG_CTL_R.create("M17");
		MAM_LG_CTL_R S0_M18 = MAM_LG_CTL_R.create("M18");
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
		MAM_BP_GRP_R S0_MM_DLV1 = MAM_BP_GRP_R.create("MM_DLV1");
		MAM_BP_GRP_R S0_MM_DLV2 = MAM_BP_GRP_R.create("MM_DLV2");
		MAM_BP_GRP_R S0_MM_DLV3 = MAM_BP_GRP_R.create("MM_DLV3");
		MAM_BP_GRP_R S0_MM_DLV4 = MAM_BP_GRP_R.create("MM_DLV4");
		MAM_BP_GRP_R S0_MM_DLV5 = MAM_BP_GRP_R.create("MM_DLV5");
		MAM_BP_GRP_R S0_MM_DLV6 = MAM_BP_GRP_R.create("MM_DLV6");
		MAM_BP_GRP_R S0_MM_DLV7 = MAM_BP_GRP_R.create("MM_DLV7");
		MAM_BP_GRP_R S0_MM_DLV8 = MAM_BP_GRP_R.create("MM_DLV8");
		MAM_BP_GRP_R S0_MM_DLV9 = MAM_BP_GRP_R.create("MM_DLV9");
		MAM_BP_GRP_R S0_MM_DLV10 = MAM_BP_GRP_R.create("MM_DLV10");
		MAM_BP_GRP_R S0_MM_CST1 = MAM_BP_GRP_R.create("MM_CST1");
		MAM_BP_GRP_R S0_MM_CST2 = MAM_BP_GRP_R.create("MM_CST2");
		MAM_BP_GRP_R S0_MM_CST3 = MAM_BP_GRP_R.create("MM_CST3");
		MAM_BP_GRP_R S0_MM_CST4 = MAM_BP_GRP_R.create("MM_CST4");
		MAM_BP_GRP_R S0_MM_CST5 = MAM_BP_GRP_R.create("MM_CST5");
		MAM_BP_GRP_R S0_MM_CST6 = MAM_BP_GRP_R.create("MM_CST6");
		MAM_BP_GRP_R S0_MM_CST7 = MAM_BP_GRP_R.create("MM_CST7");
		MAM_BP_GRP_R S0_MM_CST8 = MAM_BP_GRP_R.create("MM_CST8");
		MAM_BP_GRP_R S0_MM_CST9 = MAM_BP_GRP_R.create("MM_CST9");
		MAM_BP_GRP_R S0_MM_CST10 = MAM_BP_GRP_R.create("MM_CST10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0030_MST_DMND_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dmnd_no,
						S0_T1.dmnd_dt,
						S0_T1.dmnd_st_dt,
						S0_T1.dmnd_end_dt,
						S0_T1.dlv_schd_st_dt,
						S0_T1.dlv_schd_end_dt,
						S0_M8.lg_grp_cd.as("to_lg_grp_cd"),
						S0_M1.ship_term_cd,
						nvl(
							S0_M17.xfr_lt,
							S0_M18.xfr_lt
						).as("xfr_lt"),
						nvl(
							S0_M17.non_dmnd_lt_flg,
							S0_M18.non_dmnd_lt_flg
						).as("non_dmnd_lt_flg"),
						S0_T1.dmnd_period_typ,
						S0_T1.dly_div_flg,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M1.itm_nm,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T1.spln_itm_cd,
						S0_T1.dmnd_typ,
						S0_T1.dmnd_qty,
						S0_T1.input_qty,
						S0_T1.rec_qty,
						S0_T1.dmnd_dpt_cd,
						S0_M5.dpt_nm.as("dmnd_dpt_nm"),
						S0_T1.dmnd_usr_cd,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						S0_M8.bp_nm.as("dlv_nm"),
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
						nvl(
							S0_T2.wrk_no,
							S0_T1.wrk_no
						).as("wrk_no"),
						nvl(
							S0_T2.wrk_nm,
							S0_T3.wrk_nm
						).as("wrk_nm"),
						S0_T1.dmnd_loc_cd,
						S0_M3.loc_nm.as("dmnd_loc_nm"),
						S0_M3.loc_grp_cd.as("dmnd_loc_grp_cd"),
						S0_M3.lg_grp_cd.as("dmnd_lg_grp_cd"),
						S0_M3.wg_cd.as("dmnd_wg_cd"),
						S0_M3.site_cd.as("dmnd_site_cd"),
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("dmnd_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP)
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
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.loc_cd.eq(S0_T1.dmnd_loc_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T1.dmnd_dpt_cd)
								.and(S0_T1.dmnd_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.bp_cd.eq(S0_T1.dlv_cd)
							)
						)
						.innerJoin(S0_M15).on(
							bracket(
								S0_T1.dmnd_loc_cd.eq(S0_M15.loc_cd)
							)
						)
						.innerJoin(S0_M16).on(
							bracket(
								value(0).eq(value(0))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_M17.fr_lg_grp_cd.eq(S0_M3.lg_grp_cd)
								.and(S0_M17.to_lg_grp_cd.eq(S0_M8.lg_grp_cd))
								.and(S0_M17.ship_term_cd.eq(S0_M1.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M18).on(
							bracket(
								S0_M18.fr_lg_grp_cd.eq(S0_M3.lg_grp_cd)
								.and(S0_M18.to_lg_grp_cd.eq(S0_M8.lg_grp_cd))
								.and(S0_M18.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
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
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.dmnd_typ.eq(bind("tmp_misc")))
							.cutoff$or(
								bracket(
									S0_T1.dmnd_typ.neq(value(MSC_DMND_TYP.MISC.value()))
									.and(bind("tmp_othr").eq(value("1")))
								)
							)
						)
						.cutoff$and(S0_T1.dmnd_st_dt.lte(bind("dmnd_dt_to")))
						.cutoff$and(S0_T1.dmnd_st_dt.gte(bind("dmnd_dt_fr")))
						.cutoff$and(S0_T1.dmnd_period_typ.like(bind("dmnd_period_typ")))
						.cutoff$and(S0_T1.dmnd_typ.like(bind("dmnd_typ")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_M8.bp_nm.like(bind("dlv_nm")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.dmnd_loc_cd.like(bind("dmnd_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("dmnd_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M3.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(
							nvl(
								S0_T2.wrk_no,
								S0_T1.wrk_no
							).like(bind("wrk_no"))
						)
						.cutoff$and(
							nvl(
								S0_T2.wrk_nm,
								S0_T3.wrk_nm
							).like(bind("wrk_nm"))
						)
						.cutoff$and(S0_T1.dmnd_dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T1.dmnd_usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.ym.eq(bind("ym")))
						.cutoff$and(S0_T1.spln_vers.like(bind("spln_vers")))
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_T1.cst_frcst_no.like(bind("cst_frcst_no")))
						.cutoff$and(S0_T1.cst_frcst_d_no.like(bind("cst_frcst_d_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						MAPA_DT$F_GET_PERIOD_ST_DT_NE(
							S0_T1.dmnd_st_dt,
							value(MAC_PERIOD_TYP.MONTHLY.value()),
							S0_M16.ac_cl_day
						).asc(),
						S0_T1.dmnd_typ.desc(),
						S0_T1.dmnd_period_typ.desc(),
						S0_T1.dmnd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M4.wg_cd.eq(S0_M3.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("spln_itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M7.spln_itm_cd.eq(S0_T1.spln_itm_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.spln_itm_nm.like(bind("spln_itm_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.bp_cd.eq(S0_T1.cst_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.bp_nm.like(bind("cst_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M10.itm_typ.eq(S0_M1.itm_typ).and(S0_M10.itm_typ_d_cd.eq(S0_M1.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M11.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M12.lg_grp_cd.eq(S0_M3.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M13.site_cd.eq(S0_M3.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.site_nm.like(bind("site_nm")))),
				when(boundOr("usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M14.usr_cd.eq(S0_T1.dmnd_usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.usr_nm.like(bind("usr_nm")))),
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
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM_DLV1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV1).on(S0_M8.bp_grp_cd1.eq(S0_MM_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_DLV1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM_DLV1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM_DLV2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV2).on(S0_M8.bp_grp_cd2.eq(S0_MM_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_DLV2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM_DLV2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM_DLV3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV3).on(S0_M8.bp_grp_cd3.eq(S0_MM_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_DLV3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM_DLV3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM_DLV4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV4).on(S0_M8.bp_grp_cd4.eq(S0_MM_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_DLV4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM_DLV4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM_DLV5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV5).on(S0_M8.bp_grp_cd5.eq(S0_MM_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_DLV5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM_DLV5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM_DLV6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV6).on(S0_M8.bp_grp_cd6.eq(S0_MM_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_DLV6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM_DLV6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM_DLV7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV7).on(S0_M8.bp_grp_cd7.eq(S0_MM_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_DLV7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM_DLV7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM_DLV8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV8).on(S0_M8.bp_grp_cd8.eq(S0_MM_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_DLV8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM_DLV8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM_DLV9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV9).on(S0_M8.bp_grp_cd9.eq(S0_MM_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_DLV9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM_DLV9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M8.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM_DLV10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV10).on(S0_M8.bp_grp_cd10.eq(S0_MM_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_DLV10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM_DLV10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd1.as("cst_grp_cd1"), S0_MM_CST1.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST1).on(S0_M9.bp_grp_cd1.eq(S0_MM_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_CST1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM_CST1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd2.as("cst_grp_cd2"), S0_MM_CST2.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST2).on(S0_M9.bp_grp_cd2.eq(S0_MM_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_CST2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM_CST2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd3.as("cst_grp_cd3"), S0_MM_CST3.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST3).on(S0_M9.bp_grp_cd3.eq(S0_MM_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_CST3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM_CST3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd4.as("cst_grp_cd4"), S0_MM_CST4.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST4).on(S0_M9.bp_grp_cd4.eq(S0_MM_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_CST4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM_CST4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd5.as("cst_grp_cd5"), S0_MM_CST5.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST5).on(S0_M9.bp_grp_cd5.eq(S0_MM_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_CST5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM_CST5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd6.as("cst_grp_cd6"), S0_MM_CST6.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST6).on(S0_M9.bp_grp_cd6.eq(S0_MM_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_CST6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM_CST6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd7.as("cst_grp_cd7"), S0_MM_CST7.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST7).on(S0_M9.bp_grp_cd7.eq(S0_MM_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_CST7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM_CST7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd8.as("cst_grp_cd8"), S0_MM_CST8.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST8).on(S0_M9.bp_grp_cd8.eq(S0_MM_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_CST8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM_CST8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd9.as("cst_grp_cd9"), S0_MM_CST9.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST9).on(S0_M9.bp_grp_cd9.eq(S0_MM_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_CST9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM_CST9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M9.bp_grp_cd10.as("cst_grp_cd10"), S0_MM_CST10.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST10).on(S0_M9.bp_grp_cd10.eq(S0_MM_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_CST10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM_CST10.bp_grp_nm.like(bind("cst_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dmnd_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_wg_nm", m.wg_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.ship_lt
						))
						.addMap((r, m) -> {
							r.setNumberNE("bp_ship_lt", m.ship_lt());
							r.setStringNE("cst_nm", m.bp_nm());
					}),
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("dmnd_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dmnd_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("dmnd_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dmnd_site_nm", m.site_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBAL0030_MST_DMND_Query_S02
	 */
	static MCQueryPlan MSBAL0030_MST_DMND_S02() {
		MST_DMND_R S0_T1 = MST_DMND_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_UNIT_R S0_M2 = MAM_UNIT_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_CUR_R S0_M6 = MAM_CUR_R.create("M6");
		MAM_SPLN_ITM_R S0_M7 = MAM_SPLN_ITM_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_ITM_TYP_D_R S0_M10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_LG_GRP_R S0_M12 = MAM_LG_GRP_R.create("M12");
		MAM_SITE_R S0_M13 = MAM_SITE_R.create("M13");
		MAM_USR_R S0_M14 = MAM_USR_R.create("M14");
		MAVM_ITM_WG_R S0_M15 = MAVM_ITM_WG_R.create("M15");
		MAVM_RD_LOC_R S0_M16 = MAVM_RD_LOC_R.create("M16");
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
		MAM_BP_GRP_R S0_MM_DLV1 = MAM_BP_GRP_R.create("MM_DLV1");
		MAM_BP_GRP_R S0_MM_DLV2 = MAM_BP_GRP_R.create("MM_DLV2");
		MAM_BP_GRP_R S0_MM_DLV3 = MAM_BP_GRP_R.create("MM_DLV3");
		MAM_BP_GRP_R S0_MM_DLV4 = MAM_BP_GRP_R.create("MM_DLV4");
		MAM_BP_GRP_R S0_MM_DLV5 = MAM_BP_GRP_R.create("MM_DLV5");
		MAM_BP_GRP_R S0_MM_DLV6 = MAM_BP_GRP_R.create("MM_DLV6");
		MAM_BP_GRP_R S0_MM_DLV7 = MAM_BP_GRP_R.create("MM_DLV7");
		MAM_BP_GRP_R S0_MM_DLV8 = MAM_BP_GRP_R.create("MM_DLV8");
		MAM_BP_GRP_R S0_MM_DLV9 = MAM_BP_GRP_R.create("MM_DLV9");
		MAM_BP_GRP_R S0_MM_DLV10 = MAM_BP_GRP_R.create("MM_DLV10");
		MAM_BP_GRP_R S0_MM_CST1 = MAM_BP_GRP_R.create("MM_CST1");
		MAM_BP_GRP_R S0_MM_CST2 = MAM_BP_GRP_R.create("MM_CST2");
		MAM_BP_GRP_R S0_MM_CST3 = MAM_BP_GRP_R.create("MM_CST3");
		MAM_BP_GRP_R S0_MM_CST4 = MAM_BP_GRP_R.create("MM_CST4");
		MAM_BP_GRP_R S0_MM_CST5 = MAM_BP_GRP_R.create("MM_CST5");
		MAM_BP_GRP_R S0_MM_CST6 = MAM_BP_GRP_R.create("MM_CST6");
		MAM_BP_GRP_R S0_MM_CST7 = MAM_BP_GRP_R.create("MM_CST7");
		MAM_BP_GRP_R S0_MM_CST8 = MAM_BP_GRP_R.create("MM_CST8");
		MAM_BP_GRP_R S0_MM_CST9 = MAM_BP_GRP_R.create("MM_CST9");
		MAM_BP_GRP_R S0_MM_CST10 = MAM_BP_GRP_R.create("MM_CST10");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0030_MST_DMND_Query_S02")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M1.itm_nm,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_M10.itm_typ_d_nm,
						S0_T1.dmnd_dpt_cd,
						S0_M5.dpt_nm.as("dmnd_dpt_nm"),
						max(S0_M15.dmnd_date_div_mons).as("dmnd_date_div_mons")
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
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.dpt_cd.eq(S0_T1.dmnd_dpt_cd)
								.and(S0_T1.dmnd_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.cur_cd.eq(S0_T1.cur_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.itm_typ.eq(S0_M1.itm_typ)
								.and(S0_M10.itm_typ_d_cd.eq(S0_M1.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M15.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M15.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M15.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M15.wg_cd.eq(S0_M3.wg_cd))
							)
						)
						.innerJoin(S0_M16).on(
							bracket(
								S0_T1.dmnd_loc_cd.eq(S0_M16.loc_cd)
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
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.dmnd_typ.eq(bind("tmp_misc")))
							.cutoff$or(
								bracket(
									S0_T1.dmnd_typ.neq(value(MSC_DMND_TYP.MISC.value()))
									.and(bind("tmp_othr").eq(value("1")))
								)
							)
						)
						.cutoff$and(S0_T1.dmnd_st_dt.lte(bind("dmnd_dt_to")))
						.cutoff$and(S0_T1.dmnd_st_dt.gte(bind("dmnd_dt_fr")))
						.cutoff$and(S0_T1.dmnd_period_typ.like(bind("dmnd_period_typ")))
						.cutoff$and(S0_T1.dmnd_typ.like(bind("dmnd_typ")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.dmnd_loc_cd.like(bind("dmnd_loc_cd")))
						.cutoff$and(S0_M3.loc_nm.like(bind("dmnd_loc_nm")))
						.cutoff$and(S0_M3.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M3.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M3.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M3.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M10.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(
							nvl(
								S0_T2.wrk_no,
								S0_T1.wrk_no
							).like(bind("wrk_no"))
						)
						.cutoff$and(
							nvl(
								S0_T2.wrk_nm,
								S0_T3.wrk_nm
							).like(bind("wrk_nm"))
						)
						.cutoff$and(S0_T1.dmnd_dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_T1.dmnd_usr_cd.like(bind("usr_cd")))
						.cutoff$and(S0_T1.ym.eq(bind("ym")))
						.cutoff$and(S0_T1.spln_vers.like(bind("spln_vers")))
						.cutoff$and(S0_T1.spln_itm_cd.like(bind("spln_itm_cd")))
						.cutoff$and(S0_T1.cst_frcst_no.like(bind("cst_frcst_no")))
						.cutoff$and(S0_T1.cst_frcst_d_no.like(bind("cst_frcst_d_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.groupBy(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M1.itm_nm,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_M10.itm_typ_d_nm,
						S0_T1.dmnd_dpt_cd,
						S0_M5.dpt_nm
					)
					.orderBy(
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.dmnd_dpt_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M4.wg_cd.eq(S0_M3.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("wg_nm")))),
				when(boundOr("spln_itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M7.spln_itm_cd.eq(S0_T1.spln_itm_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.spln_itm_nm.like(bind("spln_itm_nm")))),
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10", "dlv_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M8.bp_cd.eq(S0_T1.dlv_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.bp_nm.like(bind("dlv_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_M9.bp_cd.eq(S0_T1.cst_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.bp_nm.like(bind("cst_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M11.loc_grp_cd.eq(S0_M3.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_M12.lg_grp_cd.eq(S0_M3.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M13.site_cd.eq(S0_M3.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.site_nm.like(bind("site_nm")))),
				when(boundOr("usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_M14.usr_cd.eq(S0_T1.dmnd_usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.usr_nm.like(bind("usr_nm")))),
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
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV1).on(S0_M8.bp_grp_cd1.eq(S0_MM_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_DLV1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM_DLV1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV2).on(S0_M8.bp_grp_cd2.eq(S0_MM_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_DLV2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM_DLV2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV3).on(S0_M8.bp_grp_cd3.eq(S0_MM_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_DLV3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM_DLV3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV4).on(S0_M8.bp_grp_cd4.eq(S0_MM_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_DLV4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM_DLV4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV5).on(S0_M8.bp_grp_cd5.eq(S0_MM_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_DLV5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM_DLV5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV6).on(S0_M8.bp_grp_cd6.eq(S0_MM_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_DLV6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM_DLV6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV7).on(S0_M8.bp_grp_cd7.eq(S0_MM_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_DLV7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM_DLV7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV8).on(S0_M8.bp_grp_cd8.eq(S0_MM_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_DLV8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM_DLV8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV9).on(S0_M8.bp_grp_cd9.eq(S0_MM_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_DLV9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM_DLV9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV10).on(S0_M8.bp_grp_cd10.eq(S0_MM_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_DLV10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM_DLV10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST1).on(S0_M9.bp_grp_cd1.eq(S0_MM_CST1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_CST1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM_CST1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST2).on(S0_M9.bp_grp_cd2.eq(S0_MM_CST2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_CST2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM_CST2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST3).on(S0_M9.bp_grp_cd3.eq(S0_MM_CST3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_CST3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM_CST3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST4).on(S0_M9.bp_grp_cd4.eq(S0_MM_CST4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_CST4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM_CST4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST5).on(S0_M9.bp_grp_cd5.eq(S0_MM_CST5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_CST5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM_CST5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST6).on(S0_M9.bp_grp_cd6.eq(S0_MM_CST6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_CST6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM_CST6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST7).on(S0_M9.bp_grp_cd7.eq(S0_MM_CST7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_CST7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM_CST7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST8).on(S0_M9.bp_grp_cd8.eq(S0_MM_CST8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_CST8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM_CST8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST9).on(S0_M9.bp_grp_cd9.eq(S0_MM_CST9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_CST9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM_CST9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM_CST10).on(S0_M9.bp_grp_cd10.eq(S0_MM_CST10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_CST10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM_CST10.bp_grp_nm.like(bind("cst_grp_nm10"))))
			);
	}
}