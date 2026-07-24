package mcframe.serverMSBE.MSBEL0120;

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
	 * -- MSBEL0120_MST_SHIP_ALLOC_STS_Query_S01
	 */
	static MCQueryPlan MSBEL0120_MST_SHIP_ALLOC_STS_S01() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SLO_D_R S0_T4 = MST_SLO_D_R.create("T4");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MST_DLV_INST_RCPT_R S0_T6 = MST_DLV_INST_RCPT_R.create("T6");
		MAM_DPT_R S0_M11 = MAM_DPT_R.create("M11");
		MSVM_SHIP_TO_ID_R S0_M12 = MSVM_SHIP_TO_ID_R.create("M12");
		MAM_ITM_R S0_M16 = MAM_ITM_R.create("M16");
		MAM_BP_R S0_M17 = MAM_BP_R.create("M17");
		MAM_BP_R S0_M18 = MAM_BP_R.create("M18");
		MAW_LOC_KEY_R S0_WK1 = MAW_LOC_KEY_R.create("WK1");
		MAW_LG_GRP_KEY_R S0_WK2 = MAW_LG_GRP_KEY_R.create("WK2");
		MAVM_RD_LOC_R S0_DACL = MAVM_RD_LOC_R.create("DACL");
		MAVM_RD_LG_GRP_R S0_DACLG = MAVM_RD_LG_GRP_R.create("DACLG");
		MAVM_RD_ALLOC_GRP_R S0_DACAG = MAVM_RD_ALLOC_GRP_R.create("DACAG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0120_MST_SHIP_ALLOC_STS_Query_S01")
					.mainQuery()
					.select(
						S0_T4.slo_no,
						S0_T1.slo_d_no,
						S0_T1.xfr_schd_no,
						S0_T2.ship_schd_no,
						S0_T3.ship_alloc_sts_no,
						S0_T1.cst_cd,
						S0_T3.ship_loc_cd,
						S0_T3.ship_str_ln_cd,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.ver_no,
						S0_T2.not_lot_mix_flg,
						S0_T2.not_sublot_mix_flg,
						S0_T2.ship_fr_lg_grp_cd,
						S0_T1.alloc_grp_cd,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.pack_unit_cd,
						S0_T3.pack_unit_qty.as("alloc_abl_qty"),
						S0_T3.base_unit_cd,
						S0_T3.base_unit_qty.as("alloc_abl_base_unit_qty"),
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T2.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T2.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T2.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T2.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						trunc(
							S0_T6.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_inst_dt"),
						S0_T6.dlv_rqst_tm.as("dlv_inst_hm"),
						trunc(
							S0_T2.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T2.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T2.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T2.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T1.rqst_usr_cd,
						S0_T1.rqst_dpt_cd,
						S0_M11.dpt_nm.as("rqst_dpt_nm"),
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
						nvl2(
							S0_T2.tdlv_cd,
							nvl(
								S0_T2.tdlv_nm,
								S0_M18.bp_nm
							),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T2.dlv_cd,
									nvl(
										S0_T2.dlv_nm,
										S0_M17.bp_nm
									),
									nvl(
										S0_T1.ship_to_id_nm,
										S0_M12.ship_to_id_nm
									)
								),
								nvl(
									S0_T1.ship_to_id_nm,
									S0_M12.ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						S0_T1.alloc_scope_typ,
						S0_T1.not_lg_mix_flg,
						S0_T1.ship_pr_no,
						S0_T1.upd_cntr.as("ship_pr_upd_cntr"),
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
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.innerJoin(S0_T3).on(S0_T3.ship_schd_no.eq(S0_T2.ship_schd_no))
						.leftOuterJoin(S0_T4).on(S0_T4.slo_d_no.eq(S0_T1.slo_d_no))
						.leftOuterJoin(S0_T5).on(S0_T5.sno1.eq(S0_T3.sno1))
						.leftOuterJoin(S0_T6).on(S0_T6.dlv_inst_rcpt_no.eq(S0_T2.dlv_inst_rcpt_no))
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.dpt_cd.eq(S0_T1.rqst_dpt_cd)
								.and(S0_T1.ship_schd_tm.between(S0_M11.st_dt, S0_M11.end_dt))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
								.and(S0_M12.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M16.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M16.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M16.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M17).on(S0_M17.bp_cd.eq(S0_T2.dlv_cd))
						.leftOuterJoin(S0_M18).on(S0_M18.bp_cd.eq(S0_T2.tdlv_cd))
						.leftOuterJoin(S0_WK1).on(
							bracket(
								S0_T3.ship_loc_cd.eq(S0_WK1.loc_cd)
							)
						)
						.leftOuterJoin(S0_WK2).on(
							bracket(
								S0_T2.ship_fr_lg_grp_cd.eq(S0_WK2.lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_DACL).on(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_DACLG).on(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
						.leftOuterJoin(S0_DACAG).on(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.ship_schd_no.neq(bind("ship_schd_no")))
						.and(S0_T2.itm_cd.eq(bind("itm_cd")))
						.and(S0_T2.itm_sub1.eq(bind("itm_sub1")))
						.and(S0_T2.itm_sub2.eq(bind("itm_sub2")))
						.and(S0_T2.itm_sub3.eq(bind("itm_sub3")))
						.and(S0_T2.ship_inst_qty.eq(value(0)))
						.and(S0_T2.ship_act_qty.eq(value(0)))
						.and(S0_T3.gd_cd.eq(bind("gd_cd")))
						.and(S0_T3.quality_typ.eq(bind("quality_typ")))
						.and(S0_T3.stk_insp_typ.eq(bind("stk_insp_typ")))
						.and(
							bracket(
								bind("xfr_schd_no").isNotNull()
								.and(bind("stk_id_typ").eq(value(MSC_STK_ID_TYP.COSTK.value())))
								.and(
									S0_T3.stk_id_typ.in(
										value(MSC_STK_ID_TYP.COSTK.value()),
										value(MSC_STK_ID_TYP.RNT_RCV.value()),
										value(MSC_STK_ID_TYP.NCV_RCV.value())
									)
								)
							)
							.or(S0_T3.stk_id_typ.eq(bind("stk_id_typ")))
						)
						.and(
							bracket(
								bind("xfr_schd_no").isNotNull()
								.and(bind("stk_id_typ").eq(value(MSC_STK_ID_TYP.COSTK.value())))
							)
							.or(S0_T3.stk_bp_cd.eq(bind("stk_bp_cd")))
						)
						.cutoff$and(S0_T3.lot_no.eq(bind("lot_no")))
						.cutoff$and(S0_T3.sublot_no.eq(bind("sublot_no")))
						.cutoff$and(S0_T3.ship_str_ln_cd.eq(bind("str_ln_cd")))
						.cutoff$and(S0_T3.ver_no.eq(bind("ver_no")))
						.and(
							bracket(
								bind("sno1_null_flg").eq(value(true))
								.and(S0_T3.sno1.eq(value(MAC_STR.NULL_VAL.value())))
							)
							.or(S0_T3.sno1.eq(bind("sno1")))
							.or(S0_M16.sno1_mng_typ.eq(value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value())))
						)
						.and(
							bracket(
								bind("sno2_null_flg").eq(value(true))
								.and(S0_T3.sno2.eq(value(MAC_STR.NULL_VAL.value())))
							)
							.or(S0_T3.sno2.eq(bind("sno2")))
							.or(S0_M16.sno2_mng_typ.eq(value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value())))
						)
						.and(
							bracket(
								bind("sno3_null_flg").eq(value(true))
								.and(S0_T3.sno3.eq(value(MAC_STR.NULL_VAL.value())))
							)
							.or(S0_T3.sno3.eq(bind("sno3")))
							.or(S0_M16.sno3_mng_typ.eq(value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value())))
						)
						.and(
							bracket(
								bind("sno4_null_flg").eq(value(true))
								.and(S0_T3.sno4.eq(value(MAC_STR.NULL_VAL.value())))
							)
							.or(S0_T3.sno4.eq(bind("sno4")))
							.or(S0_M16.sno4_mng_typ.eq(value(MAC_SNO_MNG_TYP.MNG_NOT_STK.value())))
						)
						.and(
							bracket(
								bind("pack_alloc_flg").eq(value(true))
								.and(bind("pack_flg").eq(value(true)))
								.and(S0_T3.pack_unit_cd.eq(bind("trd_unit_cd")))
							)
							.or(
								bracket(
									bind("pack_alloc_flg").eq(value(false))
									.or(bind("pack_flg").eq(value(false)))
								)
								.and(S0_T3.pack_unit_cd.eq(bind("base_unit_cd")))
							)
						)
						.and(
							bracket(
								S0_T3.ship_loc_cd.isNotNull()
								.and(S0_T3.ship_loc_cd.eq(S0_WK1.loc_cd))
							)
							.or(
								S0_T3.ship_loc_cd.isNull()
								.and(S0_T2.ship_fr_lg_grp_cd.isNotNull())
								.and(S0_T2.ship_fr_lg_grp_cd.eq(S0_WK2.lg_grp_cd))
							)
							.or(
								bind("loc_cd").isNull()
								.and(bind("alloc_ship_lg_grp_cd").isNull())
								.and(bind("alloc_grp_cd").isNotNull())
								.and(S0_T1.alloc_grp_cd.eq(bind("alloc_grp_cd")))
							)
						)
						.and(
							S0_T4.proc_typ.isNull()
							.or(S0_T4.proc_typ.neq(value(MAC_SLO_PROC_TYP.PURC_DDLV.value())))
						)
						.and(S0_T3.alloc_flg.eq(value(true)))
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
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setStringNE("wg_cd", m.wg_cd());
							r.setStringNE("site_cd", m.site_cd());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
							r.setNumberNE("pack_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("pack_unit_conv_qty", m.conv_qty());
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
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
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
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL0120_MST_SHIP_ALLOC_STS_Query_S02
	 */
	static MCQueryPlan MSBEL0120_MST_SHIP_ALLOC_STS_S02() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MAVM_ITM_UNIT_R S0_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0120_MST_SHIP_ALLOC_STS_Query_S02")
					.mainQuery()
					.select(
						S0_T1.ship_pr_no,
						S0_T1.alloc_grp_cd,
						S0_T1.ship_lg_grp_cd,
						S0_T1.loc_cd,
						S0_T1.slo_d_no,
						S0_T1.upd_cntr,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.ship_fr_lg_grp_cd,
						S0_T3.ship_alloc_sts_no,
						S0_T3.gd_cd,
						S0_T3.quality_typ,
						S0_T3.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.ship_loc_cd,
						S0_T3.ship_str_ln_cd,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.ver_no,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T3.pack_unit_qty.as("alloc_abl_qty"),
						S0_T3.pack_unit_cd,
						S0_T3.base_unit_qty.as("alloc_chng_base_unit_qty"),
						S0_T3.base_unit_cd,
						S0_M1.dec_place.as("pack_unit_dec_place"),
						S0_M1.conv_base_qty.as("pack_unit_conv_base_qty"),
						S0_M1.conv_qty.as("pack_unit_conv_qty"),
						S0_M2.dec_place.as("base_unit_dec_place"),
						S0_M2.rnd_typ.as("base_unit_rnd_typ"),
						S0_M2.pack_alloc_flg
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.innerJoin(S0_T3).on(S0_T2.ship_schd_no.eq(S0_T3.ship_schd_no))
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M1.unit_cd.eq(S0_T3.pack_unit_cd))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T3.ship_alloc_sts_no.like(bind("ship_alloc_sts_no")))
					)
					.forUpdateNoWait(S0_T1.ship_pr_no)
			);
	}
	
	/**
	 * -- MSBEL0120_MST_SHIP_PR_Query_S01
	 */
	static MCQueryPlan MSBEL0120_MST_SHIP_PR_S01() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_SLO_D_R S0_T3 = MST_SLO_D_R.create("T3");
		MAVM_ITM_UNIT_R S0_M1 = MAVM_ITM_UNIT_R.create("M1");
		MAM_ITM_R S0_M2 = MAM_ITM_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0120_MST_SHIP_PR_Query_S01")
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
						S0_M2.sno1_mng_typ,
						S0_M2.sno2_mng_typ,
						S0_M2.sno3_mng_typ,
						S0_M2.sno4_mng_typ,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.ver_no,
						S0_M2.ver_flg,
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
						S0_T2.base_unit_qty.subtract(S0_T2.alloc_qty).as("wait_qty"),
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
						S0_M1.dec_place.as("trd_unit_dec_place"),
						S0_M1.rnd_typ.as("trd_unit_rnd_typ"),
						S0_M1.conv_base_qty.as("trd_unit_conv_base_qty"),
						S0_M1.conv_qty.as("trd_unit_conv_qty"),
						S0_M1.pack_flg,
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
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M1.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M1.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M1.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M1.unit_cd.eq(S0_T2.trd_unit_cd))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M2.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M2.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M2.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.ship_schd_no.eq(bind("ship_schd_no")))
					)
					.forUpdateNoWait(S0_T1.ship_pr_no)
			);
	}
	
	/**
	 * -- MSBEL0120_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL0120_MST_SHIP_SCHD_S01() {
		MST_SHIP_PR_R S0_T1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R S0_T2 = MST_SHIP_SCHD_R.create("T2");
		MST_DLV_INST_RCPT_R S0_T5 = MST_DLV_INST_RCPT_R.create("T5");
		MSVM_DLV_ID_R S0_M2 = MSVM_DLV_ID_R.create("M2");
		MSVM_SHIP_TO_ID_R S0_M4 = MSVM_SHIP_TO_ID_R.create("M4");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_ITM_R S0_M12 = MAM_ITM_R.create("M12");
		MAM_SUNDRY_ITM_R S0_M19 = MAM_SUNDRY_ITM_R.create("M19");
		MAM_BP_R S0_M21 = MAM_BP_R.create("M21");
		MAM_BP_R S0_M22 = MAM_BP_R.create("M22");
		MAVM_RD_LOC_R S0_DACL = MAVM_RD_LOC_R.create("DACL");
		MAVM_RD_LG_GRP_R S0_DACLG = MAVM_RD_LG_GRP_R.create("DACLG");
		MAVM_RD_ALLOC_GRP_R S0_DACAG = MAVM_RD_ALLOC_GRP_R.create("DACAG");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0120_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.slo_d_no,
						S0_T1.xfr_schd_no,
						S0_T2.ship_schd_no,
						S0_T1.dlv_id_typ,
						nvl(
							S0_T2.dlv_cd,
							S0_T1.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T2.dlv_cd,
							nvl(
								S0_T2.dlv_nm,
								S0_M21.bp_nm
							),
							nvl(
								S0_T1.dlv_id_nm,
								S0_M2.dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_T1.cst_cd,
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
						nvl2(
							S0_T2.tdlv_cd,
							nvl(
								S0_T2.tdlv_nm,
								S0_M22.bp_nm
							),
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T2.dlv_cd,
									nvl(
										S0_T2.dlv_nm,
										S0_M21.bp_nm
									),
									nvl(
										S0_T1.ship_to_id_nm,
										S0_M4.ship_to_id_nm
									)
								),
								nvl(
									S0_T1.ship_to_id_nm,
									S0_M4.ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						S0_T1.rqst_usr_cd,
						S0_T1.rqst_dpt_cd,
						S0_M6.dpt_nm.as("rqst_dpt_nm"),
						S0_T1.def_loc_cd,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.ver_no,
						S0_M12.ver_flg,
						S0_T2.ship_fr_lg_grp_cd.as("ship_lg_grp_cd"),
						cases()
							.when(
								S0_T2.iv_schd_qty.gt(value(0))
								.or(S0_T2.fix_flg.eq(value(true)))
							)
								.then(S0_T2.ship_fr_lg_grp_cd)
							.otherwise(S0_T1.ship_lg_grp_cd).as("ship_fr_lg_grp_cd"),
						S0_T1.alloc_grp_cd,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
							S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M19.itm_nm
							),
							S0_M12.itm_nm
						).as("itm_nm"),
						S0_T2.gd_cd,
						S0_T2.quality_typ,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_T2.stk_bp_cd,
						S0_T2.sno1,
						S0_T2.sno1_null_flg,
						S0_T2.sno2,
						S0_T2.sno2_null_flg,
						S0_T2.sno3,
						S0_T2.sno3_null_flg,
						S0_T2.sno4,
						S0_T2.sno4_null_flg,
						S0_T1.ship_schd_split_typ,
						S0_T1.alloc_scope_typ,
						S0_T1.not_lg_mix_flg,
						trunc(
							S0_T1.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T1.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T2.ship_rqst_tm,
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T2.ship_rqst_tm.as("ship_rqst_hm"),
						trunc(
							S0_T2.pd_inst_dlv_tm,
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T2.pd_inst_dlv_tm.as("pd_inst_dlv_hm"),
						trunc(
							S0_T5.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_inst_dt"),
						S0_T5.dlv_rqst_tm.as("dlv_inst_hm"),
						trunc(
							S0_T2.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T2.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T2.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T2.dlv_schd_tm.as("dlv_schd_hm"),
						S0_T2.ship_block_flg,
						S0_M12.pack_alloc_flg,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.alloc_qty,
						S0_T2.wait_qty,
						S0_T2.base_unit_qty.subtract(S0_T2.alloc_qty).as("wait_rem_qty"),
						S0_T1.upd_cntr.as("ship_pr_upd_cntr"),
						S0_M12.stk_mng_typ,
						S0_T2.ship_inst_qty,
						S0_T2.ship_act_qty,
						S0_T1.alloc_typ,
						S0_T2.not_dt_calc_flg,
						S0_T2.ship_schd_tm,
						S0_T2.dlv_schd_tm,
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
						S0_T2.ship_term_cd,
						S0_T1.ship_inst_typ,
						S0_T1.dlv_rqst_tm,
						S0_T2.pd_inst_dlv_tm,
						S0_T2.ship_rqst_tm,
						S0_T1.ship_rqst_tm.as("ship_pr_ship_rqst_tm"),
						S0_T2.not_lot_mix_flg,
						S0_T2.not_sublot_mix_flg,
						S0_T1.trd_ptn_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T2.ship_pr_no.eq(S0_T1.ship_pr_no))
						.leftOuterJoin(S0_T5).on(S0_T5.dlv_inst_rcpt_no.eq(S0_T2.dlv_inst_rcpt_no))
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.dlv_id_typ.eq(S0_T1.dlv_id_typ)
								.and(S0_M2.dlv_id_cd.eq(S0_T1.dlv_id_cd))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
								.and(S0_M4.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.dpt_cd.eq(S0_T1.rqst_dpt_cd)
								.and(S0_T1.ship_schd_tm.between(S0_M6.st_dt, S0_M6.end_dt))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M12.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M12.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M12.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_M19.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M19.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M19.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M19.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M19.sno1.eq(S0_T2.sno1))
								.and(S0_M19.sno2.eq(S0_T2.sno2))
								.and(S0_M19.sno3.eq(S0_T2.sno3))
								.and(S0_M19.sno4.eq(S0_T2.sno4))
							)
						)
						.leftOuterJoin(S0_M21).on(S0_M21.bp_cd.eq(S0_T2.dlv_cd))
						.leftOuterJoin(S0_M22).on(S0_M22.bp_cd.eq(S0_T2.tdlv_cd))
						.leftOuterJoin(S0_DACL).on(S0_DACL.loc_cd.eq(S0_T1.loc_cd))
						.leftOuterJoin(S0_DACLG).on(S0_DACLG.lg_grp_cd.eq(S0_T1.ship_lg_grp_cd))
						.leftOuterJoin(S0_DACAG).on(S0_DACAG.alloc_grp_cd.eq(S0_T1.alloc_grp_cd))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T2.ship_schd_no.eq(bind("ship_schd_no")))
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
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("slo_d_no")
						))
						.addSelect(m -> toArray(
							m.dlv_day_week_typ,
							m.proc_typ,
							m.slo_no,
							m.sls_cststk_flg,
							m.sls_schd_dt
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_no", m.slo_no());
							r.setStringNE("proc_typ", m.proc_typ());
							r.setStringNE("dlv_day_week_typ", m.dlv_day_week_typ());
							r.setBooleanNE("sls_cststk_flg", m.sls_cststk_flg());
							r.setDateNE("sls_schd_dt", m.sls_schd_dt());
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
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("rqst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("wg_cd", m.wg_cd());
							r.setStringNE("site_cd", m.site_cd());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.pack_flg
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setBooleanNE("pack_flg", m.pack_flg());
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
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