package mcframe.serverMSBE.MSBEL0140;

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
	 * -- MSBEL0140_MAM_LOC_Query_S01
	 */
	static MCQueryPlan MSBEL0140_MAM_LOC_S01() {
		MAM_LOC_R S0_M = MAM_LOC_R.create("M");
		MAW_LOC_KEY_R S0_SW = MAW_LOC_KEY_R.create("SW");
		MAM_LOC_R S1_M = MAM_LOC_R.create("M");
		MAM_LOC_R S2_SM = MAM_LOC_R.create("SM");
		MAW_LOC_KEY_R S2_SW = MAW_LOC_KEY_R.create("SW");
		MAM_LOC_R S3_M = MAM_LOC_R.create("M");
		MAM_LOC_R S4_SM = MAM_LOC_R.create("SM");
		MAW_LOC_KEY_R S4_SW = MAW_LOC_KEY_R.create("SW");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0140_MAM_LOC_Query_S01")
					.mainQuery()
					.select(S0_M.loc_cd)
					.from(
						S0_M
						.innerJoin(S0_SW).on(S0_SW.loc_cd.eq(S0_M.loc_cd))
					)
					.union(
						subQuery()
						.select(S1_M.loc_cd)
						.from(S1_M)
						.where(
							value(0).eq(value(0))
							.and(
								exists(
									subQuery()
									.select(value("X"))
									.from(
										S2_SM
										.innerJoin(S2_SW).on(S2_SW.loc_cd.eq(S2_SM.loc_cd))
									)
									.where(
										value(0).eq(value(0))
										.and(S2_SM.lg_grp_cd.eq(S1_M.lg_grp_cd))
									)
								)
							)
						)
						.union(
							subQuery()
							.select(S3_M.loc_cd)
							.from(S3_M)
							.where(
								value(0).eq(value(0))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S4_SM
											.innerJoin(S4_SW).on(S4_SW.loc_cd.eq(S4_SM.loc_cd))
										)
										.where(
											value(0).eq(value(0))
											.and(S4_SM.alloc_grp_cd.eq(S3_M.alloc_grp_cd))
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL0140_MST_SHIP_PR_Query_S01
	 */
	static MCQueryPlan MSBEL0140_MST_SHIP_PR_S01() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MAM_LOC_R S0_M1 = MAM_LOC_R.create("M1");
		MAM_LG_GRP_R S0_M2 = MAM_LG_GRP_R.create("M2");
		MAM_ALLOC_GRP_R S0_M3 = MAM_ALLOC_GRP_R.create("M3");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MAM_SUNDRY_ITM_R S0_M5 = MAM_SUNDRY_ITM_R.create("M5");
		MAVM_WR_LOC_R S0_DACL = MAVM_WR_LOC_R.create("DACL");
		MAVM_WR_LG_GRP_R S0_DACLG = MAVM_WR_LG_GRP_R.create("DACLG");
		MAVM_WR_ALLOC_GRP_R S0_DACAG = MAVM_WR_ALLOC_GRP_R.create("DACAG");
		MST_SHIP_ALLOC_STS_R S1_ST1 = MST_SHIP_ALLOC_STS_R.create("ST1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0140_MST_SHIP_PR_Query_S01")
					.mainQuery()
					.select(
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T1.alloc_grp_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.loc_cd.as("ship_loc_cd"),
						countAll().as("cnt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.leftOuterJoin(S0_M1).on(S0_M1.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_M2).on(S0_M2.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
						.leftOuterJoin(S0_M3).on(S0_M3.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M4.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M4.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M4.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M5.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M5.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M5.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M5.sno1.eq(S0_T2.sno1))
								.and(S0_M5.sno2.eq(S0_T2.sno2))
								.and(S0_M5.sno3.eq(S0_T2.sno3))
								.and(S0_M5.sno4.eq(S0_T2.sno4))
							)
						)
						.leftOuterJoin(S0_DACL).on(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_DACLG).on(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
						.leftOuterJoin(S0_DACAG).on(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.alloc_typ.eq(value(MAC_ALLOC_TYP.LATER.value())))
						.and(S0_T2.wait_qty.gt(value(0)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T2.ship_inst_qty.eq(value(0)))
						.and(S0_T2.ship_act_qty.eq(value(0)))
						.and(S0_T2.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									value(0).eq(value(0))
									.and(S1_ST1.ship_schd_no.eq(S0_T2.ship_schd_no))
									.and(S1_ST1.alloc_flg.eq(value(false)))
								)
							)
						)
						.and(
							bracket(
								S0_T1.loc_cd.isNotNull()
								.and(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
							)
							.or(
								S0_T1.loc_cd.isNull()
								.and(S0_T1.ship_lg_grp_cd.isNotNull())
								.and(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
							)
							.or(
								S0_T1.loc_cd.isNull()
								.and(S0_T1.ship_lg_grp_cd.isNull())
								.and(S0_T1.alloc_grp_cd.isNotNull())
								.and(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
							)
						)
						.cutoff$and(S0_T2.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.alloc_scope_typ.eq(bind("alloc_scope_typ")))
						.cutoff$and(S0_T1.loc_cd.like(bind("ship_loc_cd")))
						.cutoff$and(S0_M1.loc_nm.like(bind("ship_loc_nm")))
						.cutoff$and(S0_T1.ship_lg_grp_cd.like(bind("ship_lg_grp_cd")))
						.cutoff$and(S0_M2.lg_grp_nm.like(bind("ship_lg_grp_nm")))
						.cutoff$and(S0_T1.alloc_grp_cd.like(bind("alloc_grp_cd")))
						.cutoff$and(S0_M3.alloc_grp_nm.like(bind("alloc_grp_nm")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								nvl(
									S0_T2.itm_nm,
									S0_M5.itm_nm
								),
								S0_M4.itm_nm
							).like(bind("itm_nm"))
						)
					)
					.groupBy(
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T1.alloc_grp_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.loc_cd
					)
					.orderBy(pr("cnt").asc())
			);
	}
	
	/**
	 * -- MSBEL0140_MST_SHIP_PR_Query_S02
	 */
	static MCQueryPlan MSBEL0140_MST_SHIP_PR_S02() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		MAVM_WR_LOC_R S0_DACL = MAVM_WR_LOC_R.create("DACL");
		MAVM_WR_LG_GRP_R S0_DACLG = MAVM_WR_LG_GRP_R.create("DACLG");
		MAVM_WR_ALLOC_GRP_R S0_DACAG = MAVM_WR_ALLOC_GRP_R.create("DACAG");
		MST_SHIP_ALLOC_STS_R S1_ST1 = MST_SHIP_ALLOC_STS_R.create("ST1");
		MAW_BP_KEY_R S2_MW1 = MAW_BP_KEY_R.create("MW1");
		MAW_BP_KEY_R S3_MW2 = MAW_BP_KEY_R.create("MW2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0140_MST_SHIP_PR_Query_S02")
					.mainQuery()
					.select(
						S0_T1.ship_pr_no,
						S0_T1.trd_ptn_typ,
						S0_T1.slo_d_no,
						S0_T1.cst_cd,
						S0_T1.ship_rqst_tm.as("ship_pr_ship_rqst_tm"),
						S0_T1.dlv_rqst_tm,
						nvl2(
							S0_T2.tdlv_cd,
							S0_T2.tdlv_lg_grp_cd,
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T2.dlv_cd,
									S0_T2.dlv_lg_grp_cd,
									S0_T1.ship_to_lg_grp_cd
								),
								S0_T1.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						S0_T1.dlv_id_typ,
						nvl(
							S0_T2.dlv_cd,
							S0_T1.dlv_id_cd
						).as("dlv_id_cd"),
						S0_T1.dlv_str_ln_cd,
						nvl2(
							S0_T2.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T1.ship_to_id_typ
						).as("ship_to_id_typ"),
						nvl(
							nvl(
								S0_T2.tdlv_cd,
								decode(
									S0_T1.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T2.dlv_cd,
									nullValue()
								)
							),
							S0_T1.ship_to_id_cd
						).as("ship_to_id_cd"),
						S0_T1.ship_inst_typ,
						S0_T1.alloc_scope_typ,
						S0_T1.alloc_grp_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.def_loc_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.upd_cntr,
						S0_T1.not_lg_mix_flg,
						S0_T2.ship_schd_no,
						S0_T2.pr_sts_typ,
						S0_T2.ship_inst_d_no,
						S0_T2.dlv_inst_rcpt_no,
						S0_T2.slo_prms_no,
						cases()
							.when(
								S0_T2.iv_schd_qty.gt(value(0))
								.or(S0_T2.fix_flg.eq(value(true)))
							)
								.then(S0_T2.ship_fr_lg_grp_cd)
							.otherwise(S0_T1.ship_lg_grp_cd).as("ship_fr_lg_grp_cd"),
						S0_T2.wg_cd,
						S0_T2.pd_inst_dlv_tm,
						S0_T2.ship_rqst_tm,
						S0_T2.ship_schd_tm,
						S0_T2.dlv_schd_tm,
						S0_T2.ship_term_cd,
						S0_T2.ship_wk_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.itm_nm,
						S0_T2.iv_itm_nm,
						S0_T2.sundry_itm_flg,
						S0_T2.sno1,
						S0_T2.sno1_null_flg,
						S0_T2.sno2,
						S0_T2.sno2_null_flg,
						S0_T2.sno3,
						S0_T2.sno3_null_flg,
						S0_T2.sno4,
						S0_T2.sno4_null_flg,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.ver_no,
						S0_T2.stk_arrv_bp_cd,
						S0_T2.gd_cd,
						S0_T2.quality_typ,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_T2.stk_bp_cd,
						S0_T2.trd_unit_qty,
						S0_T2.trd_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.alloc_qty,
						S0_T2.wait_qty,
						S0_T2.ship_inst_qty,
						S0_T2.ship_act_qty,
						S0_T2.iv_schd_qty,
						S0_T2.iv_act_qty,
						S0_T2.sls_qty,
						S0_T2.dlv_qty,
						S0_T2.ship_ret_qty,
						S0_T2.abort_qty,
						S0_T2.abort_flg,
						S0_T2.not_dt_calc_flg,
						S0_T2.fix_flg,
						S0_T2.cmpl_flg,
						S0_T2.alloc_prio,
						S0_T2.ship_abl_flg,
						S0_T2.ship_lot_chk_tar_flg,
						S0_T2.ship_block_flg,
						S0_T2.inst_bndl_flg,
						S0_T2.not_lot_mix_flg,
						S0_T2.not_sublot_mix_flg,
						S0_T2.vld_dt_fr,
						S0_T2.vld_dt_to,
						S0_T2.ship_skip_flg,
						S0_T2.re_ship_schd_flg,
						S0_T2.intr_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.ship_cnt_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_M2.dec_place.as("base_unit_dec_place"),
						S0_M2.rnd_typ.as("base_unit_rnd_typ"),
						S0_M2.pack_alloc_flg,
						nvl(
							S0_T2.dlv_day_week_typ,
							S0_T3.dlv_day_week_typ
						).as("dlv_day_week_typ"),
						S0_T3.sls_cststk_flg,
						S0_T3.sls_schd_dt
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.leftOuterJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T1.slo_d_no))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_DACL).on(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_DACLG).on(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
						.leftOuterJoin(S0_DACAG).on(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.alloc_typ.eq(value(MAC_ALLOC_TYP.LATER.value())))
						.and(S0_T2.wait_qty.gt(value(0)))
						.and(S0_T2.abort_flg.eq(value(false)))
						.and(S0_T2.ship_inst_qty.eq(value(0)))
						.and(S0_T2.ship_act_qty.eq(value(0)))
						.and(S0_T2.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_ST1)
								.where(
									value(0).eq(value(0))
									.and(S1_ST1.ship_schd_no.eq(S0_T2.ship_schd_no))
									.and(S1_ST1.alloc_flg.eq(value(false)))
								)
							)
						)
						.and(
							bracket(
								S0_T1.loc_cd.isNotNull()
								.and(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
							)
							.or(
								S0_T1.loc_cd.isNull()
								.and(S0_T1.ship_lg_grp_cd.isNotNull())
								.and(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
							)
							.or(
								S0_T1.loc_cd.isNull()
								.and(S0_T1.ship_lg_grp_cd.isNull())
								.and(S0_T1.alloc_grp_cd.isNotNull())
								.and(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
							)
						)
						.cutoff$and(S0_T2.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.alloc_scope_typ.eq(bind("alloc_scope_typ")))
						.and(
							decode(
								S0_T1.loc_cd,
								bind("ship_loc_cd"),
								value(1)
							).eq(value(1))
						)
						.and(
							decode(
								S0_T1.ship_lg_grp_cd,
								bind("ship_lg_grp_cd"),
								value(1)
							).eq(value(1))
						)
						.and(
							decode(
								S0_T1.alloc_grp_cd,
								bind("alloc_grp_cd"),
								value(1)
							).eq(value(1))
						)
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							bracket(
								bind("cst_slct_rstrct").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S2_MW1)
										.where(
											value(0).eq(value(0))
											.and(S2_MW1.bp_cd.eq(S0_T1.cst_cd))
										)
									)
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("cst_slct_other").eq(value(true))
								.and(
									notExists(
										subQuery()
										.select(value("X"))
										.from(S3_MW2)
										.where(
											value(0).eq(value(0))
											.and(S3_MW2.bp_cd.eq(S0_T1.cst_cd))
										)
									)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.conv_base_qty,
							m.conv_qty,
							m.pack_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
							r.setBooleanNE("pack_flg", m.pack_flg());
					})
				)
			);
	}
}