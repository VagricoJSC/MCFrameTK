package mcframe.serverMSBE.MSBEL1760;

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
	 * -- MSBEL1760_MST_IV_Query_S01
	 */
	static MCQueryPlan MSBEL1760_MST_IV_S01() {
		MCTempView S0_V1 = createTempView("V1");
		MST_IV_R S1_T1 = MST_IV_R.create("T1");
		MST_IV_D_R S1_T2 = MST_IV_D_R.create("T2");
		MST_SHIP_PR_R S1_T3 = MST_SHIP_PR_R.create("T3");
		MST_SLO_R S1_T4 = MST_SLO_R.create("T4");
		MST_SLO_D_R S1_T6 = MST_SLO_D_R.create("T6");
		MAM_BP_R S1_M1 = MAM_BP_R.create("M1");
		MAM_LOC_R S1_M2 = MAM_LOC_R.create("M2");
		MAM_BP_R S1_M3 = MAM_BP_R.create("M3");
		MAM_BP_R S1_M4 = MAM_BP_R.create("M4");
		MAM_LOC_R S1_M5 = MAM_LOC_R.create("M5");
		MAM_CNTRY_R S1_M6 = MAM_CNTRY_R.create("M6");
		MAM_TRNSPT_R S1_M7 = MAM_TRNSPT_R.create("M7");
		MAM_EXIM_PORT_R S1_M8 = MAM_EXIM_PORT_R.create("M8");
		MAM_CUR_R S1_M10 = MAM_CUR_R.create("M10");
		MAM_ITM_R S1_M11 = MAM_ITM_R.create("M11");
		MAM_DPT_R S1_M100 = MAM_DPT_R.create("M100");
		MAM_LG_GRP_R S1_M101 = MAM_LG_GRP_R.create("M101");
		MST_XFR_SCHD_R S1_T5 = MST_XFR_SCHD_R.create("T5");
		MAM_ITM_LG_GRP_R S1_M102 = MAM_ITM_LG_GRP_R.create("M102");
		MAM_LOC_R S1_M103 = MAM_LOC_R.create("M103");
		MAM_BP_GRP_R S1_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S1_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S1_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S1_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S1_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S1_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S1_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S1_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S1_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S1_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S1_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S1_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S1_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S1_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S1_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S1_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S1_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S1_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S1_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S1_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_BP_R S2 = MAM_BP_R.create();
		MAM_BP_R S3 = MAM_BP_R.create();
		MAM_BP_R S4 = MAM_BP_R.create();
		MST_IV_SHIP_ACT_D_R S5_ACTD = MST_IV_SHIP_ACT_D_R.create("ACTD");
		MST_IV_SHIP_ACT_D_R S6_ACTD = MST_IV_SHIP_ACT_D_R.create("ACTD");
		MST_IV_D_R S7_IVD = MST_IV_D_R.create("IVD");
		
		MCDynamicSQLID DS1C_DLV_GRP = createDynamicSQLID("DS1C_DLV_GRP");
		MCDynamicSQLID DS1C_RQST_GRP = createDynamicSQLID("DS1C_RQST_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1760_MST_IV_Query_S01")
					.mainQuery()
					.select(S0_V1.prAll())
					.from(
						subQuery()
						.select(
							S1_T1.iv_mng_no,
							S1_T1.iv_no,
							S1_T1.cmpl_schd_dt,
							S1_T1.cmpl_dt,
							S1_T1.ac_dt,
							cases()
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())).and(S1_T6.sls_cststk_flg.eq(value(false))))
									.then(S1_T1.trd_schd_dt)
								.otherwise(nullValue()).as("sls_schd_dt"),
							cases()
								.when(S1_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())))
									.then(value((MCDate)null))
								.otherwise(S1_T1.trd_schd_dt).as("arr_schd_dt"),
							S1_T1.trd_ptn_typ,
							S1_T1.ship_rqst_id_typ,
							S1_T1.ship_rqst_id_cd,
							cases()
								.when(S1_T1.ship_rqst_id_typ.eq(value(MSC_SHIP_RQST_ID_TYP.LOC.value())))
									.then(S1_M2.loc_nm)
								.otherwise(S1_M1.bp_nm).as("ship_rqst_id_nm"),
							S1_T1.tdlv_cd,
							cases()
								.when(S1_T1.tdlv_sundry_flg.eq(value(false)))
									.then(S1_M3.bp_nm)
								.otherwise(S1_T1.tdlv_nm).as("tdlv_nm"),
							S1_T1.dlv_id_typ,
							S1_T1.dlv_id_cd,
							cases()
								.when(S1_T1.dlv_sundry_flg.eq(value(false)))
									.then(
										cases()
											.when(S1_T1.dlv_id_typ.eq(value(MSC_DLV_ID_TYP.DLV.value())))
												.then(S1_M4.bp_nm)
											.otherwise(S1_M5.loc_nm)
								)
								.otherwise(S1_T1.dlv_id_nm).as("dlv_id_nm"),
							S1_T1.dlv_cntry_cd,
							S1_M6.cntry_nm.as("dlv_cntry_nm"),
							S1_T1.trnspt_cd,
							S1_M7.trnspt_nm,
							S1_T1.vssl_flght,
							S1_T1.load_port_cd,
							S1_M8.port_nm.as("load_port_nm"),
							S1_T1.etd_dt,
							S1_T1.sls_basis_typ,
							S1_T1.bill_basis_dt,
							S1_T1.rcv_schd_dt,
							S1_T1.bl_no,
							S1_T1.bl_dt,
							S1_T1.bl_rmrks,
							S1_T1.sub_char1,
							S1_T1.sub_char2,
							S1_T1.sub_char3,
							bracket(
								subQuery()
								.select(S2.bill_cl_typ)
								.from(S2)
								.where(
									value(0).eq(value(0))
									.and(
										S2.bp_cd.eq(subQuery()
											.select(S3.bcst_cd)
											.from(S3)
											.where(
												value(0).eq(value(0))
												.and(
													S3.bp_cd.eq(subQuery()
														.select(S4.acst_cd)
														.from(S4)
														.where(
															value(0).eq(value(0))
															.and(S4.bp_cd.eq(S1_T1.ship_rqst_id_cd))
															.and(S4.cst_flg.eq(value(true)))
															.and(S4.acst_cd.isNotNull())
														)
													)
												)
												.and(S3.acst_flg.eq(value(true)))
												.and(S3.bcst_cd.isNotNull())
											)
										)
									)
								)
							).as("bill_cl_typ"),
							S1_T1.trd_cur_cd,
							S1_M10.cur_nm.as("trd_cur_nm"),
							S1_T2.iv_amt,
							S1_T2.trd_cur_amt,
							S1_M10.amt_dec_place.as("trd_cur_amt_dec_place"),
							S1_M11.dscnt_itm_flg,
							S1_M11.exim_xpns_typ,
							S1_T1.upd_cntr.as("iv_upd_cntr"),
							S1_T3.ship_pr_no,
							S1_T3.upd_cntr.as("ship_pr_upd_cntr"),
							S1_T6.sls_cststk_flg,
							S1_M100.wg_cd.as("sls_dpt_wg_cd"),
							S1_M101.wg_cd.as("lg_grp_wg_cd"),
							coalesce(
								S1_T5.gi_loc_cd,
								S1_M102.lg_def_loc_cd,
								S1_M103.loc_cd
							).as("chk_gi_loc_cd")
						)
						.from(
							S1_T1
							.innerJoin(S1_T2).on(
								bracket(
									S1_T1.iv_mng_no.eq(S1_T2.iv_mng_no)
								)
							)
							.leftOuterJoin(S1_T3).on(
								bracket(
									bracket(
										S1_T2.slo_d_no.isNotNull()
										.and(S1_T2.slo_d_no.eq(S1_T3.slo_d_no))
									)
									.or(
										S1_T2.xfr_schd_no.isNotNull()
										.and(S1_T2.xfr_schd_no.eq(S1_T3.xfr_schd_no))
									)
								)
							)
							.leftOuterJoin(S1_T4).on(
								bracket(
									S1_T2.slo_no.eq(S1_T4.slo_no)
								)
							)
							.leftOuterJoin(S1_T6).on(
								bracket(
									S1_T2.slo_d_no.eq(S1_T6.slo_d_no)
								)
							)
							.leftOuterJoin(S1_M1).on(
								bracket(
									S1_T1.ship_rqst_id_cd.eq(S1_M1.bp_cd)
								)
							)
							.leftOuterJoin(S1_M2).on(
								bracket(
									S1_T1.ship_rqst_id_cd.eq(S1_M2.loc_cd)
								)
							)
							.leftOuterJoin(S1_M3).on(
								bracket(
									S1_T1.tdlv_cd.eq(S1_M3.bp_cd)
								)
							)
							.leftOuterJoin(S1_M4).on(
								bracket(
									S1_T1.dlv_id_cd.eq(S1_M4.bp_cd)
								)
							)
							.leftOuterJoin(S1_M5).on(
								bracket(
									S1_T1.dlv_id_cd.eq(S1_M5.loc_cd)
								)
							)
							.leftOuterJoin(S1_M6).on(
								bracket(
									S1_T1.dlv_cntry_cd.eq(S1_M6.cntry_cd)
								)
							)
							.leftOuterJoin(S1_M7).on(
								bracket(
									S1_T1.trnspt_cd.eq(S1_M7.trnspt_cd)
								)
							)
							.leftOuterJoin(S1_M8).on(
								bracket(
									S1_T1.load_port_cd.eq(S1_M8.port_cd)
								)
							)
							.leftOuterJoin(S1_M10).on(
								bracket(
									S1_T1.trd_cur_cd.eq(S1_M10.cur_cd)
								)
							)
							.leftOuterJoin(S1_M11).on(
								bracket(
									S1_T2.itm_cd.eq(S1_M11.itm_cd)
									.and(S1_T2.itm_sub1.eq(S1_M11.itm_sub1))
									.and(S1_T2.itm_sub2.eq(S1_M11.itm_sub2))
									.and(S1_T2.itm_sub3.eq(S1_M11.itm_sub3))
								)
							)
							.leftOuterJoin(S1_M100).on(
								bracket(
									S1_T2.sls_dpt_cd.eq(S1_M100.dpt_cd)
									.and(
										nvl(
											S1_T4.slo_dt,
											S1_T1.iv_dt
										).between(S1_M100.st_dt, S1_M100.end_dt)
									)
								)
							)
							.leftOuterJoin(S1_M101).on(S1_T3.ship_lg_grp_cd.eq(S1_M101.lg_grp_cd))
							.leftOuterJoin(S1_T5).on(
								bracket(
									S1_T2.xfr_schd_no.eq(S1_T5.xfr_schd_no)
								)
							)
							.leftOuterJoin(S1_M102).on(
								bracket(
									S1_T5.itm_cd.eq(S1_M102.itm_cd)
									.and(S1_T5.itm_sub1.eq(S1_M102.itm_sub1))
									.and(S1_T5.itm_sub2.eq(S1_M102.itm_sub2))
									.and(S1_T5.itm_sub3.eq(S1_M102.itm_sub3))
									.and(S1_T5.gi_lg_grp_cd.eq(S1_M102.lg_grp_cd))
								)
							)
							.leftOuterJoin(S1_M103).on(
								bracket(
									S1_T5.gi_lg_grp_cd.eq(S1_M103.lg_grp_cd)
									.and(S1_M103.lg_def_flg.eq(value(true)))
									.and(S1_M103.del_flg.eq(value(false)))
								)
							)
							.addDynamicView(DS1C_DLV_GRP)
							.addDynamicView(DS1C_RQST_GRP)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(
								bind("is_crt").eq(value(true))
								.and(
									S1_T1.pl_reg_flg.eq(value(true))
									.or(S1_T1.pl_skip_flg.eq(value(true)))
								)
								.and(S1_T1.cmpl_flg.eq(value(false)))
								.and(S1_T1.non_cmpl_flg.eq(value(false)))
								.and(S1_T1.rcpt_iv_mng_no.isNull())
							)
							.cutoff$and(
								bind("is_upd_del").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S5_ACTD)
										.where(
											S1_T1.iv_no.eq(S5_ACTD.iv_no)
										)
									)
								)
							)
							.cutoff$and(
								bind("is_ref").eq(value(true))
								.and(
									bracket(
										bracket(
											S1_T1.pl_reg_flg.eq(value(true))
											.or(S1_T1.pl_skip_flg.eq(value(true)))
										)
										.and(S1_T1.cmpl_flg.eq(value(false)))
										.and(S1_T1.non_cmpl_flg.eq(value(false)))
										.and(S1_T1.rcpt_iv_mng_no.isNull())
									)
									.or(
										exists(
											subQuery()
											.select(value("X"))
											.from(S6_ACTD)
											.where(
												S1_T1.iv_no.eq(S6_ACTD.iv_no)
											)
										)
									)
								)
							)
							.cutoff$and(S1_T1.tdlv_cd.like(bind("tdlv_cd")))
							.cutoff$and(
								bracket(
									bracket(
										S1_T1.cmpl_flg.eq(value(false))
										.and(S1_T1.cmpl_schd_dt.gte(bind("cmpl_schd_dt_fr")))
									)
									.or(
										S1_T1.cmpl_flg.eq(value(true))
										.and(S1_T1.cmpl_dt.gte(bind("cmpl_schd_dt_fr")))
									)
								)
							)
							.cutoff$and(
								bracket(
									bracket(
										S1_T1.cmpl_flg.eq(value(false))
										.and(S1_T1.cmpl_schd_dt.lte(bind("cmpl_schd_dt_to")))
									)
									.or(
										S1_T1.cmpl_flg.eq(value(true))
										.and(S1_T1.cmpl_dt.lte(bind("cmpl_schd_dt_to")))
									)
								)
							)
							.cutoff$and(S1_T1.iv_no.like(bind("iv_no")))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(S7_IVD)
									.where(
										S1_T1.iv_mng_no.eq(S7_IVD.iv_mng_no)
										.cutoff$and(S7_IVD.slo_no.like(bind("slo_no")))
										.cutoff$and(
											nvl(
												S7_IVD.slo_d_no,
												S7_IVD.xfr_schd_no
											).like(bind("ship_rqst_no"))
										)
										.cutoff$and(S7_IVD.cst_po_no.like(bind("cst_po_no")))
										.cutoff$and(S7_IVD.cst_po_d_no.like(bind("cst_po_d_no")))
									)
								)
							)
							.cutoff$and(S1_T1.dlv_id_typ.like(bind("dlv_id_typ")))
							.cutoff$and(S1_T1.dlv_id_cd.like(bind("dlv_id_cd")))
							.cutoff$and(S1_T1.ship_rqst_id_typ.like(bind("ship_rqst_id_typ")))
							.cutoff$and(S1_T1.ship_rqst_id_cd.like(bind("ship_rqst_id_cd")))
							.cutoff$and(S1_T1.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T1.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T1.sub_char3.like(bind("sub_char3")))
							.addDynamicPredicate(DS1C_DLV_GRP)
							.addDynamicPredicate(DS1C_RQST_GRP)
						).view(S0_V1)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_V1.pr("tdlv_nm").like(bind("tdlv_nm")))
						.cutoff$and(S0_V1.pr("dlv_id_nm").like(bind("dlv_id_nm")))
						.cutoff$and(S0_V1.pr("ship_rqst_id_nm").like(bind("ship_rqst_id_nm")))
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("dlv_grp_flg1"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM11).on(S1_M4.bp_grp_cd1.eq(S1_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM11.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S1_MM11.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM12).on(S1_M4.bp_grp_cd2.eq(S1_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM12.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S1_MM12.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM13).on(S1_M4.bp_grp_cd3.eq(S1_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM13.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S1_MM13.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM14).on(S1_M4.bp_grp_cd4.eq(S1_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM14.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S1_MM14.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM15).on(S1_M4.bp_grp_cd5.eq(S1_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM15.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S1_MM15.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM16).on(S1_M4.bp_grp_cd6.eq(S1_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM16.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S1_MM16.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM17).on(S1_M4.bp_grp_cd7.eq(S1_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM17.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S1_MM17.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM18).on(S1_M4.bp_grp_cd8.eq(S1_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM18.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S1_MM18.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM19).on(S1_M4.bp_grp_cd9.eq(S1_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM19.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S1_MM19.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.view(DS1C_DLV_GRP, v -> v.leftOuterJoin(S1_MM110).on(S1_M4.bp_grp_cd10.eq(S1_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM110.bp_grp_typ))))
					.predicate(DS1C_DLV_GRP, p -> p.cutoff$and(S1_M4.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S1_MM110.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("rqst_grp_flg1"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM21).on(S1_M1.bp_grp_cd1.eq(S1_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_MM21.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd1.like(bind("rqst_grp_cd1"))).cutoff$and(S1_MM21.bp_grp_nm.like(bind("rqst_grp_nm1")))),
				when(boundOr("rqst_grp_flg2"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM22).on(S1_M1.bp_grp_cd2.eq(S1_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_MM22.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd2.like(bind("rqst_grp_cd2"))).cutoff$and(S1_MM22.bp_grp_nm.like(bind("rqst_grp_nm2")))),
				when(boundOr("rqst_grp_flg3"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM23).on(S1_M1.bp_grp_cd3.eq(S1_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_MM23.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd3.like(bind("rqst_grp_cd3"))).cutoff$and(S1_MM23.bp_grp_nm.like(bind("rqst_grp_nm3")))),
				when(boundOr("rqst_grp_flg4"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM24).on(S1_M1.bp_grp_cd4.eq(S1_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_MM24.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd4.like(bind("rqst_grp_cd4"))).cutoff$and(S1_MM24.bp_grp_nm.like(bind("rqst_grp_nm4")))),
				when(boundOr("rqst_grp_flg5"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM25).on(S1_M1.bp_grp_cd5.eq(S1_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_MM25.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd5.like(bind("rqst_grp_cd5"))).cutoff$and(S1_MM25.bp_grp_nm.like(bind("rqst_grp_nm5")))),
				when(boundOr("rqst_grp_flg6"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM26).on(S1_M1.bp_grp_cd6.eq(S1_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_MM26.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd6.like(bind("rqst_grp_cd6"))).cutoff$and(S1_MM26.bp_grp_nm.like(bind("rqst_grp_nm6")))),
				when(boundOr("rqst_grp_flg7"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM27).on(S1_M1.bp_grp_cd7.eq(S1_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_MM27.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd7.like(bind("rqst_grp_cd7"))).cutoff$and(S1_MM27.bp_grp_nm.like(bind("rqst_grp_nm7")))),
				when(boundOr("rqst_grp_flg8"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM28).on(S1_M1.bp_grp_cd8.eq(S1_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_MM28.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd8.like(bind("rqst_grp_cd8"))).cutoff$and(S1_MM28.bp_grp_nm.like(bind("rqst_grp_nm8")))),
				when(boundOr("rqst_grp_flg9"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM29).on(S1_M1.bp_grp_cd9.eq(S1_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_MM29.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd9.like(bind("rqst_grp_cd9"))).cutoff$and(S1_MM29.bp_grp_nm.like(bind("rqst_grp_nm9")))),
				when(boundOr("rqst_grp_flg10"))
					.view(DS1C_RQST_GRP, v -> v.leftOuterJoin(S1_MM210).on(S1_M1.bp_grp_cd10.eq(S1_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_MM210.bp_grp_typ))))
					.predicate(DS1C_RQST_GRP, p -> p.cutoff$and(S1_M1.bp_grp_cd10.like(bind("rqst_grp_cd10"))).cutoff$and(S1_MM210.bp_grp_nm.like(bind("rqst_grp_nm10"))))
			);
	}
}