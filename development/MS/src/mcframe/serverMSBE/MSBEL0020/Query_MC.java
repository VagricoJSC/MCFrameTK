package mcframe.serverMSBE.MSBEL0020;

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
	 * -- MSBEL0020_MST_MLY_STK_DTL_Query_S01
	 */
	static MCQueryPlan MSBEL0020_MST_MLY_STK_DTL_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_UNIT_R S0_M10 = MAM_UNIT_R.create("M10");
		MAM_ITM_TYP_D_R S0_M15 = MAM_ITM_TYP_D_R.create("M15");
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
		MCTempView S1_T1 = createTempView("T1");
		MST_MLY_STK_DTL_R S2_T1 = MST_MLY_STK_DTL_R.create("T1");
		MAVM_RD_LOC_R S2_M0 = MAVM_RD_LOC_R.create("M0");
		MAM_WG_R S2_M2 = MAM_WG_R.create("M2");
		MAM_BP_R S2_M5 = MAM_BP_R.create("M5");
		MAM_ITM_R S2_M6 = MAM_ITM_R.create("M6");
		MAVM_BP_NM_R S2_M14 = MAVM_BP_NM_R.create("M14");
		MAM_ITM_TYP_D_R S2_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_SUNDRY_ITM_R S2_M22 = MAM_SUNDRY_ITM_R.create("M22");
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
		MST_MLY_STK_DTL_R S3_T1 = MST_MLY_STK_DTL_R.create("T1");
		MAVM_RD_LOC_R S3_M0 = MAVM_RD_LOC_R.create("M0");
		MAM_WG_R S3_M2 = MAM_WG_R.create("M2");
		MAM_BP_R S3_M5 = MAM_BP_R.create("M5");
		MAM_ITM_R S3_M6 = MAM_ITM_R.create("M6");
		MAVM_BP_NM_R S3_M14 = MAVM_BP_NM_R.create("M14");
		MAM_ITM_TYP_D_R S3_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_SUNDRY_ITM_R S3_M22 = MAM_SUNDRY_ITM_R.create("M22");
		MAM_ITM_GRP_R S3_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S3_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S3_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S3_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S3_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S3_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S3_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S3_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S3_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S3_MM10 = MAM_ITM_GRP_R.create("MM10");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS2C_ITM_GRP = createDynamicSQLID("DS2C_ITM_GRP");
		MCDynamicSQLID DS3C_ITM_GRP = createDynamicSQLID("DS3C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0020_MST_MLY_STK_DTL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr("mly_io_cl_ym"),
						S0_T1.pr("io_act_typ"),
						S0_T1.pr(S2_M0.wg_cd),
						S0_T1.pr(S2_M2.wg_nm),
						S0_T1.pr(S2_T1.itm_cd),
						S0_T1.pr(S2_T1.itm_sub1),
						S0_T1.pr(S2_T1.itm_sub2),
						S0_T1.pr(S2_T1.itm_sub3),
						S0_T1.pr("itm_nm"),
						S0_T1.pr(S2_T1.asst_typ),
						S0_T1.pr(S2_T1.stk_id_typ),
						S0_T1.pr(S2_T1.stk_bp_cd),
						S0_T1.pr("stk_bp_nm"),
						S0_T1.pr(S2_T1.stk_arrv_bp_cd),
						S0_T1.pr("stk_arrv_bp_nm"),
						S0_M6.unit_cd.as("base_unit_cd"),
						S0_M10.unit_nm.as("base_unit_nm"),
						S0_M6.dec_place.as("base_unit_dec_place"),
						S0_M6.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.pr("base_unit_qty"),
						S0_M6.itm_typ,
						S0_M6.itm_typ_d_cd,
						S0_M15.itm_typ_d_nm,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						subQuery()
						.select(
							bind("mly_io_cl_ym_fr").as("mly_io_cl_ym"),
							value(MSC_IO_ACT_TYP.INI_STK.value()).as("io_act_typ"),
							S1_T1.pr(S2_T1.itm_cd),
							S1_T1.pr(S2_T1.itm_sub1),
							S1_T1.pr(S2_T1.itm_sub2),
							S1_T1.pr(S2_T1.itm_sub3),
							S1_T1.pr("itm_nm"),
							S1_T1.pr(S2_T1.asst_typ),
							S1_T1.pr(S2_T1.stk_id_typ),
							S1_T1.pr(S2_T1.stk_bp_cd),
							S1_T1.pr(S2_T1.stk_arrv_bp_cd),
							sum(S1_T1.pr(S2_T1.base_unit_qty)).as("base_unit_qty"),
							S1_T1.pr(S2_M0.wg_cd),
							S1_T1.pr(S2_M2.wg_nm),
							S1_T1.pr("stk_arrv_bp_nm"),
							S1_T1.pr("stk_bp_nm")
						)
						.from(
							subQuery()
							.select(
								S2_T1.ac_ym,
								S2_T1.io_act_typ,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								coalesce(
									S2_M22.itm_nm,
									S2_M6.itm_nm
								).as("itm_nm"),
								S2_T1.asst_typ,
								S2_T1.stk_id_typ,
								S2_T1.stk_bp_cd,
								S2_M14.bp_nm.as("stk_bp_nm"),
								S2_T1.stk_arrv_bp_cd,
								S2_M5.bp_nm.as("stk_arrv_bp_nm"),
								S2_T1.base_unit_qty,
								S2_M0.wg_cd,
								S2_M2.wg_nm,
								S2_T1.in_xfr_typ,
								S2_T1.fix_no,
								max(S2_T1.ac_ym)
									.over()
									.partitionBy(
										S2_T1.itm_cd,
										S2_T1.itm_sub1,
										S2_T1.itm_sub2,
										S2_T1.itm_sub3,
										S2_T1.loc_cd,
										S2_T1.str_ln_cd,
										S2_T1.stk_arrv_bp_cd,
										S2_T1.lot_no,
										S2_T1.sublot_no,
										S2_T1.sno1,
										S2_T1.sno2,
										S2_T1.sno3,
										S2_T1.sno4,
										S2_T1.fix_no_typ,
										S2_T1.fix_no,
										S2_T1.pack_unit_cd,
										S2_T1.gd_cd,
										S2_T1.in_xfr_typ,
										S2_T1.quality_typ,
										S2_T1.asst_typ,
										S2_T1.stk_insp_typ,
										S2_T1.stk_id_typ,
										S2_T1.stk_bp_cd
									).as("max_ac_ym")
							)
							.from(
								S2_T1
								.innerJoin(S2_M0).on(S2_M0.loc_cd.eq(S2_T1.loc_cd))
								.leftOuterJoin(S2_M2).on(S2_M2.wg_cd.eq(S2_M0.wg_cd))
								.leftOuterJoin(S2_M5).on(S2_T1.stk_arrv_bp_cd.eq(S2_M5.bp_cd))
								.leftOuterJoin(S2_M6).on(
									bracket(
										S2_T1.itm_cd.eq(S2_M6.itm_cd)
										.and(S2_T1.itm_sub1.eq(S2_M6.itm_sub1))
										.and(S2_T1.itm_sub2.eq(S2_M6.itm_sub2))
										.and(S2_T1.itm_sub3.eq(S2_M6.itm_sub3))
									)
								)
								.leftOuterJoin(S2_M14).on(S2_T1.stk_bp_cd.eq(S2_M14.bp_cd))
								.leftOuterJoin(S2_M15).on(
									bracket(
										S2_M6.itm_typ.eq(S2_M15.itm_typ)
										.and(S2_M6.itm_typ_d_cd.eq(S2_M15.itm_typ_d_cd))
									)
								)
								.leftOuterJoin(S2_M22).on(
									bracket(
										S2_T1.itm_cd.eq(S2_M22.itm_cd)
										.and(S2_T1.itm_sub1.eq(S2_M22.itm_sub1))
										.and(S2_T1.itm_sub2.eq(S2_M22.itm_sub2))
										.and(S2_T1.itm_sub3.eq(S2_M22.itm_sub3))
										.and(S2_T1.sno1.eq(S2_M22.sno1))
										.and(S2_T1.sno2.eq(S2_M22.sno2))
										.and(S2_T1.sno3.eq(S2_M22.sno3))
										.and(S2_T1.sno4.eq(S2_M22.sno4))
									)
								)
								.addDynamicView(DS2C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T1.ac_ym.gte(bind("last_ac_ym")))
								.and(S2_T1.ac_ym.lt(bind("mly_io_cl_ym_fr")))
								.and(S2_T1.io_act_typ.eq(value(MSC_IO_ACT_TYP.END_STK.value())))
								.cutoff$and(S2_T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S2_T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
								.cutoff$and(S2_T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S2_T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S2_T1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S2_T1.sub_char1.like(bind("sub_char1")))
								.cutoff$and(S2_T1.sub_char2.like(bind("sub_char2")))
								.cutoff$and(S2_T1.sub_char3.like(bind("sub_char3")))
								.cutoff$and(S2_M0.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_M2.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_M5.bp_nm.like(bind("stk_arrv_bp_nm")))
								.cutoff$and(S2_M6.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_M14.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S2_M15.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(
									coalesce(
										S2_M22.itm_nm,
										S2_M6.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(
									S2_T1.in_xfr_typ.neq(value(MSC_IN_XFR_TYP.IN_XFR.value()))
									.and(
										S2_T1.stk_id_typ.notIn(
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
											S2_T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value()))
											.and(
												(
													MAC_STR$IS_NULL_VAL(S2_T1.fix_no).eq(value(false))
													.and(
														S2_M0.sppl_cd.isNull()
														.or(S2_T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.COSTK.value())))
													)
												)
												.or(
													MAC_STR$IS_NULL_VAL(S2_T1.fix_no).eq(value(true))
													.and(
														S2_M5.cnsgn_stktk_flg.eq(value(false))
														.and(S2_M0.sppl_cd.isNull())
													)
												)
											)
										)
									)
									.and(bind("only_enable_true").isNotNull())
								)
								.addDynamicPredicate(DS2C_ITM_GRP)
							).view(S1_T1)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T1.pr(S2_T1.ac_ym).eq(S1_T1.pr("max_ac_ym")))
						)
						.groupBy(
							S1_T1.pr(S2_M0.wg_cd),
							S1_T1.pr(S2_M2.wg_nm),
							S1_T1.pr(S2_T1.itm_cd),
							S1_T1.pr(S2_T1.itm_sub1),
							S1_T1.pr(S2_T1.itm_sub2),
							S1_T1.pr(S2_T1.itm_sub3),
							S1_T1.pr("itm_nm"),
							S1_T1.pr(S2_T1.asst_typ),
							S1_T1.pr(S2_T1.stk_id_typ),
							S1_T1.pr(S2_T1.stk_bp_cd),
							S1_T1.pr("stk_bp_nm"),
							S1_T1.pr(S2_T1.stk_arrv_bp_cd),
							S1_T1.pr("stk_arrv_bp_nm"),
							S1_T1.pr(S2_T1.io_act_typ)
						)
						.unionAll(
							subQuery()
							.select(
								S3_T1.ac_ym.as("mly_io_cl_ym"),
								S3_T1.io_act_typ,
								S3_T1.itm_cd,
								S3_T1.itm_sub1,
								S3_T1.itm_sub2,
								S3_T1.itm_sub3,
								coalesce(
									S3_M22.itm_nm,
									S3_M6.itm_nm
								).as("itm_nm"),
								S3_T1.asst_typ,
								S3_T1.stk_id_typ,
								S3_T1.stk_bp_cd,
								S3_T1.stk_arrv_bp_cd,
								sum(S3_T1.base_unit_qty).as("base_unit_qty"),
								S3_M0.wg_cd,
								S3_M2.wg_nm,
								S3_M5.bp_nm.as("stk_arrv_bp_nm"),
								S3_M14.bp_nm.as("stk_bp_nm")
							)
							.from(
								S3_T1
								.innerJoin(S3_M0).on(S3_M0.loc_cd.eq(S3_T1.loc_cd))
								.leftOuterJoin(S3_M2).on(S3_M2.wg_cd.eq(S3_M0.wg_cd))
								.leftOuterJoin(S3_M5).on(S3_T1.stk_arrv_bp_cd.eq(S3_M5.bp_cd))
								.leftOuterJoin(S3_M6).on(
									bracket(
										S3_T1.itm_cd.eq(S3_M6.itm_cd)
										.and(S3_T1.itm_sub1.eq(S3_M6.itm_sub1))
										.and(S3_T1.itm_sub2.eq(S3_M6.itm_sub2))
										.and(S3_T1.itm_sub3.eq(S3_M6.itm_sub3))
									)
								)
								.leftOuterJoin(S3_M14).on(S3_T1.stk_bp_cd.eq(S3_M14.bp_cd))
								.leftOuterJoin(S3_M15).on(
									bracket(
										S3_M6.itm_typ.eq(S3_M15.itm_typ)
										.and(S3_M6.itm_typ_d_cd.eq(S3_M15.itm_typ_d_cd))
									)
								)
								.leftOuterJoin(S3_M22).on(
									bracket(
										S3_T1.itm_cd.eq(S3_M22.itm_cd)
										.and(S3_T1.itm_sub1.eq(S3_M22.itm_sub1))
										.and(S3_T1.itm_sub2.eq(S3_M22.itm_sub2))
										.and(S3_T1.itm_sub3.eq(S3_M22.itm_sub3))
										.and(S3_T1.sno1.eq(S3_M22.sno1))
										.and(S3_T1.sno2.eq(S3_M22.sno2))
										.and(S3_T1.sno3.eq(S3_M22.sno3))
										.and(S3_T1.sno4.eq(S3_M22.sno4))
									)
								)
								.addDynamicView(DS3C_ITM_GRP)
							)
							.where(
								value(0).eq(value(0))
								.and(S3_T1.ac_ym.gte(bind("mly_io_cl_ym_fr")))
								.and(S3_T1.ac_ym.lte(bind("mly_io_cl_ym_to")))
								.cutoff$and(S3_T1.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S3_T1.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S3_T1.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S3_T1.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(S3_T1.stk_arrv_bp_cd.like(bind("stk_arrv_bp_cd")))
								.cutoff$and(S3_T1.stk_bp_cd.like(bind("stk_bp_cd")))
								.cutoff$and(S3_T1.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S3_T1.stk_id_typ.like(bind("stk_id_typ")))
								.cutoff$and(S3_T1.sub_char1.like(bind("sub_char1")))
								.cutoff$and(S3_T1.sub_char2.like(bind("sub_char2")))
								.cutoff$and(S3_T1.sub_char3.like(bind("sub_char3")))
								.cutoff$and(S3_M0.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S3_M2.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S3_M5.bp_nm.like(bind("stk_arrv_bp_nm")))
								.cutoff$and(S3_M6.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S3_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S3_M14.bp_nm.like(bind("stk_bp_nm")))
								.cutoff$and(S3_M15.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(
									coalesce(
										S3_M22.itm_nm,
										S3_M6.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(
									S3_T1.in_xfr_typ.neq(value(MSC_IN_XFR_TYP.IN_XFR.value()))
									.and(
										S3_T1.stk_id_typ.notIn(
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
											S3_T1.stk_arrv_bp_cd.neq(value(MAC_STR.NULL_VAL.value()))
											.and(
												(
													MAC_STR$IS_NULL_VAL(S3_T1.fix_no).eq(value(false))
													.and(
														S2_M0.sppl_cd.isNull()
														.or(S3_T1.stk_id_typ.neq(value(MSC_STK_ID_TYP.COSTK.value())))
													)
												)
												.or(
													MAC_STR$IS_NULL_VAL(S3_T1.fix_no).eq(value(true))
													.and(
														S3_M5.cnsgn_stktk_flg.eq(value(false))
														.and(S3_M0.sppl_cd.isNull())
													)
												)
											)
										)
									)
									.and(bind("only_enable_true").isNotNull())
								)
								.addDynamicPredicate(DS3C_ITM_GRP)
							)
							.groupBy(
								S3_M0.wg_cd,
								S3_M2.wg_nm,
								S3_T1.itm_cd,
								S3_T1.itm_sub1,
								S3_T1.itm_sub2,
								S3_T1.itm_sub3,
								coalesce(
									S3_M22.itm_nm,
									S3_M6.itm_nm
								),
								S3_T1.asst_typ,
								S3_T1.stk_id_typ,
								S3_T1.stk_bp_cd,
								S3_M14.bp_nm,
								S3_T1.stk_arrv_bp_cd,
								S3_M5.bp_nm,
								S3_T1.ac_ym,
								S3_T1.io_act_typ
							)
						).view(S0_T1)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.pr(S2_T1.itm_cd).eq(S0_M6.itm_cd)
								.and(S0_T1.pr(S2_T1.itm_sub1).eq(S0_M6.itm_sub1))
								.and(S0_T1.pr(S2_T1.itm_sub2).eq(S0_M6.itm_sub2))
								.and(S0_T1.pr(S2_T1.itm_sub3).eq(S0_M6.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(S0_M6.unit_cd.eq(S0_M10.unit_cd))
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M6.itm_typ.eq(S0_M15.itm_typ)
								.and(S0_M6.itm_typ_d_cd.eq(S0_M15.itm_typ_d_cd))
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T1.pr(S2_T1.itm_cd).asc(),
						S0_T1.pr(S2_T1.itm_sub1).asc(),
						S0_T1.pr(S2_T1.itm_sub2).asc(),
						S0_T1.pr(S2_T1.itm_sub3).asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M6.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ)))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M6.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ)))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M6.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ)))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M6.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ)))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M6.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ)))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M6.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ)))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M6.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ)))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M6.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ)))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M6.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ)))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M6.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M6.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ)))),
				when(boundOr("itm_grp_flg1"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM1).on(S2_M6.itm_grp_cd1.eq(S2_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2_MM1.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S2_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM2).on(S2_M6.itm_grp_cd2.eq(S2_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2_MM2.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S2_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM3).on(S2_M6.itm_grp_cd3.eq(S2_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2_MM3.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S2_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM4).on(S2_M6.itm_grp_cd4.eq(S2_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2_MM4.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S2_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM5).on(S2_M6.itm_grp_cd5.eq(S2_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2_MM5.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S2_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM6).on(S2_M6.itm_grp_cd6.eq(S2_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2_MM6.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S2_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM7).on(S2_M6.itm_grp_cd7.eq(S2_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2_MM7.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S2_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM8).on(S2_M6.itm_grp_cd8.eq(S2_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2_MM8.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S2_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM9).on(S2_M6.itm_grp_cd9.eq(S2_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2_MM9.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S2_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS2C_ITM_GRP, v -> v.leftOuterJoin(S2_MM10).on(S2_M6.itm_grp_cd10.eq(S2_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2_MM10.itm_grp_typ))))
					.predicate(DS2C_ITM_GRP, p -> p.cutoff$and(S2_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S2_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM1).on(S3_M6.itm_grp_cd1.eq(S3_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S3_MM1.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S3_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM2).on(S3_M6.itm_grp_cd2.eq(S3_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S3_MM2.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S3_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM3).on(S3_M6.itm_grp_cd3.eq(S3_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S3_MM3.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S3_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM4).on(S3_M6.itm_grp_cd4.eq(S3_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S3_MM4.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S3_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM5).on(S3_M6.itm_grp_cd5.eq(S3_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S3_MM5.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S3_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM6).on(S3_M6.itm_grp_cd6.eq(S3_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S3_MM6.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S3_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM7).on(S3_M6.itm_grp_cd7.eq(S3_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S3_MM7.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S3_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM8).on(S3_M6.itm_grp_cd8.eq(S3_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S3_MM8.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S3_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM9).on(S3_M6.itm_grp_cd9.eq(S3_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S3_MM9.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S3_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS3C_ITM_GRP, v -> v.leftOuterJoin(S3_MM10).on(S3_M6.itm_grp_cd10.eq(S3_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S3_MM10.itm_grp_typ))))
					.predicate(DS3C_ITM_GRP, p -> p.cutoff$and(S3_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S3_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			);
	}
}