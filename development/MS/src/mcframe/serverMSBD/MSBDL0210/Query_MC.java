package mcframe.serverMSBD.MSBDL0210;

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
	 * -- MSBDL0210_MST_PURC_FRCST_D_Query_S01
	 */
	static MCQueryPlan MSBDL0210_MST_PURC_FRCST_D_S01() {
		MST_PURC_FRCST_D_R S0_T1 = MST_PURC_FRCST_D_R.create("T1");
		MSW_PURC_FRCST_D_KEY_R S0_WK = MSW_PURC_FRCST_D_KEY_R.create("WK");
		MST_PURC_FRCST_H_R S0_T2 = MST_PURC_FRCST_H_R.create("T2");
		MST_PURC_FRCST_FIX_R S0_T3 = MST_PURC_FRCST_FIX_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0210_MST_PURC_FRCST_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_frcst_d_no,
						S0_T3.purc_frcst_fix_no,
						S0_T2.sppl_cd,
						S0_T2.wg_cd,
						S0_T2.pf_dt,
						S0_T3.itm_cd,
						S0_T3.itm_sub1,
						S0_T3.itm_sub2,
						S0_T3.itm_sub3,
						S0_T3.trd_unit_cd,
						S0_T3.base_unit_cd,
						S0_T1.pf_period_typ,
						S0_T1.pf_period_st_dt,
						S0_T1.pf_period_end_dt
					)
					.from(
						S0_T1
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.purc_frcst_d_no.eq(S0_T1.purc_frcst_d_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_fix_no.eq(S0_T1.purc_frcst_fix_no)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBDL0210_MST_PURC_FRCST_H_Query_S01
	 */
	static MCQueryPlan MSBDL0210_MST_PURC_FRCST_H_S01() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MCTempView S0_V1 = createTempView("V1");
		MCTempView S0_V2 = createTempView("V2");
		MCTempView S0_V3 = createTempView("V3");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		MST_PURC_FRCST_H_R S1_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PURC_FRCST_FIX_R S1_TF = MST_PURC_FRCST_FIX_R.create("TF");
		MAM_BP_ITM_R S1_MI = MAM_BP_ITM_R.create("MI");
		MST_PURC_FRCST_H_R S2_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PURC_FRCST_H_R S2_TP = MST_PURC_FRCST_H_R.create("TP");
		MST_PURC_FRCST_H_R S2_TN = MST_PURC_FRCST_H_R.create("TN");
		MST_PURC_FRCST_H_R S3_TH = MST_PURC_FRCST_H_R.create("TH");
		
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0210_MST_PURC_FRCST_H_Query_S01")
					.mainQuery()
					.select(
						S0_V1.pr("fix_flg"),
						S0_T1.del_flg,
						S0_V1.pr("purc_commit_flg"),
						S0_T1.purc_frcst_no,
						S0_T1.pf_dt,
						S0_V2.pr("pre_pf_dt"),
						cases()
							.when(S0_V3.pr("max_pf_dt").eq(S0_T1.pf_dt))
								.then(value(true))
							.otherwise(value(false)).as("latest_flg"),
						S0_T1.sppl_cd,
						S0_M1.bp_nm.as("sppl_nm"),
						S0_M1.subcon_flg,
						S0_T1.wg_cd,
						S0_M2.wg_nm,
						S0_T1.pf_usr_cd,
						S0_M3.usr_nm.as("pf_usr_nm"),
						S0_T1.pf_dpt_cd,
						S0_M4.dpt_nm.as("pf_dpt_nm"),
						S0_T1.pf_rpt_flg,
						S0_T1.pf_rpt_dt,
						S0_T1.pf_rpt_no,
						S0_T1.del_pf_rpt_flg,
						S0_T1.del_pf_rpt_dt,
						S0_T1.rpt_rmrks.as("hdr_rpt_rmrks"),
						S0_T1.intr_rmrks.as("hdr_intr_rmrks"),
						S0_T1.sub_char1.as("hdr_sub_char1"),
						S0_T1.sub_char2.as("hdr_sub_char2"),
						S0_T1.sub_char3.as("hdr_sub_char3"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								S1_TH.purc_frcst_no,
								min(S1_TF.fix_flg).as("fix_flg"),
								max(S1_MI.purc_commit_flg).as("purc_commit_flg")
							)
							.from(
								S1_TH
								.innerJoin(S1_TF).on(
									bracket(
										S1_TF.purc_frcst_no.eq(S1_TH.purc_frcst_no)
									)
								)
								.leftOuterJoin(S1_MI).on(
									bracket(
										S1_MI.bp_cd.eq(S1_TH.sppl_cd)
										.and(S1_MI.itm_cd.eq(S1_TF.itm_cd))
										.and(S1_MI.itm_sub1.eq(S1_TF.itm_sub1))
										.and(S1_MI.itm_sub2.eq(S1_TF.itm_sub2))
										.and(S1_MI.itm_sub3.eq(S1_TF.itm_sub3))
										.and(S1_TH.pf_dt.between(S1_MI.st_dt, S1_MI.end_dt))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_TH.pf_dt.gte(bind("pf_dt_fr")))
								.and(S1_TH.pf_dt.lte(bind("pf_dt_to")))
								.cutoff$and(S1_TH.pf_rpt_flg.eq(bind("rpt_flg_str")))
								.cutoff$and(S1_TH.del_flg.eq(bind("del_flg_str")))
								.cutoff$and(S1_TH.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_TH.sppl_cd.like(bind("sppl_cd")))
								.cutoff$and(S1_TH.pf_usr_cd.like(bind("pf_usr_cd")))
								.cutoff$and(S1_TH.pf_dpt_cd.like(bind("pf_dpt_cd")))
								.cutoff$and(S1_TH.pf_rpt_no.like(bind("pf_rpt_no")))
								.cutoff$and(S1_TH.rpt_rmrks.like(bind("hdr_rpt_rmrks")))
								.cutoff$and(S1_TH.intr_rmrks.like(bind("hdr_intr_rmrks")))
								.cutoff$and(S1_TH.sub_char1.like(bind("hdr_sub_char1")))
								.cutoff$and(S1_TH.sub_char2.like(bind("hdr_sub_char2")))
								.cutoff$and(S1_TH.sub_char3.like(bind("hdr_sub_char3")))
							)
							.groupBy(S1_TH.purc_frcst_no).view(S0_V1)
						).on(
							bracket(
								S0_V1.pr(S1_TH.purc_frcst_no).eq(S0_T1.purc_frcst_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_TH.sppl_cd,
								S2_TH.wg_cd,
								min(S2_TN.pf_dt).as("next_pf_dt"),
								S2_TH.pf_dt,
								max(S2_TP.pf_dt).as("pre_pf_dt")
							)
							.from(
								S2_TH
								.leftOuterJoin(S2_TP).on(
									bracket(
										S2_TP.sppl_cd.eq(S2_TH.sppl_cd)
										.and(S2_TP.wg_cd.eq(S2_TH.wg_cd))
										.and(S2_TP.pf_dt.lt(S2_TH.pf_dt))
										.and(S2_TP.del_flg.eq(value(false)))
									)
								)
								.leftOuterJoin(S2_TN).on(
									bracket(
										S2_TN.sppl_cd.eq(S2_TH.sppl_cd)
										.and(S2_TN.wg_cd.eq(S2_TH.wg_cd))
										.and(S2_TN.pf_dt.gt(S2_TH.pf_dt))
										.and(S2_TN.del_flg.eq(value(false)))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_TH.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_TH.sppl_cd.like(bind("sppl_cd")))
							)
							.groupBy(
								S2_TH.sppl_cd,
								S2_TH.wg_cd,
								S2_TH.pf_dt
							).view(S0_V2)
						).on(
							bracket(
								S0_V2.pr(S2_TH.sppl_cd).eq(S0_T1.sppl_cd)
								.and(S0_V2.pr(S2_TH.wg_cd).eq(S0_T1.wg_cd))
								.and(S0_V2.pr(S2_TH.pf_dt).eq(S0_T1.pf_dt))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S3_TH.sppl_cd,
								S3_TH.wg_cd,
								max(S3_TH.pf_dt).as("max_pf_dt")
							)
							.from(S3_TH)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S3_TH.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S3_TH.sppl_cd.like(bind("sppl_cd")))
							)
							.groupBy(
								S3_TH.sppl_cd,
								S3_TH.wg_cd
							).view(S0_V3)
						).on(
							bracket(
								S0_V3.pr(S3_TH.sppl_cd).eq(S0_T1.sppl_cd)
								.and(S0_V3.pr(S3_TH.wg_cd).eq(S0_T1.wg_cd))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.sppl_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.usr_cd.eq(S0_T1.pf_usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.dpt_cd.eq(S0_T1.pf_dpt_cd)
								.and(S0_T1.pf_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.wg_cd.eq(S0_M4.wg_cd)
							)
						)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.subcon_flg.eq(bind("subcon_flg")))
						.cutoff$and(S0_V1.pr("fix_flg").eq(bind("fix_flg_str")))
						.cutoff$and(S0_V1.pr("purc_commit_flg").eq(bind("purc_commit_flg_str")))
						.cutoff$and(
							S0_V3.pr("max_pf_dt").eq(S0_T1.pf_dt)
							.and(value(true).eq(bind("latest_flg_str")))
						)
						.cutoff$and(
							bracket(
								S0_T1.pf_rpt_flg.eq(value(true))
								.and(S0_T1.del_flg.eq(value(true)))
								.or(S0_T1.del_flg.eq(value(false)))
							)
							.and(value(true).eq(bind("print_flg")))
						)
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_M1.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_M3.usr_nm.like(bind("pf_usr_nm")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("pf_dpt_cnm")))
						.cutoff$and(S0_M4.wg_cd.like(bind("pf_wg_cd")))
						.cutoff$and(S0_M5.wg_nm.like(bind("pf_wg_nm")))
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.pf_dt.asc(),
						S0_T1.sppl_cd.asc(),
						S0_T1.wg_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M1.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M1.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M1.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M1.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M1.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M1.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M1.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M1.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M1.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M1.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBDL0210_MST_PURC_FRCST_H_Query_S02
	 */
	static MCQueryPlan MSBDL0210_MST_PURC_FRCST_H_S02() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MCTempView S0_V1 = createTempView("V1");
		MST_PURC_FRCST_H_R S0_T4 = MST_PURC_FRCST_H_R.create("T4");
		MST_PURC_FRCST_FIX_R S0_T5 = MST_PURC_FRCST_FIX_R.create("T5");
		MCTempView S0_V2 = createTempView("V2");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_BP_ITM_R S0_M6 = MAM_BP_ITM_R.create("M6");
		MAM_ITM_R S0_M7 = MAM_ITM_R.create("M7");
		MAM_ITM_TYP_D_R S0_M8 = MAM_ITM_TYP_D_R.create("M8");
		MAM_UNIT_R S0_M9 = MAM_UNIT_R.create("M9");
		MAM_UNIT_R S0_M10 = MAM_UNIT_R.create("M10");
		MAVM_ITM_UNIT_R S0_M11 = MAVM_ITM_UNIT_R.create("M11");
		MAM_PF_GRP_R S0_M12 = MAM_PF_GRP_R.create("M12");
		MAM_ITM_GRP_R S0_IM1 = MAM_ITM_GRP_R.create("IM1");
		MAM_ITM_GRP_R S0_IM2 = MAM_ITM_GRP_R.create("IM2");
		MAM_ITM_GRP_R S0_IM3 = MAM_ITM_GRP_R.create("IM3");
		MAM_ITM_GRP_R S0_IM4 = MAM_ITM_GRP_R.create("IM4");
		MAM_ITM_GRP_R S0_IM5 = MAM_ITM_GRP_R.create("IM5");
		MAM_ITM_GRP_R S0_IM6 = MAM_ITM_GRP_R.create("IM6");
		MAM_ITM_GRP_R S0_IM7 = MAM_ITM_GRP_R.create("IM7");
		MAM_ITM_GRP_R S0_IM8 = MAM_ITM_GRP_R.create("IM8");
		MAM_ITM_GRP_R S0_IM9 = MAM_ITM_GRP_R.create("IM9");
		MAM_ITM_GRP_R S0_IM10 = MAM_ITM_GRP_R.create("IM10");
		MAM_BP_GRP_R S0_BM1 = MAM_BP_GRP_R.create("BM1");
		MAM_BP_GRP_R S0_BM2 = MAM_BP_GRP_R.create("BM2");
		MAM_BP_GRP_R S0_BM3 = MAM_BP_GRP_R.create("BM3");
		MAM_BP_GRP_R S0_BM4 = MAM_BP_GRP_R.create("BM4");
		MAM_BP_GRP_R S0_BM5 = MAM_BP_GRP_R.create("BM5");
		MAM_BP_GRP_R S0_BM6 = MAM_BP_GRP_R.create("BM6");
		MAM_BP_GRP_R S0_BM7 = MAM_BP_GRP_R.create("BM7");
		MAM_BP_GRP_R S0_BM8 = MAM_BP_GRP_R.create("BM8");
		MAM_BP_GRP_R S0_BM9 = MAM_BP_GRP_R.create("BM9");
		MAM_BP_GRP_R S0_BM10 = MAM_BP_GRP_R.create("BM10");
		MST_PURC_FRCST_H_R S1_TH = MST_PURC_FRCST_H_R.create("TH");
		MST_PURC_FRCST_H_R S1_TP = MST_PURC_FRCST_H_R.create("TP");
		MST_PURC_FRCST_H_R S1_TN = MST_PURC_FRCST_H_R.create("TN");
		MST_PURC_FRCST_H_R S2_TH = MST_PURC_FRCST_H_R.create("TH");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0210_MST_PURC_FRCST_H_Query_S02")
					.mainQuery()
					.select(
						S0_T2.fix_flg,
						S0_T1.del_flg,
						S0_T1.purc_frcst_no,
						S0_T5.purc_frcst_fix_no.as("pre_purc_frcst_fix_no"),
						S0_T1.pf_dt,
						S0_V1.pr("pre_pf_dt"),
						cases()
							.when(S0_V2.pr("max_pf_dt").eq(S0_T1.pf_dt))
								.then(value(true))
							.otherwise(value(false)).as("latest_flg"),
						S0_T1.sppl_cd,
						S0_M1.bp_nm.as("sppl_nm"),
						S0_M1.subcon_flg,
						S0_T1.wg_cd,
						S0_M2.wg_nm,
						S0_T1.pf_usr_cd,
						S0_M3.usr_nm.as("pf_usr_nm"),
						S0_T1.pf_dpt_cd,
						S0_M4.dpt_nm.as("pf_dpt_nm"),
						S0_T1.pf_rpt_flg,
						S0_T1.pf_rpt_dt,
						S0_T1.pf_rpt_no,
						S0_T1.del_pf_rpt_flg,
						S0_T1.del_pf_rpt_dt,
						S0_T1.rpt_rmrks.as("hdr_rpt_rmrks"),
						S0_T1.intr_rmrks.as("hdr_intr_rmrks"),
						S0_T1.sub_char1.as("hdr_sub_char1"),
						S0_T1.sub_char2.as("hdr_sub_char2"),
						S0_T1.sub_char3.as("hdr_sub_char3"),
						S0_T2.purc_frcst_fix_no,
						S0_T3.purc_frcst_d_no,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_M7.itm_nm,
						S0_M7.itm_typ,
						S0_M8.itm_typ_d_cd,
						S0_M8.itm_typ_d_nm,
						S0_M6.purc_commit_flg,
						S0_T3.pf_period_typ,
						S0_T3.pf_period_st_dt,
						S0_T3.pf_period_end_dt,
						S0_T3.fix_period_flg,
						nvl(
							S0_M12.fix_period_num,
							value(0)
						).as("fix_period_num"),
						S0_T2.trd_unit_cd,
						S0_M9.unit_nm.as("trd_unit_nm"),
						S0_M11.dec_place.as("trd_unit_dec_place"),
						S0_M11.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M11.conv_qty.as("trd_unit_conv_qty"),
						S0_T3.trd_unit_schd_qty,
						S0_T3.trd_unit_pf_qty,
						S0_T3.trd_unit_prms_qty,
						S0_T2.base_unit_cd,
						S0_M10.unit_nm.as("base_unit_nm"),
						S0_M7.dec_place.as("base_unit_dec_place"),
						S0_M7.rnd_typ.as("base_unit_rnd_typ"),
						S0_T3.base_unit_schd_qty,
						S0_T3.base_unit_pf_qty,
						S0_T3.base_unit_prms_qty,
						S0_T2.rpt_rmrks.as("dtl_rpt_rmrks"),
						S0_T2.intr_rmrks.as("dtl_intr_rmrks"),
						S0_T2.sub_char1.as("dtl_sub_char1"),
						S0_T2.sub_char2.as("dtl_sub_char2"),
						S0_T2.sub_char3.as("dtl_sub_char3"),
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_cntr,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_TH.sppl_cd,
								S1_TH.wg_cd,
								min(S1_TN.pf_dt).as("next_pf_dt"),
								S1_TH.pf_dt,
								max(S1_TP.pf_dt).as("pre_pf_dt")
							)
							.from(
								S1_TH
								.leftOuterJoin(S1_TP).on(
									bracket(
										S1_TP.sppl_cd.eq(S1_TH.sppl_cd)
										.and(S1_TP.wg_cd.eq(S1_TH.wg_cd))
										.and(S1_TP.pf_dt.lt(S1_TH.pf_dt))
										.and(S1_TP.del_flg.eq(value(false)))
									)
								)
								.leftOuterJoin(S1_TN).on(
									bracket(
										S1_TN.sppl_cd.eq(S1_TH.sppl_cd)
										.and(S1_TN.wg_cd.eq(S1_TH.wg_cd))
										.and(S1_TN.pf_dt.gt(S1_TH.pf_dt))
										.and(S1_TN.del_flg.eq(value(false)))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S1_TH.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S1_TH.sppl_cd.like(bind("sppl_cd")))
							)
							.groupBy(
								S1_TH.sppl_cd,
								S1_TH.wg_cd,
								S1_TH.pf_dt
							).view(S0_V1)
						).on(
							bracket(
								S0_V1.pr(S1_TH.sppl_cd).eq(S0_T1.sppl_cd)
								.and(S0_V1.pr(S1_TH.wg_cd).eq(S0_T1.wg_cd))
								.and(S0_V1.pr(S1_TH.pf_dt).eq(S0_T1.pf_dt))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.sppl_cd.eq(S0_V1.pr(S1_TH.sppl_cd))
								.and(S0_T4.wg_cd.eq(S0_V1.pr(S1_TH.wg_cd)))
								.and(S0_T4.pf_dt.eq(S0_V1.pr("pre_pf_dt")))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T5.purc_frcst_no.eq(S0_T4.purc_frcst_no)
								.and(S0_T5.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_T5.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_T5.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_T5.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_TH.sppl_cd,
								S2_TH.wg_cd,
								max(S2_TH.pf_dt).as("max_pf_dt")
							)
							.from(S2_TH)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_TH.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_TH.sppl_cd.like(bind("sppl_cd")))
							)
							.groupBy(
								S2_TH.sppl_cd,
								S2_TH.wg_cd
							).view(S0_V2)
						).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_V2.pr(S2_TH.sppl_cd))
								.and(S0_T1.wg_cd.eq(S0_V2.pr(S2_TH.wg_cd)))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.sppl_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.usr_cd.eq(S0_T1.pf_usr_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.dpt_cd.eq(S0_T1.pf_dpt_cd)
								.and(S0_T1.pf_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.wg_cd.eq(S0_M4.wg_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M6.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_M6.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.pf_dt.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M7.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M7.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M7.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.itm_typ.eq(S0_M7.itm_typ)
								.and(S0_M8.itm_typ_d_cd.eq(S0_M7.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.unit_cd.eq(S0_T2.trd_unit_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.unit_cd.eq(S0_T2.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M11.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M11.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M11.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M11.unit_cd.eq(S0_T2.trd_unit_cd))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.pf_grp_cd.eq(S0_M6.pf_grp_cd)
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pf_dt.gte(bind("pf_dt_fr")))
						.and(S0_T1.pf_dt.lte(bind("pf_dt_to")))
						.cutoff$and(S0_T1.pf_rpt_flg.eq(bind("rpt_flg_str")))
						.cutoff$and(S0_T1.del_flg.eq(bind("del_flg_str")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.pf_usr_cd.like(bind("pf_usr_cd")))
						.cutoff$and(S0_T1.pf_dpt_cd.like(bind("pf_dpt_cd")))
						.cutoff$and(S0_T1.pf_rpt_no.like(bind("pf_rpt_no")))
						.cutoff$and(S0_T1.rpt_rmrks.like(bind("hdr_rpt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("hdr_intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("hdr_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("hdr_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("hdr_sub_char3")))
						.cutoff$and(S0_T2.fix_flg.eq(bind("fix_flg_str")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T2.rpt_rmrks.like(bind("dtl_rpt_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("dtl_intr_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("dtl_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("dtl_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("dtl_sub_char3")))
						.cutoff$and(
							S0_V2.pr("max_pf_dt").eq(S0_T1.pf_dt)
							.and(value(true).eq(bind("latest_flg_str")))
						)
						.cutoff$and(S0_M1.subcon_flg.eq(bind("subcon_flg")))
						.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_M1.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_M3.usr_nm.like(bind("pf_usr_nm")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("pf_dpt_cnm")))
						.cutoff$and(S0_M4.wg_cd.like(bind("pf_wg_cd")))
						.cutoff$and(S0_M5.wg_nm.like(bind("pf_wg_nm")))
						.cutoff$and(S0_M6.purc_commit_flg.eq(bind("purc_commit_flg_str")))
						.cutoff$and(S0_M7.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_M7.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M7.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M8.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.pf_dt.asc(),
						S0_T1.sppl_cd.asc(),
						S0_T1.wg_cd.asc(),
						S0_T2.itm_cd.asc(),
						S0_T2.itm_sub1.asc(),
						S0_T2.itm_sub2.asc(),
						S0_T2.itm_sub3.asc(),
						S0_T3.pf_period_typ.asc(),
						S0_T3.pf_period_st_dt.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd1.as("itm_grp_cd1"), S0_IM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM1).on(S0_M7.itm_grp_cd1.eq(S0_IM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_IM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_IM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd2.as("itm_grp_cd2"), S0_IM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM2).on(S0_M7.itm_grp_cd2.eq(S0_IM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_IM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_IM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd3.as("itm_grp_cd3"), S0_IM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM3).on(S0_M7.itm_grp_cd3.eq(S0_IM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_IM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_IM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd4.as("itm_grp_cd4"), S0_IM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM4).on(S0_M7.itm_grp_cd4.eq(S0_IM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_IM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_IM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd5.as("itm_grp_cd5"), S0_IM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM5).on(S0_M7.itm_grp_cd5.eq(S0_IM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_IM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_IM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd6.as("itm_grp_cd6"), S0_IM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM6).on(S0_M7.itm_grp_cd6.eq(S0_IM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_IM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_IM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd7.as("itm_grp_cd7"), S0_IM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM7).on(S0_M7.itm_grp_cd7.eq(S0_IM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_IM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_IM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd8.as("itm_grp_cd8"), S0_IM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM8).on(S0_M7.itm_grp_cd8.eq(S0_IM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_IM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_IM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd9.as("itm_grp_cd9"), S0_IM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM9).on(S0_M7.itm_grp_cd9.eq(S0_IM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_IM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_IM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M7.itm_grp_cd10.as("itm_grp_cd10"), S0_IM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_IM10).on(S0_M7.itm_grp_cd10.eq(S0_IM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_IM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M7.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_IM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd1.as("sppl_grp_cd1"), S0_BM1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM1).on(S0_M1.bp_grp_cd1.eq(S0_BM1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BM1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_BM1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd2.as("sppl_grp_cd2"), S0_BM2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM2).on(S0_M1.bp_grp_cd2.eq(S0_BM2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BM2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_BM2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd3.as("sppl_grp_cd3"), S0_BM3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM3).on(S0_M1.bp_grp_cd3.eq(S0_BM3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BM3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_BM3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd4.as("sppl_grp_cd4"), S0_BM4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM4).on(S0_M1.bp_grp_cd4.eq(S0_BM4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BM4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_BM4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd5.as("sppl_grp_cd5"), S0_BM5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM5).on(S0_M1.bp_grp_cd5.eq(S0_BM5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BM5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_BM5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd6.as("sppl_grp_cd6"), S0_BM6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM6).on(S0_M1.bp_grp_cd6.eq(S0_BM6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BM6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_BM6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd7.as("sppl_grp_cd7"), S0_BM7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM7).on(S0_M1.bp_grp_cd7.eq(S0_BM7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BM7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_BM7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd8.as("sppl_grp_cd8"), S0_BM8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM8).on(S0_M1.bp_grp_cd8.eq(S0_BM8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BM8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_BM8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd9.as("sppl_grp_cd9"), S0_BM9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM9).on(S0_M1.bp_grp_cd9.eq(S0_BM9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BM9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_BM9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M1.bp_grp_cd10.as("sppl_grp_cd10"), S0_BM10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_BM10).on(S0_M1.bp_grp_cd10.eq(S0_BM10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BM10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_BM10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			);
	}
	
	/**
	 * -- MSBDL0210_MST_PURC_FRCST_H_Query_S03
	 */
	static MCQueryPlan MSBDL0210_MST_PURC_FRCST_H_S03() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MSW_PURC_FRCST_FIX_KEY_R S0_WK = MSW_PURC_FRCST_FIX_KEY_R.create("WK");
		MAVM_ITM_UNIT_R S0_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_UNIT_R S0_M2 = MAM_UNIT_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0210_MST_PURC_FRCST_H_Query_S03")
					.mainQuery()
					.select(
						S0_T1.pf_dt.as("pre_pf_dt"),
						S0_T1.sppl_cd,
						S0_T1.wg_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T3.pf_period_typ,
						S0_T3.pf_period_st_dt,
						S0_T3.fix_period_flg.as("pre_fix_period_flg"),
						S0_T3.trd_unit_pf_qty.as("pre_trd_unit_pf_qty"),
						S0_T3.base_unit_pf_qty.as("pre_base_unit_pf_qty"),
						S0_T2.trd_unit_cd.as("pre_trd_unit_cd"),
						S0_M2.unit_nm.as("pre_trd_unit_nm"),
						S0_M1.dec_place.as("pre_trd_unit_dec_place")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.innerJoin(S0_WK).on(
							bracket(
								S0_WK.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.innerJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M1.unit_cd.eq(S0_T2.trd_unit_cd))
							)
						)
						.innerJoin(S0_M2).on(
							bracket(
								S0_M2.unit_cd.eq(S0_T2.trd_unit_cd)
							)
						)
					)
					.where(
						S0_T2.fix_flg.eq(value(true))
					)
			);
	}
	
	/**
	 * -- MSBDL0210_MST_PURC_FRCST_H_Query_S04
	 */
	static MCQueryPlan MSBDL0210_MST_PURC_FRCST_H_S04() {
		MST_PURC_FRCST_H_R S0_T1 = MST_PURC_FRCST_H_R.create("T1");
		MAVM_RD_WG_R S0_DAC = MAVM_RD_WG_R.create("DAC");
		MCTempView S0_W1 = createTempView("W1");
		MST_PURC_FRCST_FIX_R S0_T2 = MST_PURC_FRCST_FIX_R.create("T2");
		MSW_PURC_FRCST_FIX_KEY_R S0_W2 = MSW_PURC_FRCST_FIX_KEY_R.create("W2");
		MST_PURC_FRCST_D_R S0_T3 = MST_PURC_FRCST_D_R.create("T3");
		MSW_PURC_FRCST_D_KEY_R S0_W3 = MSW_PURC_FRCST_D_KEY_R.create("W3");
		MST_PURC_FRCST_H_R S0_T4 = MST_PURC_FRCST_H_R.create("T4");
		MAM_BP_ITM_R S0_M1 = MAM_BP_ITM_R.create("M1");
		MAM_PF_GRP_R S0_M2 = MAM_PF_GRP_R.create("M2");
		MST_PURC_FRCST_H_R S1_TH = MST_PURC_FRCST_H_R.create("TH");
		MSW_PURC_FRCST_H_KEY_R S1_WK = MSW_PURC_FRCST_H_KEY_R.create("WK");
		MST_PURC_FRCST_H_R S1_TP = MST_PURC_FRCST_H_R.create("TP");
		MST_PURC_FRCST_H_R S1_TN = MST_PURC_FRCST_H_R.create("TN");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0210_MST_PURC_FRCST_H_Query_S04")
					.mainQuery()
					.select(
						S0_T1.purc_frcst_no,
						S0_T1.del_flg,
						S0_T4.purc_frcst_no.as("pre_purc_frcst_no"),
						S0_W1.pr("pre_pf_dt"),
						nvl2(
							S0_W1.pr("next_pf_dt"),
							value(false),
							value(true)
						).as("latest_flg"),
						S0_T1.pf_rpt_flg,
						S0_T1.pf_rpt_dt,
						S0_T1.pf_rpt_no,
						S0_T1.del_pf_rpt_flg,
						S0_T1.del_pf_rpt_dt,
						S0_T2.purc_frcst_fix_no,
						S0_T3.purc_frcst_d_no,
						S0_T3.pf_period_end_dt,
						S0_T3.fix_period_flg,
						nvl(
							S0_M2.fix_period_num,
							value(0)
						).as("fix_period_num"),
						S0_T3.trd_unit_schd_qty,
						S0_T3.base_unit_schd_qty,
						S0_M1.pf_fix_flg,
						S0_M1.purc_commit_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								S1_TH.purc_frcst_no,
								S1_TH.sppl_cd,
								S1_TH.wg_cd,
								S1_TH.pf_dt,
								min(S1_TN.pf_dt).as("next_pf_dt"),
								max(S1_TP.pf_dt).as("pre_pf_dt")
							)
							.from(
								S1_TH
								.innerJoin(S1_WK).on(
									bracket(
										S1_WK.purc_frcst_no.eq(S1_TH.purc_frcst_no)
									)
								)
								.leftOuterJoin(S1_TP).on(
									bracket(
										S1_TP.sppl_cd.eq(S1_TH.sppl_cd)
										.and(S1_TP.wg_cd.eq(S1_TH.wg_cd))
										.and(S1_TP.pf_dt.lt(S1_TH.pf_dt))
										.and(S1_TP.del_flg.eq(value(false)))
									)
								)
								.leftOuterJoin(S1_TN).on(
									bracket(
										S1_TN.sppl_cd.eq(S1_TH.sppl_cd)
										.and(S1_TN.wg_cd.eq(S1_TH.wg_cd))
										.and(S1_TN.pf_dt.gt(S1_TH.pf_dt))
										.and(S1_TN.del_flg.eq(value(false)))
									)
								)
							)
							.groupBy(
								S1_TH.purc_frcst_no,
								S1_TH.sppl_cd,
								S1_TH.wg_cd,
								S1_TH.pf_dt
							).view(S0_W1)
						).on(
							bracket(
								S0_W1.pr(S1_TH.purc_frcst_no).eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.purc_frcst_no.eq(S0_T1.purc_frcst_no)
							)
						)
						.innerJoin(S0_W2).on(
							bracket(
								S0_W2.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.purc_frcst_fix_no.eq(S0_T2.purc_frcst_fix_no)
							)
						)
						.innerJoin(S0_W3).on(
							bracket(
								S0_W3.purc_frcst_d_no.eq(S0_T3.purc_frcst_d_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T4.sppl_cd.eq(S0_W1.pr(S1_TH.sppl_cd))
								.and(S0_T4.wg_cd.eq(S0_W1.pr(S1_TH.wg_cd)))
								.and(S0_T4.pf_dt.eq(S0_W1.pr("pre_pf_dt")))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_M1.itm_cd.eq(S0_T2.itm_cd))
								.and(S0_M1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_T1.pf_dt.between(S0_M1.st_dt, S0_M1.end_dt))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.pf_grp_cd.eq(S0_M1.pf_grp_cd)
							)
						)
					)
			);
	}
}