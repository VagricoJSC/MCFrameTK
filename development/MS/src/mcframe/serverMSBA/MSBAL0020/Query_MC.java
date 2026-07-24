package mcframe.serverMSBA.MSBAL0020;

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
	 * -- MSBAL0020_MST_DLV_INST_RCPT_Query_S01
	 */
	static MCQueryPlan MSBAL0020_MST_DLV_INST_RCPT_S01() {
		MSW_SLO_D_KEY_R S0_W1 = MSW_SLO_D_KEY_R.create("W1");
		MST_DLV_INST_RCPT_R S0_T1 = MST_DLV_INST_RCPT_R.create("T1");
		MST_SLO_D_R S0_T2 = MST_SLO_D_R.create("T2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0020_MST_DLV_INST_RCPT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.dlv_inst_rcpt_no,
						S0_T1.dlv_inst_rcpt_rev,
						S0_T1.slo_d_no,
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						// this field is appended by sql coverter.
						S0_T2.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						S0_T2.itm_sub3.as("join_itm_sub3_")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(S0_T1.slo_d_no.eq(S0_W1.slo_d_no))
						.innerJoin(S0_T2).on(S0_T2.slo_d_no.eq(S0_T1.slo_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(value(false)))
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
	
	/**
	 * -- MSBAL0020_MST_WG_RQST_PRMS_Query_S01
	 */
	static MCQueryPlan MSBAL0020_MST_WG_RQST_PRMS_S01() {
		MSW_WG_RQST_KEY_R S0_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S0_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_WG_RQST_R S0_T2 = MST_WG_RQST_R.create("T2");
		MAM_LG_GRP_R S0_M3 = MAM_LG_GRP_R.create("M3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0020_MST_WG_RQST_PRMS_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wg_rqst_prms_no,
						S0_T1.wg_rqst_no,
						S0_T1.wg_cd,
						S0_T1.fix_flg,
						S0_T1.fix_dt,
						S0_T2.wg_rqst_typ,
						S0_T2.prms_ntc_flg,
						S0_T2.prms_dt,
						S0_T2.re_prms_ntc_flg,
						S0_T2.re_prms_dt,
						S0_T2.gr_loc_wg_cd.as("gr_wg_cd"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T1.prms_trd_unit_qty,
						S0_T1.prms_trd_unit_cd,
						S0_T1.prms_base_unit_qty,
						S0_T1.prms_base_unit_cd,
						trunc(
							S0_T1.gr_schd_tm,
							MCDateFmt.DD
						).as("gr_schd_dt"),
						S0_T1.gr_schd_tm.as("gr_schd_hm"),
						S0_T2.gr_loc_cd,
						nvl(
							S0_T1.gi_lg_grp_cd,
							S0_T2.gi_lg_grp_cd
						).as("gi_lg_grp_cd"),
						S0_M3.lg_grp_nm.as("gi_lg_grp_nm"),
						S0_T1.gi_loc_cd,
						S0_T2.gi_loc_wg_cd.as("gi_wg_cd"),
						S0_T1.gi_str_ln_cd,
						trunc(
							S0_T1.gi_rqst_tm,
							MCDateFmt.DD
						).as("gi_schd_dt"),
						S0_T1.gi_rqst_tm.as("gi_schd_hm"),
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.can_flg,
						S0_T1.prms_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.fix_flg.as("last_fix_flg"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("wg_rqst_prms_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						decode(
							S0_T1.fix_flg,
							value(true),
							S0_T1.prms_base_unit_qty,
							nullValue()
						).as("org_prms_base_unit_qty")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(S0_T1.wg_rqst_no.eq(S0_W1.wg_rqst_no))
						.innerJoin(S0_T2).on(S0_T2.wg_rqst_no.eq(S0_T1.wg_rqst_no))
						.leftOuterJoin(S0_M3).on(
							S0_M3.lg_grp_cd.eq(nvl(
									S0_T1.gi_lg_grp_cd,
									S0_T2.gi_lg_grp_cd
								)
							)
						)
					)
					.where(
						value(0).eq(value(0))
					)
					.orderBy(
						S0_T1.wg_rqst_no.asc(),
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
							r.setBooleanNE("gi_str_ln_tgt_flg", m.str_ln_tgt_flg());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("prms_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("prms_trd_unit_dec_place", m.dec_place());
							r.setStringNE("prms_trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("prms_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("prms_trd_unit_conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("prms_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("prms_base_unit_dec_place", m.dec_place());
							r.setStringNE("prms_base_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gr_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.asset_mng_typ,
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("asset_mng_typ", m.asset_mng_typ());
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gi_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_wg_nm", m.wg_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBAL0020_MST_WG_RQST_PRMS_Query_S02
	 */
	static MCQueryPlan MSBAL0020_MST_WG_RQST_PRMS_S02() {
		MSW_WG_RQST_KEY_R S0_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S0_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_XFR_SCHD_R S0_T2 = MST_XFR_SCHD_R.create("T2");
		MST_XFR_ALLOC_STS_R S0_T3 = MST_XFR_ALLOC_STS_R.create("T3");
		MSW_WG_RQST_KEY_R S1_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S1_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_XFR_SCHD_R S1_T2 = MST_XFR_SCHD_R.create("T2");
		MST_SHIP_PR_R S1_T3 = MST_SHIP_PR_R.create("T3");
		MSW_WG_RQST_KEY_R S2_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S2_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_PO_SCHD_R S2_T2 = MST_PO_SCHD_R.create("T2");
		MST_PO_D_R S2_T3 = MST_PO_D_R.create("T3");
		MST_ARR_PR_R S2_T4 = MST_ARR_PR_R.create("T4");
		MST_ARR_SCHD_R S2_T5 = MST_ARR_SCHD_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0020_MST_WG_RQST_PRMS_Query_S02")
					.mainQuery()
					.select(
						S0_T1.wg_rqst_no,
						S0_T1.wg_rqst_prms_no,
						sum(S0_T3.act_qty).as("gi_act_qty"),
						sum(S0_T3.act_qty).as("gr_act_qty")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.wg_rqst_no.eq(S0_W1.wg_rqst_no)
								.and(S0_T1.fix_flg.eq(value(true)))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.WG_RQST.value()))
								.and(S0_T2.xfr_src_no.eq(S0_T1.wg_rqst_prms_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.xfr_schd_no.eq(S0_T2.xfr_schd_no)
							)
						)
					)
					.groupBy(
						S0_T1.wg_rqst_no,
						S0_T1.wg_rqst_prms_no
					)
					.unionAll(
						subQuery()
						.select(
							S1_T1.wg_rqst_no,
							S1_T1.wg_rqst_prms_no,
							S1_T3.ship_act_qty.as("gi_act_qty"),
							S1_T3.dlv_qty.as("gr_act_qty")
						)
						.from(
							S1_W1
							.innerJoin(S1_T1).on(
								bracket(
									S1_T1.wg_rqst_no.eq(S1_W1.wg_rqst_no)
									.and(S1_T1.fix_flg.eq(value(true)))
								)
							)
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.WG_RQST.value()))
									.and(S1_T2.xfr_src_no.eq(S1_T1.wg_rqst_prms_no))
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T3.xfr_schd_no.eq(S1_T2.xfr_schd_no)
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S2_T1.wg_rqst_no,
								S2_T1.wg_rqst_prms_no,
								value(0).as("gi_act_qty"),
								sum(
									decode(
										S2_T5.arr_ptn_typ,
										value(MSC_ARR_PTN_TYP.N_YET_ARR.value()),
										S2_T5.arr_qty,
										S2_T5.purc_qty
									)
								).as("gr_act_qty")
							)
							.from(
								S2_W1
								.innerJoin(S2_T1).on(
									bracket(
										S2_T1.wg_rqst_no.eq(S2_W1.wg_rqst_no)
										.and(S2_T1.fix_flg.eq(value(true)))
									)
								)
								.innerJoin(S2_T2).on(
									bracket(
										S2_T2.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value()))
										.and(S2_T2.po_schd_src_no.eq(S2_T1.wg_rqst_prms_no))
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T3.po_schd_no.eq(S2_T2.po_schd_no)
									)
								)
								.innerJoin(S2_T4).on(
									bracket(
										S2_T4.po_d_no.eq(S2_T3.po_d_no)
									)
								)
								.innerJoin(S2_T5).on(
									bracket(
										S2_T5.arr_pr_no.eq(S2_T4.arr_pr_no)
									)
								)
							)
							.groupBy(
								S2_T1.wg_rqst_no,
								S2_T1.wg_rqst_prms_no
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBAL0020_MST_WG_RQST_Query_S01
	 */
	static MCQueryPlan MSBAL0020_MST_WG_RQST_S01() {
		MST_WG_RQST_R S0_T1 = MST_WG_RQST_R.create("T1");
		MAM_WG_R S0_M1 = MAM_WG_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_LG_GRP_R S0_M5 = MAM_LG_GRP_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_LG_GRP_R S0_M10 = MAM_LG_GRP_R.create("M10");
		MAM_LOC_R S0_M11 = MAM_LOC_R.create("M11");
		MAM_STR_LN_R S0_M12 = MAM_STR_LN_R.create("M12");
		MAM_SUNDRY_ITM_R S0_M13 = MAM_SUNDRY_ITM_R.create("M13");
		MAM_ITM_R S0_M14 = MAM_ITM_R.create("M14");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_ITM_R S0_M24 = MAM_ITM_R.create("M24");
		MAM_DPT_R S0_M27 = MAM_DPT_R.create("M27");
		MAVM_RD_WG_R S0_M32 = MAVM_RD_WG_R.create("M32");
		MAM_LOC_GRP_R S0_M33 = MAM_LOC_GRP_R.create("M33");
		MAM_SITE_R S0_M34 = MAM_SITE_R.create("M34");
		MAM_LOC_GRP_R S0_M35 = MAM_LOC_GRP_R.create("M35");
		MAM_SITE_R S0_M36 = MAM_SITE_R.create("M36");
		MAM_ITM_TYP_D_R S0_M38 = MAM_ITM_TYP_D_R.create("M38");
		MAM_SUNDRY_ITM_R S0_M39 = MAM_SUNDRY_ITM_R.create("M39");
		MAM_BP_R S0_M43 = MAM_BP_R.create("M43");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_SIM_PRMS_RSLT_R S0_T3 = MST_SIM_PRMS_RSLT_R.create("T3");
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
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_WG_RQST_PRMS_R S1_TMP = MST_WG_RQST_PRMS_R.create("TMP");
		MST_WG_RQST_PRMS_R S2_TMP = MST_WG_RQST_PRMS_R.create("TMP");
		MST_WG_RQST_PRMS_R S3_TMP = MST_WG_RQST_PRMS_R.create("TMP");
		
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0020_MST_WG_RQST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wg_rqst_no,
						S0_T1.wg_rqst_typ,
						S0_T1.wg_rqst_src_typ,
						S0_T1.wg_rqst_src_no,
						S0_T1.wg_rqst_sts_typ,
						S0_T1.rqst_dt,
						S0_T1.prms_ntc_flg.as("last_prms_ntc_flg"),
						S0_T1.prms_ntc_flg,
						S0_T1.prms_dt,
						S0_T1.re_prms_ntc_flg,
						S0_T1.re_prms_dt,
						S0_T1.prms_uncn_flg,
						S0_T1.re_rqst_flg,
						S0_T1.re_rqst_dt,
						S0_T1.rqst_crrct_flg,
						S0_T1.dlv_inst_rcpt_flg,
						S0_T1.can_flg,
						S0_T1.rqst_fr_wg_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_M2.dpt_nm.as("rqst_fr_dpt_nm"),
						S0_T1.rqst_fr_usr_cd,
						S0_T1.gr_loc_wg_cd.as("gr_wg_cd"),
						S0_T1.gr_lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_str_ln_cd,
						trunc(
							S0_T1.gr_rqst_tm,
							MCDateFmt.DD
						).as("gr_rqst_dt"),
						S0_T1.gr_rqst_tm.as("gr_rqst_hm"),
						S0_T1.rqst_to_wg_cd,
						S0_T1.gi_loc_wg_cd.as("gi_wg_cd"),
						S0_T1.gi_lg_grp_cd,
						S0_T1.gi_loc_cd.as("rqst_gi_loc_cd"),
						S0_T1.gi_str_ln_cd.as("rqst_gi_str_ln_cd"),
						trunc(
							S0_T1.gi_rqst_tm,
							MCDateFmt.DD
						).as("gi_rqst_dt"),
						S0_T1.gi_rqst_tm.as("gi_rqst_hm"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M13.itm_nm,
							S0_T1.itm_nm,
							S0_M14.itm_nm
						).as("itm_nm"),
						decode(
							S0_M18.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								S0_T1.iv_itm_nm,
								S0_ITMLCL.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M14.lot_mng_typ,
						S0_M14.sublot_mng_typ,
						S0_M14.sno1_mng_typ,
						S0_M14.sno2_mng_typ,
						S0_M14.sno3_mng_typ,
						S0_M14.sno4_mng_typ,
						S0_M14.asset_mng_typ,
						S0_M14.ver_flg,
						S0_M14.dscnt_itm_flg,
						S0_T1.sundry_itm_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.ver_no,
						S0_T1.gd_cd,
						S0_T1.vld_dt_fr,
						S0_T1.vld_dt_to,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.not_cmpl_qty,
						S0_T1.base_unit_cd,
						S0_M14.unit_cd.as("prms_base_unit_cd"),
						S0_T1.not_cmpl_qty,
						S0_T1.sppl_cd.as("rqst_sppl_cd"),
						S0_M18.bp_nm.as("rqst_sppl_nm"),
						S0_M18.sppl_iv_flg,
						S0_M18.prnt_lcl_cd,
						S0_T1.maker_cd.as("rqst_maker_cd"),
						S0_T1.io_schd_pr_no,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.dlv_cd,
						nvl(
							S0_T1.dlv_nm,
							S0_M20.bp_nm
						).as("dlv_nm"),
						S0_T1.dlv_sundry_flg,
						S0_T1.dlv_cntct_dpt,
						S0_T1.dlv_cntct_psn,
						S0_T1.dlv_zip_cd,
						S0_T1.dlv_addr1,
						S0_T1.dlv_addr2,
						S0_T1.dlv_addr3,
						S0_T1.dlv_addr4,
						S0_T1.dlv_tel,
						S0_T1.dlv_fax,
						S0_T1.tdlv_cd,
						nvl(
							S0_T1.tdlv_nm,
							S0_M43.bp_nm
						).as("tdlv_nm"),
						S0_T1.tdlv_sundry_flg,
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.itm_ord_no,
						S0_T1.mfg_loc_cd.as("rqst_mfg_loc_cd"),
						S0_T1.bom_ptn.as("rqst_bom_ptn"),
						S0_T1.purc_rsn_cd,
						S0_T1.xpns_po_flg,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						nvl(
							S0_M39.itm_nm,
							S0_M24.itm_nm
						).as("bd_itm_nm"),
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_loc_cd,
						S0_T1.bd_dpt_cd,
						S0_M27.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						S0_T3.sim_alloc_pln_typ,
						S0_T1.wg_rqst_cnt_rmrks,
						S0_T1.wg_re_rqst_cnt_rmrks,
						S0_T1.intr_rmrks.as("wg_rqst_intr_rmrks"),
						S0_T1.comp_cng_flg,
						S0_T1.spec_cng_flg,
						S0_T1.rqst_crrct_dt,
						S0_T1.rqst_can_dt,
						S0_T1.prms_can_dt,
						S0_T1.inst_dt,
						S0_T1.inst_can_dt,
						S0_T1.act_dt,
						S0_T1.act_can_dt,
						S0_M14.itm_typ,
						S0_M14.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr.as("wg_rqst_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M2).on(
							S0_M2.dpt_cd.eq(S0_T1.rqst_fr_dpt_cd)
							.and(S0_T1.gr_rqst_tm.between(S0_M2.st_dt, S0_M2.end_dt))
						)
						.leftOuterJoin(S0_M13).on(
							S0_T1.itm_cd.eq(S0_M13.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M13.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M13.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M13.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M13.sno1))
							.and(S0_T1.sno2.eq(S0_M13.sno2))
							.and(S0_T1.sno3.eq(S0_M13.sno3))
							.and(S0_T1.sno4.eq(S0_M13.sno4))
						)
						.leftOuterJoin(S0_M14).on(
							S0_M14.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M14.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M14.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M14.itm_sub3.eq(S0_T1.itm_sub3))
						)
						.leftOuterJoin(S0_M18).on(S0_M18.bp_cd.eq(S0_T1.sppl_cd))
						.leftOuterJoin(S0_M20).on(S0_M20.bp_cd.eq(S0_T1.dlv_cd))
						.leftOuterJoin(S0_M24).on(
							S0_M24.itm_cd.eq(S0_T1.bd_itm_cd)
							.and(S0_M24.itm_sub1.eq(S0_T1.bd_itm_sub1))
							.and(S0_M24.itm_sub2.eq(S0_T1.bd_itm_sub2))
							.and(S0_M24.itm_sub3.eq(S0_T1.bd_itm_sub3))
						)
						.leftOuterJoin(S0_M27).on(
							S0_M27.dpt_cd.eq(S0_T1.bd_dpt_cd)
							.and(S0_T1.gr_rqst_tm.between(S0_M27.st_dt, S0_M27.end_dt))
						)
						.innerJoin(S0_M32).on(S0_M32.wg_cd.eq(S0_T1.rqst_to_wg_cd))
						.leftOuterJoin(S0_M39).on(
							S0_T1.bd_itm_cd.eq(S0_M39.itm_cd)
							.and(S0_T1.bd_itm_sub1.eq(S0_M39.itm_sub1))
							.and(S0_T1.bd_itm_sub2.eq(S0_M39.itm_sub2))
							.and(S0_T1.bd_itm_sub3.eq(S0_M39.itm_sub3))
							.and(S0_T1.bd_sno1.eq(S0_M39.sno1))
							.and(S0_T1.bd_sno2.eq(S0_M39.sno2))
							.and(S0_T1.bd_sno3.eq(S0_M39.sno3))
							.and(S0_T1.bd_sno4.eq(S0_M39.sno4))
						)
						.leftOuterJoin(S0_M43).on(S0_M43.bp_cd.eq(S0_T1.tdlv_cd))
						.leftOuterJoin(S0_ITMLCL).on(
							S0_T1.itm_cd.eq(S0_ITMLCL.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITMLCL.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITMLCL.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITMLCL.itm_sub3))
							.and(S0_ITMLCL.lcl_cd.eq(S0_M18.prnt_lcl_cd))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T3.wg_rqst_no.eq(S0_T1.wg_rqst_no)
							.and(
								S0_T3.wg_cd.eq(decode(
										S0_T1.wg_rqst_typ,
										value(MSC_WG_RQST_TYP.PURC.value()),
										S0_T1.rqst_fr_wg_cd,
										S0_T1.rqst_to_wg_cd
									)
								)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.can_flg.eq(bind("can_flg")))
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_rqst_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_prms_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_part_inst_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_inst_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_cmpl_sts")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(value(true).eq(bind("wg_rqst_srch_dty_typ_none")))
							.or(
								bind("wg_rqst_srch_dty_typ_none").isNull()
								.cutoff$and(S0_T1.rqst_dt.gte(bind("wg_rqst_rqst_dt_fr")))
								.cutoff$and(S0_T1.rqst_dt.lte(bind("wg_rqst_rqst_dt_to")))
								.cutoff$and(S0_T1.rqst_crrct_dt.gte(bind("wg_rqst_rqst_crrct_dt_fr")))
								.cutoff$and(S0_T1.rqst_crrct_dt.lte(bind("wg_rqst_rqst_crrct_dt_to")))
								.cutoff$and(S0_T1.rqst_can_dt.gte(bind("wg_rqst_rqst_can_dt_fr")))
								.cutoff$and(S0_T1.rqst_can_dt.lte(bind("wg_rqst_rqst_can_dt_to")))
								.cutoff$and(S0_T1.prms_dt.gte(bind("wg_rqst_prms_dt_fr")))
								.cutoff$and(S0_T1.prms_dt.lte(bind("wg_rqst_prms_dt_to")))
								.cutoff$and(S0_T1.prms_can_dt.gte(bind("wg_rqst_prms_can_dt_fr")))
								.cutoff$and(S0_T1.prms_can_dt.lte(bind("wg_rqst_prms_can_dt_to")))
								.cutoff$and(S0_T1.inst_dt.gte(bind("wg_rqst_inst_dt_fr")))
								.cutoff$and(S0_T1.inst_dt.lte(bind("wg_rqst_inst_dt_to")))
								.cutoff$and(S0_T1.inst_can_dt.gte(bind("wg_rqst_inst_can_dt_fr")))
								.cutoff$and(S0_T1.inst_can_dt.lte(bind("wg_rqst_inst_can_dt_to")))
								.cutoff$and(S0_T1.act_dt.gte(bind("wg_rqst_act_dt_fr")))
								.cutoff$and(S0_T1.act_dt.lte(bind("wg_rqst_act_dt_to")))
								.cutoff$and(S0_T1.act_can_dt.gte(bind("wg_rqst_act_can_dt_fr")))
								.cutoff$and(S0_T1.act_can_dt.lte(bind("wg_rqst_act_can_dt_to")))
							)
						)
						.cutoff$and(
							bind("tmp_re_rqst").eq(value(true))
							.and(S0_T1.re_rqst_flg.eq(value(true)))
						)
						.cutoff$and(
							bind("tmp_prms_div").eq(value(true))
							.and(
								value(1).lt(subQuery()
									.select(countAll())
									.from(S1_TMP)
									.where(
										value(0).eq(value(0))
										.and(S1_TMP.wg_rqst_no.eq(S0_T1.wg_rqst_no))
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_dlv_inst_rcpt").eq(value(true))
							.and(S0_T1.dlv_inst_rcpt_flg.eq(value(true)))
						)
						.cutoff$and(
							bind("tmp_due_delay").eq(value(true))
							.and(S0_T1.prms_ntc_flg.eq(value(true)))
							.and(
								exists(
									subQuery()
									.select(nullValue())
									.from(S2_TMP)
									.where(
										value(0).eq(value(0))
										.and(S2_TMP.wg_rqst_no.eq(S0_T1.wg_rqst_no))
										.and(S2_TMP.gr_schd_tm.gt(S0_T1.gr_rqst_tm))
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_re_rqst_no_prms").eq(value(true))
							.and(S0_T1.re_rqst_flg.eq(value(true)))
							.and(S0_T1.re_prms_ntc_flg.eq(value(false)))
						)
						.and(
							value(true).eq(value(false))
							.or(bind("tmp_prms_chk").eq(value(false)))
							.or(
								bind("tmp_prms_chk").eq(value(true))
								.and(S0_T1.prms_ntc_flg.eq(value(true)))
								.and(
									exists(
										subQuery()
										.select(nullValue())
										.from(S3_TMP)
										.where(
											value(0).eq(value(0))
											.and(S3_TMP.wg_rqst_no.eq(S0_T1.wg_rqst_no))
											.cutoff$and(S3_TMP.gr_schd_tm.gte(bind("gr_schd_hm_fr")))
											.cutoff$and(S3_TMP.gr_schd_tm.lte(bind("gr_schd_hm_to")))
											.cutoff$and(S3_TMP.gi_rqst_tm.gte(bind("gi_schd_hm_fr")))
											.cutoff$and(S3_TMP.gi_rqst_tm.lte(bind("gi_schd_hm_to")))
											.and(
												S3_TMP.can_flg.eq(value(false))
												.or(S3_TMP.fix_flg.eq(value(true)))
											)
										)
									)
								)
							)
						)
						.cutoff$and(S0_T1.wg_rqst_typ.like(bind("wg_rqst_typ")))
						.cutoff$and(S0_T1.gr_rqst_tm.gte(bind("gr_rqst_hm_fr")))
						.cutoff$and(S0_T1.gr_rqst_tm.lte(bind("gr_rqst_hm_to")))
						.cutoff$and(S0_T1.gi_rqst_tm.gte(bind("gi_rqst_hm_fr")))
						.cutoff$and(S0_T1.gi_rqst_tm.lte(bind("gi_rqst_hm_to")))
						.cutoff$and(S0_T1.rqst_dt.gte(bind("rqst_dt_fr")))
						.cutoff$and(S0_T1.rqst_dt.lte(bind("rqst_dt_to")))
						.cutoff$and(S0_T1.re_rqst_dt.gte(bind("re_rqst_dt_fr")))
						.cutoff$and(S0_T1.re_rqst_dt.lte(bind("re_rqst_dt_to")))
						.cutoff$and(S0_T1.rqst_fr_wg_cd.like(bind("rqst_fr_wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.rqst_fr_usr_cd.like(bind("rqst_fr_usr_cd")))
						.cutoff$and(S0_T1.rqst_fr_dpt_cd.like(bind("rqst_fr_dpt_cd")))
						.cutoff$and(S0_M2.dpt_nm.like(bind("rqst_fr_dpt_nm")))
						.cutoff$and(S0_T1.rqst_to_wg_cd.like(bind("rqst_to_wg_cd")))
						.cutoff$and(S0_T1.gr_loc_wg_cd.like(bind("gr_wg_cd")))
						.cutoff$and(S0_T1.gr_lg_grp_cd.like(bind("gr_lg_grp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
						.cutoff$and(S0_T1.gi_lg_grp_cd.like(bind("gi_lg_grp_cd")))
						.cutoff$and(S0_T1.gi_loc_cd.like(bind("gi_loc_cd")))
						.cutoff$and(S0_T1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
						.cutoff$and(S0_T1.wg_rqst_src_typ.like(bind("wg_rqst_src_typ")))
						.cutoff$and(S0_T1.wg_rqst_src_no.like(bind("wg_rqst_src_no")))
						.cutoff$and(S0_M14.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M14.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M13.itm_nm,
								S0_M14.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.wg_rqst_no.like(bind("wg_rqst_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T1.dlv_nm,
								S0_M20.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M18.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.wg_rqst_cnt_rmrks.like(bind("wg_rqst_cnt_rmrks")))
						.cutoff$and(S0_T1.wg_re_rqst_cnt_rmrks.like(bind("wg_re_rqst_cnt_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("wg_rqst_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("wg_rqst_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("wg_rqst_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(S0_T1.wg_rqst_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("rqst_fr_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.wg_cd.eq(S0_T1.rqst_fr_wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.wg_nm.like(bind("rqst_fr_wg_nm")))),
				when(boundOr("rqst_fr_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_M3.usr_cd.eq(S0_T1.rqst_fr_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.usr_nm.like(bind("rqst_fr_usr_nm")))),
				when(boundOr("gr_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.wg_cd.eq(S0_T1.gr_loc_wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("gr_wg_nm")))),
				when(boundOr("gr_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.lg_grp_cd.eq(S0_T1.gr_lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.lg_grp_nm.like(bind("gr_lg_grp_nm")))),
				when(boundOr("gr_loc_grp_nm", "gr_site_nm", "gr_site_cd", "gr_loc_grp_cd", "gr_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(S0_M6.loc_cd.eq(S0_T1.gr_loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M6.site_cd.like(bind("gr_site_cd"))).cutoff$and(S0_M6.loc_grp_cd.like(bind("gr_loc_grp_cd"))).cutoff$and(S0_M6.loc_nm.like(bind("gr_loc_nm")))),
				when(boundOr("gr_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_M7.loc_cd.eq(S0_T1.gr_loc_cd).and(S0_M7.str_ln_cd.eq(S0_T1.gr_str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("gr_str_ln_nm")))),
				when(boundOr("rqst_to_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(S0_M8.wg_cd.eq(S0_T1.rqst_to_wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("rqst_to_wg_nm")))),
				when(boundOr("gi_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_M10.lg_grp_cd.eq(S0_T1.gi_lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M10.lg_grp_nm.like(bind("gi_lg_grp_nm")))),
				when(boundOr("gi_loc_grp_nm", "gi_site_nm", "gi_site_cd", "gi_loc_grp_cd", "gi_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_M11.loc_cd.eq(S0_T1.gi_loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.site_cd.like(bind("gi_site_cd"))).cutoff$and(S0_M11.loc_grp_cd.like(bind("gi_loc_grp_cd"))).cutoff$and(S0_M11.loc_nm.like(bind("gi_loc_nm")))),
				when(boundOr("gi_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_M12.loc_cd.eq(S0_T1.gi_loc_cd).and(S0_M12.str_ln_cd.eq(S0_T1.gi_str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.str_ln_nm.like(bind("gi_str_ln_nm")))),
				when(boundOr("gr_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M33).on(S0_M33.loc_grp_cd.eq(S0_M6.loc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M33.loc_grp_nm.like(bind("gr_loc_grp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(S0_M34.site_cd.eq(S0_M6.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M34.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("gi_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(S0_M35.loc_grp_cd.eq(S0_M11.loc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M35.loc_grp_nm.like(bind("gi_loc_grp_nm")))),
				when(boundOr("gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M36).on(S0_M36.site_cd.eq(S0_M11.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M36.site_nm.like(bind("gi_site_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(S0_M38.itm_typ.eq(S0_M14.itm_typ).and(S0_M38.itm_typ_d_cd.eq(S0_M14.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M38.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(S0_T2.sno1.eq(S0_T1.sno1)))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M14.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M14.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M14.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M14.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M14.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M14.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M14.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M14.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M14.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M14.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM_DLV1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV1).on(S0_M20.bp_grp_cd1.eq(S0_MM_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_DLV1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM_DLV1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM_DLV2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV2).on(S0_M20.bp_grp_cd2.eq(S0_MM_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_DLV2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM_DLV2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM_DLV3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV3).on(S0_M20.bp_grp_cd3.eq(S0_MM_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_DLV3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM_DLV3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM_DLV4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV4).on(S0_M20.bp_grp_cd4.eq(S0_MM_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_DLV4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM_DLV4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM_DLV5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV5).on(S0_M20.bp_grp_cd5.eq(S0_MM_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_DLV5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM_DLV5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM_DLV6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV6).on(S0_M20.bp_grp_cd6.eq(S0_MM_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_DLV6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM_DLV6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM_DLV7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV7).on(S0_M20.bp_grp_cd7.eq(S0_MM_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_DLV7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM_DLV7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM_DLV8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV8).on(S0_M20.bp_grp_cd8.eq(S0_MM_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_DLV8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM_DLV8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM_DLV9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV9).on(S0_M20.bp_grp_cd9.eq(S0_MM_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_DLV9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM_DLV9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM_DLV10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV10).on(S0_M20.bp_grp_cd10.eq(S0_MM_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_DLV10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM_DLV10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M18.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M18.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M18.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M18.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M18.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M18.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M18.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M18.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M18.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M18.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gr_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("gr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setStringNE("gr_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gi_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_wg_nm", m.wg_nm());
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
							r.getStringNE("rqst_gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_gi_loc_nm", m.loc_nm());
							r.setStringNE("gi_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("gi_site_cd", m.site_cd());
							r.setStringNE("gi_lg_grp_cd", m.lg_grp_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("rqst_gi_loc_cd"),
							r.getStringNE("rqst_gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_gi_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("rqst_maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("gr_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("gi_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gi_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_site_nm", m.site_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("prms_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ,
							m.unit_cd
						))
						.addMap((r, m) -> {
							r.setNumberNE("prms_base_unit_dec_place", m.dec_place());
							r.setStringNE("prms_base_unit_rnd_typ", m.rnd_typ());
							r.setStringNE("join_unit_cd_", m.unit_cd());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_unit_cd_")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("prms_base_unit_nm", m.unit_nm());
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
	
	/**
	 * -- MSBAL0020_MST_WG_RQST_Query_S02
	 */
	static MCQueryPlan MSBAL0020_MST_WG_RQST_S02() {
		MST_WG_RQST_R S0_T1 = MST_WG_RQST_R.create("T1");
		MST_WG_RQST_PRMS_R S0_T3 = MST_WG_RQST_PRMS_R.create("T3");
		MAM_WG_R S0_M1 = MAM_WG_R.create("M1");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_USR_R S0_M3 = MAM_USR_R.create("M3");
		MAM_WG_R S0_M4 = MAM_WG_R.create("M4");
		MAM_LG_GRP_R S0_M5 = MAM_LG_GRP_R.create("M5");
		MAM_LOC_R S0_M6 = MAM_LOC_R.create("M6");
		MAM_STR_LN_R S0_M7 = MAM_STR_LN_R.create("M7");
		MAM_WG_R S0_M8 = MAM_WG_R.create("M8");
		MAM_LG_GRP_R S0_M10 = MAM_LG_GRP_R.create("M10");
		MAM_LOC_R S0_M11 = MAM_LOC_R.create("M11");
		MAM_STR_LN_R S0_M12 = MAM_STR_LN_R.create("M12");
		MAM_SUNDRY_ITM_R S0_M13 = MAM_SUNDRY_ITM_R.create("M13");
		MAM_ITM_R S0_M14 = MAM_ITM_R.create("M14");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAM_BP_R S0_M20 = MAM_BP_R.create("M20");
		MAM_ITM_R S0_M24 = MAM_ITM_R.create("M24");
		MAM_DPT_R S0_M27 = MAM_DPT_R.create("M27");
		MAVM_RD_WG_R S0_M32 = MAVM_RD_WG_R.create("M32");
		MAM_LOC_GRP_R S0_M33 = MAM_LOC_GRP_R.create("M33");
		MAM_SITE_R S0_M34 = MAM_SITE_R.create("M34");
		MAM_LOC_R S0_M44 = MAM_LOC_R.create("M44");
		MAM_LOC_GRP_R S0_M35 = MAM_LOC_GRP_R.create("M35");
		MAM_SITE_R S0_M36 = MAM_SITE_R.create("M36");
		MAM_ITM_TYP_D_R S0_M38 = MAM_ITM_TYP_D_R.create("M38");
		MAM_SUNDRY_ITM_R S0_M39 = MAM_SUNDRY_ITM_R.create("M39");
		MAM_BP_R S0_M43 = MAM_BP_R.create("M43");
		MAM_ITM_LCL_R S0_ITMLCL = MAM_ITM_LCL_R.create("ITMLCL");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MST_SIM_PRMS_RSLT_R S0_T4 = MST_SIM_PRMS_RSLT_R.create("T4");
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
		MAM_BP_GRP_R S0_MM_SPPL1 = MAM_BP_GRP_R.create("MM_SPPL1");
		MAM_BP_GRP_R S0_MM_SPPL2 = MAM_BP_GRP_R.create("MM_SPPL2");
		MAM_BP_GRP_R S0_MM_SPPL3 = MAM_BP_GRP_R.create("MM_SPPL3");
		MAM_BP_GRP_R S0_MM_SPPL4 = MAM_BP_GRP_R.create("MM_SPPL4");
		MAM_BP_GRP_R S0_MM_SPPL5 = MAM_BP_GRP_R.create("MM_SPPL5");
		MAM_BP_GRP_R S0_MM_SPPL6 = MAM_BP_GRP_R.create("MM_SPPL6");
		MAM_BP_GRP_R S0_MM_SPPL7 = MAM_BP_GRP_R.create("MM_SPPL7");
		MAM_BP_GRP_R S0_MM_SPPL8 = MAM_BP_GRP_R.create("MM_SPPL8");
		MAM_BP_GRP_R S0_MM_SPPL9 = MAM_BP_GRP_R.create("MM_SPPL9");
		MAM_BP_GRP_R S0_MM_SPPL10 = MAM_BP_GRP_R.create("MM_SPPL10");
		MST_WG_RQST_PRMS_R S1_TMP = MST_WG_RQST_PRMS_R.create("TMP");
		MST_WG_RQST_PRMS_R S2_TMP = MST_WG_RQST_PRMS_R.create("TMP");
		MST_WG_RQST_PRMS_R S3_TMP = MST_WG_RQST_PRMS_R.create("TMP");
		
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0020_MST_WG_RQST_Query_S02")
					.mainQuery()
					.select(
						S0_T1.wg_rqst_no,
						S0_T3.wg_rqst_prms_no,
						S0_T1.wg_rqst_typ,
						S0_T1.wg_rqst_src_typ,
						S0_T1.wg_rqst_src_no,
						S0_T1.wg_rqst_sts_typ,
						S0_T1.rqst_dt,
						S0_T1.prms_ntc_flg.as("last_prms_ntc_flg"),
						S0_T1.prms_ntc_flg,
						S0_T1.prms_dt,
						S0_T1.re_prms_ntc_flg,
						S0_T1.re_prms_dt,
						S0_T1.prms_uncn_flg,
						S0_T1.re_rqst_flg,
						S0_T1.re_rqst_dt,
						S0_T1.rqst_crrct_flg,
						S0_T1.dlv_inst_rcpt_flg,
						S0_T1.can_flg,
						S0_T1.rqst_fr_wg_cd,
						S0_T1.rqst_fr_dpt_cd,
						S0_M2.dpt_nm.as("rqst_fr_dpt_nm"),
						S0_T1.rqst_fr_usr_cd,
						S0_T1.gr_loc_wg_cd.as("gr_wg_cd"),
						S0_T1.gr_lg_grp_cd,
						S0_T1.gr_loc_cd,
						S0_T1.gr_str_ln_cd,
						trunc(
							S0_T1.gr_rqst_tm,
							MCDateFmt.DD
						).as("gr_rqst_dt"),
						S0_T1.gr_rqst_tm.as("gr_rqst_hm"),
						trunc(
							S0_T3.gr_schd_tm,
							MCDateFmt.DD
						).as("gr_schd_dt"),
						S0_T3.gr_schd_tm.as("gr_schd_hm"),
						S0_T1.rqst_to_wg_cd,
						S0_T1.gi_loc_wg_cd.as("gi_wg_cd"),
						S0_T1.gi_lg_grp_cd,
						S0_T1.gi_loc_cd.as("rqst_gi_loc_cd"),
						S0_T3.gi_loc_cd,
						S0_T1.gi_str_ln_cd.as("rqst_gi_str_ln_cd"),
						S0_T3.gi_str_ln_cd,
						trunc(
							S0_T1.gi_rqst_tm,
							MCDateFmt.DD
						).as("gi_rqst_dt"),
						S0_T1.gi_rqst_tm.as("gi_rqst_hm"),
						trunc(
							S0_T3.gi_rqst_tm,
							MCDateFmt.DD
						).as("gi_schd_dt"),
						S0_T3.gi_rqst_tm.as("gi_schd_hm"),
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						coalesce(
							S0_M13.itm_nm,
							S0_T1.itm_nm,
							S0_M14.itm_nm
						).as("itm_nm"),
						decode(
							S0_M18.sppl_iv_flg,
							value(true),
							decode(
								S0_T1.sundry_itm_flg,
								value(true),
								S0_T1.iv_itm_nm,
								S0_ITMLCL.itm_nm
							),
							nullValue()
						).as("iv_itm_nm"),
						S0_M14.lot_mng_typ,
						S0_M14.sublot_mng_typ,
						S0_M14.sno1_mng_typ,
						S0_M14.sno2_mng_typ,
						S0_M14.sno3_mng_typ,
						S0_M14.sno4_mng_typ,
						S0_M14.asset_mng_typ,
						S0_M14.ver_flg,
						S0_M14.dscnt_itm_flg,
						S0_T1.sundry_itm_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.ver_no,
						S0_T1.gd_cd,
						S0_T1.vld_dt_fr,
						S0_T1.vld_dt_to,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T3.prms_trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T3.prms_trd_unit_qty,
						S0_T3.prms_base_unit_cd,
						S0_T3.prms_base_unit_qty,
						S0_T1.not_cmpl_qty,
						S0_T1.sppl_cd.as("rqst_sppl_cd"),
						S0_M18.bp_nm.as("rqst_sppl_nm"),
						S0_M18.sppl_iv_flg,
						S0_M18.prnt_lcl_cd,
						S0_T3.sppl_cd,
						S0_T1.maker_cd.as("rqst_maker_cd"),
						S0_T3.maker_cd,
						S0_T1.io_schd_pr_no,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.dlv_cd,
						nvl(
							S0_T1.dlv_nm,
							S0_M20.bp_nm
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
						S0_T1.tdlv_cd,
						nvl(
							S0_T1.tdlv_nm,
							S0_M43.bp_nm
						).as("tdlv_nm"),
						S0_T1.tdlv_zip_cd,
						S0_T1.tdlv_addr1,
						S0_T1.tdlv_addr2,
						S0_T1.tdlv_addr3,
						S0_T1.tdlv_addr4,
						S0_T1.tdlv_tel,
						S0_T1.tdlv_fax,
						S0_T1.tdlv_cntct_dpt,
						S0_T1.tdlv_cntct_psn,
						S0_T1.itm_ord_no,
						S0_T1.mfg_loc_cd.as("rqst_mfg_loc_cd"),
						S0_T3.mfg_loc_cd,
						S0_T1.bom_ptn.as("rqst_bom_ptn"),
						S0_T3.bom_ptn,
						S0_T1.purc_rsn_cd,
						S0_T1.xpns_po_flg,
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.bd_itm_cd,
						S0_T1.bd_itm_sub1,
						S0_T1.bd_itm_sub2,
						S0_T1.bd_itm_sub3,
						nvl(
							S0_M39.itm_nm,
							S0_M24.itm_nm
						).as("bd_itm_nm"),
						S0_T1.bd_sno1,
						S0_T1.bd_sno2,
						S0_T1.bd_sno3,
						S0_T1.bd_sno4,
						S0_T1.bd_lot_no,
						S0_T1.bd_sublot_no,
						S0_T1.bd_loc_cd,
						S0_T1.bd_dpt_cd,
						S0_M27.dpt_nm.as("bd_dpt_nm"),
						S0_T1.bd_ctg_cd,
						S0_T1.bd_oper_cd,
						S0_T1.bd_slo_no,
						S0_T1.bd_iv_no,
						S0_T1.bd_po_no,
						S0_T4.sim_alloc_pln_typ,
						S0_T1.wg_rqst_cnt_rmrks,
						S0_T1.wg_re_rqst_cnt_rmrks,
						S0_T1.intr_rmrks.as("wg_rqst_intr_rmrks"),
						S0_T1.comp_cng_flg,
						S0_T1.spec_cng_flg,
						S0_T1.rqst_crrct_dt,
						S0_T1.rqst_can_dt,
						S0_T1.prms_can_dt,
						S0_T1.inst_dt,
						S0_T1.inst_can_dt,
						S0_T1.act_dt,
						S0_T1.act_can_dt,
						S0_M14.itm_typ,
						S0_M14.itm_typ_d_cd,
						S0_T3.fix_flg,
						S0_T3.fix_dt,
						S0_T3.can_flg,
						S0_T3.prms_rmrks,
						S0_T3.intr_rmrks,
						S0_T3.sub_char1,
						S0_T3.sub_char2,
						S0_T3.sub_char3,
						S0_T3.ins_usr_id,
						S0_T3.ins_usr_nm,
						S0_T3.ins_ts,
						S0_T3.ins_func_id,
						S0_T1.upd_cntr.as("wg_rqst_upd_cntr"),
						S0_T3.upd_usr_id,
						S0_T3.upd_usr_nm,
						S0_T3.upd_ts,
						S0_T3.upd_func_id,
						S0_T3.upd_srv_req_no,
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_SPPL_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T3).on(S0_T3.wg_rqst_no.eq(S0_T1.wg_rqst_no))
						.leftOuterJoin(S0_M2).on(
							S0_M2.dpt_cd.eq(S0_T1.rqst_fr_dpt_cd)
							.and(S0_T1.gr_rqst_tm.between(S0_M2.st_dt, S0_M2.end_dt))
						)
						.leftOuterJoin(S0_M13).on(
							S0_T1.itm_cd.eq(S0_M13.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_M13.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_M13.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_M13.itm_sub3))
							.and(S0_T1.sno1.eq(S0_M13.sno1))
							.and(S0_T1.sno2.eq(S0_M13.sno2))
							.and(S0_T1.sno3.eq(S0_M13.sno3))
							.and(S0_T1.sno4.eq(S0_M13.sno4))
						)
						.leftOuterJoin(S0_M14).on(
							S0_M14.itm_cd.eq(S0_T1.itm_cd)
							.and(S0_M14.itm_sub1.eq(S0_T1.itm_sub1))
							.and(S0_M14.itm_sub2.eq(S0_T1.itm_sub2))
							.and(S0_M14.itm_sub3.eq(S0_T1.itm_sub3))
						)
						.leftOuterJoin(S0_M18).on(S0_M18.bp_cd.eq(S0_T1.sppl_cd))
						.leftOuterJoin(S0_M20).on(S0_M20.bp_cd.eq(S0_T1.dlv_cd))
						.leftOuterJoin(S0_M24).on(
							S0_M24.itm_cd.eq(S0_T1.bd_itm_cd)
							.and(S0_M24.itm_sub1.eq(S0_T1.bd_itm_sub1))
							.and(S0_M24.itm_sub2.eq(S0_T1.bd_itm_sub2))
							.and(S0_M24.itm_sub3.eq(S0_T1.bd_itm_sub3))
						)
						.leftOuterJoin(S0_M27).on(
							S0_M27.dpt_cd.eq(S0_T1.bd_dpt_cd)
							.and(S0_T1.gr_rqst_tm.between(S0_M27.st_dt, S0_M27.end_dt))
						)
						.innerJoin(S0_M32).on(S0_M32.wg_cd.eq(S0_T1.rqst_to_wg_cd))
						.leftOuterJoin(S0_M39).on(
							S0_T1.bd_itm_cd.eq(S0_M39.itm_cd)
							.and(S0_T1.bd_itm_sub1.eq(S0_M39.itm_sub1))
							.and(S0_T1.bd_itm_sub2.eq(S0_M39.itm_sub2))
							.and(S0_T1.bd_itm_sub3.eq(S0_M39.itm_sub3))
							.and(S0_T1.bd_sno1.eq(S0_M39.sno1))
							.and(S0_T1.bd_sno2.eq(S0_M39.sno2))
							.and(S0_T1.bd_sno3.eq(S0_M39.sno3))
							.and(S0_T1.bd_sno4.eq(S0_M39.sno4))
						)
						.leftOuterJoin(S0_M43).on(S0_M43.bp_cd.eq(S0_T1.tdlv_cd))
						.leftOuterJoin(S0_ITMLCL).on(
							S0_T1.itm_cd.eq(S0_ITMLCL.itm_cd)
							.and(S0_T1.itm_sub1.eq(S0_ITMLCL.itm_sub1))
							.and(S0_T1.itm_sub2.eq(S0_ITMLCL.itm_sub2))
							.and(S0_T1.itm_sub3.eq(S0_ITMLCL.itm_sub3))
							.and(S0_ITMLCL.lcl_cd.eq(S0_M18.prnt_lcl_cd))
						)
						.leftOuterJoin(S0_T4).on(
							S0_T4.wg_rqst_no.eq(S0_T1.wg_rqst_no)
							.and(
								S0_T4.wg_cd.eq(decode(
										S0_T1.wg_rqst_typ,
										value(MSC_WG_RQST_TYP.PURC.value()),
										S0_T1.rqst_fr_wg_cd,
										S0_T1.rqst_to_wg_cd
									)
								)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							bind("can_flg").eq(value(true))
							.and(S0_T1.can_flg.eq(value(true)))
							.or(bind("can_flg").eq(value(false)))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_rqst_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_prms_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_part_inst_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_inst_sts")))
							.cutoff$or(S0_T1.wg_rqst_sts_typ.eq(bind("tmp_cmpl_sts")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(value(true).eq(bind("wg_rqst_srch_dty_typ_none")))
							.or(
								bind("wg_rqst_srch_dty_typ_none").isNull()
								.cutoff$and(S0_T1.rqst_dt.gte(bind("wg_rqst_rqst_dt_fr")))
								.cutoff$and(S0_T1.rqst_dt.lte(bind("wg_rqst_rqst_dt_to")))
								.cutoff$and(S0_T1.rqst_crrct_dt.gte(bind("wg_rqst_rqst_crrct_dt_fr")))
								.cutoff$and(S0_T1.rqst_crrct_dt.lte(bind("wg_rqst_rqst_crrct_dt_to")))
								.cutoff$and(S0_T1.rqst_can_dt.gte(bind("wg_rqst_rqst_can_dt_fr")))
								.cutoff$and(S0_T1.rqst_can_dt.lte(bind("wg_rqst_rqst_can_dt_to")))
								.cutoff$and(S0_T1.prms_dt.gte(bind("wg_rqst_prms_dt_fr")))
								.cutoff$and(S0_T1.prms_dt.lte(bind("wg_rqst_prms_dt_to")))
								.cutoff$and(S0_T1.prms_can_dt.gte(bind("wg_rqst_prms_can_dt_fr")))
								.cutoff$and(S0_T1.prms_can_dt.lte(bind("wg_rqst_prms_can_dt_to")))
								.cutoff$and(S0_T1.inst_dt.gte(bind("wg_rqst_inst_dt_fr")))
								.cutoff$and(S0_T1.inst_dt.lte(bind("wg_rqst_inst_dt_to")))
								.cutoff$and(S0_T1.inst_can_dt.gte(bind("wg_rqst_inst_can_dt_fr")))
								.cutoff$and(S0_T1.inst_can_dt.lte(bind("wg_rqst_inst_can_dt_to")))
								.cutoff$and(S0_T1.act_dt.gte(bind("wg_rqst_act_dt_fr")))
								.cutoff$and(S0_T1.act_dt.lte(bind("wg_rqst_act_dt_to")))
								.cutoff$and(S0_T1.act_can_dt.gte(bind("wg_rqst_act_can_dt_fr")))
								.cutoff$and(S0_T1.act_can_dt.lte(bind("wg_rqst_act_can_dt_to")))
							)
						)
						.cutoff$and(
							bind("tmp_re_rqst").eq(value(true))
							.and(S0_T1.re_rqst_flg.eq(value(true)))
						)
						.cutoff$and(
							bind("tmp_prms_div").eq(value(true))
							.and(
								value(1).lt(subQuery()
									.select(countAll())
									.from(S1_TMP)
									.where(
										value(0).eq(value(0))
										.and(S1_TMP.wg_rqst_no.eq(S0_T1.wg_rqst_no))
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_due_delay").eq(value(true))
							.and(S0_T1.prms_ntc_flg.eq(value(true)))
							.and(
								exists(
									subQuery()
									.select(nullValue())
									.from(S2_TMP)
									.where(
										value(0).eq(value(0))
										.and(S2_TMP.wg_rqst_no.eq(S0_T1.wg_rqst_no))
										.and(S2_TMP.gr_schd_tm.gt(S0_T1.gr_rqst_tm))
									)
								)
							)
						)
						.cutoff$and(
							bind("tmp_dlv_inst_rcpt").eq(value(true))
							.and(S0_T1.dlv_inst_rcpt_flg.eq(value(true)))
						)
						.cutoff$and(
							bind("tmp_re_rqst_no_prms").eq(value(true))
							.and(S0_T1.re_rqst_flg.eq(value(true)))
							.and(S0_T1.re_prms_ntc_flg.eq(value(false)))
						)
						.and(
							value(true).eq(value(false))
							.or(bind("tmp_prms_chk").eq(value(false)))
							.or(
								bind("tmp_prms_chk").eq(value(true))
								.and(S0_T1.prms_ntc_flg.eq(value(true)))
								.and(
									exists(
										subQuery()
										.select(nullValue())
										.from(S3_TMP)
										.where(
											value(0).eq(value(0))
											.and(S3_TMP.wg_rqst_no.eq(S0_T1.wg_rqst_no))
											.cutoff$and(S3_TMP.gr_schd_tm.gte(bind("gr_schd_hm_fr")))
											.cutoff$and(S3_TMP.gr_schd_tm.lte(bind("gr_schd_hm_to")))
											.cutoff$and(S3_TMP.gi_rqst_tm.gte(bind("gi_schd_hm_fr")))
											.cutoff$and(S3_TMP.gi_rqst_tm.lte(bind("gi_schd_hm_to")))
											.and(
												S3_TMP.can_flg.eq(value(false))
												.or(S3_TMP.fix_flg.eq(value(true)))
											)
										)
									)
								)
							)
						)
						.cutoff$and(S0_T1.wg_rqst_typ.like(bind("wg_rqst_typ")))
						.cutoff$and(S0_T1.gr_rqst_tm.gte(bind("gr_rqst_hm_fr")))
						.cutoff$and(S0_T1.gr_rqst_tm.lte(bind("gr_rqst_hm_to")))
						.cutoff$and(S0_T1.gi_rqst_tm.gte(bind("gi_rqst_hm_fr")))
						.cutoff$and(S0_T1.gi_rqst_tm.lte(bind("gi_rqst_hm_to")))
						.cutoff$and(S0_T1.rqst_dt.gte(bind("rqst_dt_fr")))
						.cutoff$and(S0_T1.rqst_dt.lte(bind("rqst_dt_to")))
						.cutoff$and(S0_T1.re_rqst_dt.gte(bind("re_rqst_dt_fr")))
						.cutoff$and(S0_T1.re_rqst_dt.lte(bind("re_rqst_dt_to")))
						.cutoff$and(S0_T1.rqst_fr_wg_cd.like(bind("rqst_fr_wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.rqst_fr_usr_cd.like(bind("rqst_fr_usr_cd")))
						.cutoff$and(S0_T1.rqst_fr_dpt_cd.like(bind("rqst_fr_dpt_cd")))
						.cutoff$and(S0_M2.dpt_nm.like(bind("rqst_fr_dpt_nm")))
						.cutoff$and(S0_T1.rqst_to_wg_cd.like(bind("rqst_to_wg_cd")))
						.cutoff$and(S0_T1.gr_loc_wg_cd.like(bind("gr_wg_cd")))
						.cutoff$and(S0_T1.gr_lg_grp_cd.like(bind("gr_lg_grp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_T1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
						.cutoff$and(S0_T1.gi_lg_grp_cd.like(bind("gi_lg_grp_cd")))
						.cutoff$and(S0_T1.gi_loc_cd.like(bind("gi_loc_cd")))
						.cutoff$and(S0_T1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
						.cutoff$and(S0_T1.wg_rqst_src_typ.like(bind("wg_rqst_src_typ")))
						.cutoff$and(S0_T1.wg_rqst_src_no.like(bind("wg_rqst_src_no")))
						.cutoff$and(S0_M14.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M14.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M13.itm_nm,
								S0_M14.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.wg_rqst_no.like(bind("wg_rqst_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(
							nvl(
								S0_T1.dlv_nm,
								S0_M20.bp_nm
							).like(bind("dlv_nm"))
						)
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_M18.bp_nm.like(bind("sppl_nm")))
						.cutoff$and(S0_T1.wg_rqst_cnt_rmrks.like(bind("wg_rqst_cnt_rmrks")))
						.cutoff$and(S0_T1.wg_re_rqst_cnt_rmrks.like(bind("wg_re_rqst_cnt_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("wg_rqst_sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("wg_rqst_sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("wg_rqst_sub_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(
						S0_T1.wg_rqst_no.asc(),
						S0_T3.wg_rqst_prms_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("rqst_fr_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_M1.wg_cd.eq(S0_T1.rqst_fr_wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.wg_nm.like(bind("rqst_fr_wg_nm")))),
				when(boundOr("rqst_fr_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_M3.usr_cd.eq(S0_T1.rqst_fr_usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.usr_nm.like(bind("rqst_fr_usr_nm")))),
				when(boundOr("gr_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(S0_M4.wg_cd.eq(S0_T1.gr_loc_wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M4.wg_nm.like(bind("gr_wg_nm")))),
				when(boundOr("gr_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(S0_M5.lg_grp_cd.eq(S0_T1.gr_lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M5.lg_grp_nm.like(bind("gr_lg_grp_nm")))),
				when(boundOr("gr_loc_grp_nm", "gr_site_nm", "gr_site_cd", "gr_loc_grp_cd", "gr_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(S0_M6.loc_cd.eq(S0_T1.gr_loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M6.site_cd.like(bind("gr_site_cd"))).cutoff$and(S0_M6.loc_grp_cd.like(bind("gr_loc_grp_cd"))).cutoff$and(S0_M6.loc_nm.like(bind("gr_loc_nm")))),
				when(boundOr("gr_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(S0_M7.loc_cd.eq(S0_T1.gr_loc_cd).and(S0_M7.str_ln_cd.eq(S0_T1.gr_str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.str_ln_nm.like(bind("gr_str_ln_nm")))),
				when(boundOr("rqst_to_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(S0_M8.wg_cd.eq(S0_T1.rqst_to_wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M8.wg_nm.like(bind("rqst_to_wg_nm")))),
				when(boundOr("gi_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(S0_M10.lg_grp_cd.eq(S0_T1.gi_lg_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M10.lg_grp_nm.like(bind("gi_lg_grp_nm")))),
				when(boundOr("gi_site_cd", "gi_loc_grp_cd", "gi_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(S0_M11.loc_cd.eq(S0_T1.gi_loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M11.site_cd.like(bind("gi_site_cd"))).cutoff$and(S0_M11.loc_grp_cd.like(bind("gi_loc_grp_cd"))).cutoff$and(S0_M11.loc_nm.like(bind("gi_loc_nm")))),
				when(boundOr("gi_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(S0_M12.loc_cd.eq(S0_T1.gi_loc_cd).and(S0_M12.str_ln_cd.eq(S0_T1.gi_str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.str_ln_nm.like(bind("gi_str_ln_nm")))),
				when(boundOr("gr_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M33).on(S0_M33.loc_grp_cd.eq(S0_M6.loc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M33.loc_grp_nm.like(bind("gr_loc_grp_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M34).on(S0_M34.site_cd.eq(S0_M6.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M34.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("gi_loc_grp_nm", "gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M44).on(S0_M44.loc_cd.eq(S0_T3.gi_loc_cd))),
				when(boundOr("gi_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M35).on(S0_M35.loc_grp_cd.eq(S0_M44.loc_grp_cd)))
					.predicate(p -> p.cutoff$and(S0_M35.loc_grp_nm.like(bind("gi_loc_grp_nm")))),
				when(boundOr("gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M36).on(S0_M36.site_cd.eq(S0_M44.site_cd)))
					.predicate(p -> p.cutoff$and(S0_M36.site_nm.like(bind("gi_site_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M38).on(S0_M38.itm_typ.eq(S0_M14.itm_typ).and(S0_M38.itm_typ_d_cd.eq(S0_M14.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_M38.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(S0_T2.sno1.eq(S0_T1.sno1)))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M14.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M14.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M14.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M14.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M14.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M14.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M14.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M14.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M14.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M14.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M14.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M14.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM_DLV1.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV1).on(S0_M20.bp_grp_cd1.eq(S0_MM_DLV1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_DLV1.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM_DLV1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM_DLV2.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV2).on(S0_M20.bp_grp_cd2.eq(S0_MM_DLV2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_DLV2.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM_DLV2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM_DLV3.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV3).on(S0_M20.bp_grp_cd3.eq(S0_MM_DLV3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_DLV3.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM_DLV3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM_DLV4.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV4).on(S0_M20.bp_grp_cd4.eq(S0_MM_DLV4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_DLV4.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM_DLV4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM_DLV5.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV5).on(S0_M20.bp_grp_cd5.eq(S0_MM_DLV5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_DLV5.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM_DLV5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM_DLV6.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV6).on(S0_M20.bp_grp_cd6.eq(S0_MM_DLV6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_DLV6.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM_DLV6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM_DLV7.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV7).on(S0_M20.bp_grp_cd7.eq(S0_MM_DLV7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_DLV7.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM_DLV7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM_DLV8.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV8).on(S0_M20.bp_grp_cd8.eq(S0_MM_DLV8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_DLV8.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM_DLV8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM_DLV9.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV9).on(S0_M20.bp_grp_cd9.eq(S0_MM_DLV9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_DLV9.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM_DLV9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M20.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM_DLV10.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM_DLV10).on(S0_M20.bp_grp_cd10.eq(S0_MM_DLV10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_DLV10.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M20.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM_DLV10.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_SPPL1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL1).on(S0_M18.bp_grp_cd1.eq(S0_MM_SPPL1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_SPPL1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_SPPL1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_SPPL2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL2).on(S0_M18.bp_grp_cd2.eq(S0_MM_SPPL2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_SPPL2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_SPPL2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_SPPL3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL3).on(S0_M18.bp_grp_cd3.eq(S0_MM_SPPL3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_SPPL3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_SPPL3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_SPPL4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL4).on(S0_M18.bp_grp_cd4.eq(S0_MM_SPPL4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_SPPL4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_SPPL4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_SPPL5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL5).on(S0_M18.bp_grp_cd5.eq(S0_MM_SPPL5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_SPPL5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_SPPL5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_SPPL6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL6).on(S0_M18.bp_grp_cd6.eq(S0_MM_SPPL6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_SPPL6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_SPPL6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_SPPL7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL7).on(S0_M18.bp_grp_cd7.eq(S0_MM_SPPL7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_SPPL7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_SPPL7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_SPPL8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL8).on(S0_M18.bp_grp_cd8.eq(S0_MM_SPPL8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_SPPL8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_SPPL8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_SPPL9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL9).on(S0_M18.bp_grp_cd9.eq(S0_MM_SPPL9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_SPPL9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_SPPL9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M18.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_SPPL10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_SPPL10).on(S0_M18.bp_grp_cd10.eq(S0_MM_SPPL10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_SPPL10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M18.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_SPPL10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_fr_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_fr_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gr_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("gr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
							r.setStringNE("gr_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("gr_site_cd", m.site_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gi_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_wg_nm", m.wg_nm());
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
							r.getStringNE("rqst_gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_gi_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("rqst_gi_loc_cd"),
							r.getStringNE("rqst_gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_gi_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("rqst_maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("gr_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
							r.setStringNE("gi_loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("gi_site_cd", m.site_cd());
							r.setStringNE("gi_lg_grp_cd", m.lg_grp_cd());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("gi_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gi_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_site_nm", m.site_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("prms_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("prms_base_unit_dec_place", m.dec_place());
							r.setStringNE("prms_base_unit_rnd_typ", m.rnd_typ());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("prms_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("prms_trd_unit_dec_place", m.dec_place());
							r.setStringNE("prms_trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("prms_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("prms_trd_unit_conv_qty", m.conv_qty());
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
	
	/**
	 * -- MSBAL0020_MSVT_AVL_IO_SCHD_Query_S01
	 */
	static MCQueryPlan MSBAL0020_MSVT_AVL_IO_SCHD_S01() {
		MSW_WG_RQST_KEY_R S0_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MSVT_AVL_IO_SCHD_R S0_T1 = MSVT_AVL_IO_SCHD_R.create("T1");
		MSW_WG_RQST_KEY_R S1_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S1_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_XFR_SCHD_R S1_T2 = MST_XFR_SCHD_R.create("T2");
		MSVT_AVL_IO_SCHD_R S1_T3 = MSVT_AVL_IO_SCHD_R.create("T3");
		MSW_WG_RQST_KEY_R S2_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S2_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_XFR_SCHD_R S2_T2 = MST_XFR_SCHD_R.create("T2");
		MST_SHIP_PR_R S2_T3 = MST_SHIP_PR_R.create("T3");
		MST_SHIP_SCHD_R S2_T4 = MST_SHIP_SCHD_R.create("T4");
		MST_SHIP_ALLOC_STS_R S2_T5 = MST_SHIP_ALLOC_STS_R.create("T5");
		MST_SHIP_ACT_D_R S2_T6 = MST_SHIP_ACT_D_R.create("T6");
		MSVT_AVL_IO_SCHD_R S2_T7 = MSVT_AVL_IO_SCHD_R.create("T7");
		MSW_WG_RQST_KEY_R S3_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S3_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_PO_SCHD_R S3_T2 = MST_PO_SCHD_R.create("T2");
		MSVT_AVL_IO_SCHD_R S3_T3 = MSVT_AVL_IO_SCHD_R.create("T3");
		MSW_WG_RQST_KEY_R S4_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S4_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_PO_SCHD_R S4_T2 = MST_PO_SCHD_R.create("T2");
		MST_PO_D_R S4_T3 = MST_PO_D_R.create("T3");
		MSVT_AVL_IO_SCHD_R S4_T4 = MSVT_AVL_IO_SCHD_R.create("T4");
		MSW_WG_RQST_KEY_R S5_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S5_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_PO_SCHD_R S5_T2 = MST_PO_SCHD_R.create("T2");
		MST_PO_D_R S5_T3 = MST_PO_D_R.create("T3");
		MST_ARR_PR_R S5_T4 = MST_ARR_PR_R.create("T4");
		MST_ARR_SCHD_R S5_T5 = MST_ARR_SCHD_R.create("T5");
		MST_ARR_ACT_R S5_T6 = MST_ARR_ACT_R.create("T6");
		MSVT_AVL_IO_SCHD_R S5_T7 = MSVT_AVL_IO_SCHD_R.create("T7");
		MSW_WG_RQST_KEY_R S6_W1 = MSW_WG_RQST_KEY_R.create("W1");
		MST_WG_RQST_PRMS_R S6_T1 = MST_WG_RQST_PRMS_R.create("T1");
		MST_PO_SCHD_R S6_T2 = MST_PO_SCHD_R.create("T2");
		MST_PO_D_R S6_T3 = MST_PO_D_R.create("T3");
		MST_INSP_SCHD_R S6_T4 = MST_INSP_SCHD_R.create("T4");
		MSVT_AVL_IO_SCHD_R S6_T5 = MSVT_AVL_IO_SCHD_R.create("T5");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBAL0020_MSVT_AVL_IO_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.io_schd_typ,
						S0_T1.io_schd_sts_typ,
						S0_T1.io_schd_no,
						S0_T1.io_typ,
						S0_T1.loc_cd,
						S0_T1.schd_dt,
						S0_T1.base_unit_qty.as("schd_qty"),
						S0_T1.io_schd_sub_no2.as("wg_rqst_no"),
						nullValue().as("wg_rqst_prms_no")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.io_schd_sub_typ2.eq(value(MSC_IO_SCHD_SUB_TYP.WG_RQST_NO.value()))
								.and(S0_T1.io_schd_sub_no2.eq(S0_W1.wg_rqst_no))
							)
						)
					)
					.unionAll(
						subQuery()
						.select(
							S1_T3.io_schd_typ,
							S1_T3.io_schd_sts_typ,
							S1_T3.io_schd_no,
							S1_T3.io_typ,
							S1_T3.loc_cd,
							S1_T3.schd_dt,
							S1_T3.base_unit_qty.as("schd_qty"),
							S1_T1.wg_rqst_no,
							S1_T1.wg_rqst_prms_no
						)
						.from(
							S1_W1
							.innerJoin(S1_T1).on(
								bracket(
									S1_T1.wg_rqst_no.eq(S1_W1.wg_rqst_no)
									.and(S1_T1.fix_flg.eq(value(true)))
								)
							)
							.innerJoin(S1_T2).on(
								bracket(
									S1_T2.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.WG_RQST.value()))
									.and(S1_T2.xfr_src_no.eq(S1_T1.wg_rqst_prms_no))
								)
							)
							.innerJoin(S1_T3).on(
								bracket(
									S1_T3.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.XFR_SCHD_NO.value()))
									.and(S1_T3.io_schd_sub_no1.eq(S1_T2.xfr_schd_no))
								)
							)
						)
						.unionAll(
							subQuery()
							.select(
								S2_T7.io_schd_typ,
								S2_T7.io_schd_sts_typ,
								S2_T7.io_schd_no,
								S2_T7.io_typ,
								S2_T7.loc_cd,
								S2_T7.schd_dt,
								S2_T7.base_unit_qty.as("schd_qty"),
								S2_T1.wg_rqst_no,
								S2_T1.wg_rqst_prms_no
							)
							.from(
								S2_W1
								.innerJoin(S2_T1).on(
									bracket(
										S2_T1.wg_rqst_no.eq(S2_W1.wg_rqst_no)
										.and(S2_T1.fix_flg.eq(value(true)))
									)
								)
								.innerJoin(S2_T2).on(
									bracket(
										S2_T2.xfr_src_typ.eq(value(MSC_XFR_SRC_TYP.WG_RQST.value()))
										.and(S2_T2.xfr_src_no.eq(S2_T1.wg_rqst_prms_no))
									)
								)
								.innerJoin(S2_T3).on(
									bracket(
										S2_T3.xfr_schd_no.eq(S2_T2.xfr_schd_no)
									)
								)
								.innerJoin(S2_T4).on(
									bracket(
										S2_T4.ship_pr_no.eq(S2_T3.ship_pr_no)
									)
								)
								.innerJoin(S2_T5).on(
									bracket(
										S2_T5.ship_schd_no.eq(S2_T4.ship_schd_no)
									)
								)
								.innerJoin(S2_T6).on(
									bracket(
										S2_T6.ship_alloc_sts_no.eq(S2_T5.ship_alloc_sts_no)
									)
								)
								.innerJoin(S2_T7).on(
									bracket(
										S2_T7.io_schd_sub_typ1.eq(value(MSC_IO_SCHD_SUB_TYP.DLV_SLIP_D_NO.value()))
										.and(S2_T7.io_schd_sub_no1.eq(S2_T6.dlv_slip_d_no))
									)
								)
							)
							.unionAll(
								subQuery()
								.select(
									S3_T3.io_schd_typ,
									S3_T3.io_schd_sts_typ,
									S3_T3.io_schd_no,
									S3_T3.io_typ,
									S3_T3.loc_cd,
									S3_T3.schd_dt,
									S3_T3.base_unit_qty.as("schd_qty"),
									S3_T1.wg_rqst_no,
									S3_T1.wg_rqst_prms_no
								)
								.from(
									S3_W1
									.innerJoin(S3_T1).on(
										bracket(
											S3_T1.wg_rqst_no.eq(S3_W1.wg_rqst_no)
											.and(S3_T1.fix_flg.eq(value(true)))
										)
									)
									.innerJoin(S3_T2).on(
										bracket(
											S3_T2.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value()))
											.and(S3_T2.po_schd_src_no.eq(S3_T1.wg_rqst_prms_no))
										)
									)
									.innerJoin(S3_T3).on(
										bracket(
											S3_T3.io_schd_typ.in(
												value(MSC_IO_SCHD_TYP.PURC_GR.value()),
												value(MSC_IO_SCHD_TYP.PURC_GR_PROV.value()),
												value(MSC_IO_SCHD_TYP.PURC_GR_DDLV.value()),
												value(MSC_IO_SCHD_TYP.ARR.value()),
												value(MSC_IO_SCHD_TYP.ARR_PROV.value())
											)
											.and(S3_T3.io_schd_sts_typ.eq(value(MSC_IO_SCHD_STS_TYP.SCHD.value())))
											.and(S3_T3.io_schd_no.eq(S3_T2.po_schd_no))
										)
									)
								)
								.unionAll(
									subQuery()
									.select(
										S4_T4.io_schd_typ,
										S4_T4.io_schd_sts_typ,
										S4_T4.io_schd_no,
										S4_T4.io_typ,
										S4_T4.loc_cd,
										S4_T4.schd_dt,
										S4_T4.base_unit_qty.as("schd_qty"),
										S4_T1.wg_rqst_no,
										S4_T1.wg_rqst_prms_no
									)
									.from(
										S4_W1
										.innerJoin(S4_T1).on(
											bracket(
												S4_T1.wg_rqst_no.eq(S4_W1.wg_rqst_no)
												.and(S4_T1.fix_flg.eq(value(true)))
											)
										)
										.innerJoin(S4_T2).on(
											bracket(
												S4_T2.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value()))
												.and(S4_T2.po_schd_src_no.eq(S4_T1.wg_rqst_prms_no))
											)
										)
										.innerJoin(S4_T3).on(
											bracket(
												S4_T3.po_schd_no.eq(S4_T2.po_schd_no)
											)
										)
										.innerJoin(S4_T4).on(
											bracket(
												S4_T4.io_schd_sub_typ2.eq(value(MSC_IO_SCHD_SUB_TYP.PO_D_NO.value()))
												.and(S4_T4.io_schd_sub_no2.eq(S4_T3.po_d_no))
											)
										)
									)
									.unionAll(
										subQuery()
										.select(
											S5_T7.io_schd_typ,
											S5_T7.io_schd_sts_typ,
											S5_T7.io_schd_no,
											S5_T7.io_typ,
											S5_T7.loc_cd,
											S5_T7.schd_dt,
											S5_T7.base_unit_qty.as("schd_qty"),
											S5_T1.wg_rqst_no,
											S5_T1.wg_rqst_prms_no
										)
										.from(
											S5_W1
											.innerJoin(S5_T1).on(
												bracket(
													S5_T1.wg_rqst_no.eq(S5_W1.wg_rqst_no)
													.and(S5_T1.fix_flg.eq(value(true)))
												)
											)
											.innerJoin(S5_T2).on(
												bracket(
													S5_T2.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value()))
													.and(S5_T2.po_schd_src_no.eq(S5_T1.wg_rqst_prms_no))
												)
											)
											.innerJoin(S5_T3).on(
												bracket(
													S5_T3.po_schd_no.eq(S5_T2.po_schd_no)
												)
											)
											.innerJoin(S5_T4).on(
												bracket(
													S5_T4.po_d_no.eq(S5_T3.po_d_no)
												)
											)
											.innerJoin(S5_T5).on(
												bracket(
													S5_T5.arr_pr_no.eq(S5_T4.arr_pr_no)
												)
											)
											.innerJoin(S5_T6).on(
												bracket(
													S5_T6.arr_schd_no.eq(S5_T5.arr_schd_no)
												)
											)
											.innerJoin(S5_T7).on(
												bracket(
													S5_T7.io_schd_typ.in(
														value(MSC_IO_SCHD_TYP.PURC_GR.value()),
														value(MSC_IO_SCHD_TYP.PURC_GR_PROV.value())
													)
													.and(
														S5_T7.io_schd_sts_typ.in(
															value(MSC_IO_SCHD_STS_TYP.ARR.value()),
															value(MSC_IO_SCHD_STS_TYP.INSP.value())
														)
													)
													.and(S5_T7.io_schd_no.eq(S5_T6.arr_act_no))
												)
											)
										)
										.unionAll(
											subQuery()
											.select(
												S6_T5.io_schd_typ,
												S6_T5.io_schd_sts_typ,
												S6_T5.io_schd_no,
												S6_T5.io_typ,
												S6_T5.loc_cd,
												S6_T5.schd_dt,
												S6_T5.base_unit_qty.as("schd_qty"),
												S6_T1.wg_rqst_no,
												S6_T1.wg_rqst_prms_no
											)
											.from(
												S6_W1
												.innerJoin(S6_T1).on(
													bracket(
														S6_T1.wg_rqst_no.eq(S6_W1.wg_rqst_no)
														.and(S6_T1.fix_flg.eq(value(true)))
													)
												)
												.innerJoin(S6_T2).on(
													bracket(
														S6_T2.po_schd_src_typ.eq(value(MSC_PO_SCHD_SRC_TYP.RQST.value()))
														.and(S6_T2.po_schd_src_no.eq(S6_T1.wg_rqst_prms_no))
													)
												)
												.innerJoin(S6_T3).on(
													bracket(
														S6_T3.po_schd_no.eq(S6_T2.po_schd_no)
													)
												)
												.innerJoin(S6_T4).on(
													bracket(
														S6_T4.src_no1.eq(S6_T3.po_d_no)
														.and(S6_T4.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())))
													)
												)
												.innerJoin(S6_T5).on(
													bracket(
														S6_T5.io_schd_typ.in(
															value(MSC_IO_SCHD_TYP.INSP_CMPL_GR.value())
														)
														.and(S6_T5.io_schd_no.eq(S6_T4.insp_schd_no))
													)
												)
											)
										)
									)
								)
							)
						)
					)
			);
	}
}