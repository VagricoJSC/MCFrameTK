package mcframe.serverMSBB.MSBBL1240;

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
	 * -- MSBBL1240_MST_DLV_INST_RCPT_Query_S01
	 */
	static MCQueryPlan MSBBL1240_MST_DLV_INST_RCPT_S01() {
		MST_DLV_INST_RCPT_R S0_T1 = MST_DLV_INST_RCPT_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SLO_R S0_T3 = MST_SLO_R.create("T3");
		MST_SHIP_PR_R S0_T4 = MST_SHIP_PR_R.create("T4");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1240_MST_DLV_INST_RCPT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.slo_d_no,
						S0_T1.cst_dlv_inst_no,
						S0_T1.cst_dlv_inst_rev,
						S0_T1.cst_dlv_inst_d_no,
						S0_T1.trd_unit_qty,
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T1.cst_dlv_inst_rmrks,
						S0_T1.cst_dlv_inst_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.edi_flg,
						S0_T1.dlv_inst_rcpt_no,
						S0_T1.dlv_inst_rcpt_rev,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M5.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_M5.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T1.pri_prnt_flg,
						S0_M5.tdlv_req_flg,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						decode(
							S0_T1.tdlv_sundry_flg,
							value(true),
							S0_T1.tdlv_nm,
							S0_M8.bp_nm
						).as("tdlv_nm"),
						S0_T1.via_dlv_typ,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_M8.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_lg_grp_cd,
						S0_T1.dlv_day_week_typ,
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
						S0_T4.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T3.upd_cntr.as("slo_upd_cntr"),
						S0_T2.itm_cd.as("join_itm_cd_"),
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.slo_d_no.eq(S0_T1.slo_d_no))
						.innerJoin(S0_T3).on(S0_T3.slo_no.eq(S0_T2.slo_no))
						.innerJoin(S0_T4).on(S0_T4.slo_d_no.eq(S0_T2.slo_d_no))
						.innerJoin(S0_W1).on(S0_T1.slo_d_no.eq(S0_W1.slo_d_no))
						.leftOuterJoin(S0_M5).on(S0_T1.dlv_cd.eq(S0_M5.bp_cd))
						.leftOuterJoin(S0_M8).on(S0_T1.tdlv_cd.eq(S0_M8.bp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
					)
					.orderBy(S0_T1.dlv_inst_rcpt_no.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.rnd_typ,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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
	 * -- MSBBL1240_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBBL1240_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1240_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T2.slo_d_no,
						S0_T1.pr_sts_typ,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.fix_flg,
						S0_T1.re_ship_schd_flg,
						trunc(
							S0_T1.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T1.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T1.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T1.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						S0_T1.not_dt_calc_flg,
						S0_T1.ship_wk_cd,
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
						S0_T1.ship_block_flg,
						S0_T1.ship_abl_flg,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.alloc_qty,
						S0_T1.wait_qty,
						S0_T1.ship_inst_qty,
						S0_T1.ship_act_qty,
						S0_T1.iv_schd_qty,
						S0_T1.iv_act_qty,
						S0_T1.sls_qty,
						S0_T1.ship_ret_qty,
						S0_T1.abort_qty,
						S0_T1.abort_flg,
						S0_T1.cmpl_flg,
						S0_T1.ship_term_cd,
						S0_T1.ship_schd_no,
						S0_T1.dlv_inst_rcpt_no,
						S0_T1.slo_prms_no,
						S0_T1.sls_act_d_no,
						S0_T2.alloc_typ,
						S0_T1.dlv_cd,
						S0_T1.dlv_sundry_flg,
						decode(
							S0_T1.dlv_sundry_flg,
							value(true),
							S0_T1.dlv_nm,
							S0_M6.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_M6.cntry_cd.as("dlv_cntry_cd"),
						S0_T1.dlv_lg_grp_cd.as("dlv_lg_grp_cd"),
						S0_T1.pri_prnt_flg,
						S0_M6.tdlv_req_flg,
						S0_T1.tdlv_cd,
						S0_T1.tdlv_sundry_flg,
						decode(
							S0_T1.tdlv_sundry_flg,
							value(true),
							S0_T1.tdlv_nm,
							S0_M9.bp_nm
						).as("tdlv_nm"),
						S0_T1.via_dlv_typ,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_M9.cntry_cd.as("tdlv_cntry_cd"),
						S0_T1.tdlv_lg_grp_cd,
						S0_T1.dlv_day_week_typ,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.innerJoin(S0_W1).on(S0_T2.slo_d_no.eq(S0_W1.slo_d_no))
						.leftOuterJoin(S0_M6).on(S0_T1.dlv_cd.eq(S0_M6.bp_cd))
						.leftOuterJoin(S0_M9).on(S0_T1.tdlv_cd.eq(S0_M9.bp_cd))
					)
					.orderBy(
						S0_T1.dlv_inst_rcpt_no.asc(),
						S0_T1.ship_schd_no.asc()
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
	 * -- MSBBL1240_MST_SLO_Query_S01
	 */
	static MCQueryPlan MSBBL1240_MST_SLO_S01() {
		MST_SLO_R S0_T1 = MST_SLO_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		MST_SHIP_PR_R S0_T3 = MST_SHIP_PR_R.create("T3");
		MAM_BP_R S0_M2 = MAM_BP_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_DPT_R S0_M4 = MAM_DPT_R.create("M4");
		MAM_WG_R S0_M5 = MAM_WG_R.create("M5");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M10 = MAM_BP_R.create("M10");
		MAM_BP_R S0_M11 = MAM_BP_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_ITM_TYP_D_R S0_M23 = MAM_ITM_TYP_D_R.create("M23");
		MAVM_RD_DPT_R S0_DAC = MAVM_RD_DPT_R.create("DAC");
		MAM_BP_GRP_R S0_MMD1 = MAM_BP_GRP_R.create("MMD1");
		MAM_BP_GRP_R S0_MMD2 = MAM_BP_GRP_R.create("MMD2");
		MAM_BP_GRP_R S0_MMD3 = MAM_BP_GRP_R.create("MMD3");
		MAM_BP_GRP_R S0_MMD4 = MAM_BP_GRP_R.create("MMD4");
		MAM_BP_GRP_R S0_MMD5 = MAM_BP_GRP_R.create("MMD5");
		MAM_BP_GRP_R S0_MMD6 = MAM_BP_GRP_R.create("MMD6");
		MAM_BP_GRP_R S0_MMD7 = MAM_BP_GRP_R.create("MMD7");
		MAM_BP_GRP_R S0_MMD8 = MAM_BP_GRP_R.create("MMD8");
		MAM_BP_GRP_R S0_MMD9 = MAM_BP_GRP_R.create("MMD9");
		MAM_BP_GRP_R S0_MMD10 = MAM_BP_GRP_R.create("MMD10");
		MAM_BP_GRP_R S0_MMC1 = MAM_BP_GRP_R.create("MMC1");
		MAM_BP_GRP_R S0_MMC2 = MAM_BP_GRP_R.create("MMC2");
		MAM_BP_GRP_R S0_MMC3 = MAM_BP_GRP_R.create("MMC3");
		MAM_BP_GRP_R S0_MMC4 = MAM_BP_GRP_R.create("MMC4");
		MAM_BP_GRP_R S0_MMC5 = MAM_BP_GRP_R.create("MMC5");
		MAM_BP_GRP_R S0_MMC6 = MAM_BP_GRP_R.create("MMC6");
		MAM_BP_GRP_R S0_MMC7 = MAM_BP_GRP_R.create("MMC7");
		MAM_BP_GRP_R S0_MMC8 = MAM_BP_GRP_R.create("MMC8");
		MAM_BP_GRP_R S0_MMC9 = MAM_BP_GRP_R.create("MMC9");
		MAM_BP_GRP_R S0_MMC10 = MAM_BP_GRP_R.create("MMC10");
		MAM_ITM_GRP_R S0_MMI1 = MAM_ITM_GRP_R.create("MMI1");
		MAM_ITM_GRP_R S0_MMI2 = MAM_ITM_GRP_R.create("MMI2");
		MAM_ITM_GRP_R S0_MMI3 = MAM_ITM_GRP_R.create("MMI3");
		MAM_ITM_GRP_R S0_MMI4 = MAM_ITM_GRP_R.create("MMI4");
		MAM_ITM_GRP_R S0_MMI5 = MAM_ITM_GRP_R.create("MMI5");
		MAM_ITM_GRP_R S0_MMI6 = MAM_ITM_GRP_R.create("MMI6");
		MAM_ITM_GRP_R S0_MMI7 = MAM_ITM_GRP_R.create("MMI7");
		MAM_ITM_GRP_R S0_MMI8 = MAM_ITM_GRP_R.create("MMI8");
		MAM_ITM_GRP_R S0_MMI9 = MAM_ITM_GRP_R.create("MMI9");
		MAM_ITM_GRP_R S0_MMI10 = MAM_ITM_GRP_R.create("MMI10");
		MST_SHIP_SCHD_R S1_TT1 = MST_SHIP_SCHD_R.create("TT1");
		MAM_EDI_IF_CTL_R S0_EDI = MAM_EDI_IF_CTL_R.create("IFCTL");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL1240_MST_SLO_Query_S01")
					.mainQuery()
					.select(
						S0_T3.sls_sts_typ,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.slo_no,
						S0_T1.slo_rev,
						S0_T1.slo_typ,
						S0_T1.aprv_flg,
						S0_T1.aprv_no,
						S0_T1.aprv_sts_typ,
						S0_T1.qtn_no,
						S0_T1.qtn_rev,
						S0_T1.slo_dt,
						S0_T3.dlv_inst_rcpt_dt,
						S0_T1.cst_cd,
						S0_T1.sls_usr_cd,
						S0_T1.sls_dpt_cd,
						S0_M4.dpt_nm.as("sls_dpt_nm"),
						S0_T1.wg_cd,
						S0_T1.assort_typ,
						S0_T1.cst_po_no,
						S0_T1.wrk_no,
						S0_T1.trd_rmrks,
						S0_T1.intr_rmrks,
						S0_T2.slo_d_no,
						S0_T2.cst_itm_cd,
						S0_T2.cst_itm_nm,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_T2.itm_nm,
							S0_M6.itm_nm
						).as("itm_nm"),
						S0_M6.sundry_itm_flg,
						S0_M6.stk_mng_typ,
						S0_M6.asset_mng_typ,
						S0_T2.vmi_flg,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.set_itm_grp_no,
						S0_T2.dlv_cd,
						nvl(
							S0_T2.dlv_nm,
							S0_M8.bp_nm
						).as("dlv_nm"),
						S0_T2.dlv_sundry_flg,
						S0_M8.cntry_cd.as("dlv_cntry_cd"),
						S0_T2.dlv_zip_cd,
						S0_T2.dlv_addr1,
						S0_T2.dlv_addr2,
						S0_T2.dlv_addr3,
						S0_T2.dlv_addr4,
						S0_T2.dlv_tel,
						S0_T2.dlv_fax,
						S0_T2.dlv_cntct_dpt,
						S0_T2.dlv_cntct_psn,
						S0_T2.dlv_lg_grp_cd,
						S0_T2.pri_prnt_flg,
						S0_T2.dest_cd1,
						S0_T2.dest_cd2,
						S0_T2.dest_cd3,
						S0_T2.tdlv_cd,
						nvl(
							S0_T2.tdlv_nm,
							S0_M13.bp_nm
						).as("tdlv_nm"),
						S0_T2.tdlv_sundry_flg,
						S0_M13.cntry_cd.as("tdlv_cntry_cd"),
						S0_T2.tdlv_zip_cd,
						S0_T2.tdlv_addr1,
						S0_T2.tdlv_addr2,
						S0_T2.tdlv_addr3,
						S0_T2.tdlv_addr4,
						S0_T2.tdlv_tel,
						S0_T2.tdlv_fax,
						S0_T2.tdlv_cntct_dpt,
						S0_T2.tdlv_cntct_psn,
						S0_T2.tdlv_lg_grp_cd,
						S0_T2.via_dlv_typ,
						S0_T2.dlv_day_week_typ,
						S0_T2.sls_cststk_flg,
						S0_T2.proc_typ,
						S0_T2.ship_inst_typ,
						S0_T2.ship_schd_split_typ,
						S0_T2.alloc_scope_typ,
						S0_T2.alloc_typ,
						S0_T2.rqst_to_loc_cd,
						S0_T2.sppl_cd,
						S0_T2.maker_cd,
						S0_T2.wg_rqst_cnt_rmrks,
						S0_T2.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.ship_lg_grp_cd,
						S0_T2.alloc_grp_cd,
						S0_T2.ship_term_cd,
						S0_T2.ship_cnt_rmrks,
						S0_T2.cst_po_d_no,
						S0_T2.cst_po_d_rmrks,
						S0_T2.sls_rsn_cd,
						S0_T2.trd_d_rmrks,
						S0_T2.intr_rmrks.as("intr_d_rmrks"),
						S0_T3.ship_cmpl_flg,
						S0_T3.sls_cmpl_flg,
						S0_T3.ship_schd_split_flg,
						S0_T3.ship_schd_split_typ,
						S0_T2.base_unit_cd,
						S0_M6.dec_place.as("base_unit_dec_place"),
						S0_M6.rnd_typ.as("base_unit_rnd_typ"),
						S0_T2.base_unit_qty,
						S0_T3.prms_qty,
						S0_T3.dlv_inst_rcpt_qty,
						S0_T3.dlv_inst_prms_qty,
						S0_T3.ship_inst_qty,
						S0_T3.ship_act_qty,
						S0_T3.iv_schd_qty,
						S0_T3.iv_act_qty,
						S0_T3.sls_qty,
						S0_T3.ship_ret_qty,
						S0_T3.re_ship_schd_qty,
						S0_T3.ship_schd_abort_qty,
						S0_T3.sls_schd_abort_qty,
						S0_T3.base_unit_qty.as("ship_pr_base_unit_qty"),
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_T2.ins_usr_id,
						S0_T2.ins_usr_nm,
						S0_T2.ins_func_id,
						S0_T2.ins_ts,
						S0_T2.upd_usr_id,
						S0_T2.upd_usr_nm,
						S0_T2.upd_func_id,
						S0_T2.upd_ts,
						S0_T2.upd_srv_req_no,
						S0_T3.upd_cntr.as("ship_pr_upd_cntr"),
						S0_T1.upd_cntr.as("slo_upd_cntr")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.slo_no.eq(S0_T1.slo_no))
						.innerJoin(S0_T3).on(S0_T3.slo_d_no.eq(S0_T2.slo_d_no))
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.dpt_cd.eq(S0_T1.sls_dpt_cd)
								.and(S0_T1.slo_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M6.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M6.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M6.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M8).on(S0_M8.bp_cd.eq(S0_T2.dlv_cd))
						.leftOuterJoin(S0_M13).on(S0_M13.bp_cd.eq(S0_T2.tdlv_cd))
						.innerJoin(S0_DAC).on(S0_DAC.dpt_cd.eq(S0_T1.sls_dpt_cd))
						.addDynamicView()
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.can_flg.eq(value(false)))
						.and(S0_T2.abort_flg.eq(value(false))
						.or(bracket(S0_T2.abort_flg.eq(value(true)).and(S0_T3.ship_schd_abort_qty.lt(S0_T3.base_unit_qty)))))
						.cutoff$and(S0_T3.sls_sts_typ.like(bind("sls_sts_typ")))
						.cutoff$and(S0_T1.slo_dt.gte(bind("slo_dt_fr")))
						.cutoff$and(S0_T1.slo_dt.lte(bind("slo_dt_to")))
						.cutoff$and(S0_T3.dlv_inst_rcpt_dt.gte(bind("dlv_inst_rcpt_dt_fr")))
						.cutoff$and(S0_T3.dlv_inst_rcpt_dt.lte(bind("dlv_inst_rcpt_dt_to")))
						.cutoff$and(S0_T2.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.dlv_nm,
								S0_M8.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T2.dest_cd1.like(bind("dest_cd1")))
						.addDynamicPredicate()
						.cutoff$and(S0_T2.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T2.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T1.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T2.tdlv_cd.like(bind("tdlv_cd")))
						.cutoff$and(
							nvl(
								S0_T2.tdlv_nm,
								S0_M13.bp_nm
							).like(bind("tdlv_nm"))
						)
						.cutoff$and(S0_M6.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M6.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.cst_itm_cd.like(bind("cst_itm_cd")))
						.cutoff$and(S0_T2.cst_itm_nm.like(bind("cst_itm_nm")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T2.itm_nm,
								S0_M6.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.sls_usr_cd.like(bind("sls_usr_cd")))
						.cutoff$and(S0_T1.sls_dpt_cd.like(bind("sls_dpt_cd")))
						.cutoff$and(S0_M4.dpt_nm.like(bind("sls_dpt_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T2.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.cst_po_no.like(bind("cst_po_no")))
						.cutoff$and(S0_T2.cst_po_d_no.like(bind("cst_po_d_no")))
						.cutoff$and(S0_T3.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T3.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T3.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
						.cutoff$and(S0_T3.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
						.cutoff$and(S0_T2.ship_rqst_tm.gte(bind("ship_rqst_hm_fr")))
						.cutoff$and(S0_T2.ship_rqst_tm.lte(bind("ship_rqst_hm_to")))
						.cutoff$and(S0_T2.dlv_rqst_tm.gte(bind("dlv_rqst_hm_fr")))
						.cutoff$and(S0_T2.dlv_rqst_tm.lte(bind("dlv_rqst_hm_to")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T2.wg_rqst_cnt_rmrks.like(bind("wg_rqst_cnt_rmrks")))
						.cutoff$and(S0_T2.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
						.cutoff$and(S0_T2.cst_po_d_rmrks.like(bind("cst_po_d_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T2.intr_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("sub_char3")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TT1)
								.where(
									value(0).eq(value(0))
									.and(S1_TT1.ship_pr_no.eq(S0_T3.ship_pr_no))
									.cutoff$and(S1_TT1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
									.cutoff$and(S1_TT1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
									.cutoff$and(S1_TT1.dlv_schd_tm.gte(bind("dlv_schd_hm_fr")))
									.cutoff$and(S1_TT1.dlv_schd_tm.lte(bind("dlv_schd_hm_to")))
								)
							)
						)
						.cutoff$and(
							bracket(
								bind("edi_flg_str").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S0_EDI)
										.where(
											S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_RECV.value()))
											.and(S0_T1.cst_cd.eq(S0_EDI.bp_cd))
											.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
											.and(S0_EDI.del_flg.eq(value(false)))
										)
									)
								)
							)
							.or(
								bracket(
									bind("edi_flg_str").eq(value(false))
									.and(
										notExists(
											subQuery()
											.select(value("X"))
											.from(S0_EDI)
											.where(
												S0_EDI.if_proc_typ.eq(value(MAC_IF_PROC_TYP.DLV_INST_RECV.value()))
												.and(S0_T1.cst_cd.eq(S0_EDI.bp_cd))
												.and(bind("today").between(S0_EDI.st_dt, S0_EDI.end_dt))
												.and(S0_EDI.del_flg.eq(value(false)))
											)
										)
									)
								)
							)
						)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.slo_no.asc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_M2.bp_cd.eq(S0_T1.cst_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.bp_nm.like(bind("cst_nm")))),
				when(boundOr("sls_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_M3.usr_cd.eq(S0_T1.sls_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.usr_nm.like(bind("sls_usr_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.wg_cd.eq(S0_T1.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.wg_nm.like(bind("wg_nm")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_M10.bp_cd.eq(S0_T2.dest_cd1)))
					.predicate(p -> p.cutoff$and(S0_M10.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_M11.bp_cd.eq(S0_T2.dest_cd2)))
					.predicate(p -> p.cutoff$and(S0_M11.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_M12.bp_cd.eq(S0_T2.dest_cd3)))
					.predicate(p -> p.cutoff$and(S0_M12.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_M23.itm_typ.eq(S0_M6.itm_typ).and(S0_M23.itm_typ_d_cd.eq(S0_M6.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M23.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("dlv_grp_flg1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD1).on(S0_M8.bp_grp_cd1.eq(S0_MMD1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMD1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MMD1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD2).on(S0_M8.bp_grp_cd2.eq(S0_MMD2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMD2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MMD2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD3).on(S0_M8.bp_grp_cd3.eq(S0_MMD3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMD3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MMD3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD4).on(S0_M8.bp_grp_cd4.eq(S0_MMD4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMD4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MMD4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD5).on(S0_M8.bp_grp_cd5.eq(S0_MMD5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMD5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MMD5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD6).on(S0_M8.bp_grp_cd6.eq(S0_MMD6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMD6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MMD6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD7).on(S0_M8.bp_grp_cd7.eq(S0_MMD7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMD7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MMD7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD8).on(S0_M8.bp_grp_cd8.eq(S0_MMD8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMD8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MMD8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD9).on(S0_M8.bp_grp_cd9.eq(S0_MMD9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMD9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MMD9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MMD10).on(S0_M8.bp_grp_cd10.eq(S0_MMD10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMD10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MMD10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC1).on(S0_M2.bp_grp_cd1.eq(S0_MMC1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MMC1.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MMC1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC2).on(S0_M2.bp_grp_cd2.eq(S0_MMC2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MMC2.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MMC2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC3).on(S0_M2.bp_grp_cd3.eq(S0_MMC3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MMC3.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MMC3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC4).on(S0_M2.bp_grp_cd4.eq(S0_MMC4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MMC4.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MMC4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC5).on(S0_M2.bp_grp_cd5.eq(S0_MMC5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MMC5.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MMC5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC6).on(S0_M2.bp_grp_cd6.eq(S0_MMC6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MMC6.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MMC6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC7).on(S0_M2.bp_grp_cd7.eq(S0_MMC7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MMC7.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MMC7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC8).on(S0_M2.bp_grp_cd8.eq(S0_MMC8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MMC8.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MMC8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC9).on(S0_M2.bp_grp_cd9.eq(S0_MMC9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MMC9.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MMC9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MMC10).on(S0_M2.bp_grp_cd10.eq(S0_MMC10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MMC10.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M2.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MMC10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI1).on(S0_M6.itm_grp_cd1.eq(S0_MMI1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MMI1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MMI1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI2).on(S0_M6.itm_grp_cd2.eq(S0_MMI2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MMI2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MMI2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI3).on(S0_M6.itm_grp_cd3.eq(S0_MMI3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MMI3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MMI3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI4).on(S0_M6.itm_grp_cd4.eq(S0_MMI4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MMI4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MMI4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI5).on(S0_M6.itm_grp_cd5.eq(S0_MMI5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MMI5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MMI5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI6).on(S0_M6.itm_grp_cd6.eq(S0_MMI6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MMI6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MMI6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI7).on(S0_M6.itm_grp_cd7.eq(S0_MMI7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MMI7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MMI7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI8).on(S0_M6.itm_grp_cd8.eq(S0_MMI8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MMI8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MMI8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI9).on(S0_M6.itm_grp_cd9.eq(S0_MMI9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MMI9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MMI9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MMI10).on(S0_M6.itm_grp_cd10.eq(S0_MMI10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MMI10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M6.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MMI10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							m.bp_nm,
							m.cst_iv_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
							r.setBooleanNE("cst_iv_flg", m.cst_iv_flg());
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
}