package mcframe.serverMSBF.MSBFL0030;

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
	 * -- MSBFL0030_MST_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0030_MST_INSP_INST_S01() {
		MST_INSP_INST_R S0_T1 = MST_INSP_INST_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_SITE_R S0_M7 = MAM_SITE_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_LOC_R S0_M10 = MAM_LOC_R.create("M10");
		MAM_STR_LN_R S0_M11 = MAM_STR_LN_R.create("M11");
		MAM_INSP_PTN_R S0_M12 = MAM_INSP_PTN_R.create("M12");
		MAM_ITM_TYP_D_R S0_M13 = MAM_ITM_TYP_D_R.create("M13");
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
		MAM_BP_GRP_R S0_MM_BP1 = MAM_BP_GRP_R.create("MM_BP1");
		MAM_BP_GRP_R S0_MM_BP2 = MAM_BP_GRP_R.create("MM_BP2");
		MAM_BP_GRP_R S0_MM_BP3 = MAM_BP_GRP_R.create("MM_BP3");
		MAM_BP_GRP_R S0_MM_BP4 = MAM_BP_GRP_R.create("MM_BP4");
		MAM_BP_GRP_R S0_MM_BP5 = MAM_BP_GRP_R.create("MM_BP5");
		MAM_BP_GRP_R S0_MM_BP6 = MAM_BP_GRP_R.create("MM_BP6");
		MAM_BP_GRP_R S0_MM_BP7 = MAM_BP_GRP_R.create("MM_BP7");
		MAM_BP_GRP_R S0_MM_BP8 = MAM_BP_GRP_R.create("MM_BP8");
		MAM_BP_GRP_R S0_MM_BP9 = MAM_BP_GRP_R.create("MM_BP9");
		MAM_BP_GRP_R S0_MM_BP10 = MAM_BP_GRP_R.create("MM_BP10");
		MCTempView S0_V1 = createTempView("V1");
		MST_INSP_SCHD_R S1_T4 = MST_INSP_SCHD_R.create("T4");
		MST_INSP_SCHD_R S1_T_SCHD = MST_INSP_SCHD_R.create("T_SCHD");
		MAVM_RD_LOC_R S2_V1 = MAVM_RD_LOC_R.create("V1");
		MST_INSP_SCHD_R S2_T4 = MST_INSP_SCHD_R.create("T4");
		MAVM_APRV_USR_R S3_V2 = MAVM_APRV_USR_R.create("V2");
		MST_INSP_SCHD_R S3_T_INSPSCHD = MST_INSP_SCHD_R.create("T_INSPSCHD");
		MAM_SCM_IF_CTL_R S3_M_SCMIF = MAM_SCM_IF_CTL_R.create("M_SCMIF");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0030_MST_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_sts_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T2.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						trunc(
							S0_T1.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T1.st_tm.as("st_hm"),
						trunc(
							S0_T1.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T1.end_tm.as("end_hm"),
						S0_T2.vld_dt.as("vld_dt_now"),
						S0_T1.lmt_up_flg,
						S0_T1.insp_aprv_flg,
						S0_T1.insp_aprv_sts_typ,
						S0_T1.aprv_dt,
						S0_T1.aprv_usr_cd,
						S0_T1.aprv_dpt_cd,
						S0_M5.dpt_nm.as("aprv_dpt_nm"),
						S0_T1.aprv_rsn,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.lot_rmrks,
						S0_T1.insp_typ,
						S0_T1.insp_ptn_cd,
						S0_T1.insp_mtd_typ,
						S0_T1.std_req_flg,
						S0_T1.std_cnf_req_flg,
						S0_T1.plnt_aprv_flg,
						S0_T1.col_schd_flg,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.mfg_loc_cd,
						S0_T3.mfg_str_ln_cd,
						S0_T1.bp_lot_no,
						S0_T1.insp_bind_typ,
						S0_T1.inst_dt,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M6.dpt_nm.as("inst_dpt_nm"),
						S0_T1.to_site_cd,
						S0_T1.from_site_cd,
						S0_T1.insp_freq,
						S0_T1.insp_lst_prnt_tm,
						S0_T1.insp_lst_prnt_flg,
						S0_T1.insp_rslt_prnt_tm,
						S0_T1.insp_rslt_prnt_flg,
						S0_T1.insp_std_no,
						cases()
							.when(
								exists(
									subQuery()
									.select(value(1))
									.from(S3_T_INSPSCHD
										.innerJoin(S3_M_SCMIF).on(
											bracket(
												S3_M_SCMIF.if_proc_typ.eq(value(MAC_IF_PROC_TYP.MES_INSP_INST_SEND.value()))
												.and(S3_M_SCMIF.loc_cd.eq(
														cases()
															.when(S0_T1.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))).then(S0_T1.mfg_loc_cd)
														.otherwise(S3_T_INSPSCHD.loc_cd)
													)
												)
												.and(bind("today").between(S3_M_SCMIF.st_dt, S3_M_SCMIF.end_dt))
												.and(S3_M_SCMIF.del_flg.eq(value(false)))
												.and(
													S3_M_SCMIF.itm_cd.isNull()
													.or(
														S3_M_SCMIF.itm_cd.eq(S0_T1.itm_cd)
														.and(S3_M_SCMIF.itm_sub1.eq(S0_T1.itm_sub1))
														.and(S3_M_SCMIF.itm_sub2.eq(S0_T1.itm_sub2))
														.and(S3_M_SCMIF.itm_sub3.eq(S0_T1.itm_sub3))
													)
												)
												.and(S3_T_INSPSCHD.insp_no.eq(S0_T1.insp_no))
											)
										)
									)
								)
							).then(value(true))
						.otherwise(value(false)).as("for_lims_flg"),
						S0_T1.lims_flg.as("last_lims_flg"),
						S0_T1.insp_no,
						S0_T1.src_no1,
						S0_T1.src_no2,
						S0_T1.insp_lst_no,
						S0_T1.upd_cntr.as("inst_upd_cntr"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.master_dt,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_V1.pr("in_prmt_insp_flg"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0_T1.sublot_no).eq(value(true))
										.and(
											S0_M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0_T2.sublot_no.eq(S0_T1.sublot_no))
								)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								MSC_INSP_TYP$IS_PRDCT(S0_T1.insp_typ).eq(value(true))
								.and(S0_T1.src_no2.eq(S0_T3.itm_mfg_inst_no))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.aprv_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.aprv_dt.gte(S0_M5.st_dt))
								.and(S0_T1.aprv_dt.lte(S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_T1.inst_dt.gte(S0_M6.st_dt))
								.and(S0_T1.inst_dt.lte(S0_M6.end_dt))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T4.insp_no,
								max(S1_T4.in_prmt_insp_flg).as("in_prmt_insp_flg")
							)
							.from(S1_T4)
							.groupBy(S1_T4.insp_no).view(S0_V1)
						).on(
							bracket(
								S0_T1.insp_no.eq(S0_V1.pr(S1_T4.insp_no))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.insp_sts_typ.eq(bind("tmp_insp_sts_typ_ord")))
							.cutoff$or(S0_T1.insp_sts_typ.eq(bind("tmp_insp_sts_typ_str")))
							.cutoff$or(S0_T1.insp_sts_typ.eq(bind("tmp_insp_sts_typ_jdg")))
						)
						.cutoff$and(S0_T1.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T1.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T1.st_tm.gte(bind("st_hm_fr")))
						.cutoff$and(S0_T1.st_tm.lte(bind("st_hm_to")))
						.cutoff$and(S0_T1.end_tm.gte(bind("end_hm_fr")))
						.cutoff$and(S0_T1.end_tm.lte(bind("end_hm_to")))
						.cutoff$and(S0_T1.insp_lst_prnt_flg.eq(bind("tmp_lst_prnt_flg_cutoff")))
						.cutoff$and(S0_T1.insp_rslt_prnt_flg.eq(bind("tmp_rslt_prnt_flg_cutoff")))
						.cutoff$and(S0_T1.insp_lst_prnt_tm.gte(bind("insp_lst_prnt_tm_fr")))
						.cutoff$and(S0_T1.insp_lst_prnt_tm.lte(bind("insp_lst_prnt_tm_to")))
						.cutoff$and(S0_T1.insp_rslt_prnt_tm.gte(bind("insp_rslt_prnt_tm_fr")))
						.cutoff$and(S0_T1.insp_rslt_prnt_tm.lte(bind("insp_rslt_prnt_tm_to")))
						.cutoff$and(S0_T1.aprv_dt.gte(bind("aprv_dt_fr")))
						.cutoff$and(S0_T1.aprv_dt.lte(bind("aprv_dt_to")))
						.cutoff$and(S0_T1.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T1.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T1.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.bp_lot_no.like(bind("bp_lot_no")))
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.to_site_cd.like(bind("site_cd")))
						.cutoff$and(S0_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T3.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.insp_typ.like(bind("insp_typ")))
						.cutoff$and(S0_T1.insp_ptn_cd.like(bind("insp_ptn_cd")))
						.cutoff$and(S0_T1.insp_mtd_typ.like(bind("insp_mtd_typ")))
						.cutoff$and(S0_T1.insp_aprv_sts_typ.like(bind("insp_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(
							MSC_INSP_TYP$IS_PRDCT(S0_T1.insp_typ).eq(value(true))
							.and(S0_T1.src_no1.like(bind("mfg_inst_no")))
						)
						.cutoff$and(
							MSC_INSP_TYP$IS_ACCPT(S0_T1.insp_typ).eq(value(true))
							.and(S0_T1.src_no1.like(bind("po_d_no")))
						)
						.cutoff$and(S0_T1.insp_no.like(bind("insp_no")))
						.cutoff$and(S0_T1.insp_lst_no.like(bind("insp_lst_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.lims_flg.eq(bind("tmp_lims_tgt_flg_str")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_T_SCHD)
								.where(
									S0_T1.insp_no.eq(S1_T_SCHD.insp_no)
									.and(S1_T_SCHD.insp_schd_no.like(bind("insp_schd_no")))
								)
							)
						)
						.and(
							bracket(
								bind("ope_not_judg").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S2_V1
											.leftOuterJoin(S2_T4).on(
												bracket(
													S0_T1.insp_no.eq(S2_T4.insp_no)
												)
											)
										)
										.where(
											S2_V1.loc_cd.eq(cases()
													.when(S2_T4.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
														.then(S2_T4.mfg_loc_cd)
													.otherwise(S2_T4.loc_cd)
											)
										)
									)
								)
							)
							.or(
								bind("ope_judg").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S3_V2)
										.where(
											S3_V2.aprv_role_cd.eq(S0_T1.insp_aprv_role_cd)
											.and(S3_V2.usr_cd.eq(bind("login_usr_cd")))
											.and(S3_V2.st_dt.lte(bind("dt")))
											.and(
												S3_V2.end_dt.isNull()
												.or(S3_V2.end_dt.gte(bind("dt")))
											)
										)
									)
								)
							)
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.insp_sts_typ.asc(),
						S0_T1.st_tm.asc(),
						S0_T1.insp_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.inst_usr_cd.eq(S0_M4.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.to_site_cd.eq(S0_M7.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.site_nm.like(bind("site_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T1.sppl_cd.eq(S0_M8.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.maker_cd.eq(S0_M9.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.bp_nm.like(bind("maker_nm")))),
				when(boundOr("mfg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.mfg_loc_cd.eq(S0_M10.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.loc_nm.like(bind("mfg_loc_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T1.mfg_loc_cd.eq(S0_M11.loc_cd).and(S0_T3.mfg_str_ln_cd.eq(S0_M11.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M11.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("insp_ptn_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.insp_ptn_cd.eq(S0_M12.insp_ptn_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.insp_ptn_nm.like(bind("insp_ptn_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M1.itm_typ.eq(S0_M13.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M13.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
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
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_BP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP1).on(S0_M8.bp_grp_cd1.eq(S0_MM_BP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_BP1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_BP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_BP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP2).on(S0_M8.bp_grp_cd2.eq(S0_MM_BP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_BP2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_BP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_BP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP3).on(S0_M8.bp_grp_cd3.eq(S0_MM_BP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_BP3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_BP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_BP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP4).on(S0_M8.bp_grp_cd4.eq(S0_MM_BP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_BP4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_BP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_BP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP5).on(S0_M8.bp_grp_cd5.eq(S0_MM_BP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_BP5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_BP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_BP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP6).on(S0_M8.bp_grp_cd6.eq(S0_MM_BP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_BP6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_BP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_BP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP7).on(S0_M8.bp_grp_cd7.eq(S0_MM_BP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_BP7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_BP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_BP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP8).on(S0_M8.bp_grp_cd8.eq(S0_MM_BP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_BP8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_BP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_BP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP9).on(S0_M8.bp_grp_cd9.eq(S0_MM_BP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_BP9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_BP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_BP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP10).on(S0_M8.bp_grp_cd10.eq(S0_MM_BP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_BP10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_BP10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("to_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_site_nm", m.site_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_INSP_PTN_R.class, r -> toCondition(
							r.getStringNE("insp_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.insp_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("insp_ptn_nm", m.insp_ptn_nm());
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
	
	/**
	 * -- MSBFL0030_MST_INSP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBFL0030_MST_INSP_SCHD_S01() {
		MST_INSP_SCHD_R S0_T1 = MST_INSP_SCHD_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T2 = MST_LOT_R.create("T2");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MST_ITM_MFG_INST_R S0_T4 = MST_ITM_MFG_INST_R.create("T4");
		MCTempView S0_V1 = createTempView("V1");
		MCTempView S0_V2 = createTempView("V2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_SITE_R S0_M4 = MAM_SITE_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_STR_LN_R S0_M6 = MAM_STR_LN_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_ITM_TYP_D_R S0_M10 = MAM_ITM_TYP_D_R.create("M10");
		MAM_SUNDRY_ITM_R S0_M12 = MAM_SUNDRY_ITM_R.create("M12");
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
		MAM_BP_GRP_R S0_MM_BP1 = MAM_BP_GRP_R.create("MM_BP1");
		MAM_BP_GRP_R S0_MM_BP2 = MAM_BP_GRP_R.create("MM_BP2");
		MAM_BP_GRP_R S0_MM_BP3 = MAM_BP_GRP_R.create("MM_BP3");
		MAM_BP_GRP_R S0_MM_BP4 = MAM_BP_GRP_R.create("MM_BP4");
		MAM_BP_GRP_R S0_MM_BP5 = MAM_BP_GRP_R.create("MM_BP5");
		MAM_BP_GRP_R S0_MM_BP6 = MAM_BP_GRP_R.create("MM_BP6");
		MAM_BP_GRP_R S0_MM_BP7 = MAM_BP_GRP_R.create("MM_BP7");
		MAM_BP_GRP_R S0_MM_BP8 = MAM_BP_GRP_R.create("MM_BP8");
		MAM_BP_GRP_R S0_MM_BP9 = MAM_BP_GRP_R.create("MM_BP9");
		MAM_BP_GRP_R S0_MM_BP10 = MAM_BP_GRP_R.create("MM_BP10");
		MST_YIELD_ACT_REM_R S1_T5 = MST_YIELD_ACT_REM_R.create("T5");
		MST_YIELD_ACT_R S1_T6 = MST_YIELD_ACT_R.create("T6");
		MSVT_YIELD_SCHD_PR_R S2 = MSVT_YIELD_SCHD_PR_R.create();
		MAVM_RD_LOC_R S3_V1 = MAVM_RD_LOC_R.create("V1");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0030_MST_INSP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_schd_sts_typ.as("insp_sts_typ"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M12.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T2.ver_no,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_M1.sublot_mng_typ,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.base_unit_qty,
						decode(
							S0_T1.insp_typ,
							value(MSC_INSP_TYP.PRDCT.value()),
							decode(
								S0_T1.src_no4,
								nullValue(),
								decode(
									S0_T1.src_no3,
									nullValue(),
									nullValue(),
									S0_V2.pr("base_unit_yield_rem_qty")
								),
								S0_V1.pr("base_unit_yield_rem_qty")
							),
							nullValue()
						).as("not_yield_qty"),
						S0_T1.base_unit_cd,
						trunc(
							S0_T1.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T1.st_tm.as("st_hm"),
						trunc(
							S0_T1.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T1.end_tm.as("end_hm"),
						S0_T2.vld_dt.as("vld_dt_now"),
						S0_T1.lmt_up_flg,
						S0_T2.lot_rmrks,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.insp_typ,
						S0_T1.insp_mtd_typ,
						S0_T1.loc_cd,
						S0_M3.loc_nm,
						S0_M3.site_cd.as("to_site_cd"),
						S0_T1.from_site_cd,
						S0_T1.str_ln_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.mfg_loc_cd,
						S0_T4.mfg_str_ln_cd,
						S0_T1.bp_lot_no,
						S0_T1.insp_bind_typ,
						S0_T1.in_prmt_insp_flg,
						S0_T1.insp_schd_no,
						S0_T1.insp_no,
						S0_T1.own_insp_no,
						S0_T1.insp_cnt_rmrks,
						S0_T1.src_no1,
						S0_T1.src_no2,
						S0_T1.src_no3,
						S0_T1.src_no4,
						S0_T1.upd_cntr.as("schd_upd_cntr"),
						S0_T1.master_dt,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T2.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0_T1.sublot_no).eq(value(true))
										.and(
											S0_M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0_T1.sublot_no.eq(S0_T2.sublot_no))
								)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								MSC_INSP_TYP$IS_PRDCT(S0_T1.insp_typ).eq(value(true))
								.and(S0_T1.src_no2.eq(S0_T4.itm_mfg_inst_no))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T6.yield_act_no,
								sum(S1_T5.base_unit_yield_rem_qty).as("base_unit_yield_rem_qty")
							)
							.from(
								S1_T5
								.innerJoin(S1_T6).on(
									bracket(
										S1_T5.yield_schd_no.eq(S1_T6.yield_schd_no)
										.and(S1_T5.div_seq.eq(S1_T6.div_seq))
									)
								)
							)
							.groupBy(S1_T6.yield_act_no).view(S0_V1)
						).on(
							bracket(
								S0_T1.src_no4.eq(S0_V1.pr(S1_T6.yield_act_no))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2.yield_schd_no,
								sum(S2.base_unit_yield_rem_qty).as("base_unit_yield_rem_qty")
							)
							.from(S2)
							.groupBy(S2.yield_schd_no).view(S0_V2)
						).on(
							bracket(
								S0_T1.src_no3.eq(S0_V2.pr(S2.yield_schd_no))
							)
						)
						.leftOuterJoin(S0_M12).on(
							S0_T1.itm_cd.eq(S0_M12.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M12.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M12.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M12.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M12.sno1))
							.and(S0_T1.sno2.eq(S0_M12.sno2))
							.and(S0_T1.sno3.eq(S0_M12.sno3))
							.and(S0_T1.sno4.eq(S0_M12.sno4))
						)
						.leftOuterJoin(S0_M3).on(
								bracket(
									S0_T1.loc_cd.eq(S0_M3.loc_cd)
								)
							)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.insp_schd_sts_typ.eq(bind("tmp_insp_sts_typ_schd")))
							.cutoff$or(S0_T1.insp_schd_sts_typ.eq(bind("tmp_insp_sts_typ_yet")))
						)
						.cutoff$and(S0_T1.st_tm.gte(bind("schd_st_hm_fr")))
						.cutoff$and(S0_T1.st_tm.lte(bind("schd_st_hm_to")))
						.cutoff$and(S0_T1.end_tm.gte(bind("schd_end_hm_fr")))
						.cutoff$and(S0_T1.end_tm.lte(bind("schd_end_hm_to")))
						.cutoff$and(S0_T1.upd_ts.gte(bind("upd_ts_fr")))
						.cutoff$and(S0_T1.upd_ts.lte(bind("upd_ts_to")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M12.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.bp_lot_no.like(bind("bp_lot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T4.mfg_str_ln_cd.like(bind("mfg_str_ln_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.insp_typ.like(bind("insp_typ")))
						.cutoff$and(S0_T1.insp_mtd_typ.like(bind("insp_mtd_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.insp_schd_no.like(bind("insp_schd_no")))
						.cutoff$and(S0_T1.insp_no.like(bind("insp_no")))
						.cutoff$and(
							MSC_INSP_TYP$IS_PRDCT(S0_T1.insp_typ).eq(value(true))
							.and(S0_T1.src_no1.like(bind("mfg_inst_no")))
						)
						.cutoff$and(
							MSC_INSP_TYP$IS_ACCPT(S0_T1.insp_typ).eq(value(true))
							.and(S0_T1.src_no1.like(bind("po_d_no")))
						)
						.cutoff$and(S0_T1.insp_cnt_rmrks.like(bind("insp_cnt_rmrks")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S3_V1)
								.where(
									S3_V1.loc_cd.eq(cases()
											.when(S0_T1.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
												.then(S0_T1.mfg_loc_cd)
											.otherwise(S0_T1.loc_cd)
									)
								)
							)
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.insp_schd_sts_typ.asc(),
						S0_T1.st_tm.asc(),
						S0_T1.insp_schd_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T1.sno1.eq(S0_T3.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("site_nm", "loc_nm", "site_cd"))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("loc_nm"))).cutoff$and(S0_M3.site_cd.like(bind("site_cd")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M3.site_cd.eq(S0_M4.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.site_nm.like(bind("site_nm")))),
				when(boundOr("mfg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.mfg_loc_cd.eq(S0_M5.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.loc_nm.like(bind("mfg_loc_nm")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.loc_cd.eq(S0_M6.loc_cd).and(S0_T1.str_ln_cd.eq(S0_M6.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("mfg_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.mfg_loc_cd.eq(S0_M7.loc_cd).and(S0_T4.mfg_str_ln_cd.eq(S0_M7.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("mfg_str_ln_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T1.sppl_cd.eq(S0_M8.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.maker_cd.eq(S0_M9.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.bp_nm.like(bind("maker_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M1.itm_typ.eq(S0_M10.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M10.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
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
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_BP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP1).on(S0_M8.bp_grp_cd1.eq(S0_MM_BP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_BP1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_BP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_BP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP2).on(S0_M8.bp_grp_cd2.eq(S0_MM_BP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_BP2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_BP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_BP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP3).on(S0_M8.bp_grp_cd3.eq(S0_MM_BP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_BP3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_BP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_BP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP4).on(S0_M8.bp_grp_cd4.eq(S0_MM_BP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_BP4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_BP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_BP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP5).on(S0_M8.bp_grp_cd5.eq(S0_MM_BP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_BP5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_BP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_BP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP6).on(S0_M8.bp_grp_cd6.eq(S0_MM_BP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_BP6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_BP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_BP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP7).on(S0_M8.bp_grp_cd7.eq(S0_MM_BP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_BP7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_BP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_BP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP8).on(S0_M8.bp_grp_cd8.eq(S0_MM_BP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_BP8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_BP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_BP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP9).on(S0_M8.bp_grp_cd9.eq(S0_MM_BP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_BP9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_BP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M8.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_BP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP10).on(S0_M8.bp_grp_cd10.eq(S0_MM_BP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_BP10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_BP10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("to_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_site_nm", m.site_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
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