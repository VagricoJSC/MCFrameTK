package mcframe.serverMSBE.MSBEL0030;

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
	 * -- MSBEL0030_MST_MLY_STK_DTL_Query_S01
	 */
	static MCQueryPlan MSBEL0030_MST_MLY_STK_DTL_S01() {
		MCTempView S0T1 = createTempView("T1");
		MAM_ITM_R S0M6 = MAM_ITM_R.create("M6");
		MAM_ITM_TYP_D_R S0M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_DPT_R S0M17 = MAM_DPT_R.create("M17");
		MAM_SUNDRY_ITM_R S0M22 = MAM_SUNDRY_ITM_R.create("M22");
		MAM_ITM_GRP_R S0MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0MM10 = MAM_ITM_GRP_R.create("MM10");
		MCTempView S1T1 = createTempView("T1");
		MST_MLY_STK_DTL_R S2T1 = MST_MLY_STK_DTL_R.create("T1");
		MAVM_RD_LOC_R S2M0 = MAVM_RD_LOC_R.create("M0");
		MST_WRK_SNO_R S2T2 = MST_WRK_SNO_R.create("T2");
		MST_LOT_R S2T3 = MST_LOT_R.create("T3");
		MAM_LOC_R S2M1 = MAM_LOC_R.create("M1");
		MAM_WG_R S2M2 = MAM_WG_R.create("M2");
		MAM_STR_LN_R S2M4 = MAM_STR_LN_R.create("M4");
		MAM_BP_R S2M5 = MAM_BP_R.create("M5");
		MAVM_ITM_UNIT_R S2M11 = MAVM_ITM_UNIT_R.create("M11");
		MAM_UNIT_R S2M12 = MAM_UNIT_R.create("M12");
		MAM_STK_GD_R S2M13 = MAM_STK_GD_R.create("M13");
		MAVM_BP_NM_R S2M14 = MAVM_BP_NM_R.create("M14");
		MST_WRK_R S2M16 = MST_WRK_R.create("M16");
		MAM_SITE_R S2M18 = MAM_SITE_R.create("M18");
		MAM_LG_GRP_R S2M19 = MAM_LG_GRP_R.create("M19");
		MAM_ALLOC_GRP_R S2M20 = MAM_ALLOC_GRP_R.create("M20");
		MAM_LOC_GRP_R S2M21 = MAM_LOC_GRP_R.create("M21");
		MST_MLY_STK_DTL_R S3T1 = MST_MLY_STK_DTL_R.create("T1");
		MAVM_RD_LOC_R S3M0 = MAVM_RD_LOC_R.create("M0");
		MST_WRK_SNO_R S3T2 = MST_WRK_SNO_R.create("T2");
		MST_LOT_R S3T3 = MST_LOT_R.create("T3");
		MAM_LOC_R S3M1 = MAM_LOC_R.create("M1");
		MAM_WG_R S3M2 = MAM_WG_R.create("M2");
		MAM_STR_LN_R S3M4 = MAM_STR_LN_R.create("M4");
		MAM_BP_R S3M5 = MAM_BP_R.create("M5");
		MAVM_ITM_UNIT_R S3M11 = MAVM_ITM_UNIT_R.create("M11");
		MAM_UNIT_R S3M12 = MAM_UNIT_R.create("M12");
		MAM_STK_GD_R S3M13 = MAM_STK_GD_R.create("M13");
		MAVM_BP_NM_R S3M14 = MAVM_BP_NM_R.create("M14");
		MST_WRK_R S3M16 = MST_WRK_R.create("M16");
		MAM_SITE_R S3M18 = MAM_SITE_R.create("M18");
		MAM_LG_GRP_R S3M19 = MAM_LG_GRP_R.create("M19");
		MAM_ALLOC_GRP_R S3M20 = MAM_ALLOC_GRP_R.create("M20");
		MAM_LOC_GRP_R S3M21 = MAM_LOC_GRP_R.create("M21");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0030_MST_MLY_STK_DTL_Query_S01")
					.mainQuery()
					.select(
						S0T1.pr("mly_io_cl_ym"),
						S0T1.pr("io_act_typ"),
						S0T1.pr(S2M0.wg_cd),
						S0T1.pr(S2M2.wg_nm),
						S0T1.pr("dpt_cd"),
						S0M17.dpt_nm,
						S0T1.pr(S2T1.loc_cd),
						S0T1.pr(S2M1.loc_nm),
						S0T1.pr(S2T1.str_ln_cd),
						S0T1.pr(S2M4.str_ln_nm),
						S0T1.pr(S2M1.site_cd),
						S0T1.pr(S2M18.site_nm),
						S0T1.pr(S2M1.lg_grp_cd),
						S0T1.pr(S2M19.lg_grp_nm),
						S0T1.pr(S2M1.alloc_grp_cd),
						S0T1.pr(S2M20.alloc_grp_nm),
						S0T1.pr(S2M1.loc_grp_cd),
						S0T1.pr(S2M21.loc_grp_nm),
						S0T1.pr(S2T1.stk_arrv_bp_cd),
						S0T1.pr("stk_arrv_bp_nm"),
						S0T1.pr(S2T1.itm_cd),
						S0T1.pr(S2T1.itm_sub1),
						S0T1.pr(S2T1.itm_sub2),
						S0T1.pr(S2T1.itm_sub3),
						S0T1.pr(S2T3.ver_no),
						S0T1.pr(S2T1.lot_no),
						S0T1.pr(S2T1.sublot_no),
						S0T1.pr(S2T1.sno1),
						S0T1.pr(S2T1.sno2),
						S0T1.pr(S2T1.sno3),
						S0T1.pr(S2T1.sno4),
						S0T1.pr(S2T1.fix_no_typ),
						S0T1.pr(S2T1.fix_no),
						S0T1.pr(S2T2.wrk_no),
						S0T1.pr(S2M16.wrk_nm),
						coalesce(
							S0M22.itm_nm,
							S0M6.itm_nm
						).as("itm_nm"),
						S0M6.unit_cd.as("base_unit_cd"),
						S0M6.dec_place.as("base_unit_dec_place"),
						S0M6.rnd_typ.as("base_unit_rnd_typ"),
						S0T1.pr(S2T1.pack_unit_cd),
						S0T1.pr("pack_unit_nm"),
						S0T1.pr("pack_unit_dec_place"),
						S0T1.pr("pack_unit_rnd_typ"),
						S0T1.pr(S2T1.gd_cd),
						S0T1.pr(S2M13.gd_nm),
						S0T1.pr(S2T1.in_xfr_typ),
						S0T1.pr(S2T1.quality_typ),
						S0T1.pr(S2T1.asst_typ),
						S0T1.pr(S2T1.stk_insp_typ),
						S0T1.pr(S2T1.stk_id_typ),
						S0T1.pr(S2T1.stk_bp_cd),
						S0T1.pr("stk_bp_nm"),
						S0T1.pr(S2T1.base_unit_qty),
						S0T1.pr(S2T1.pack_unit_qty),
						S0M6.itm_typ,
						S0M6.itm_typ_d_cd,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							bind("mly_io_cl_ym_fr").as("mly_io_cl_ym"),
							value(MSC_IO_ACT_TYP.INI_STK.value()).as("io_act_typ"),
							S1T1.pr(S2M0.wg_cd),
							S1T1.pr(S2M2.wg_nm),
							MAPA_LOC$F_GET_ASST_DPT_CD(
									S2T1.loc_cd,
									bind("mly_io_cl_ym_fr")
								).as("dpt_cd"),
							S1T1.pr(S2T1.loc_cd),
							S1T1.pr(S2M1.loc_nm),
							S1T1.pr(S2T1.str_ln_cd),
							S1T1.pr(S2M4.str_ln_nm),
							S1T1.pr(S2M1.site_cd),
							S1T1.pr(S2M18.site_nm),
							S1T1.pr(S2M1.lg_grp_cd),
							S1T1.pr(S2M19.lg_grp_nm),
							S1T1.pr(S2M1.alloc_grp_cd),
							S1T1.pr(S2M20.alloc_grp_nm),
							S1T1.pr(S2M1.loc_grp_cd),
							S1T1.pr(S2M21.loc_grp_nm),
							S1T1.pr(S2T1.stk_arrv_bp_cd),
							S1T1.pr("stk_arrv_bp_nm"),
							S1T1.pr(S2T1.itm_cd),
							S1T1.pr(S2T1.itm_sub1),
							S1T1.pr(S2T1.itm_sub2),
							S1T1.pr(S2T1.itm_sub3),
							S1T1.pr(S2T3.ver_no),
							S1T1.pr(S2T1.lot_no),
							S1T1.pr(S2T1.sublot_no),
							S1T1.pr(S2T1.sno1),
							S1T1.pr(S2T1.sno2),
							S1T1.pr(S2T1.sno3),
							S1T1.pr(S2T1.sno4),
							S1T1.pr(S2T1.fix_no_typ),
							S1T1.pr(S2T1.fix_no),
							S1T1.pr(S2T2.wrk_no),
							S1T1.pr(S2M16.wrk_nm),
							S1T1.pr(S2T1.pack_unit_cd),
							S1T1.pr("pack_unit_nm"),
							S1T1.pr("pack_unit_dec_place"),
							S1T1.pr("pack_unit_rnd_typ"),
							S1T1.pr(S2T1.gd_cd),
							S1T1.pr(S2M13.gd_nm),
							S1T1.pr(S2T1.in_xfr_typ),
							S1T1.pr(S2T1.quality_typ),
							S1T1.pr(S2T1.asst_typ),
							S1T1.pr(S2T1.stk_insp_typ),
							S1T1.pr(S2T1.stk_id_typ),
							S1T1.pr(S2T1.stk_bp_cd),
							S1T1.pr("stk_bp_nm"),
							S1T1.pr(S2T1.base_unit_qty),
							S1T1.pr(S2T1.pack_unit_qty)
						)
						.from(
							subQuery()
							.select(
								S2T1.ac_ym,
								S2M0.wg_cd,
								S2M2.wg_nm,
								S2T1.loc_cd,
								S2M1.loc_nm,
								S2T1.str_ln_cd,
								S2M4.str_ln_nm,
								S2M1.site_cd,
								S2M18.site_nm,
								S2M1.lg_grp_cd,
								S2M19.lg_grp_nm,
								S2M1.alloc_grp_cd,
								S2M20.alloc_grp_nm,
								S2M1.loc_grp_cd,
								S2M21.loc_grp_nm,
								S2T1.stk_arrv_bp_cd,
								S2M5.bp_nm.as("stk_arrv_bp_nm"),
								S2T1.itm_cd,
								S2T1.itm_sub1,
								S2T1.itm_sub2,
								S2T1.itm_sub3,
								S2T3.ver_no,
								S2T1.lot_no,
								S2T1.sublot_no,
								S2T1.sno1,
								S2T1.sno2,
								S2T1.sno3,
								S2T1.sno4,
								S2T1.fix_no_typ,
								S2T1.fix_no,
								S2T2.wrk_no,
								S2M16.wrk_nm,
								S2T1.pack_unit_cd,
								S2M12.unit_nm.as("pack_unit_nm"),
								S2M11.dec_place.as("pack_unit_dec_place"),
								S2M11.rnd_typ.as("pack_unit_rnd_typ"),
								S2T1.gd_cd,
								S2M13.gd_nm,
								S2T1.in_xfr_typ,
								S2T1.quality_typ,
								S2T1.asst_typ,
								S2T1.stk_insp_typ,
								S2T1.stk_id_typ,
								S2T1.stk_bp_cd,
								S2M14.bp_nm.as("stk_bp_nm"),
								S2T1.base_unit_qty,
								S2T1.pack_unit_qty,
								max(S2T1.ac_ym)
									.over()
									.partitionBy(
										S2T1.itm_cd,
										S2T1.itm_sub1,
										S2T1.itm_sub2,
										S2T1.itm_sub3,
										S2T1.loc_cd,
										S2T1.str_ln_cd,
										S2T1.stk_arrv_bp_cd,
										S2T1.lot_no,
										S2T1.sublot_no,
										S2T1.sno1,
										S2T1.sno2,
										S2T1.sno3,
										S2T1.sno4,
										S2T1.fix_no_typ,
										S2T1.fix_no,
										S2T1.pack_unit_cd,
										S2T1.gd_cd,
										S2T1.in_xfr_typ,
										S2T1.quality_typ,
										S2T1.asst_typ,
										S2T1.stk_insp_typ,
										S2T1.stk_id_typ,
										S2T1.stk_bp_cd
									).as("max_ac_ym")
							)
							.from(
								S2T1
								.innerJoin(S2M0).on(S2M0.loc_cd.eq(S2T1.loc_cd))
								.leftOuterJoin(S2T2).on(S2T1.sno1.eq(S2T2.sno1))
								.leftOuterJoin(S2T3).on(
									bracket(
										S2T1.itm_cd.eq(S2T3.itm_cd)
										.and(S2T1.itm_sub1.eq(S2T3.itm_sub1))
										.and(S2T1.itm_sub2.eq(S2T3.itm_sub2))
										.and(S2T1.itm_sub3.eq(S2T3.itm_sub3))
										.and(S2T1.lot_no.eq(S2T3.lot_no))
										.and(S2T1.sublot_no.eq(S2T3.sublot_no))
									)
								)
								.leftOuterJoin(S2M1).on(S2M1.loc_cd.eq(S2T1.loc_cd))
								.leftOuterJoin(S2M2).on(S2M2.wg_cd.eq(S2M0.wg_cd))
								.leftOuterJoin(S2M4).on(
									bracket(
										S2T1.loc_cd.eq(S2M4.loc_cd)
										.and(S2T1.str_ln_cd.eq(S2M4.str_ln_cd))
									)
								)
								.leftOuterJoin(S2M5).on(S2T1.stk_arrv_bp_cd.eq(S2M5.bp_cd))
								.leftOuterJoin(S2M11).on(
									bracket(
										S2T1.itm_cd.eq(S2M11.itm_cd)
										.and(S2T1.itm_sub1.eq(S2M11.itm_sub1))
										.and(S2T1.itm_sub2.eq(S2M11.itm_sub2))
										.and(S2T1.itm_sub3.eq(S2M11.itm_sub3))
										.and(S2T1.pack_unit_cd.eq(S2M11.unit_cd))
									)
								)
								.leftOuterJoin(S2M12).on(S2T1.pack_unit_cd.eq(S2M12.unit_cd))
								.leftOuterJoin(S2M13).on(S2T1.gd_cd.eq(S2M13.gd_cd))
								.leftOuterJoin(S2M14).on(S2T1.stk_bp_cd.eq(S2M14.bp_cd))
								.leftOuterJoin(S2M16).on(S2T2.wrk_no.eq(S2M16.wrk_no))
								.leftOuterJoin(S2M18).on(
									bracket(
										S2M18.site_cd.eq(S2M1.site_cd)
									)
								)
								.leftOuterJoin(S2M19).on(
									bracket(
										S2M19.lg_grp_cd.eq(S2M1.lg_grp_cd)
									)
								)
								.leftOuterJoin(S2M20).on(
									bracket(
										S2M20.alloc_grp_cd.eq(S2M1.alloc_grp_cd)
									)
								)
								.leftOuterJoin(S2M21).on(
									bracket(
										S2M21.loc_grp_cd.eq(S2M1.loc_grp_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S2T1.ac_ym.gte(bind("last_ac_ym")))
								.and(S2T1.ac_ym.lt(bind("mly_io_cl_ym_fr")))
								.and(S2T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
								.cutoff$and(S2T1.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2T1.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
								.cutoff$and(S2T1.lot_no.like(bind("lot_no")))
								.cutoff$and(S2T1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2T1.sno1.like(bind("sno1")))
								.cutoff$and(S2T1.sno2.like(bind("sno2")))
								.cutoff$and(S2T1.sno3.like(bind("sno3")))
								.cutoff$and(S2T1.sno4.like(bind("sno4")))
								.cutoff$and(S2T1.fix_no_typ.like(bind("fix_no_typ")))
								.cutoff$and(S2T1.fix_no.like(bind("fix_no")))
								.cutoff$and(S2T1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S2T1.in_xfr_typ.like(bind("in_xfr_typ")))
								.cutoff$and(S2T1.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S2T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S2T1.stk_insp_typ.like(bind("stk_insp_typ")))
								.cutoff$and(S2T1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S2T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S2T1.pack_unit_cd.like(bind("pack_unit_cd")))
								.cutoff$and(S2T1.sub_char1.like(bind("sub_char1")))
								.cutoff$and(S2T1.sub_char2.like(bind("sub_char2")))
								.cutoff$and(S2T1.sub_char3.like(bind("sub_char3")))
								.cutoff$and(S2M0.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2M2.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2M1.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S2M4.str_ln_nm.like(bind("str_ln_nm")))
								.cutoff$and(S2M1.site_cd.like(bind("site_cd")))
								.cutoff$and(S2M18.site_nm.like(bind("site_nm")))
								.cutoff$and(S2M1.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S2M19.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S2M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S2M20.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S2M1.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S2M21.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(S2T3.ver_no.like(bind("ver_no")))
								.cutoff$and(S2M5.bp_nm.like(bind("stk_arrv_bp_nm")))
								.cutoff$and(S2M14.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S2T2.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S2M16.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S2M13.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S2M12.unit_nm.like(bind("pack_unit_nm")))
								.cutoff$and(
									S2T1.in_xfr_typ.neq(value(MSC_IN_XFR_TYP.IN_XFR.value()))
									.and(
										S2T1.stk_id_typ.notIn(
											value(MSC_STK_ID_TYP.RNT_RCV.value()),
											value(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value()),
											value(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value()),
											value(MSC_STK_ID_TYP.SLF_SUPPRT.value()),
											value(MSC_STK_ID_TYP.CSTSTK.value()),
											value(MSC_STK_ID_TYP.ACCPT_DFCT.value())
										)
									)
									.and(
										not(
											S2T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value()))
											.and(
												(
													MAC_STR$IS_NULL_VAL(S2T1.fix_no).eq(value(false))
													.and(
														S2M0.sppl_cd.isNull()
														.or(S2T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.COSTK.value())))
													)
												)
												.or(
													MAC_STR$IS_NULL_VAL(S2T1.fix_no).eq(value(true))
													.and(
														S2M5.cnsgn_stktk_flg.eq(value(false))
														.and(S2M0.sppl_cd.isNull())
													)
												)
											)
										)
									)
									.and(bind("only_enable_true").isNotNull())
								)
							).view(S1T1)
						)
						.where(
							value(0).eq(value(0))
							.and(S1T1.pr(S2T1.ac_ym).eq(S1T1.pr("max_ac_ym")))
						)
						.unionAll(
							subQuery()
							.select(
								S3T1.ac_ym.as("mly_io_cl_ym"),
								S3T1.io_act_typ,
								S3M0.wg_cd,
								S3M2.wg_nm,
								MAPA_LOC$F_GET_ASST_DPT_CD(
									S3T1.loc_cd,
									S3T1.ac_ym
								).as("dpt_cd"),
								S3T1.loc_cd,
								S3M1.loc_nm,
								S3T1.str_ln_cd,
								S3M4.str_ln_nm,
								S3M1.site_cd,
								S3M18.site_nm,
								S3M1.lg_grp_cd,
								S3M19.lg_grp_nm,
								S3M1.alloc_grp_cd,
								S3M20.alloc_grp_nm,
								S3M1.loc_grp_cd,
								S3M21.loc_grp_nm,
								S3T1.stk_arrv_bp_cd,
								S3M5.bp_nm.as("stk_arrv_bp_nm"),
								S3T1.itm_cd,
								S3T1.itm_sub1,
								S3T1.itm_sub2,
								S3T1.itm_sub3,
								S3T3.ver_no,
								S3T1.lot_no,
								S3T1.sublot_no,
								S3T1.sno1,
								S3T1.sno2,
								S3T1.sno3,
								S3T1.sno4,
								S3T1.fix_no_typ,
								S3T1.fix_no,
								S3T2.wrk_no,
								S3M16.wrk_nm,
								S3T1.pack_unit_cd,
								S3M12.unit_nm.as("pack_unit_nm"),
								S3M11.dec_place.as("pack_unit_dec_place"),
								S3M11.rnd_typ.as("pack_unit_rnd_typ"),
								S3T1.gd_cd,
								S3M13.gd_nm,
								S3T1.in_xfr_typ,
								S3T1.quality_typ,
								S3T1.asst_typ,
								S3T1.stk_insp_typ,
								S3T1.stk_id_typ,
								S3T1.stk_bp_cd,
								S3M14.bp_nm.as("stk_bp_nm"),
								S3T1.base_unit_qty,
								S3T1.pack_unit_qty
							)
							.from(
								S3T1
								.innerJoin(S3M0).on(S3M0.loc_cd.eq(S3T1.loc_cd))
								.leftOuterJoin(S3T2).on(S3T1.sno1.eq(S3T2.sno1))
								.leftOuterJoin(S3T3).on(
									bracket(
										S3T1.itm_cd.eq(S3T3.itm_cd)
										.and(S3T1.itm_sub1.eq(S3T3.itm_sub1))
										.and(S3T1.itm_sub2.eq(S3T3.itm_sub2))
										.and(S3T1.itm_sub3.eq(S3T3.itm_sub3))
										.and(S3T1.lot_no.eq(S3T3.lot_no))
										.and(S3T1.sublot_no.eq(S3T3.sublot_no))
									)
								)
								.leftOuterJoin(S3M1).on(S3M1.loc_cd.eq(S3T1.loc_cd))
								.leftOuterJoin(S3M2).on(S3M2.wg_cd.eq(S3M0.wg_cd))
								.leftOuterJoin(S3M4).on(
									bracket(
										S3T1.loc_cd.eq(S3M4.loc_cd)
										.and(S3T1.str_ln_cd.eq(S3M4.str_ln_cd))
									)
								)
								.leftOuterJoin(S3M5).on(S3T1.stk_arrv_bp_cd.eq(S3M5.bp_cd))
								.leftOuterJoin(S3M11).on(
									bracket(
										S3T1.itm_cd.eq(S3M11.itm_cd)
										.and(S3T1.itm_sub1.eq(S3M11.itm_sub1))
										.and(S3T1.itm_sub2.eq(S3M11.itm_sub2))
										.and(S3T1.itm_sub3.eq(S3M11.itm_sub3))
										.and(S3T1.pack_unit_cd.eq(S3M11.unit_cd))
									)
								)
								.leftOuterJoin(S3M12).on(S3T1.pack_unit_cd.eq(S3M12.unit_cd))
								.leftOuterJoin(S3M13).on(S3T1.gd_cd.eq(S3M13.gd_cd))
								.leftOuterJoin(S3M14).on(S3T1.stk_bp_cd.eq(S3M14.bp_cd))
								.leftOuterJoin(S3M16).on(S3T2.wrk_no.eq(S3M16.wrk_no))
								.leftOuterJoin(S3M18).on(
									bracket(
										S3M18.site_cd.eq(S3M1.site_cd)
									)
								)
								.leftOuterJoin(S3M19).on(
									bracket(
										S3M19.lg_grp_cd.eq(S3M1.lg_grp_cd)
									)
								)
								.leftOuterJoin(S3M20).on(
									bracket(
										S3M20.alloc_grp_cd.eq(S3M1.alloc_grp_cd)
									)
								)
								.leftOuterJoin(S3M21).on(
									bracket(
										S3M21.loc_grp_cd.eq(S3M1.loc_grp_cd)
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S3T1.ac_ym.gte(bind("mly_io_cl_ym_fr")))
								.and(S3T1.ac_ym.lte(bind("mly_io_cl_ym_to")))
								.cutoff$and(S3T1.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S3T1.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S3T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S3T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S3T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S3T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S3T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
								.cutoff$and(S3T1.lot_no.like(bind("lot_no")))
								.cutoff$and(S3T1.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S3T1.sno1.like(bind("sno1")))
								.cutoff$and(S3T1.sno2.like(bind("sno2")))
								.cutoff$and(S3T1.sno3.like(bind("sno3")))
								.cutoff$and(S3T1.sno4.like(bind("sno4")))
								.cutoff$and(S3T1.fix_no_typ.like(bind("fix_no_typ")))
								.cutoff$and(S3T1.fix_no.like(bind("fix_no")))
								.cutoff$and(S3T1.gd_cd.like(bind("gd_cd")))
								.cutoff$and(S3T1.in_xfr_typ.like(bind("in_xfr_typ")))
								.cutoff$and(S3T1.quality_typ.like(bind("quality_typ")))
								.cutoff$and(S3T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S3T1.stk_insp_typ.like(bind("stk_insp_typ")))
								.cutoff$and(S3T1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S3T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S3T1.pack_unit_cd.like(bind("pack_unit_cd")))
								.cutoff$and(S3T1.sub_char1.like(bind("sub_char1")))
								.cutoff$and(S3T1.sub_char2.like(bind("sub_char2")))
								.cutoff$and(S3T1.sub_char3.like(bind("sub_char3")))
								.cutoff$and(S3M0.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S3M2.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S3M1.loc_nm.like(bind("loc_nm")))
								.cutoff$and(S3M4.str_ln_nm.like(bind("str_ln_nm")))
								.cutoff$and(S3M1.site_cd.like(bind("site_cd")))
								.cutoff$and(S3M18.site_nm.like(bind("site_nm")))
								.cutoff$and(S3M1.lg_grp_cd.like(bind("lg_grp_cd")))
								.cutoff$and(S3M19.lg_grp_nm.like(bind("lg_grp_nm")))
								.cutoff$and(S3M1.alloc_grp_cd.like(bind("alloc_grp_cd")))
								.cutoff$and(S3M20.alloc_grp_nm.like(bind("alloc_grp_nm")))
								.cutoff$and(S3M1.loc_grp_cd.like(bind("loc_grp_cd")))
								.cutoff$and(S3M21.loc_grp_nm.like(bind("loc_grp_nm")))
								.cutoff$and(S3T3.ver_no.like(bind("ver_no")))
								.cutoff$and(S3M5.bp_nm.like(bind("stk_arrv_bp_nm")))
								.cutoff$and(S3M14.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S3T2.wrk_no.like(bind("wrk_no")))
								.cutoff$and(S3M16.wrk_nm.like(bind("wrk_nm")))
								.cutoff$and(S3M13.gd_nm.like(bind("gd_nm")))
								.cutoff$and(S3M12.unit_nm.like(bind("pack_unit_nm")))
								.cutoff$and(
									S3T1.in_xfr_typ.neq(value(MSC_IN_XFR_TYP.IN_XFR.value()))
									.and(
										S3T1.stk_id_typ.notIn(
											value(MSC_STK_ID_TYP.RNT_RCV.value()),
											value(MSC_STK_ID_TYP.RTN_PRE_ACCPT.value()),
											value(MSC_STK_ID_TYP.PURC_PRE_ACCPT.value()),
											value(MSC_STK_ID_TYP.SLF_SUPPRT.value()),
											value(MSC_STK_ID_TYP.CSTSTK.value()),
											value(MSC_STK_ID_TYP.ACCPT_DFCT.value())
										)
									)
									.and(
										not(
											S3T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value()))
											.and(
												(
													MAC_STR$IS_NULL_VAL(S3T1.fix_no).eq(value(false))
													.and(
														S2M0.sppl_cd.isNull()
														.or(S3T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.COSTK.value())))
													)
												)
												.or(
													MAC_STR$IS_NULL_VAL(S3T1.fix_no).eq(value(true))
													.and(
														S3M5.cnsgn_stktk_flg.eq(value(false))
														.and(S3M0.sppl_cd.isNull())
													)
												)
											)
										)
									)
									.and(bind("only_enable_true").isNotNull())
								)
							)
						).view(S0T1)
						.leftOuterJoin(S0M6).on(
							bracket(
								S0T1.pr(S2T1.itm_cd).eq(S0M6.itm_cd)
								.and(S0T1.pr(S2T1.itm_sub1).eq(S0M6.itm_sub1))
								.and(S0T1.pr(S2T1.itm_sub2).eq(S0M6.itm_sub2))
								.and(S0T1.pr(S2T1.itm_sub3).eq(S0M6.itm_sub3))
							)
						)
						.leftOuterJoin(S0M17).on(
							bracket(
								S0T1.pr("dpt_cd").eq(S0M17.dpt_cd)
								.and(S0T1.pr("mly_io_cl_ym").between(S0M17.st_dt, S0M17.end_dt))
							)
						)
						.leftOuterJoin(S0M22).on(
							bracket(
								S0T1.pr(S2T1.itm_cd).eq(S0M22.itm_cd)
								.and(S0T1.pr(S2T1.itm_sub1).eq(S0M22.itm_sub1))
								.and(S0T1.pr(S2T1.itm_sub2).eq(S0M22.itm_sub2))
								.and(S0T1.pr(S2T1.itm_sub3).eq(S0M22.itm_sub3))
								.and(S0T1.pr(S2T1.sno1).eq(S0M22.sno1))
								.and(S0T1.pr(S2T1.sno2).eq(S0M22.sno2))
								.and(S0T1.pr(S2T1.sno3).eq(S0M22.sno3))
								.and(S0T1.pr(S2T1.sno4).eq(S0M22.sno4))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.addDynamicPredicate()
						.cutoff$and(
							coalesce(
								S0M22.itm_nm,
								S0M6.itm_nm
							).like(bind("itm_nm"))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
				.orderBy(addDynamicOrderBy(ORDERBY))
			)
			.setDynamicSQLInfo(
					when(boundOr("itm_typ_d_nm"))
						.view(v -> v.leftOuterJoin(S0M15).on(bracket(S0M6.itm_typ.eq(S0M15.itm_typ).and(S0M6.itm_typ_d_cd.eq(S0M15.itm_typ_d_cd)))))
						.predicate(p -> p.cutoff$and(S0M15.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
					when(boundOr("itm_grp_flg1"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd1.as("itm_grp_cd1"), S0MM1.itm_grp_nm.as("itm_grp_nm1"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM1).on(S0M6.itm_grp_cd1.eq(S0MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0MM1.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
					when(boundOr("itm_grp_flg2"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd2.as("itm_grp_cd2"), S0MM2.itm_grp_nm.as("itm_grp_nm2"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM2).on(S0M6.itm_grp_cd2.eq(S0MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0MM2.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
					when(boundOr("itm_grp_flg3"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd3.as("itm_grp_cd3"), S0MM3.itm_grp_nm.as("itm_grp_nm3"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM3).on(S0M6.itm_grp_cd3.eq(S0MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0MM3.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
					when(boundOr("itm_grp_flg4"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd4.as("itm_grp_cd4"), S0MM4.itm_grp_nm.as("itm_grp_nm4"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM4).on(S0M6.itm_grp_cd4.eq(S0MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0MM4.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
					when(boundOr("itm_grp_flg5"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd5.as("itm_grp_cd5"), S0MM5.itm_grp_nm.as("itm_grp_nm5"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM5).on(S0M6.itm_grp_cd5.eq(S0MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0MM5.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
					when(boundOr("itm_grp_flg6"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd6.as("itm_grp_cd6"), S0MM6.itm_grp_nm.as("itm_grp_nm6"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM6).on(S0M6.itm_grp_cd6.eq(S0MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0MM6.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
					when(boundOr("itm_grp_flg7"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd7.as("itm_grp_cd7"), S0MM7.itm_grp_nm.as("itm_grp_nm7"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM7).on(S0M6.itm_grp_cd7.eq(S0MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0MM7.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
					when(boundOr("itm_grp_flg8"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd8.as("itm_grp_cd8"), S0MM8.itm_grp_nm.as("itm_grp_nm8"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM8).on(S0M6.itm_grp_cd8.eq(S0MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0MM8.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
					when(boundOr("itm_grp_flg9"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd9.as("itm_grp_cd9"), S0MM9.itm_grp_nm.as("itm_grp_nm9"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM9).on(S0M6.itm_grp_cd9.eq(S0MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0MM9.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
					when(boundOr("itm_grp_flg10"))
						.select(DS0C_ITM_GRP, S0M6.itm_grp_cd10.as("itm_grp_cd10"), S0MM10.itm_grp_nm.as("itm_grp_nm10"))
						.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0MM10).on(S0M6.itm_grp_cd10.eq(S0MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0MM10.itm_grp_typ))))
						.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
					})
				)
			);
	}
}