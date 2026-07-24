package mcframe.serverMSBB.MSBBL1230;

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
	 * -- MSBBL1230_MST_DLV_INST_RCPT_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_DLV_INST_RCPT_S01() {
		MST_DLV_INST_RCPT_R S0_T1 = MST_DLV_INST_RCPT_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_DLV_INST_RCPT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dlv_inst_rcpt_no,
						S0_T1.slo_d_no,
						S0_T1.dlv_inst_rcpt_rev,
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.cst_dlv_inst_no,
						S0_T1.cst_dlv_inst_rev,
						S0_T1.cst_dlv_inst_d_no,
						S0_T1.cst_dlv_inst_rmrks,
						S0_T1.cst_dlv_inst_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.edi_flg,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.slo_d_no.eq(S0_T2.slo_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.slo_no.eq(S0_T3.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T3.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T2.slo_no.eq(bind("slo_no")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(
						S0_T1.slo_d_no.asc(),
						S0_T1.dlv_inst_rcpt_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_DW_SLO_PRMS_D_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_DW_SLO_PRMS_D_S01() {
		MST_SLO_PRMS_P_R S0_T1 = MST_SLO_PRMS_P_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_DW_SLO_PRMS_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slo_prms_no,
						S0_T1.slo_prms_rev,
						S0_T1.slo_d_no,
						S0_T1.dlv_inst_rcpt_no,
						trunc(
							S0_T1.prms_dlv_tm,
							MCDateFmt.DD
						).as("prms_dlv_dt"),
						S0_T1.prms_dlv_tm.as("prms_dlv_hm"),
						S0_T1.trd_unit_prms_qty,
						S0_T2.trd_unit_cd,
						S0_T1.slo_prms_h_no,
						S0_T1.can_flg,
						S0_T1.prms_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T1.slo_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.slo_no.eq(S0_T1.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T3.sls_dpt_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
					)
					.orderBy(
						S0_T1.slo_prms_h_no.desc(),
						S0_T1.slo_prms_rev.desc(),
						S0_T1.slo_prms_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SHIP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SHIP_ACT_D_S01() {
		MST_SHIP_ACT_D_R S0_T1 = MST_SHIP_ACT_D_R.create("T1");
		MST_SHIP_ALLOC_STS_R S0_T2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MST_SHIP_SCHD_R S0_T3 = MST_SHIP_SCHD_R.create("T3");
		MST_SHIP_PR_R S0_T4 = MST_SHIP_PR_R.create("T4");
		MST_SLO_D_R S0_T5 = MST_SLO_D_R.create("T5");
		MST_SHIP_ACT_R S0_T7 = MST_SHIP_ACT_R.create("T7");
		MST_SLO_R S0_T8 = MST_SLO_R.create("T8");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SHIP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ship_act_d_no,
						S0_T5.slo_d_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						trunc(
							S0_T7.ship_tm,
							MCDateFmt.DD
						).as("ship_dt"),
						S0_T7.ship_tm.as("ship_hm"),
						S0_T1.ship_loc_cd,
						S0_T1.ship_str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.ver_no,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.rsn_cd,
						S0_T1.itm_cd.as("join_itm_cd_"),
						S0_T1.itm_sub1.as("join_itm_sub1_"),
						S0_T1.itm_sub2.as("join_itm_sub2_"),
						S0_T1.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.ship_alloc_sts_no.eq(S0_T2.ship_alloc_sts_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.ship_schd_no.eq(S0_T3.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.ship_pr_no.eq(S0_T4.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T4.slo_d_no.eq(S0_T5.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T1.ship_act_no.eq(S0_T7.ship_act_no)
							)
						)
						.innerJoin(S0_T8).on(
							bracket(
								S0_T5.slo_no.eq(S0_T8.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T8.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T5.slo_no.eq(bind("slo_no")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(
						S0_T1.dlv_slip_no.asc(),
						S0_T1.dlv_slip_d_no.asc(),
						S0_T1.ship_act_d_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.first_gr_dt,
							m.lmt_dt,
							m.lot_rmrks,
							m.vld_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("first_gr_dt", m.first_gr_dt());
							r.setDateNE("vld_dt", m.vld_dt());
							r.setDateNE("lmt_dt", m.lmt_dt());
							r.setStringNE("lot_rmrks", m.lot_rmrks());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("ship_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd"),
							r.getStringNE("ship_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SHIP_ALLOC_STS_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SHIP_ALLOC_STS_S01() {
		MST_SHIP_ALLOC_STS_R S0_T1 = MST_SHIP_ALLOC_STS_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_PR_R S0_T3 = MST_SHIP_PR_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_SLO_R S0_T5 = MST_SLO_R.create("T5");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SHIP_ALLOC_STS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ship_alloc_sts_no,
						S0_T1.alloc_flg,
						S0_T1.alloc_wait_flg,
						decode(
							S0_T1.ship_inst_d_no,
							nullValue(),
							value(false),
							value(true)
						).as("ship_inst_flg"),
						S0_T1.ship_schd_no,
						S0_T2.dlv_inst_rcpt_no,
						S0_T3.slo_d_no,
						S0_T2.ship_fr_lg_grp_cd.as("ship_fr_lg_grp_cd"),
						S0_T1.ship_loc_cd,
						S0_T1.ship_str_ln_cd,
						S0_T1.stk_arrv_bp_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.ver_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.pack_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.ent_unit_qty,
						S0_T1.ent_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.ship_act_qty,
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T2.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T2.ship_pr_no.eq(S0_T3.ship_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T3.slo_d_no.eq(S0_T4.slo_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T4.slo_no.eq(S0_T5.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T5.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T4.slo_no.eq(bind("slo_no")))
					)
					.orderBy(
						S0_T3.slo_d_no.asc(),
						S0_T1.ship_schd_no.asc(),
						S0_T2.dlv_inst_rcpt_no.asc(),
						S0_T1.ship_alloc_sts_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd"),
							r.getStringNE("ship_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("ent_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ent_unit_nm", m.unit_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("ent_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("ent_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_DLV_INST_RCPT_R S0_T2 = MST_DLV_INST_RCPT_R.create("T2");
		MST_SHIP_PR_R S0_T3 = MST_SHIP_PR_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MST_SLO_R S0_T5 = MST_SLO_R.create("T5");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.ship_schd_no,
						S0_T1.pr_sts_typ,
						S0_T1.ship_pr_no,
						S0_T3.slo_d_no,
						S0_T1.dlv_inst_rcpt_no,
						S0_T1.slo_prms_no,
						S0_T1.slo_prms_no.as("org_slo_prms_no"),
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.wg_cd,
						trunc(
							S0_T1.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T1.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						trunc(
							S0_T1.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T1.ship_rqst_tm.as("ship_rqst_hm"),
						S0_T1.not_dt_calc_flg,
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.ship_term_cd,
						S0_T1.ship_wk_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.alloc_qty,
						S0_T1.wait_qty,
						S0_T1.ship_inst_qty,
						S0_T1.ship_act_qty,
						S0_T1.iv_schd_qty,
						S0_T1.iv_act_qty,
						S0_T1.sls_qty,
						S0_T1.ship_ret_qty,
						S0_T1.abort_flg,
						S0_T1.abort_flg.as("org_abort_flg"),
						S0_T1.fix_flg,
						S0_T1.re_ship_schd_flg,
						S0_T1.ship_block_flg,
						decode(
							S0_T1.slo_prms_no,
							nullValue(),
							value(false),
							value(true)
						).as("answd_flg"),
						S0_T1.ship_abl_flg,
						S0_T1.cmpl_flg,
						S0_T1.trd_d_rmrks,
						S0_T1.ship_cnt_rmrks,
						trunc(
							S0_T2.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_inst_dt"),
						S0_T2.dlv_rqst_tm.as("dlv_inst_hm"),
						S0_T1.sls_act_d_no,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M9.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt.as("dlv_cntct_dpt"),
						S0_T1.dlv_cntct_psn.as("dlv_cntct_psn"),
						S0_T1.dlv_zip_cd.as("dlv_zip_cd"),
						S0_T1.dlv_addr1.as("dlv_addr1"),
						S0_T1.dlv_addr2.as("dlv_addr2"),
						S0_T1.dlv_addr3.as("dlv_addr3"),
						S0_T1.dlv_addr4.as("dlv_addr4"),
						S0_T1.dlv_tel.as("dlv_tel"),
						S0_T1.dlv_fax.as("dlv_fax"),
						S0_M9.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T1.pri_prnt_flg,
						S0_M9.tdlv_req_flg,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						decode(
							S0_T1.tdlv_sundry_flg,
							value(true),
							S0_T1.tdlv_nm,
							S0_M12.bp_nm
						).as("tdlv_nm"),
						S0_T1.via_dlv_typ,
						S0_T1.tdlv_cntct_dpt.as("tdlv_cntct_dpt"),
						S0_T1.tdlv_cntct_psn.as("tdlv_cntct_psn"),
						S0_T1.tdlv_zip_cd.as("tdlv_zip_cd"),
						S0_T1.tdlv_addr1.as("tdlv_addr1"),
						S0_T1.tdlv_addr2.as("tdlv_addr2"),
						S0_T1.tdlv_addr3.as("tdlv_addr3"),
						S0_T1.tdlv_addr4.as("tdlv_addr4"),
						S0_T1.tdlv_tel.as("tdlv_tel"),
						S0_T1.tdlv_fax.as("tdlv_fax"),
						S0_M12.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_lg_grp_cd.as("tdlv_lg_grp_cd"),
						S0_T1.dlv_day_week_typ,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.itm_cd.as("join_itm_cd_"),
						S0_T1.itm_sub1.as("join_itm_sub1_"),
						S0_T1.itm_sub2.as("join_itm_sub2_"),
						S0_T1.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.dlv_inst_rcpt_no.eq(S0_T2.dlv_inst_rcpt_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T3.ship_pr_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.slo_d_no.eq(S0_T3.slo_d_no)
							)
						)
						.innerJoin(S0_T5).on(
							bracket(
								S0_T4.slo_no.eq(S0_T5.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T5.sls_dpt_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(S0_T1.dlv_cd.eq(S0_M9.bp_cd))
						.leftOuterJoin(S0_M12).on(S0_T1.tdlv_cd.eq(S0_M12.bp_cd))
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T4.slo_no.eq(bind("slo_no")))
					)
					.orderBy(
						S0_T3.slo_d_no.asc(),
						S0_T1.dlv_inst_rcpt_no.asc(),
						S0_T1.ship_schd_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("ship_term_cd")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
					}),
					j -> j
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("ship_wk_cd")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("tdlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_lg_grp_nm", m.lg_grp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SLO_D_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SLO_D_S01() {
		MST_SLO_D_R S0_T1 = MST_SLO_D_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M15 = MAM_DPT_R.create("M15");
		MAM_BP_R S0_M19 = MAM_BP_R.create("M19");
		MAM_ITM_LCL_R S0_M31 = MAM_ITM_LCL_R.create("M31");
		MST_SHIP_SCHD_R S1_TM = MST_SHIP_SCHD_R.create("TM");
		MAM_EDI_IF_CTL_R S1_MA = MAM_EDI_IF_CTL_R.create("MA");
		MST_SLO_PRMS_H_R S0_T4 = MST_SLO_PRMS_H_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SLO_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.abort_flg,
						S0_T2.sls_sts_typ,
						S0_T1.disp_seq,
						S0_T1.slo_d_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_T1.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.sundry_itm_flg,
						S0_M1.comp_spec_typ,
						decode(
							S0_M1.sundry_itm_flg,
							value(true),
							S0_T1.iv_itm_nm,
							nvl(
								S0_M31.itm_nm,
								S0_M1.itm_nm
							)
						).as("iv_itm_nm"),
						S0_M1.stk_mng_typ,
						S0_M1.asset_mng_typ,
						S0_M1.dscnt_itm_flg,
						S0_T1.cntry_org_cd,
						S0_T1.vmi_flg,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.upri_not_tgt_flg,
						S0_T1.cost_upri,
						S0_T1.cost_amt,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_tax_amt,
						S0_T1.trd_cur_amt.add(S0_T1.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.dscnt_rsn_cd,
						S0_T1.iv_upri,
						S0_T1.iv_amt,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.bill_crryovr_times,
						S0_T1.gd_cd,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.sno1_null_flg,
						S0_T1.sno2_null_flg,
						S0_T1.sno3_null_flg,
						S0_T1.sno4_null_flg,
						S0_T1.set_itm_grp_no,
						trunc(
							S0_T1.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T1.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T1.sls_schd_dt,
						S0_T1.accpt_schd_dt,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M5.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt.as("dlv_cntct_dpt"),
						S0_T1.dlv_cntct_psn.as("dlv_cntct_psn"),
						S0_T1.dlv_zip_cd.as("dlv_zip_cd"),
						S0_T1.dlv_addr1.as("dlv_addr1"),
						S0_T1.dlv_addr2.as("dlv_addr2"),
						S0_T1.dlv_addr3.as("dlv_addr3"),
						S0_T1.dlv_addr4.as("dlv_addr4"),
						S0_T1.dlv_tel.as("dlv_tel"),
						S0_T1.dlv_fax.as("dlv_fax"),
						S0_M5.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T1.pri_prnt_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						decode(
							S0_T1.tdlv_sundry_flg,
							value(true),
							S0_T1.tdlv_nm,
							S0_M19.bp_nm
						).as("tdlv_nm"),
						S0_T1.via_dlv_typ,
						S0_T1.tdlv_cntct_dpt.as("tdlv_cntct_dpt"),
						S0_T1.tdlv_cntct_psn.as("tdlv_cntct_psn"),
						S0_T1.tdlv_zip_cd.as("tdlv_zip_cd"),
						S0_T1.tdlv_addr1.as("tdlv_addr1"),
						S0_T1.tdlv_addr2.as("tdlv_addr2"),
						S0_T1.tdlv_addr3.as("tdlv_addr3"),
						S0_T1.tdlv_addr4.as("tdlv_addr4"),
						S0_T1.tdlv_tel.as("tdlv_tel"),
						S0_T1.tdlv_fax.as("tdlv_fax"),
						S0_M19.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_lg_grp_cd.as("tdlv_lg_grp_cd"),
						S0_T1.dlv_day_week_typ,
						S0_T1.sls_cststk_flg,
						S0_T1.proc_typ,
						S0_T1.ship_inst_typ,
						S0_T1.ship_schd_split_typ,
						S0_T1.alloc_scope_typ,
						S0_T1.not_lg_mix_flg,
						S0_T1.alloc_typ,
						S0_T1.rqst_to_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.wg_rqst_cnt_rmrks,
						S0_T1.alloc_grp_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.def_loc_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.ver_no,
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						S0_T1.ship_term_cd,
						decode(
							bracket(
								subQuery()
								.select(countAll())
								.from(S1_TM)
								.where(
									S1_TM.ship_pr_no.eq(S0_T2.ship_pr_no)
									.and(S1_TM.ship_block_flg.eq(value(true)))
								)
							),
							value(0),
							value(false),
							value(true)
						).as("ship_block_flg"),
						S0_T1.ship_cnt_rmrks,
						S0_T1.cst_po_d_no,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.cst_po_d_rmrks,
						S0_T1.sls_rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_M15.dpt_nm.as("bd_dpt_nm"),
						S0_T1.sls_upri_req_typ,
						S0_T1.trd_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_sub_d_char1,
						S0_T1.edi_sub_d_char2,
						S0_T1.edi_sub_d_char3,
						S0_T1.edi_sub_d_char4,
						S0_T1.edi_sub_d_char5,
						S0_T1.edi_sub_d_num1,
						S0_T1.edi_sub_d_dt1,
						S0_T1.can_flg,
						S0_T1.can_rsn_cd,
						S0_T1.slo_d_can_rmkrs,
						decode(
							bracket(
								subQuery()
								.select(S1_MA.bp_cd)
								.from(S1_MA)
								.where(
									S1_MA.bp_cd.eq(S0_T3.cst_cd)
									.and(S1_MA.if_proc_typ.eq(value(MAC_IF_PROC_TYP.SLO_PRMS_SEND.value())))
									.and(bind("today").between(S1_MA.st_dt, S1_MA.end_dt))
									.and(S1_MA.del_flg.eq(value(false)))
								)
							),
							nullValue(),
							value(false),
							value(true)
						).as("edi_send_flg"),
						subQuery()
						.select(S0_T4.edi_prms_flg)
						.from(S0_T4)
						.where(
							S0_T1.slo_d_no.eq(S0_T4.slo_d_no)
							.and(S0_T4.can_flg.eq(value(false)))
						).as("edi_prms_flg"),
						S0_T2.ship_cmpl_flg,
						S0_T2.sls_cmpl_flg,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T2.ship_inst_qty,
						S0_T2.ship_act_qty,
						S0_T2.iv_schd_qty,
						S0_T2.iv_act_qty,
						S0_T2.sls_qty,
						S0_T2.ship_ret_qty,
						S0_T2.re_ship_schd_qty,
						S0_T2.ship_schd_abort_qty,
						S0_T2.sls_schd_abort_qty,
						S0_T1.qtn_d_no,
						S0_T2.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T1.upd_cntr.as("slo_d_upd_cntr"),
						S0_T2.ship_schd_abort_qty.as("abort_qty"),
						S0_T2.base_unit_qty.as("ship_pr_base_unit_qty")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.slo_d_no.eq(S0_T2.slo_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T1.slo_no.eq(S0_T3.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T3.sls_dpt_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.dlv_cd.eq(S0_M5.bp_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M15.dpt_cd)
								.and(S0_T3.slo_dt.between(S0_M15.st_dt, S0_M15.end_dt))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T1.tdlv_cd.eq(S0_M19.bp_cd)
							)
						)
						.leftOuterJoin(S0_M31).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M31.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M31.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M31.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M31.itm_sub3))
								.and(S0_M5.prnt_lcl_cd.eq(S0_M31.lcl_cd))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
					)
					.orderBy(S0_T1.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_to_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_to_loc_nm", m.loc_nm());
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
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_SHIP_TERM_R.class, r -> toCondition(
							r.getStringNE("ship_term_cd")
						))
						.addSelect(m -> toArray(
							m.ship_term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_term_nm", m.ship_term_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("sls_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("can_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("can_rsn_nm", m.slo_rsn_nm());
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("tdlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("dlv_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("dlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("def_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("def_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("wg_cd", m.wg_cd());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SLO_D_Query_S02
	 */
	static MCQueryPlan MSBBL1230_MST_SLO_D_S02() {
		MST_SLO_D_R S0_T1 = MST_SLO_D_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SHIP_SCHD_R S0_T3 = MST_SHIP_SCHD_R.create("T3");
		MST_SLO_D_R S1_ST1 = MST_SLO_D_R.create("ST1");
		MST_SHIP_PR_R S1_ST2 = MST_SHIP_PR_R.create("ST2");
		MST_SHIP_SCHD_R S1_ST3 = MST_SHIP_SCHD_R.create("ST3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SLO_D_Query_S02")
					.mainQuery()
					.selectDistinct(
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.dlv_cd,
						S0_T1.tdlv_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.slo_d_no.eq(S0_T2.slo_d_no))
						.innerJoin(S0_T3).on(S0_T2.ship_pr_no.eq(S0_T3.ship_pr_no))
					)
					.where(
						S0_T1.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NO_PICK.value()))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T3.abort_flg.eq(value(false)))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(
									S1_ST1
									.innerJoin(S1_ST2).on(S1_ST1.slo_d_no.eq(S1_ST2.slo_d_no))
									.innerJoin(S1_ST3).on(S1_ST2.ship_pr_no.eq(S1_ST3.ship_pr_no))
								)
								.where(
									S1_ST1.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.PICK.value()))
									.and(S1_ST1.can_flg.eq(value(false)))
									.and(S1_ST3.abort_flg.eq(value(false)))
									.and(S1_ST1.slo_no.eq(S0_T1.slo_no))
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
											S1_ST2.ship_to_id_typ
										).eq(S0_T2.ship_to_id_typ)
									)
									.and(
										nvl(
											nvl(
												S1_ST3.tdlv_cd,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													S1_ST3.dlv_cd,
													nullValue()
												)
											),
											S1_ST2.ship_to_id_cd
										).eq(S0_T2.ship_to_id_cd)
									)
									.and(
										bracket(
											cases()
												.when(
													S1_ST3.tdlv_cd.isNotNull()
													.and(S1_ST3.tdlv_sundry_flg.eq(value(true)))
												)
													.then(S1_ST3.tdlv_nm)
												.when(
													S1_ST3.tdlv_cd.isNull()
													.and(S1_ST3.dlv_cd.isNotNull())
													.and(S1_ST2.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.DLV.value())))
													.and(S1_ST3.dlv_sundry_flg.eq(value(true)))
												)
													.then(S1_ST3.dlv_nm)
												.when(
													S1_ST3.tdlv_cd.isNull()
													.and(
														S1_ST2.ship_to_id_typ.neq(value(MSC_SHIP_TO_ID_TYP.DLV.value()))
														.or(S1_ST3.dlv_cd.isNull())
														.or(S1_ST3.dlv_sundry_flg.eq(value(false)))
													)
													.and(S1_ST2.ship_to_sundry_flg.eq(value(true)))
												)
													.then(S1_ST2.ship_to_id_nm)
												.otherwise(nullValue())
										).eq(S0_T2.ship_to_id_nm)
										.or(
											bracket(
												cases()
													.when(
														S1_ST3.tdlv_cd.isNotNull()
														.and(S1_ST3.tdlv_sundry_flg.eq(value(true)))
													)
														.then(S1_ST3.tdlv_nm)
													.when(
														S1_ST3.tdlv_cd.isNull()
														.and(S1_ST3.dlv_cd.isNotNull())
														.and(S1_ST2.ship_to_id_typ.eq(value(MSC_SHIP_TO_ID_TYP.DLV.value())))
														.and(S1_ST3.dlv_sundry_flg.eq(value(true)))
													)
														.then(S1_ST3.dlv_nm)
													.when(
														S1_ST3.tdlv_cd.isNull()
														.and(
															S1_ST2.ship_to_id_typ.neq(value(MSC_SHIP_TO_ID_TYP.DLV.value()))
															.or(S1_ST3.dlv_cd.isNull())
															.or(S1_ST3.dlv_sundry_flg.eq(value(false)))
														)
														.and(S1_ST2.ship_to_sundry_flg.eq(value(true)))
													)
														.then(S1_ST2.ship_to_id_nm)
													.otherwise(nullValue())
											).isNull()
											.and(S0_T2.ship_to_id_nm.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_zip_cd,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_zip_cd,
													S1_ST2.ship_to_zip_cd
												),
												S1_ST2.ship_to_zip_cd
											)
										).eq(S0_T2.ship_to_zip_cd)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_zip_cd,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_zip_cd,
														S1_ST2.ship_to_zip_cd
													),
													S1_ST2.ship_to_zip_cd
												)
											).isNull()
											.and(S0_T2.ship_to_zip_cd.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr1,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr1,
													S1_ST2.ship_to_addr1
												),
												S1_ST2.ship_to_addr1
											)
										).eq(S0_T2.ship_to_addr1)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr1,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr1,
														S1_ST2.ship_to_addr1
													),
													S1_ST2.ship_to_addr1
												)
											).isNull()
											.and(S0_T2.ship_to_addr1.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr2,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr2,
													S1_ST2.ship_to_addr2
												),
												S1_ST2.ship_to_addr2
											)
										).eq(S0_T2.ship_to_addr2)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr2,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr2,
														S1_ST2.ship_to_addr2
													),
													S1_ST2.ship_to_addr2
												)
											).isNull()
											.and(S0_T2.ship_to_addr2.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr3,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr3,
													S1_ST2.ship_to_addr3
												),
												S1_ST2.ship_to_addr3
											)
										).eq(S0_T2.ship_to_addr3)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr3,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr3,
														S1_ST2.ship_to_addr3
													),
													S1_ST2.ship_to_addr3
												)
											).isNull()
											.and(S0_T2.ship_to_addr3.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_addr4,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_addr4,
													S1_ST2.ship_to_addr4
												),
												S1_ST2.ship_to_addr4
											)
										).eq(S0_T2.ship_to_addr4)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_addr4,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_addr4,
														S1_ST2.ship_to_addr4
													),
													S1_ST2.ship_to_addr4
												)
											).isNull()
											.and(S0_T2.ship_to_addr4.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_cntct_dpt,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_cntct_dpt,
													S1_ST2.ship_to_cntct_dpt
												),
												S1_ST2.ship_to_cntct_dpt
											)
										).eq(S0_T2.ship_to_cntct_dpt)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_cntct_dpt,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_cntct_dpt,
														S1_ST2.ship_to_cntct_dpt
													),
													S1_ST2.ship_to_cntct_dpt
												)
											).isNull()
											.and(S0_T2.ship_to_cntct_dpt.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_cntct_psn,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_cntct_psn,
													S1_ST2.ship_to_cntct_psn
												),
												S1_ST2.ship_to_cntct_psn
											)
										).eq(S0_T2.ship_to_cntct_psn)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_cntct_psn,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_cntct_psn,
														S1_ST2.ship_to_cntct_psn
													),
													S1_ST2.ship_to_cntct_psn
												)
											).isNull()
											.and(S0_T2.ship_to_cntct_psn.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_tel,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_tel,
													S1_ST2.ship_to_tel
												),
												S1_ST2.ship_to_tel
											)
										).eq(S0_T2.ship_to_tel)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_tel,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_tel,
														S1_ST2.ship_to_tel
													),
													S1_ST2.ship_to_tel
												)
											).isNull()
											.and(S0_T2.ship_to_tel.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_fax,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_fax,
													S1_ST2.ship_to_fax
												),
												S1_ST2.ship_to_fax
											)
										).eq(S0_T2.ship_to_fax)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_fax,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_fax,
														S1_ST2.ship_to_fax
													),
													S1_ST2.ship_to_fax
												)
											).isNull()
											.and(S0_T2.ship_to_fax.isNull())
										)
									)
									.and(
										nvl(
											S1_ST3.via_dlv_typ,
											S1_ST2.via_dlv_typ
										).eq(S0_T2.via_dlv_typ)
										.or(
											nvl(
												S1_ST3.via_dlv_typ,
												S1_ST2.via_dlv_typ
											).isNull()
											.and(S0_T2.via_dlv_typ.isNull())
										)
									)
									.and(
										nvl2(
											S1_ST3.tdlv_cd,
											S1_ST3.tdlv_lg_grp_cd,
											decode(
												S1_ST2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S1_ST3.dlv_cd,
													S1_ST3.dlv_lg_grp_cd,
													S1_ST2.ship_to_lg_grp_cd
												),
												S1_ST2.ship_to_lg_grp_cd
											)
										).eq(S0_T2.ship_to_lg_grp_cd)
										.or(
											nvl2(
												S1_ST3.tdlv_cd,
												S1_ST3.tdlv_lg_grp_cd,
												decode(
													S1_ST2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													nvl2(
														S1_ST3.dlv_cd,
														S1_ST3.dlv_lg_grp_cd,
														S1_ST2.ship_to_lg_grp_cd
													),
													S1_ST2.ship_to_lg_grp_cd
												)
											).isNull()
											.and(S0_T2.ship_to_lg_grp_cd.isNull())
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SLO_PRMS_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SLO_PRMS_S01() {
		MST_SLO_PRMS_R S0_T1 = MST_SLO_PRMS_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MST_SLO_PRMS_H_R S0_T4 = MST_SLO_PRMS_H_R.create("T4");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SLO_PRMS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slo_prms_no,
						S0_T1.slo_prms_rev,
						S0_T1.slo_d_no,
						S0_T1.dlv_inst_rcpt_no,
						trunc(
							S0_T1.prms_dlv_tm,
							MCDateFmt.DD
						).as("prms_dlv_dt"),
						S0_T1.prms_dlv_tm.as("prms_dlv_hm"),
						S0_T4.slo_prms_h_no,
						S0_T4.prms_prnt_tm,
						decode(S0_T4.slo_prms_prnt_flg,
								value(true),
								S0_T4.last_prms_rev,
								decode(S0_T4.last_prms_rev,
										nullValue(),
										value(1),
										S0_T4.last_prms_rev.add(value(1)))
								).as("last_prms_rev"),
						S0_T4.slo_prms_prnt_flg,
						S0_T1.trd_unit_prms_qty,
						S0_T1.base_unit_prms_qty,
						S0_T1.prms_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T1.slo_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.slo_no.eq(S0_T2.slo_no)
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T1.slo_prms_h_no.eq(S0_T4.slo_prms_h_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T3.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T2.slo_no.eq(bind("slo_no")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(
						S0_T1.slo_d_no.asc(),
						S0_T1.dlv_inst_rcpt_no.asc(),
						S0_T1.slo_prms_no.asc()
					)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SLO_PRMS_Query_S02
	 */
	static MCQueryPlan MSBBL1230_MST_SLO_PRMS_S02() {
		MST_SLO_PRMS_P_R S0_T1 = MST_SLO_PRMS_P_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SLO_PRMS_Query_S02")
					.mainQuery()
					.select(max(S0_T1.slo_prms_rev).as("slo_prms_rev"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.slo_d_no.eq(bind("slo_d_no")))
					)
			);
	}
	/**
	 * -- MSBBL1230_MST_SLO_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SLO_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MAM_CO_R S0_M8 = MAM_CO_R.create("M8");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slo_no,
						S0_T1.slo_rev,
						S0_T1.slo_dt,
						S0_T1.slo_typ,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.cst_cd,
						S0_T1.sls_basis_typ,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M5.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.ar_dpt_cd,
						S0_M11.dpt_nm.as("ar_dpt_nm"),
						S0_T1.assort_typ,
						S0_T1.can_flg,
						S0_T1.cst_po_no,
						S0_T1.cst_po_rev,
						S0_T1.trd_cur_cd,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_M8.base_cur_cd,
						S0_M8.ptax_cur_cd,
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.wrk_no,
						S0_T1.iv_no,
						S0_T1.adv_ship_ctrl_typ,
						S0_T1.adv_bill_amt,
						S0_T1.adv_rcv_amt,
						S0_T1.rcpt_dt,
						S0_T1.rcpt_usr_cd,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T1.cst_po_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.edi_flg,
						S0_T1.can_rsn_cd,
						S0_T1.can_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.edi_sub_char1,
						S0_T1.edi_sub_char2,
						S0_T1.edi_sub_char3,
						S0_T1.edi_sub_char4,
						S0_T1.edi_sub_char5,
						S0_T1.edi_sub_num1,
						S0_T1.edi_sub_dt1,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.upd_cntr.as("slo_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.sls_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								value(1).eq(value(1))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T1.ar_dpt_cd.eq(S0_M11.dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.acst_cd,
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
							r.setStringNE("acst_cd", m.acst_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("acst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("acst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("sls_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sls_usr_nm", m.usr_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("base_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("base_cur_nm", m.cur_nm());
							r.setNumberNE("base_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("base_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ptax_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ptax_cur_nm", m.cur_nm());
							r.setNumberNE("ptax_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ptax_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MST_SLO_RSN_R.class, r -> toCondition(
							r.getStringNE("can_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.slo_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("can_rsn_nm", m.slo_rsn_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rcpt_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rcpt_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SLO_STS_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SLO_STS_S01() {
		MST_SLO_STS_R S0_T1 = MST_SLO_STS_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SLO_STS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slo_sts_no,
						S0_T1.slo_d_no,
						S0_T1.slo_sts_typ,
						S0_T1.unit_cd,
						S0_T1.qty,
						S0_T1.cur_cd,
						S0_T1.upri,
						S0_T1.amt,
						S0_T1.tax_cd,
						S0_T1.tax_amt,
						S0_T1.loc_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.alloc_grp_cd,
						S0_T1.slo_prms_rev,
						S0_T1.iv_no,
						S0_T1.iv_d_no,
						S0_T1.rcpt_iv_no,
						S0_T1.rcpt_iv_d_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T1.bill_no,
						S0_T1.ac_dt,
						trunc(
							S0_T1.biz_tm,
							MCDateFmt.DD
						).as("biz_dt"),
						S0_T1.biz_tm.as("biz_hm"),
						trunc(
							S0_T1.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T1.st_schd_tm.as("st_schd_hm"),
						trunc(
							S0_T1.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T1.end_schd_tm.as("end_schd_hm"),
						trunc(
							S0_T1.st_act_tm,
							MCDateFmt.DD
						).as("st_act_dt"),
						S0_T1.st_act_tm.as("st_act_hm"),
						trunc(
							S0_T1.end_act_tm,
							MCDateFmt.DD
						).as("end_act_dt"),
						S0_T1.end_act_tm.as("end_act_hm"),
						S0_T1.ship_inst_no,
						S0_T1.ship_inst_d_no,
						S0_T1.arr_act_no,
						S0_T1.sls_act_no,
						S0_T1.sls_act_d_no,
						S0_T1.po_no,
						S0_T1.po_d_no,
						S0_T1.purc_act_no,
						S0_T1.purc_act_d_no,
						S0_T1.wg_rqst_no,
						S0_T1.dlv_inst_no,
						S0_T1.dlv_inst_d_no,
						S0_T1.dlv_inst_rcpt_no,
						S0_T1.itm_ord_no,
						S0_T1.mfg_inst_no,
						S0_T1.mfg_act_no,
						S0_T1.insp_no,
						S0_T1.insp_act_no,
						S0_T1.xfr_inst_no,
						S0_T1.xfr_inst_d_no,
						S0_T1.xfr_act_no,
						S0_T1.xfr_act_d_no,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_srv_req_no,
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.slo_d_no.eq(S0_T2.slo_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.slo_no.eq(S0_T3.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T3.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T2.slo_no.eq(bind("slo_no")))
					)
					.orderBy(
						S0_T1.slo_d_no.asc(),
						S0_T1.slo_sts_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_SLS_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_SLS_SCHD_S01() {
		MST_SLS_SCHD_R S0_T1 = MST_SLS_SCHD_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_DLV_SLIP_D_R S0_T3 = MST_DLV_SLIP_D_R.create("T3");
		MST_DLV_SLIP_R S0_T4 = MST_DLV_SLIP_R.create("T4");
		MST_PURC_ACT_D_R S0_T8 = MST_PURC_ACT_D_R.create("T8");
		MST_PURC_ACT_R S0_T9 = MST_PURC_ACT_R.create("T9");
		MST_SHIP_ACT_D_R S1_W = MST_SHIP_ACT_D_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_SLS_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.sls_schd_dt,
						S0_T1.abort_flg,
						S0_T1.sls_schd_no,
						S0_T1.slo_d_no,
						S0_T1.dlv_inst_rcpt_no,
						S0_T1.ship_schd_no,
						S0_T4.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T1.iv_no,
						S0_T1.iv_d_no,
						S0_T1.wg_rqst_no,
						S0_T1.po_schd_no,
						S0_T1.purc_schd_no,
						S0_T9.purc_act_no,
						S0_T1.purc_act_d_no,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.sls_ac_abl_flg,
						S0_T1.cmpl_flg,
						S0_T1.base_unit_abort_qty,
						S0_T1.base_unit_sls_qty,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.slo_d_no.eq(S0_T2.slo_d_no))
						.leftOuterJoin(S0_T3).on(S0_T1.dlv_slip_d_no.eq(S0_T3.dlv_slip_d_no))
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.dlv_slip_no.eq(S0_T4.dlv_slip_no)
								.and(S0_T3.dlv_slip_seq.eq(S0_T4.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T8).on(S0_T1.purc_act_d_no.eq(S0_T8.purc_act_d_no))
						.leftOuterJoin(S0_T9).on(
							bracket(
								S0_T8.purc_act_no.eq(S0_T9.purc_act_no)
								.and(S0_T8.purc_act_seq.eq(S0_T9.purc_act_seq))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.slo_no.eq(bind("slo_no")))
						.and(
							S0_T4.dlv_slip_seq.eq(
									subQuery()
									.select(max(S1_W.dlv_slip_seq))
									.from(S1_W)
									.where(
										S1_W.dlv_slip_no.eq(S0_T4.dlv_slip_no)
										.and(S1_W.can_flg.eq(value(false)))
									)
								)
							.or(S0_T4.slip_sts_typ.isNull())
						)
						.and(
							S0_T9.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value()))
							.or(S0_T9.slip_sts_typ.isNull())
						)
					)
					.orderBy(S0_T1.sls_schd_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PURC_SCHD_R.class, r -> toCondition(
							r.getStringNE("purc_schd_no")
						))
						.addSelect(m -> toArray(
							m.arr_pr_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_arr_pr_no_", m.arr_pr_no());
					}),
					j -> j
						.add(MST_ARR_PR_R.class, r -> toCondition(
							r.getStringNE("join_arr_pr_no_")
						))
						.addSelect(m -> toArray(
							m.po_d_no
						))
						.addMap((r, m) -> {
							r.setStringNE("join_po_d_no_", m.po_d_no());
					}),
					j -> j
						.add(MST_PO_D_R.class, r -> toCondition(
							r.getStringNE("join_po_d_no_")
						))
						.addSelect(m -> toArray(
							m.po_d_no,
							m.po_no
						))
						.addMap((r, m) -> {
							r.setStringNE("po_no", m.po_no());
							r.setStringNE("po_d_no", m.po_d_no());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_WG_RQST_PRMS_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_WG_RQST_PRMS_S01() {
		MST_WG_RQST_PRMS_R S0_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_WG_RQST_R S0_T2 = MST_WG_RQST_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_WG_RQST_PRMS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wg_rqst_prms_no,
						S0_T2.wg_rqst_no,
						S0_T2.wg_rqst_src_no,
						S0_T1.prms_trd_unit_qty,
						S0_T1.prms_trd_unit_cd,
						S0_T1.prms_base_unit_qty,
						S0_T1.prms_base_unit_cd,
						trunc(
							S0_T1.gr_schd_tm,
							MCDateFmt.DD
						).as("gr_schd_dt"),
						S0_T1.gr_schd_tm.as("gr_schd_hm"),
						S0_T1.gi_lg_grp_cd,
						S0_T1.gi_loc_cd,
						S0_T1.gi_str_ln_cd,
						trunc(
							S0_T1.gi_rqst_tm,
							MCDateFmt.DD
						).as("gi_rqst_dt"),
						S0_T1.gi_rqst_tm.as("gi_rqst_hm"),
						S0_T1.prms_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.wg_rqst_no.eq(S0_T2.wg_rqst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.slo_no.eq(S0_T3.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T3.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.can_flg.eq(value(false)))
						.and(S0_T2.slo_no.eq(bind("slo_no")))
						.and(S0_T2.prms_ntc_flg.eq(value(true)))
						.and(S0_T2.can_flg.eq(value(false)))
					)
					.orderBy(
						S0_T2.wg_rqst_no.asc(),
						S0_T1.wg_rqst_prms_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("prms_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prms_trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("prms_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prms_base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("gi_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd"),
							r.getStringNE("gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("prms_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("prms_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL1230_MST_WG_RQST_Query_S01
	 */
	static MCQueryPlan MSBBL1230_MST_WG_RQST_S01() {
		MST_WG_RQST_R S0_T1 = MST_WG_RQST_R.create("T1");
		MST_SLO_R S0_T2 = MST_SLO_R.create("T2");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1230_MST_WG_RQST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slo_d_no,
						S0_T1.wg_rqst_no,
						S0_T1.wg_rqst_typ,
						S0_T1.wg_rqst_src_typ,
						S0_T1.wg_rqst_src_no,
						S0_T1.wg_rqst_sts_typ,
						S0_T1.prms_ntc_flg,
						S0_T1.prms_dt,
						S0_T1.prms_uncn_flg,
						S0_T1.re_prms_ntc_flg,
						S0_T1.re_prms_dt,
						S0_T1.re_rqst_flg,
						S0_T1.re_rqst_dt,
						S0_T1.wg_re_rqst_cnt_rmrks,
						trunc(
							S0_T1.gr_rqst_tm,
							MCDateFmt.DD
						).as("gr_rqst_dt"),
						S0_T1.gr_rqst_tm.as("gr_rqst_hm"),
						trunc(
							S0_T1.gi_rqst_tm,
							MCDateFmt.DD
						).as("gi_rqst_dt"),
						S0_T1.gi_rqst_tm.as("gi_rqst_hm"),
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.wg_rqst_cnt_rmrks,
						S0_T1.rqst_to_wg_cd,
						S0_T1.gi_lg_grp_cd,
						S0_T1.gi_loc_cd,
						S0_T1.rqst_dt,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.itm_cd.as("join_itm_cd_"),
						S0_T1.itm_sub1.as("join_itm_sub1_"),
						S0_T1.itm_sub2.as("join_itm_sub2_"),
						S0_T1.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.slo_no.eq(S0_T1.slo_no)
							)
						)
						.innerJoin(S0_DAC).on(
							bracket(
								S0_DAC.dpt_cd.eq(S0_T2.sls_dpt_cd)
							)
						)
					)
					.where(
						value(1).eq(value(1))
						.and(S0_T1.slo_no.eq(bind("slo_no")))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(
						S0_T1.slo_d_no.asc(),
						S0_T1.wg_rqst_typ.asc(),
						S0_T1.wg_rqst_no.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_to_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_to_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("gi_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
					})
				)
			);
	}
}